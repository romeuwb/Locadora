<%@ page language="java" import="java.sql.*"%>
<%

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dbpi","root","root");
Statement stm = con.createStatement();
%>