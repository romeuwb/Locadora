package br.com.locadora;

import java.util.Date;

public class Locacao {

    private int cod_locacao;
    private int cod_cliente;
    private int cod_filme;
    private Date data_retirada;
    private Date data_devolucao;
  
    

    public Locacao() {
    }

    public Locacao(int cod_locacao, int cod_cliente, int cod_filme, Date data_retirada, Date data_devolucao) {
        this.setCodlocacao(cod_locacao);
        this.setCodcliente(cod_cliente);
        this.setCodfilme(cod_filme);
        this.setDataretirada(data_retirada);
        this.setDatadevolucao(data_devolucao);
        
    }

	public int getCodlocacao() {
		return cod_locacao;
	}

	public void setCodlocacao(int cod_locacao) {
		this.cod_locacao = cod_locacao;
	}

	public int getCodcliente() {
		return cod_cliente;
	}

	public void setCodcliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public int getCodfilme() {
		return cod_filme;
	}

	public void setCodfilme(int cod_filme) {
		this.cod_filme = cod_filme;
	}

	public Date getDataretirada() {
		return data_retirada;
	}

	public void setDataretirada(Date data_retirada) {
		this.data_retirada = data_retirada;
	}

	public Date getDatadevolucao() {
		return data_devolucao;
	}

	public void setDatadevolucao(Date data_devolucao) {
		this.data_devolucao = data_devolucao;
	}

	



}