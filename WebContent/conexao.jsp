<%@ page language="java" import="java.sql.*"%>
<%

Class.forName("com.sql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DB_VIDEOLOCA","sa","sql7");
Statement stm = con.createStatement();
%>