package br.com.locadora;

import java.sql.*;
import java.util.*;

import comunica.Conexao;

public class ProdutoBD {

    private String sql = null;
    private String msg = null;
    private Conexao conexao;
    private Produto produto;
    private Vector vetProduto;

    /**
     * Método construtor sem parametros
     */
    public ProdutoBD() {
        this.conexao = new Conexao();
    }

    public void msg() {
        this.msg = this.msg + this.conexao.getMsg();
        System.out.println(this.msg);
    }

    public String getMsg() {
        this.msg = this.msg + this.conexao.getMsg();
        return this.msg;
    }

    public boolean autenticaProduto(Produto produto) {
        this.sql = "select * from Produto where codigo='" + produto.getCod() + "' and descricao='" + produto.getDescricao() + " ' ";
        try {
            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            if (this.conexao.rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.msg = "Nao foi possivel inserir o Produto " + produto.getDescricao() + ".\nErro:" + e.getMessage();
            return false;
        }

    }

    public Produto getProduto(Produto produto) {
        this.sql = "select * from Produto where descricao='" + produto.getDescricao() + "'";
        try {
            this.conexao.rs = this.conexao.st.executeQuery(this.sql);
            if (this.conexao.rs.next()) {
                this.produto = new Produto(this.conexao.rs.getInt("codigo"), this.conexao.rs.getString("descricao"), this.conexao.rs.getString("categoria"), this.conexao.rs.getString("tipo"), this.conexao.rs.getString("valor"));

                return this.produto;

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel recuperar o produto " + produto.getDescricao() + ".\nErro:" + e.getMessage();

        }

        return this.produto = null;

    }

    public Vector getProduto() {

        this.sql = "select * from Produto order by descricao";

        this.vetProduto = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {

                this.produto = new Produto(this.conexao.rs.getInt("codigo"), this.conexao.rs.getString("descricao"), this.conexao.rs.getString("categoria"), this.conexao.rs.getString("tipo"), this.conexao.rs.getString("valor"));

                this.vetProduto.addElement(this.produto);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\nErro:" + e.getMessage();

            getMsg();

        }

        return this.vetProduto;

    }

    public Vector getProdutoINI(Produto produto) {

        this.sql = "select * from Produto where descricao like '" + produto.getDescricao() + "%'";

        this.vetProduto = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {
                this.produto = new Produto(this.conexao.rs.getInt("codigo"), this.conexao.rs.getString("descricao"), this.conexao.rs.getString("categoria"), this.conexao.rs.getString("tipo"), this.conexao.rs.getString("valor"));

                vetProduto.add(this.produto);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return this.vetProduto;

    }

    public Produto getProdutoPorCod(int codigo) {

        this.sql = "select * from Produto where codigo=" +codigo;

        Produto produto = null;

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);
            if (this.conexao.rs.next()) {
                produto = new Produto(this.conexao.rs.getInt("codigo"), this.conexao.rs.getString("descricao"), this.conexao.rs.getString("categoria"), this.conexao.rs.getString("tipo"), this.conexao.rs.getString("valor"));


            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return produto;

    }

    public Vector getProdutoPorNome(String pesquisa) {

        this.sql = "select * from Produto where descricao like '%" + pesquisa + "%'";

        this.vetProduto = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {
                this.produto = new Produto(this.conexao.rs.getInt("codigo"), this.conexao.rs.getString("descricao"), this.conexao.rs.getString("categoria"), this.conexao.rs.getString("tipo"), this.conexao.rs.getString("valor"));

                vetProduto.add(this.produto);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return this.vetProduto;

    }

    public boolean setProduto(char operacao, Produto produto) {

        int codigo = produto.getCod();
        String descricao = produto.getDescricao();
        String categoria = produto.getCategoria();
        String tipo = produto.getTipo();
        String valor = produto.getValor();


        switch (operacao) {

            case 'I':

                this.sql = "insert into Produto( descricao, categoria, tipo, valor) values('" + descricao + "','" + categoria + "','" + tipo + "','" + valor + "')";

                break;

            case 'U':

                this.sql = "update Produto set descricao='" + descricao + "',categoria='" + categoria + "',tipo='" + tipo + "',valor='" + valor+"' where codigo= "+codigo;

                break;

            case 'D':

                this.sql = "delete from Produto where codigo=" +codigo;

                break;

            default:
                this.sql = "";

        }

        try {

            this.conexao.st.executeUpdate(this.sql);

            return true;

        } catch (Exception e) {

            e.printStackTrace();

            this.msg = "Erro=" + e.getMessage();

            return false;

        }
    }
}