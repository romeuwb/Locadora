<%@ page language="java" import="java.sql.*"%>
<%
Class.forName("oracle.jdbc.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE");
Statement stm = con.createStatement();
%>