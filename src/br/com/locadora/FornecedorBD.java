package br.com.locadora;

import java.sql.*;
import java.util.*;

import comunica.Conexao;

public class FornecedorBD {

    private String sql = null;
    private String msg = null;
    private Conexao conexao;
    private Fornecedor fornecedor;
    private Vector vetCliente;

    /**
     * Método construtor sem parametros
     */
    public FornecedorBD() {
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

    public boolean autenticaCliente(Fornecedor fornecedor) {
        this.sql = "select * from fornecedor where codigo='" + fornecedor.getCodigo() + "' and nome='" + fornecedor.getNome() + " ' ";
        try {
            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            if (this.conexao.rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.msg = "Nao foi possivel inserir o Fornecedor " + fornecedor.getNome() + ".\nErro:" + e.getMessage();
            return false;
        }

    }

    public Fornecedor getFornecedor(Fornecedor fornecedor) {
        this.sql = "select * from fornecedor where nome='" + fornecedor.getNome() + "'";
        try {
            this.conexao.rs = this.conexao.st.executeQuery(this.sql);
            if (this.conexao.rs.next()) {
                this.fornecedor = new Fornecedor (this.conexao.rs.getInt("codigo"), this.conexao.rs.getString("nome"), this.conexao.rs.getString("cpf"), this.conexao.rs.getString("rg"), this.conexao.rs.getString("endereco"), this.conexao.rs.getString("telefone"), this.conexao.rs.getString("bairro"), this.conexao.rs.getString("cidade"));

                return this.fornecedor;

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel recuperar o usuário " + fornecedor.getNome() + ".\nErro:" + e.getMessage();

        }

        return this.fornecedor = null;

    }

    public Vector getFornecedor() {

        this.sql = "select * from fornecedor order by nome";

        this.vetCliente = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {

                this.fornecedor = new Fornecedor(this.conexao.rs.getInt("codigo"), this.conexao.rs.getString("nome"), this.conexao.rs.getString("cpf"), this.conexao.rs.getString("rg"), this.conexao.rs.getString("endereco"), this.conexao.rs.getString("telefone"), this.conexao.rs.getString("bairro"), this.conexao.rs.getString("cidade"));

                this.vetCliente.addElement(this.fornecedor);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\nErro:" + e.getMessage();

            getMsg();

        }

        return this.vetCliente;

    }

    public Fornecedor getFornecedorPorCod(int codigo) {

        this.sql = "select * from fornecedor where codigo=" + codigo;

        Fornecedor fornecedor = null;

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            if (this.conexao.rs.next()) {
                fornecedor = new Fornecedor(this.conexao.rs.getInt("codigo"), this.conexao.rs.getString("nome"), this.conexao.rs.getString("cpf"), this.conexao.rs.getString("rg"), this.conexao.rs.getString("endereco"), this.conexao.rs.getString("telefone"), this.conexao.rs.getString("bairro"), this.conexao.rs.getString("cidade"));


            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return fornecedor;

    }

    public Vector getPesquisaPorNome(String pesquisa) {

        this.sql = "select * from fornecedor where nome like '%" + pesquisa + "%'";

        this.vetCliente = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {
                this.fornecedor = new Fornecedor(this.conexao.rs.getInt("codigo"), this.conexao.rs.getString("nome"), this.conexao.rs.getString("cpf"), this.conexao.rs.getString("rg"), this.conexao.rs.getString("endereco"), this.conexao.rs.getString("telefone"), this.conexao.rs.getString("bairro"), this.conexao.rs.getString("cidade"));

                vetCliente.add(this.fornecedor);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return this.vetCliente;

    }

    public Vector getFornecedorINI(Fornecedor fornecedor) {

        this.sql = "select * from fornecedor where nome like '" + fornecedor.getNome() + "%'";

        this.vetCliente = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {
                this.fornecedor = new Fornecedor(this.conexao.rs.getInt("codigo"), this.conexao.rs.getString("nome"), this.conexao.rs.getString("cpf"), this.conexao.rs.getString("rg"), this.conexao.rs.getString("endereco"), this.conexao.rs.getString("telefone"), this.conexao.rs.getString("bairro"), this.conexao.rs.getString("cidade"));

                vetCliente.add(this.fornecedor);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return this.vetCliente;

    }

    public boolean setFornecedor(char operacao, Fornecedor fornecedor) {

        int codigo = fornecedor.getCodigo();
        String nome = fornecedor.getNome();
        String cpf = fornecedor.getCpf();
        String rg = fornecedor.getRg();
        String endereco = fornecedor.getEndereco();
        String telefone = fornecedor.getTelefone();
        String cidade = fornecedor.getCidade();
        String bairro = fornecedor.getBairro();


        switch (operacao) {

            case 'I':

                this.sql = "insert into fornecedor( nome, cpf, rg, endereco, telefone, cidade, bairro) values('" + nome + "','" + cpf + "','" + rg + "','" + endereco + "','" + telefone + "','" + cidade + "','" + bairro + "')";

                break;

            case 'U':

                this.sql = "update fornecedor set nome='" + nome + "',cpf='" + cpf + "',rg='" + rg + "', endereco='" + endereco + "', telefone='" + telefone + "', cidade='" + cidade + "', bairro='" + bairro + "' where codigo=" + codigo;

                break;

            case 'D':

                this.sql = "delete from fornecedor where codigo=" + codigo;

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