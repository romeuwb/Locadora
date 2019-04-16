package br.com.locadora;

import java.sql.*;
import java.util.Vector;

public class Fachada {

    private String msg = null;
    private UsuarioBD ubd;
    private ClienteBD clbd;
    private FornecedorBD fordb;
    private FilmeBD prod;
    private LocacaoBD ped;

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

//****************operação com os objetos Usuario*************************** 
    public boolean autenticaUsuario(Usuario usuario) {
        this.ubd = new UsuarioBD();
        if (ubd.autenticaUsuario(usuario)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean setUsuario(char operacao, Usuario usuario) {
        this.ubd = new UsuarioBD();
        if (ubd.setUsuario(operacao, usuario)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna um usuario que tenho o login correpindente.
     *
     * @param login
     * @return Usuario u
     */
    public Usuario getUsuario(Usuario usuario) {
        this.ubd = new UsuarioBD();
        return this.ubd.getUsuario(usuario);
    }

    /**
     * Retorna o conjunto total de usuario cadastrado na base de dados. Para
     * recurar qualquer valor bastautilizar os metodos get e set da classe
     * básica.
     *
     * @param Sem parametro de entrada
     * @return Um vetor de objetos de Usuario.
     */
    public Vector getUsuario() {
        this.ubd = new UsuarioBD();
        return this.ubd.getUsuario();
    }

    public Vector getUsuarioINI(Usuario usuario) {
        this.ubd = new UsuarioBD();
        return this.ubd.getUsuarioINI(usuario);
    }
    /* OPERAÇOES COM CLIENTE PF
     * xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
     */

    public boolean setCliente(char operacao, Cliente cliente) {
        this.clbd = new ClienteBD();
        if (clbd.setCliente(operacao, cliente)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna um usuario que tenho o login correpindente.
     *
     * @param login
     * @return Usuario u
     */
    public Cliente getCliente(Cliente cliente) {
        this.clbd = new ClienteBD();
        return this.clbd.getCliente(cliente);
    }

    /**
     * Retorna o conjunto total de usuario cadastrado na base de dados. Para
     * recurar qualquer valor bastautilizar os metodos get e set da classe
     * básica.
     *
     * @param Sem parametro de entrada
     * @return Um vetor de objetos de Usuario.
     */
    public Vector getClientePF() {
        this.clbd = new ClienteBD();
        return this.clbd.getCliente();
    }

    public Vector getClienteINI(Cliente cliente) {
        this.clbd = new ClienteBD();
        return this.clbd.getClienteINI(cliente);
    }
    
    public Vector getNome(String pesquisa) {
        this.clbd = new ClienteBD();
        return this.clbd.getClientePorNome(pesquisa);
    }

    public Cliente getPorCod(int codigo) {
        this.clbd = new ClienteBD();
        return this.clbd.getClientePorCod(codigo);
    }
    /**
     * Operações com Fornecedor
     * xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
     *
     */
    public boolean setFornecedor(char operacao, Fornecedor fornecedor) {
        this.fordb = new FornecedorBD();
        if (fordb.setFornecedor(operacao, fornecedor)){
            return false;
        } else {
            return true;
        }
    }
    

    /**
     * Retorna um usuario que tenho o login correpindente.
     *
     * @param login
     * @return Usuario u
     */
    public Fornecedor getFornecedor(Fornecedor fornecedor) {
        this.fordb = new FornecedorBD();
        return this.fordb.getFornecedor(fornecedor);
    }

    /**
     * Retorna o conjunto total de usuario cadastrado na base de dados. Para
     * recurar qualquer valor bastautilizar os metodos get e set da classe
     * básica.
     *
     * @param Sem parametro de entrada
     * @return Um vetor de objetos de Usuario.
     */
    public Vector getFornecedor() {
        this.fordb = new FornecedorBD();
        return this.fordb.getFornecedor();
    }

    public Vector getClienteINI(Fornecedor fornecedor) {
        this.fordb = new FornecedorBD();
        return this.fordb.getFornecedorINI(fornecedor);
    }
        public Vector getFornecedorPorNome(String pesquisa) {
        this.fordb = new FornecedorBD();
        return this.fordb.getPesquisaPorNome(pesquisa);
    }

    public Fornecedor getFornecedorPorCod(int codigo) {
        this.fordb = new FornecedorBD();
        return this.fordb.getFornecedorPorCod(codigo);
    }

    /* 
     * OPERAÇÕES COM PRODUTOS
     * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     */

    public boolean autenticaProduto(Filme produto) {
        this.prod = new FilmeBD();
        if (prod.autenticaProduto(produto)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean setProduto(char operacao, Filme produto) {
        this.prod = new FilmeBD();
        if (prod.setProduto(operacao, produto)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna um usuario que tenho o login correpindente.
     *
     * @param login
     * @return Usuario u
     */
    public Filme getProduto(Filme produto) {
        this.prod = new FilmeBD();
        return this.prod.getProduto(produto);
    }

    /**
     * Retorna o conjunto total de usuario cadastrado na base de dados. Para
     * recurar qualquer valor bastautilizar os metodos get e set da classe
     * básica.
     *
     * @param Sem parametro de entrada
     * @return Um vetor de objetos de Usuario.
     */
    public Vector getProduto() {
        this.prod = new FilmeBD();
        return this.prod.getProduto();
    }

    public Vector getProdutoINI(Filme produto) {
        this.prod = new FilmeBD();
        return this.prod.getProdutoINI(produto);
    }
    public Vector getProdutoPorNome(String pesquisa) {
        this.prod = new FilmeBD();
        return this.prod.getProdutoPorNome(pesquisa);
    }

    public Filme getProdutoPorCod(int codigo) {
        this.prod = new FilmeBD();
        return this.prod.getProdutoPorCod(codigo);
    }

    /**
     * Operações com Pedidos
     * xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
     */
    public boolean autenticaPedido(Locacao pedido) {
        this.ped = new LocacaoBD();
        if (ped.autenticaPedido(pedido)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean setPedido(char operacao, Locacao pedido) {
        this.ped = new LocacaoBD();
        if (ped.setPedido(operacao, pedido)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna um usuario que tenho o login correpindente.
     *
     * @param login
     * @return Usuario u
     */
    public Locacao getPedido(Locacao pedido) {
        this.ped = new LocacaoBD();
        return this.ped.getPedido(pedido);
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
        this.ped = new LocacaoBD();
        return this.ped.getPedido();
    }

    public Vector getPedidoINI(Locacao pedido) {
        this.ped = new LocacaoBD();
        return this.ped.getPedidoINI(pedido);
    }
    public Vector getPedidoPorNome(String pesquisa) {
        this.ped = new LocacaoBD();
        return this.ped.getPesquisaPorNome(pesquisa);
    }

    public Locacao getPedidoPorCod(int codigo) {
        this.ped = new LocacaoBD();
        return this.ped.getPedPorCod(codigo);
    }
}