package br.com.locadora;

import java.sql.*;
import java.util.*;

import comunica.Conexao;

public class UsuarioBD {

    private String sql = null;
    private String msg = null;
    private Conexao conexao;
    private Usuario usuario;
    private Vector vetUsuario;

    /**
     * Método construtor sem parametros
     */
    public UsuarioBD() {
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

    public boolean autenticaUsuario(Usuario usuario) {
        this.sql = "select * from usuario where login='" + usuario.getLogin() + "' and senha='" + usuario.getSenha() + " ' ";
        try {
            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            if (this.conexao.rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.msg = "Nao foi possivel inserir o usuário " + usuario.getLogin() + ".\nErro:" + e.getMessage();
            return false;
        }

    }

    public Usuario getUsuario(Usuario usuario) {
        this.sql = "select * from usuario where login='" + usuario.getLogin() + "'";
        try {
            this.conexao.rs = this.conexao.st.executeQuery(this.sql);
            if (this.conexao.rs.next()) {
                this.usuario = new Usuario(this.conexao.rs.getString("nome"), this.conexao.rs.getString("ogin"), this.conexao.rs.getString("senha"));

                return this.usuario;

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel recuperar o usuário " + usuario.getLogin() + ".\nErro:" + e.getMessage();

        }

        return this.usuario = null;

    }

    public Vector getUsuario() {

        this.sql = "select * from usuario order by login";

        this.vetUsuario = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {

                this.usuario = new Usuario(this.conexao.rs.getString("nome"), this.conexao.rs.getString("login"), this.conexao.rs.getString("senha"));

                this.vetUsuario.addElement(this.usuario);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\nErro:" + e.getMessage();

            getMsg();

        }

        return this.vetUsuario;

    }

    public Vector getUsuarioINI(Usuario usuario) {

        this.sql = "select * from usuario where nome like '" + usuario.getNome() + "%'";

        this.vetUsuario = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {

                this.usuario = new Usuario(this.conexao.rs.getString("NOME"), this.conexao.rs.getString("LOGIN"), this.conexao.rs.getString("SENHA"));

                vetUsuario.add(this.usuario);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return this.vetUsuario;

    }

    public boolean setUsuario(char operacao, Usuario usuario) {

        String login = usuario.getLogin();

        String senha = usuario.getSenha();

        String nome = usuario.getNome();

        switch (operacao) {

            case 'I':

                this.sql = "insert into usuario(nome,login,senha)values('" + nome + "','" + login + "','" + senha + "')";

                break;

            case 'U':

                this.sql = "update usuario set senha='" + senha + "',nome='" + nome + "' where login='" + login + "'";

                break;

            case 'D':

                this.sql = "delete from usuario where login='" + login + "'";

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