package br.com.locadora;

import java.sql.*;
import java.util.Vector;

public class Fachada {

    private String msg = null;
    private ClienteBD clbd;
    private FilmeBD film;
    private LocacaoBD loc;

    /**
     * Construtor padrao default
     */
    public Fachada() {
    }

    public void getmsg() {
        System.out.print(this.msg);
    }

    public String getMsg() {
        return this.msg;
    }

    /**
     * Retorna o conjunto total de usuario cadastrado na base de dados. Para
     * recuperar qualquer valor bastautilizar os metodos get e set da classe
     * basica.
     *
     * @param Sem parametro de entrada
     * @return Um vetor de objetos de Usuario.
     */
    public boolean setCliente(char operacao, Cliente cliente) {
        this.clbd = new ClienteBD();
        if (clbd.setCliente(operacao, cliente)) {
            return true;
        } else {
            return false;
        }
    }
    
    public Vector getCliente() {
        this.clbd = new ClienteBD();
        return this.clbd.getCliente();
    }

    public Vector getClienteINI(Cliente cliente) {
        this.clbd = new ClienteBD();
        return this.clbd.getClienteINI(cliente);
    }
    
    public Vector getClientePorNome(String pesquisa) {
        this.clbd = new ClienteBD();
        return this.clbd.getClientePorNome(pesquisa);
    }

    public Cliente getPorCod(int codigo) {
        this.clbd = new ClienteBD();
        return this.clbd.getClientePorCod(codigo);
    }
    
    /* 
     * OPERAÇÕES COM PRODUTOS
     * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     */

       public boolean setProduto(char operacao, Filme filme) {
        this.film = new FilmeBD();
        if (film.setFilme(operacao, filme)) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Retorna o conjunto total de usuario cadastrado na base de dados. Para
     * recurar qualquer valor bastautilizar os metodos get e set da classe
     * básica.
     *
     * @param Sem parametro de entrada
     * @return Um vetor de objetos de Usuario.
     */
    public Vector getFilme() {
        this.film = new FilmeBD();
        return this.film.getFilme();
    }

    public Vector getProdutoINI(Filme produto) {
        this.film = new FilmeBD();
        return this.film.getFilmeINI(produto);
    }
    public Vector getProdutoPorNome(String pesquisa) {
        this.film = new FilmeBD();
        return this.film.getFilmePorNome(pesquisa);
    }

    public Filme getProdutoPorCod(int codigo) {
        this.film = new FilmeBD();
        return this.film.getFilmePorCod(codigo);
    }

    /**
     * Operações com Loca��o
     * xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
     */
      public boolean setPedido(char operacao, Locacao pedido) {
        this.loc = new LocacaoBD();
        if (loc.setLocacao(operacao, pedido)) {
            return true;
        } else {
            return false;
        }
    }

   
    /**
     * Retorna o conjunto total de usuario cadastrado na base de dados. Para
     * recurar qualquer valor bastautilizar os metodos get e set da classe
     * básica.
     *
     * @param Sem parametro de entrada
     * @return Um vetor de objetos de Usuario.
     */
    public Vector getPedido() {
        this.loc = new LocacaoBD();
        return this.loc.getPedido();
    }

    public Vector getPedidoINI(Locacao pedido) {
        this.loc = new LocacaoBD();
        return this.loc.getLocacaoINI(pedido);
    }
    public Vector getPedidoPorNome(String pesquisa) {
        this.loc = new LocacaoBD();
        return this.loc.getPesquisaPorNome(pesquisa);
    }

    public Locacao getPedidoPorCod(int codigo) {
        this.loc = new LocacaoBD();
        return this.loc.getLocacaoPorCod(codigo);
    }
}