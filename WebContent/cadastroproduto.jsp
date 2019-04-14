<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
//Verifica se está logado
    if (session.getValue("loginUsuario") != null || session.getValue("senhaUsuario") != null) {
    } else {
        out.println("Você não está logado no sistema");
        out.println("<script>document.location.href='index.jsp';</script>");
    }
%>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <link rel="stylesheet" href="css/estilo.css" type="text/css" />
        <title>Cadastro de Produtos</title>
    </head>
    <body id="container">

        <!-- Div Cental -->
        <div id="geral">


            <!-- CabeÃ§alho -->
            <div id="topo">
                <div class="logo"><a href="index.jsp"><img src="img/title.png" width="150" height="90" /></a></div>

                <!-- menu -->
                <%@include file="menu.jsp" %>
                <!-- Fim menu -->

                <!-- Meio-->
                <div>
                    <div id="img"></div>

                    <div id="form">
                        <form action="rscadproduto.jsp" method="post" name="frmCadastro" target="_self" id="frmCadastro">
                            <div align="center">
                                <h1>Formulário de Cadastro de Produtos</h1>

                                <table width="80%"  border="0">
                                    <tr>
                                        <td width="12%"><span class="style1"><strong>Descrição:</strong></span></td>
                                        <td width="88%"><span class="style1">
                                                <input name="descricao" type="text" id="descricao" size="40">
                                            </span></td>
                                    </tr>
                                    
                                    <tr>
                                        <td><strong>Categoria:</strong></td>
                                        <td><span class="style1">
                                                <input name="categoria" type="text" id="categoria" size="20" />
                                            </span></td>
                                    </tr>
                                    <tr>
                                        <td><strong>Tipo:</strong></td>
                                        <td><span class="style1">
                                                <input name="tipo" type="text" id="tipo" size="20" />
                                            </span></tr>

                                    <tr>
                                        <td><strong>Valor:</strong></td>
                                        <td><strong>
                                                <input name="valor" type="text" id="valor" size="40" />
                                            </strong></tr>
                                   
                                    <tr>
                                        <td>&nbsp;</td>
                                        <td><strong>
                                                <input name="Eviar" type="submit" id="Eviar" value="Cadastrar" />
                                                <input name="limpar" type="submit" id="limpar" value="Limpar" />
                                            </strong></td>
                                    </tr>
                                </table>
                                <p class="style1"><strong>    </strong></p>
                            </div>
                        </form>
                    </div>


                    <!-- Fim Meio-->

                    <!-- Baixo -->
                    <div>
                        <%@include file="rodape.jsp" %>
                    </div>
                    <!-- Fim Baixo -->
                </div>
            </div>
    </body>
</html>
