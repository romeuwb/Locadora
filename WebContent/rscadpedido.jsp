<%@page import="javax.swing.JOptionPane"%>
<%@page import="javax.mail.SendFailedException"%>
<%@page import="aula.*" errorPage="erro.jsp"%>
<jsp:useBean id="pedido" class="aula.Pedido"/>
<jsp:useBean id="fachada" class="aula.Fachada" />

<%
    String descricao = "", situacao = "", valor = "", data_pedido= "", msg = "";
    String codprod, codcliente;
    codprod = request.getParameter("codprod");
    codcliente = session.getAttribute("codcliente").toString();
    descricao = request.getParameter("descricao");
    situacao = request.getParameter("situacao");
    data_pedido = request.getParameter("data_pedido");
    valor = request.getParameter("valor");
    
    pedido.setDescricao(descricao);
    pedido.setData(data_pedido);
     pedido.setValor(valor);
    pedido.setSituacao(situacao);
    pedido.setCodprod(Integer.parseInt(codprod));
    pedido.setCodcliente(Integer.parseInt(codcliente));
    
    if (fachada.setPedido('I', pedido)) {
        msg = "Pedido efetuado com Exito";
    } else {
        msg = "O pedido não pode ser realizado";
    }

    response.sendRedirect("index.jsp");
%>
<center>
    <%=msg%>
</center>