package br.com.locadora.domain;
import java.util.Date;

public class Cliente {

	private int cod_Cliente;
	private String rg;
	private String Nome;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefone;
	private String email;
	private Date dataNascimento ;
	private String sexo;
	
     
    public Cliente(int cod_Cliente, String rg, String Nome,	String endereco, String bairro,	String cidade, String estado, String telefone, 	String email, Date dataNascimento, String sexo) {
        this.cod_Cliente = cod_Cliente;
        this.rg = rg;
        this.Nome = Nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public Cliente() {
		super();
	}
	public int getCodCliente() {
		return cod_Cliente;
	}
	public void setCodCliente(int cod_Cliente) {
		this.cod_Cliente = cod_Cliente;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;

    
	}
}