<%@page import="javax.swing.JOptionPane"%>
<%@page import="br.com.locadora.*, java.util.*" %>
<jsp:useBean id="Filme" class="br.com.locadora.Filme"/>
<jsp:useBean id="fachada" class="br.com.locadora.Fachada"/>
<% fachada= new Fachada();
Filme = new Filme();
int codFilme= Integer.parseInt(request.getParameter("codFilme"));
String nome=request.getParameter("nome");
FilmeBD film=new FilmeBD();
film.setFilme("D".charAt(0), Filme);
out.println("alert('O Filme "+ nome +" foi excluído do sistema.Pressione F5 para atualizar.');");				  
response.sendRedirect("relFilme.jsp");
%>

