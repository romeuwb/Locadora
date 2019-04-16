<%@page import="br.com.locadora.*, java.util.*" %>
<jsp:useBean id="locacao" class="br.com.locadora.Locacao"/>
<jsp:useBean id="fachada" class="br.com.locadora.Fachada"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <link rel="stylesheet" href="css/estilo.css" type="text/css" />
        <title>Locator</title>
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
                                <p class="style1"><strong>.: Altera&ccedil;&atilde;o de dados do Pedido</strong> :.</p>
                                <form action="rscadlocacao.jsp" method="post" name="editaPedido id="editaPedido">
                                    <input type="hidden" name="operacao" value="U"/>
                                    <input type="hidden" name="codigo" value="<%=locacao.getCodlocacao()%>"/>
                                    <table width="35%" border="0">

                                        <tr>
                                            <tr>
                                                <td width="14%"><span class="style1">Codigo Locacao:</span></td>
                                                <td width="86%"><input name="codlocacao" type="text" id="codlocacao" value="<%=locacao.getCodlocacao()%>" size="40"></td>
                                            </tr>

                                            <tr> 
                                                <td height="22"><span class="style1">codigo Cliente:</span></td>
                                                <td><input name="codcliente" type="text" id="codcliente" value="<%=locacao.getCodcliente()%>" size="15" maxlength="15"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">Codigo Filme:</span></td>
                                                <td><input name="codfilme" type="text" id="codfilme" value="<%=locacao.getCodfilme()%>" size="10"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">Data Retirada:</span></td>
                                                <td><input name="dataretirada" type="text" id="dataretirada" value="<%=locacao.getDataretirada()%>" size="10"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">Data Devolucao:</span></td>
                                                <td><input name="datadevolucao" type="text" id="datadevolucao" value="<%=locacao.getDatadevolucao()%>" size="15"></td>
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
