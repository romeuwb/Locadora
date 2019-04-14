package br.com.locadora;

import java.sql.*;

import java.util.*;

/** Classe que realiza conexão com o banco
de dados

Neste exemplo é mostrado para um conexão com o Banco de Dados
MySQL.

Pode-se passar o nome ou o IP para identificar o servidor.

Server=localhost\SQLEXPRESS;Database=master;Trusted_Connection=True;

*/

public class Conexao{

String jdbc="jdbc:sql://localhost/dbpi" ;

private String usuario = "root";

private String senha = "root";

Statement st;

Connection conexao;

private String msg="";

private String sql=null;

ResultSet rs=null;

/** Construtor default */

public Conexao() {

try{

Class.forName("com.mysql.jdbc.Driver");

this.conexao = DriverManager.getConnection(jdbc,usuario,senha);

this.st = this.conexao.createStatement();

this.msg="Conexão estabelecida com exito !\n";

}

catch(ClassNotFoundException e) {

this.msg="Driver JDBC-ODBC não encontrado!.Verifique a classe do Driver";

getmsg();

}

catch(Exception e) {

this.msg="Problemas na conexao com a fonte de dados,verifique o SQL passado.";

getmsg();

}

}

/** Método para imprimir no console */

public void getmsg(){

System.out.println(this.msg);

}

/**Método para retornar a variável
de menagem*/

public String getMsg(){

return this.msg;

}

public void fecharConexao(){

try{

this.st.close();

this.conexao.close();

}catch(Exception e){

this.msg="Não foi possível fechar a conexao";

getmsg();

e.printStackTrace();

}

}

public Connection getConexao() {

return conexao;

}

}