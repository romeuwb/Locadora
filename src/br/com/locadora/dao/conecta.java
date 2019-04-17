package br.com.locadora.dao;
import java.sql.*;

public class conecta {

    public static void main(String args[]) {

        try {
      
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","SYSTEM","ora7");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM DB_VIDEOLOCA;");
            while(rs.next()) {
               String name =  rs.getString("NOME");
               System.out.println(name);
            }
        }catch(SQLException e) 
        {
        System.out.println("Erro ao conectar com o banco");
        } catch(ClassNotFoundException ex)
           {
           System.out.println("Driver JDBC-ODBC não encontrado!");
            }finally 
               {
               System.out.println("Conexao finalizada....");
              } 
         
    }
}