
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="br.com.locadora.Filme"%>
<%@page import="br.com.locadora.FilmeBD"%>
<%@page import="br.com.locadora.Locacao"%>

<%  
Date dataAtual = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
String dataStr = sdf.format(dataAtual);  
%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <link rel="stylesheet" href="css/estilo.css" type="text/css" />
        <title>Nova Locação</title>
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
                        <form action="rscadpedido.jsp?cod_locacao=1" method="post" name="frmCadastro" target="_self" id="frmCadastro">
                            <div align="center">
                                <h1>Formulário de Pedido</h1>

                                <table width="80%"  border="0">
                                    <tr>
                                        <td width="12%"><span class="style1"><strong>Codigo Locacao:</strong></span></td>
                                        <td width="88%"><span class="style1">
                                                <input name="codlocacao" type="text" id="codlocacao" size="40" >
                                            </span></td>
                                    </tr>

                                    <tr>
                                        <td><strong>Codigo Cliente:</strong></td>
                                        <td><span class="style1">
                                                <input name="codcliente" type="text" id="codcliente" size="20" />
                                            </span></td>
                                    </tr>
                                    <tr>
                                        <td><strong>Codigo Filme:</strong></td>
                                        <td><span class="style1">
                                                <input name="codfilme" type="text" id="codfilme" size="20"  />
                                            </span></tr>
                                    <tr>
                                        <td><strong>Data Retirada</strong></td>
                                        <td><span class="style1">
                                                <input name="dataretirada" type="text" id="dataretirada" size="20"  value="<%=dataStr%>" />
                                            </span></tr>
                                    </tr>
<tr>
                                        <td><strong>Data Devolucao</strong></td>
                                        <td><span class="style1">
                                                <input name="datadevolucao" type="text" id="datadevolucao" size="20"  />
                                            </span></tr>
                                    </tr>
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
