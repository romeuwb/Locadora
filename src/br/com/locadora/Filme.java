package br.com.locadora;

public class Filme {

    private int cod_filme;
    private String titulo;
    private int cod_categoria;
    private String diretor;
    private float valor_locacao;
    private String reservada;
    

    public Filme() {
    }

    public Filme(int cod_filme, String filme, int cod_categoria, String diretor, float valor_locacao,String reservada ) {
        this.cod_filme = cod_filme;
        this.titulo = titulo;
        this.cod_categoria = cod_categoria;
        this.diretor=diretor;
        this.valor_locacao=valor_locacao;
        this.reservada=reservada;
        
    }

    public int getCodfilme() {
        return cod_filme;
    }

    public void getCodFilme(int cod_filme) {
        this.cod_filme = cod_filme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo= titulo;
    }

    public int getCodcategoria() {
        return cod_categoria;
    }

    public void setCodcategoria(int cod_categoria) {
        this.cod_categoria = cod_categoria;
    }

  
    public float getValorlocacao() {
        return valor_locacao;
    }

    
	public void setValorlocacao(float valor_locacao) {
		this.valor_locacao = valor_locacao;
	}

	public String getReservada() {
		return reservada;
	}

	public void setReservada(String reservada) {
		this.reservada = reservada;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

}