package br.com.locadora;

public class Pedido {

    private int codigo;
    private String descricao;
    private String valor;
    private String data_pedido;
    private String situacao;
    private int codprod;
    private int codcliente;
    

    public Pedido() {
    }

    public Pedido(int codigo, int codprod, int codcliente, String descricao, String valor, String data_pedido, String situacao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.data_pedido = data_pedido;
        this.situacao=situacao;
        this.codprod=codprod;
        this.codcliente=codcliente;
        
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getData() {
        return data_pedido;
    }

    public void setData(String data_pedido) {
        this.data_pedido = data_pedido;
    }
    
    public String getSituacao(){
        return situacao;
    }
    public void setSituacao(String situacao){
        this.situacao= situacao;
    }

    public int getCodprod() {
        return codprod;
    }

    public void setCodprod(int codprod) {
        this.codprod = codprod;
    }

    public int getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(int codcliente) {
        this.codcliente = codcliente;
    }
}