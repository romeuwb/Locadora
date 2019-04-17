package br.com.locadora.dao;


import java.util.*;
import java.util.Date;

import br.com.locadora.domain.Cliente;

public class ClienteBD {

    private String sql = null;
    private String msg = null;
    private Conexao conexao;
    private Cliente cliente;
    private Vector vetCliente;

    /**
     * Método construtor sem parametros
     */
    public ClienteBD() {
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
    
    public Cliente getCliente(Cliente cliente) {
        this.sql = "select * from Clientes where nome='" + cliente.getNome() + "'";
        try {
            this.conexao.rs = this.conexao.st.executeQuery(this.sql);
            if (this.conexao.rs.next()) {
                this.cliente = new Cliente(this.conexao.rs.getInt("cod_Cliente"), this.conexao.rs.getString("rg"), this.conexao.rs.getString("Nome"), this.conexao.rs.getString("endereco"), 
                		this.conexao.rs.getString("bairro"), this.conexao.rs.getString("cidade"), this.conexao.rs.getString("estado"), this.conexao.rs.getString("telefone"), 
                		this.conexao.rs.getString("email"), this.conexao.rs.getDate("datanascimentos"), this.conexao.rs.getString("sexo"));

                return this.cliente;

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel recuperar o usuario " + cliente.getNome() + ".\nErro:" + e.getMessage();

        }

        return this.cliente = null;

    }

    public Vector getCliente() {

        this.sql = "select * from Clientes order by nome";

        this.vetCliente = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {

            	this.cliente = new Cliente(this.conexao.rs.getInt("cod_Cliente"), this.conexao.rs.getString("rg"), this.conexao.rs.getString("Nome"), this.conexao.rs.getString("endereco"), 
                		this.conexao.rs.getString("bairro"), this.conexao.rs.getString("cidade"), this.conexao.rs.getString("estado"), this.conexao.rs.getString("telefone"), 
                		this.conexao.rs.getString("email"), this.conexao.rs.getDate("datanascimento"), this.conexao.rs.getString("sexo"));


                this.vetCliente.addElement(this.cliente);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\nErro:" + e.getMessage();

            getMsg();

        }

        return this.vetCliente;

    }
    
    public Cliente getClientePorCod(int codigo) {

        this.sql = "select * from Clientes where codigo=" + codigo;


        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            if (this.conexao.rs.next()) {
            	this.cliente = new Cliente(this.conexao.rs.getInt("cod_Cliente"), this.conexao.rs.getString("rg"), this.conexao.rs.getString("Nome"), this.conexao.rs.getString("endereco"), 
                		this.conexao.rs.getString("bairro"), this.conexao.rs.getString("cidade"), this.conexao.rs.getString("estado"), this.conexao.rs.getString("telefone"), 
                		this.conexao.rs.getString("email"), this.conexao.rs.getDate("datanascimento"), this.conexao.rs.getString("sexo"));



            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return cliente;

    }

    public Vector getClientePorNome(String pesquisa) {

        this.sql = "select * from Clientes where nome like '" + pesquisa + "%'";

        this.vetCliente = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {
            	this.cliente = new Cliente(this.conexao.rs.getInt("cod_Cliente"), this.conexao.rs.getString("rg"), this.conexao.rs.getString("Nome"), this.conexao.rs.getString("endereco"), 
                		this.conexao.rs.getString("bairro"), this.conexao.rs.getString("cidade"), this.conexao.rs.getString("estado"), this.conexao.rs.getString("telefone"), 
                		this.conexao.rs.getString("email"), this.conexao.rs.getDate("datanascimento"), this.conexao.rs.getString("sexo"));


                vetCliente.add(this.cliente);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return this.vetCliente;

    }
    public Vector getClienteINI(Cliente cliente) {

        this.sql = "select * from Clientes where nome like '" + cliente.getNome() + "%'";

        this.vetCliente = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {
            	this.cliente = new Cliente(this.conexao.rs.getInt("cod_Cliente"), this.conexao.rs.getString("rg"), this.conexao.rs.getString("Nome"), this.conexao.rs.getString("endereco"), 
                		this.conexao.rs.getString("bairro"), this.conexao.rs.getString("cidade"), this.conexao.rs.getString("estado"), this.conexao.rs.getString("telefone"), 
                		this.conexao.rs.getString("email"), this.conexao.rs.getDate("datanascimento"), this.conexao.rs.getString("sexo"));


                vetCliente.add(this.cliente);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return this.vetCliente;

    }

    public boolean setCliente(char operacao, Cliente cliente) {

        int codCliente=cliente.getCodCliente();
        String rg = cliente.getRg();
        String Nome = cliente.getNome();
        String endereco= cliente.getEndereco();
        String bairro = cliente.getBairro();
        String cidade = cliente.getCidade();
        String estado = cliente.getEstado();
        String telefone = cliente.getTelefone();
        String email = cliente.getEmail();
        Date dtNascimento = cliente.getDataNascimento();
        String sexo = cliente.getSexo();
        
        

        switch (operacao) {

            case 'I':

                this.sql = "insert into Clientes( cod_Cliente, rg, Nome, endereco, bairro, cidade, estado, telefone, email, sexo) values('" + codCliente + "','" + rg + "','" + Nome + "','" + endereco + "','" + bairro + "', '" + cidade + "', '" + estado + "','" + telefone + "','" + email + "','" + sexo + "')";

                break;

            case 'U':

                this.sql = "update Clientes set rg='" + rg + "',Nome='" + Nome + "',endereco='" + endereco + "',bairro='" + bairro + "', cidade='" + cidade + "',estado='" + estado + "',telefone='" + telefone + "', email='" + email + "', datanascimento='" + dtNascimento + "', sexo='" + sexo + "' where cod_Cliente=" +codCliente;

                break;

            case 'D':

                this.sql = "delete from Clientes where cod_Cliente="+codCliente;

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