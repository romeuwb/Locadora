<%@page import="java.util.Date"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="br.com.locadora.*" errorPage="erro.jsp"%>
<jsp:useBean id="Cliente" class="br.com.locadora.Cliente"/>
<jsp:useBean id="Fachada" class="br.com.locadora.Fachada"/>

<%
    String rg = "", Nome = "", endereco = "", bairro = "", cidade = "", estado = "", telefone = "",email="",sexo="", msg = "";
	Date dtNascimento="";	
	
	rg = request.getParameter("rg");
    Nome = request.getParameter("nome");
    endereco = request.getParameter("endereco");
    bairro = request.getParameter("bairro");
    cidade = request.getParameter("cidade");
    estado = request.getParameter("estado");
    telefone = request.getParameter("telefone");
    email = request.getParameter("email");
    dtNascimento = request.getParameter("dtNascimento");
    sexo= request.getParameter("sexo");
    
    Cliente.setRg(rg);
    Cliente.setNome(Nome);
    Cliente.setEndereco(endereco);
    Cliente.setBairro(bairro);
    Cliente.setCidade(cidade);
    Cliente.setEstado(estado);
	Cliente.setTelefone(telefone);
	Cliente.setEmail(email);
	Cliente.setDtNascimento(dtNascimento);
	Cliente.setSexo(sexo);
    
    if (Fachada.setCliente('I', Cliente)) {
        msg = "Cadastrado efetuado com Exito";
    } else {
        msg = "O cadastro n�o pode ser realizado";
    }

    response.sendRedirect("cadastrocliente.jsp");
%>
<center>
    <%=msg%>
</center>