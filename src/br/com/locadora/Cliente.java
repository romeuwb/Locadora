package br.com.locadora;
import java.util.Date;

public class Cliente {

	private int codCliente;
	private String rg;
	private String Nome;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefone;
	private String email;
	private Date dtNascimento ;
	private char sexo;
	
     
    public Cliente(int codCliente, String rg, String Nome,	String endereco, String bairro,	String cidade, String estado, String telefone, 	String email, Date dtNascimento, char sexo) {
        this.codCliente = codCliente;
        this.rg = rg;
        this.Nome = Nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
    }

    public Cliente() {
		super();
	}
	public int getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
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
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;

    
	}
}