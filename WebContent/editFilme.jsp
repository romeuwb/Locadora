<%@page import="br.com.locadora.*, java.util.*" %>
<jsp:useBean id="filme" class="br.com.locadora.Filme"/>
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
                                <p class="style1"><strong>.: Altera&ccedil;&atilde;o de dados do Filme</strong> :.</p>
                                <form action="rscadfilme.jsp" method="post" name="editaFilme id="editaFilme">
                                    <input type="hidden" name="operacao" value="U"/>
                                    <input type="hidden" name="codigo" value="<%=filme.getCodfilme()%>"/>
                                    <table width="35%" border="0">

                                        <tr>
                                            <tr>
                                                <td width="14%"><span class="style1">titulo:</span></td>
                                                <td width="86%"><input name="titulo" type="text" id="titulo" value="<%=filme.getTitulo()%>" size="40"></td>
                                            </tr>

                                            <tr> 
                                                <td height="22"><span class="style1">cod_categoria:</span></td>
                                                <td><input name="codcategoria" type="text" id="codcategoria" value="<%=filme.getCodcategoria()%>" size="15" maxlength="15"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">diretor:</span></td>
                                                <td><input name="diretor" type="text" id="diretor" value="<%=filme.getDiretor()%>" size="10"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">valor_locacao:</span></td>
                                                <td><input name="valor_locacao" type="text" id="valor_locacao" value="<%=filme.getValorlocacao()%>" size="10"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">reservada:</span></td>
                                                <td><input name="reservada" type="text" id="reservada" value="<%=filme.getReservada()%>" size="15"></td>
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
