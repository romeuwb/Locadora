package br.com.locadora.dao;

import java.sql.*;
import java.util.*;

import br.com.locadora.dao.Conexao;
import br.com.locadora.domain.Filme;

public class FilmeBD {

    private String sql = null;
    private String msg = null;
    private Conexao conexao;
    private Filme filme;
    private Vector vetFilme;

    /**
     * Metodo construtor sem parametros
     */
    public FilmeBD() {
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

    public Filme getTitulo(Filme filme) {
        this.sql = "select * from Filme where titulo='" + filme.getTitulo() + "'";
        try {
            this.conexao.rs = this.conexao.st.executeQuery(this.sql);
            if (this.conexao.rs.next()) {
                this.filme = new Filme(this.conexao.rs.getInt("cod_filme"),
                		this.conexao.rs.getString("titulo"), this.conexao.rs.getInt("cod_categoria"), this.conexao.rs.getString("diretor"), 
                		this.conexao.rs.getFloat("valor_locacao"),this.conexao.rs.getString("reservada"));

                return this.filme;

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel recuperar o produto " + filme.getTitulo() + ".\nErro:" + e.getMessage();

        }

        return this.filme = null;

    }

    public Vector getFilme() {

        this.sql = "select * from Filme order by descricao";

        this.vetFilme= new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {
            	this.filme = new Filme(this.conexao.rs.getInt("cod_filme"),
                		this.conexao.rs.getString("filme"), this.conexao.rs.getInt("cod_categoria"), this.conexao.rs.getString("diretor"), 
                		this.conexao.rs.getFloat("valor_locacao"),this.conexao.rs.getString("reservada"));

                this.vetFilme.addElement(this.filme);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\nErro:" + e.getMessage();

            getMsg();

        }

        return this.vetFilme;

    }

    public Vector getFilmeINI(Filme filme) {

        this.sql = "select * from Filme where titulo like '" + filme.getTitulo() + "%'";

        this.vetFilme = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {
            	this.filme = new Filme(this.conexao.rs.getInt("cod_filme"),
                		this.conexao.rs.getString("filme"), this.conexao.rs.getInt("cod_categoria"), this.conexao.rs.getString("diretor"), 
                		this.conexao.rs.getFloat("valor_locacao"),this.conexao.rs.getString("reservada"));

                vetFilme.add(this.filme);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return this.vetFilme;

    }

    public Filme getFilmePorCod(int cod_filme) {

        this.sql = "select * from Filme where cod_filme=" +cod_filme;

        Filme titulo = null;

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);
            if (this.conexao.rs.next()) {
            	this.filme = new Filme(this.conexao.rs.getInt("cod_filme"),
                		this.conexao.rs.getString("filme"), this.conexao.rs.getInt("cod_categoria"), this.conexao.rs.getString("diretor"), 
                		this.conexao.rs.getFloat("valor_locacao"),this.conexao.rs.getString("reservada"));


            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return filme;

    }

    public Vector getFilmePorNome(String pesquisa) {

        this.sql = "select * from Filme where descricao like '%" + pesquisa + "%'";

        this.vetFilme = new Vector();

        try {

            this.conexao.rs = this.conexao.st.executeQuery(this.sql);

            while (this.conexao.rs.next()) {
            	this.filme = new Filme(this.conexao.rs.getInt("cod_filme"),
                		this.conexao.rs.getString("filme"), this.conexao.rs.getInt("cod_categoria"), this.conexao.rs.getString("diretor"), 
                		this.conexao.rs.getFloat("valor_locacao"),this.conexao.rs.getString("reservada"));
                
            	vetFilme.add(this.filme);

            }

        } catch (Exception e) {

            this.msg = "Nao foi possivel realizar a consulta.\n Erro:" + e.getMessage() + "\n";

            getMsg();

        }

        return this.vetFilme;

    }

    public boolean setFilme(char operacao, Filme filme) {

        int cod_filme = filme.getCodfilme();
        String titulo = filme.getTitulo();
        int cod_categoria = filme.getCodcategoria();
        String diretor = filme.getDiretor();
        float valor_locacao = filme.getValorlocacao();
        String reservada = filme.getReservada();


        switch (operacao) {

            case 'I':

                this.sql = "insert into Filme( cod_filme, titulo, cod_categoria, diretor, valor_locacao, reservada ) values('" + cod_filme + "','" + titulo + "','" + cod_categoria + "','" + diretor + "','"+ valor_locacao +"', '"+reservada+"')";

                break;

            case 'U':

                this.sql = "update Filme set titulo='" + titulo + "',cod_categoria='" + cod_categoria + "',diretor='" + diretor + "',valor_locacao='" + valor_locacao+"', reservada='" + reservada + "' where cod_filme= "+cod_filme;

                break;

            case 'D':

                this.sql = "delete from Filme where cod_filme=" +cod_filme;

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