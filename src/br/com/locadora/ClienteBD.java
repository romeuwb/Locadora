package br.com.locadora;

import java.sql.*;
import java.util.*;

import comunica.Conexao;
import sun.misc.Cleaner;

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

    public boolean autenticaCliente(Cliente cliente) {
        this.sql = "select * from Cliente where login='" + cliente.getLogin()+ "' and senha='" + cliente.getSenha()+ " ' ";
        try {
            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            if (this.conexao.rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.msg = "Nao foi possivel inserir o Cliente " + cliente.getNome() + ".\nErro:" + e.getMessage();
            return false;
        }

    }

    public Cliente getClientePorLoginSenha(String login, String senha ) {

        this.sql = "select * from dbpi.cliente where login='" + login+ "' and senha='" +senha+ "'"  ;


        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            if (this.conexao.rs.next()) {
                this.cliente = new Cliente(this.conexao.rs.getInt("codigo"), this.conexao.rs.getString("nome"), this.conexao.rs.getString("login"), this.conexao.rs.getString("senha"), this.conexao.rs.getInt("tipo"), this.conexao.rs.getString("cpf"), this.conexao.rs.getString("rg"), this.conexao.rs.getString("sexo"), this.conexao.rs.getString("endereco"), this.conexao.rs.getString("telefone"), this.conexao.rs.getString("bairro"), this.conexao.rs.getString("cidade"));


            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return cliente;

    }

        public boolean autenticaFuncionario(Cliente cliente) {
        this.sql = "select * from Cliente where login='" + cliente.getLogin()+ "' and senha='" + cliente.getSenha()+ "' and tipo='" + cliente.getTipo()+ "' ";
        try {
            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            if (this.conexao.rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.msg = "Nao foi possivel inserir o Cliente " + cliente.getNome() + ".\nErro:" + e.getMessage();
            return false;
        }

    }
    
    
    public Cliente getCliente(Cliente cliente) {
        this.sql = "select * from Cliente where nome='" + cliente.getNome() + "'";
        try {
            this.conexao.rs = this.conexao.st.executeQuery(this.sql);
            if (this.conexao.rs.next()) {
                this.cliente = new Cliente(this.conexao.rs.getInt("codigo"), this.conexao.rs.getString("nome"), this.conexao.rs.getString("login"), this.conexao.rs.getString("senha"), this.conexao.rs.getInt("tipo"), this.conexao.rs.getString("cpf"), this.conexao.rs.getString("rg"), this.conexao.rs.getString("sexo"), this.conexao.rs.getString("endereco"), this.conexao.rs.getString("telefone"), this.conexao.rs.getString("bairro"), this.conexao.rs.getString("cidade"));

                return this.cliente;

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel recuperar o usuário " + cliente.getNome() + ".\nErro:" + e.getMessage();

        }

        return this.cliente = null;

    }

    public Vector getCliente() {

        this.sql = "select * from Cliente order by nome";

        this.vetCliente = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {

                this.cliente = new Cliente(this.conexao.rs.getInt("codigo"), this.conexao.rs.getString("nome"), this.conexao.rs.getString("login"), this.conexao.rs.getString("senha"), this.conexao.rs.getInt("tipo"), this.conexao.rs.getString("cpf"), this.conexao.rs.getString("rg"), this.conexao.rs.getString("sexo"), this.conexao.rs.getString("endereco"), this.conexao.rs.getString("telefone"), this.conexao.rs.getString("bairro"), this.conexao.rs.getString("cidade"));

                this.vetCliente.addElement(this.cliente);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\nErro:" + e.getMessage();

            getMsg();

        }

        return this.vetCliente;

    }
    
    public Cliente getClientePorCod(int codigo) {

        this.sql = "select * from dbpi.cliente where codigo=" + codigo;


        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            if (this.conexao.rs.next()) {
                this.cliente = new Cliente(this.conexao.rs.getInt("codigo"), this.conexao.rs.getString("nome"), this.conexao.rs.getString("login"), this.conexao.rs.getString("senha"), this.conexao.rs.getInt("tipo"), this.conexao.rs.getString("cpf"), this.conexao.rs.getString("rg"), this.conexao.rs.getString("sexo"), this.conexao.rs.getString("endereco"), this.conexao.rs.getString("telefone"), this.conexao.rs.getString("bairro"), this.conexao.rs.getString("cidade"));


            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return cliente;

    }

    public Vector getClientePorNome(String pesquisa) {

        this.sql = "select * from Cliente where nome like '" + pesquisa + "%'";

        this.vetCliente = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {
                this.cliente = new Cliente(this.conexao.rs.getInt("codigo"), this.conexao.rs.getString("nome"), this.conexao.rs.getString("login"), this.conexao.rs.getString("senha"), this.conexao.rs.getInt("tipo"), this.conexao.rs.getString("cpf"), this.conexao.rs.getString("rg"), this.conexao.rs.getString("sexo"), this.conexao.rs.getString("endereco"), this.conexao.rs.getString("telefone"), this.conexao.rs.getString("bairro"), this.conexao.rs.getString("cidade"));

                vetCliente.add(this.cliente);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return this.vetCliente;

    }
    public Vector getClienteINI(Cliente cliente) {

        this.sql = "select * from Cliente where nome like '" + cliente.getNome() + "%'";

        this.vetCliente = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {
                this.cliente = new Cliente(this.conexao.rs.getInt("codigo"), this.conexao.rs.getString("nome"), this.conexao.rs.getString("login"), this.conexao.rs.getString("senha"), this.conexao.rs.getInt("tipo"), this.conexao.rs.getString("cpf"), this.conexao.rs.getString("rg"), this.conexao.rs.getString("sexo"), this.conexao.rs.getString("endereco"), this.conexao.rs.getString("telefone"), this.conexao.rs.getString("bairro"), this.conexao.rs.getString("cidade"));

                vetCliente.add(this.cliente);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return this.vetCliente;

    }

    public boolean setCliente(char operacao, Cliente cliente) {

        int codigo=cliente.getCodigo();
        String nome = cliente.getNome();
        String login = cliente.getLogin();
        String senha= cliente.getSenha();
        int tipo = cliente.getTipo();
        String cpf = cliente.getCpf();
        String rg = cliente.getRg();
        String sexo = cliente.getSexo();
        String endereco = cliente.getEndereco();
        String telefone = cliente.getTelefone();
        String cidade = cliente.getCidade();
        String bairro = cliente.getBairro();
        

        switch (operacao) {

            case 'I':

                this.sql = "insert into cliente( nome, login, senha, tipo, sexo, cpf, rg, endereco, telefone, cidade, bairro) values('" + nome + "','" + login + "','" + senha + "','" + tipo + "','" + sexo + "', '" + cpf + "', '" + rg + "','" + endereco + "','" + telefone + "','" + cidade + "','" + bairro + "')";

                break;

            case 'U':

                this.sql = "update Cliente set nome='" + nome + "',login='" + login + "',senha='" + senha + "',tipo='" + tipo + "', cpf='" + cpf + "',rg='" + rg + "',sexo='" + sexo + "', endereco='" + endereco + "', telefone='" + telefone + "', cidade='" + cidade + "', bairro='" + bairro + "' where codigo=" +codigo;

                break;

            case 'D':

                this.sql = "delete from Cliente where codigo="+codigo;

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