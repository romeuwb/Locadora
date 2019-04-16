<%@ page language="java" import="java.sql.*"%>
<%
Class.forName("com.microsoft.sqlserver.jdbc.sqlserverdriver");
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DB_VIDEOLOCA");
Statement stm = con.createStatement();
%>