<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="br.com.locadora.*" errorPage="erro.jsp"%>
<jsp:useBean id="filme" class="br.com.locadora.Filme"/>
<jsp:useBean id="fachada" class="br.com.locadora.Fachada"/>

<%
    String titulo = "", diretor = "", reservada = "", msg = "";
	int cod_filme, cod_categoria;
	float valor_locacao;
	
	cod_filme = request.getParameter("cod_filme");
	titulo = request.getParameter("titulo");
	diretor = request.getParameter("diretor");
	cod_categoria = request.getParameter("cod_categoria");
	valor_locacao = request.getParameter("valor_locacao");
	reservada = request.getParameter("reservada");
    
    
    filme.SetCodFilme(cod_filme);
    filme.setTitulo(titulo);
    filme.setCodcategoria(cod_categoria);
    filme.setDiretor(diretor);
    filme.setValorlocacao(valor_locacao);
    filme.setReservada(reservada);
	
    
    if (fachada.setFilme('I', filme)) {
        msg = "Cadastrado efetuado com Exito";
    } else {
        msg = "O cadastro n�o pode ser realizado";
    }

    response.sendRedirect("cadastrofilme.jsp");
%>
<center>
    <%=msg%>
</center>