<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.util.Date"%>
<%@page import="javax.mail.SendFailedException"%>
<%@page import="br.com.locadora.*" errorPage="erro.jsp"%>
<jsp:useBean id="locacao" class="br.com.locadora.Locacao"/>
<jsp:useBean id="fachada" class="br.com.locadora.Fachada" />

<%
	String msg="";
    Date data_retirada, data_devolucao;
    int cod_locacao, cod_cliente, cod_filme;
    
    cod_locacao = request.getParameter("cod_locacao");
    cod_cliente = session.getAttribute("cod_cliente").toString();
    cod_filme = request.getParameter("cod_filme");
    data_retirada = request.getParameter("data_retirada");
    data_devolucao = request.getParameter("data_devolucao");
    
    
    locacao.setCodlocacao(cod_locacao);
    locacao.setCodcliente(cod_cliente);
    locacao.setCodfilme(cod_filme);
    locacao.setDataretirada(data_retirada);
    locacao.setDatadevolucao(data_devolucao);
    
    
    if (fachada.setPedido('I', locacao)) {
        msg = "Pedido efetuado com Exito";
    } else {
        msg = "O pedido não pode ser realizado";
    }

    response.sendRedirect("index.jsp");
%>
<center>
    <%=msg%>
</center>