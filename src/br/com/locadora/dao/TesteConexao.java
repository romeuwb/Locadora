package br.com.locadora.dao;

public class TesteConexao {

	public static void main(String[] args) {
		 try {
		Conexao con = new Conexao();
		con.getConexao();
		con.getMsg();
		System.out.println("Conexao ok");
	
	}
		 catch(Exception e) {
	            System.out.println("Erro ao conectar com o banco");
	        } finally {
	            System.out.println("Conexao finalizada....");
	        }
	}	

}