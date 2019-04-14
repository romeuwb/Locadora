package br.com.locadora;

import java.sql.*;
import java.util.*;

import comunica.Conexao;

public class PedidoBD {

    private String sql = null;
    private String msg = null;
    private Conexao conexao;
    private Pedido pedido;
    private Vector vetPedido;

    /**
     * Método construtor sem parametros
     */
    public PedidoBD() {
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

    public boolean autenticaPedido(Pedido pedido) {
        this.sql = "select * from Pedido where cod='" + pedido.getCod() + "' and descricao='" + pedido.getDescricao() + " ' ";
        try {
            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            if (this.conexao.rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.msg = "Nao foi possivel inserir o Pedido " + pedido.getDescricao() + ".\nErro:" + e.getMessage();
            return false;
        }

    }

    public Pedido getPedido(Pedido pedido) {
        this.sql = "select * from Pedido where codigo='" + pedido.getCod() + "'";
        try {
            this.conexao.rs = this.conexao.st.executeQuery(this.sql);
            if (this.conexao.rs.next()) {
                this.pedido = new Pedido(this.conexao.rs.getInt("cod"),this.conexao.rs.getInt("codprod"),this.conexao.rs.getInt("codcliente"), this.conexao.rs.getString("descricao"), this.conexao.rs.getString("valor"), this.conexao.rs.getString("data_pedido"), this.conexao.rs.getString("situacao"));

                return this.pedido;

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel recuperar o pedido " + pedido.getDescricao() + ".\nErro:" + e.getMessage();

        }

        return this.pedido = null;

    }

    public Vector getPedido() {

        this.sql = "select * from Pedido order by nome";

        this.vetPedido = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {
                this.pedido = new Pedido(this.conexao.rs.getInt("codigo"),this.conexao.rs.getInt("codprod"),this.conexao.rs.getInt("codcliente"), this.conexao.rs.getString("descricao"), this.conexao.rs.getString("valor"), this.conexao.rs.getString("data_pedido"), this.conexao.rs.getString("situacao"));

                this.vetPedido.addElement(this.pedido);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\nErro:" + e.getMessage();

            getMsg();

        }

        return this.vetPedido;

    }

    public Vector getPedidoINI(Pedido pedido) {

        this.sql = "select * from Pedido where nome like '" + pedido.getDescricao() + "%'";

        this.vetPedido = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {
                this.pedido = new Pedido(this.conexao.rs.getInt("codigo"),this.conexao.rs.getInt("codprod"),this.conexao.rs.getInt("codcliente"), this.conexao.rs.getString("descricao"), this.conexao.rs.getString("valor"), this.conexao.rs.getString("data_pedido"), this.conexao.rs.getString("situacao"));

                vetPedido.add(this.pedido);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return this.vetPedido;

    }

    public Pedido getPedPorCod(int codigo) {

        this.sql = "select * from Pedido where cod="+ codigo;

        Pedido pedido=null;

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            if (this.conexao.rs.next()) {
                this.pedido = new Pedido(this.conexao.rs.getInt("cod"),this.conexao.rs.getInt("codprod"),this.conexao.rs.getInt("codcliente"), this.conexao.rs.getString("descricao"), this.conexao.rs.getString("valor"), this.conexao.rs.getString("data_pedido"), this.conexao.rs.getString("situacao"));


            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return pedido;

    }
    public Vector getPesquisaPorNome(String pesquisa) {

        this.sql = "select * from Pedido where descricao like '%" + pesquisa + "%'";

        this.vetPedido = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {
                this.pedido = new Pedido(this.conexao.rs.getInt("codigo"),this.conexao.rs.getInt("codprod"),this.conexao.rs.getInt("codcliente"), this.conexao.rs.getString("descricao"), this.conexao.rs.getString("valor"), this.conexao.rs.getString("data_pedido"), this.conexao.rs.getString("situacao"));

                vetPedido.add(this.pedido);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return this.vetPedido;

    }
    
    public boolean setPedido(char operacao, Pedido pedido) {

        int cod = pedido.getCod();
        int codprod=pedido.getCodprod();
        int codcliente=pedido.getCodcliente();
        String descricao = pedido.getDescricao();
        String valor = pedido.getValor();
        String data_pedido = pedido.getData();
        String situacao = pedido.getSituacao();
        
        switch (operacao) {

            case 'I':

                this.sql = "insert into Pedido(codprod, codcliente, descricao, valor, data_pedido, situacao) values('" + codprod + "','" + codcliente + "','" + descricao + "','" + valor + "','" + data_pedido + "','"+situacao+ "')";

                break;

            case 'U':

                this.sql = "update Pedido set codprod='"+codprod+"',codcliente='"+codcliente+"', descricao='" + descricao + "',valor='" + valor + "',data_pedido='" + data_pedido + "', situacao='"+situacao+"' where cod= "+cod;

                break;

            case 'D':

                this.sql = "delete from Pedido where cod="+cod;

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