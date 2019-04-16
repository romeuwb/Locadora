<%@page import="javax.swing.JOptionPane"%>
<%@page import="br.com.locadora.*, java.util.*" %>
<jsp:useBean id="Locacao" class="br.com.locadora.Locacao"/>
<jsp:useBean id="fachada" class="br.com.locadora.Fachada"/>
<% fachada= new Fachada();
Locacao = new Locacao();
int cod_locacao= Integer.parseInt(request.getParameter("cod_locacao"));
String nome=request.getParameter("nome");
LocacaoBD loc=new LocacaoBD();
loc.setLocacao("D".charAt(0), Locacao);
out.println("alert('O Pedido "+ nome +" foi excluído do sistema.Pressione F5 para atualizar.');");				  
response.sendRedirect("relLocacao.jsp");
%>

