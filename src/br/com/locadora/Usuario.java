
package br.com.locadora;
public class Usuario {
private String nome;
private String login;
private String senha;

public Usuario() {
}

public Usuario(String nome,String login,String senha) {
this.nome = nome;
this.login = login;
this.senha = senha;
}

public String getLogin() {
return this.login;
}

public String getNome() {
return this.nome;
}

public String getSenha() {
return this.senha;
}

public void setLogin(String login) {
this.login = login;
}

public void setNome(String nome) {
this.nome = nome;
}

public void setSenha(String senha) {
this.senha = senha;
}
}