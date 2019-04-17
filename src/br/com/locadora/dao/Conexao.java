package br.com.locadora.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.*;

/** Classe que realiza conexao  com o banco de dados
*/

public class Conexao {

	private String	driver	= "oracle.jdbc.driver.OracleDriver";
	private String	url		= "jdbc:oracle:thin:@localhost:1521:XE";
	private String	user	= "SYSTEM";
	private String	senha	= "ora7";

	Statement st;
	Connection		conexao;
	private String	msg		= "";
	private String	sql		= null;
	ResultSet		rs		= null;

	/** Construtor default */

	public Conexao() {

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			this.conexao = DriverManager.getConnection(url, user, senha);

			this.st = this.conexao.createStatement();

			this.msg = "Conex�o estabelecida com exito !\n";

		} catch (ClassNotFoundException e) {
			this.msg = "Driver JDBC-ODBC não encontrado!.Verifique a classe do Driver";
			getmsg();
		} catch (Exception e) {
			this.msg = "Problemas na conexao com a fonte de dados,verifique o SQL passado.";
			getmsg();
		}
	}

	/** Método para imprimir no console */

	public void getmsg() {
		System.out.println(this.msg);
	}

	/**Método para retornar a variável de menagem*/

	public String getMsg() {
		return this.msg;
	}

	public void fecharConexao() {
		try {
			this.st.close();
			this.conexao.close();

		} catch (Exception e) {
			this.msg = "Não foi possível fechar a conexao";
			getmsg();
			e.printStackTrace();
		}
	}

	public Connection getConexao() {
		return conexao;
	}

}