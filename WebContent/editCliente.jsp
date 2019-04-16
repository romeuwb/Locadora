<%@page import="aula.*, java.util.*" %>
<jsp:useBean id="fornecedor" class="aula.Fornecedor"/>
<jsp:useBean id="fachada" class="aula.Fachada"/>

<%
//Verifica se está logado
    if (session.getAttribute("loginUsuario") != null) {
    } else {

        response.sendRedirect("index.jsp");
    }
%>

<%
    String codigo = "";
    fachada = new Fachada();

    codigo = request.getParameter("codigo");
    int codInt = Integer.parseInt(codigo);
    fornecedor = fachada.getFornecedorPorCod(codInt);


%>




<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <link rel="stylesheet" href="css/estilo.css" type="text/css" />
        <title>Personalité Noivas</title>
    </head>
    <body id="container">

        <!-- Div Cental -->
        <div id="geral">


            <!-- Cabeçalho -->
            <div id="topo">
                <div class="logo"><a href="index.jsp"><img src="img/title.png" width="150" height="90" /></a></div>
                <!-- menu -->
                <%@include file="menu.jsp" %>

                <!-- Meio-->
                <div>

                    <div id="meio">
                        <div id="form">
                            <div align="center">
                                <p class="style1"><strong>.: Altera&ccedil;&atilde;o de dados do Funcionário</strong> :.</p>
                                <form action="rseditFornecedor.jsp" method="post" name="editaFornecedor" id="editaFornecedor">
                                    <input type="hidden" name="operacao" value="U"/>
                                    <input type="hidden" name="codigo" value="<%=fornecedor.getCodigo()%>"/>
                                    <table width="35%" border="0">

                                        <tr>
                                            <tr>
                                                <td width="14%"><span class="style1">Nome:</span></td>
                                                <td width="86%"><input name="nome" type="text" id="nome" value="<%=fornecedor.getNome()%>" size="40"></td>
                                            </tr>

                                            <tr> 
                                                <td height="22"><span class="style1">CPF:</span></td>
                                                <td><input name="cpf" type="text" id="cpf" value="<%=fornecedor.getCpf()%>" size="15" maxlength="15"></td>
                                            </tr>
                                            <tr> 
                                                <td height="22"><span class="style1">RG:</span></td>
                                                <td><input name="rg" type="text" id="rg" value="<%=fornecedor.getRg()%>" size="15" maxlength="15"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">Endere&ccedil;o:</span></td>
                                                <td><input name="endereco" type="text" id="endereco" value="<%=fornecedor.getEndereco()%>" size="40"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">Telefone:</span></td>
                                                <td><input name="telefone" type="text" id="telefone" value="<%=fornecedor.getTelefone()%>" size="10"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">Bairro:</span></td>
                                                <td><input name="bairro" type="text" id="bairro" value="<%=fornecedor.getBairro()%>" size="10"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">Cidade:</span></td>
                                                <td><input name="cidade" type="text" id="telefone" value="<%=fornecedor.getCidade()%>" size="15"></td>
                                            </tr>
                                    </table>
                                    <input name="enviar" type="submit" id="enviar" value="Atualizar">
                                </form>
                            </div>
                        </div>
                    </div>
                    <!-- Fim Meio-->

                    <!-- Baixo -->
                    <div>
                        <%@include file="rodape.jsp" %>
                    </div>
                </div>
                <!-- Fim Baixo -->
            </div>
        </div>
    </body>
</html>
