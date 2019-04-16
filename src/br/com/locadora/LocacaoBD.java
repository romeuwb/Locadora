package br.com.locadora;

import java.sql.*;
import java.util.*;
import java.util.Date;

import br.com.locadora.Conexao;

public class LocacaoBD {

    private String sql = null;
    private String msg = null;
    private Conexao conexao;
    private Locacao locacao;
    private Vector vetLocacao;

    /**
     * Método construtor sem parametros
     */
    public LocacaoBD() {
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



    public Locacao getLocacao(Locacao locacao) {
        this.sql = "select * from Locacao where cod_locacoes='" + locacao.getCodlocacao() + "'";
        try {
            this.conexao.rs = this.conexao.st.executeQuery(this.sql);
            if (this.conexao.rs.next()) {
                this.locacao = new Locacao(this.conexao.rs.getInt("cod_locacao"),this.conexao.rs.getInt("cod_cliente"),this.conexao.rs.getInt("cod_filme"), 
                		this.conexao.rs.getDate("data_retirada"), this.conexao.rs.getDate("data_devolucao"));

                return this.locacao;

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel recuperar a locacoes " + locacao.getCodlocacao() + ".\nErro:" + e.getMessage();

        }

        return this.locacao = null;

    }

    public Vector getPedido() {

        this.sql = "select * from locacoes order by nome";

        this.vetLocacao = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {
            	this.locacao = new Locacao(this.conexao.rs.getInt("cod_locacao"),this.conexao.rs.getInt("cod_cliente"),this.conexao.rs.getInt("cod_filme"), 
                		this.conexao.rs.getDate("data_retirada"), this.conexao.rs.getDate("data_devolucao"));

                this.vetLocacao.addElement(this.locacao);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\nErro:" + e.getMessage();

            getMsg();

        }

        return this.vetLocacao;

    }

    public Vector getLocacaoINI(Locacao locacao) {

        this.sql = "select * from Locacoes where nome like '" + locacao.getCodlocacao() + "%'";

        this.vetLocacao = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {
            	this.locacao = new Locacao(this.conexao.rs.getInt("cod_locacao"),this.conexao.rs.getInt("cod_cliente"),this.conexao.rs.getInt("cod_filme"), 
                		this.conexao.rs.getDate("data_retirada"), this.conexao.rs.getDate("data_devolucao"));

                vetLocacao.add(this.locacao);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return this.vetLocacao;

    }

    public Locacao getLocacaoPorCod(int cod_locacao) {

        this.sql = "select * from Locacoes where cod_locacao="+ cod_locacao;

        Locacao locacao=null;

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            if (this.conexao.rs.next()) {
            	this.locacao = new Locacao(this.conexao.rs.getInt("cod_locacao"),this.conexao.rs.getInt("cod_cliente"),this.conexao.rs.getInt("cod_filme"), 
                		this.conexao.rs.getDate("data_retirada"), this.conexao.rs.getDate("data_devolucao"));

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return locacao;

    }
    public Vector getPesquisaPorNome(String pesquisa) {

        this.sql = "select * from Locacoes where descricao like '%" + pesquisa + "%'";

        this.vetLocacao = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {
            	this.locacao = new Locacao(this.conexao.rs.getInt("cod_locacao"),this.conexao.rs.getInt("cod_cliente"),this.conexao.rs.getInt("cod_filme"), 
                		this.conexao.rs.getDate("data_retirada"), this.conexao.rs.getDate("data_devolucao"));

                vetLocacao.add(this.locacao);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return this.vetLocacao;

    }
    
    public boolean setLocacao(char operacao, Locacao locacao) {

        int cod_locacao = locacao.getCodlocacao();
        int cod_cliente=locacao.getCodcliente();
        int cod_filme=locacao.getCodfilme();
        Date data_retirada = locacao.getDataretirada();
        Date data_devolucao = locacao.getDatadevolucao();
        
        
        switch (operacao) {

            case 'I':

                this.sql = "insert into Locacoes(cod_locacao, cod_cliente, cod_filme, data_retirada, data_devolucao) values('" + cod_locacao + "','" + cod_cliente + "','" + cod_filme + "','" + data_retirada + "','" + data_devolucao + "')";

                break;

            case 'U':

                this.sql = "update Locacoes set cod_cliente='"+cod_cliente+"', cod_filme='" + cod_filme + "',data_retirada='" + data_retirada + "',data_devolucao='" + data_devolucao + "' where cod_locacao='"+cod_locacao;

                break;

            case 'D':

                this.sql = "delete from Locacoes where cod_locacao="+cod_locacao;

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