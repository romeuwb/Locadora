package br.com.locadora;

public class Produto {

    private int codigo;
    private String descricao;
    private String categoria;
    private String tipo;
    private String valor;
    

    public Produto() {
    }

    public Produto(int codigo, String descricao, String categoria, String tipo, String valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.tipo = tipo;
        this.valor = valor;        
    }

    public int getCod() {
        return codigo;
    }

    public void setCod(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTtipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}