
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="br.com.locadora.Filme"%>
<%@page import="br.com.locadora.FilmeBD"%>
<%@page import="br.com.locadora.Pedido"%>
<%
	String codproduto;
    codproduto= request.getParameter("cod");
    
    Filme produto;
    FilmeBD proddb = new FilmeBD();
    int codprodut= Integer.parseInt(codproduto);
    produto= proddb.getProdutoPorCod(codprodut);
%>
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
        <title>Cadastro de Pedido</title>
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
                        <form action="rscadpedido.jsp?codprod=1" method="post" name="frmCadastro" target="_self" id="frmCadastro">
                            <div align="center">
                                <h1>Formulário de Pedido</h1>

                                <table width="80%"  border="0">
                                    <tr>
                                        <td width="12%"><span class="style1"><strong>Descrição:</strong></span></td>
                                        <td width="88%"><span class="style1">
                                                <input name="descricao" type="text" id="descricao" size="40"value="Buque" >
                                            </span></td>
                                    </tr>

                                    <tr>
                                        <td><strong>Data do Pedido:</strong></td>
                                        <td><span class="style1">
                                                <input name="data_pedido" type="text" id="data_pedido" size="20" value="<%=dataStr%>" />
                                            </span></td>
                                    </tr>
                                    <tr>
                                        <td><strong>Valor:</strong></td>
                                        <td><span class="style1">
                                                <input name="valor" type="text" id="valor" size="20" value="<%=produto.getValor() %>" />
                                            </span></tr>
                                    <tr>
                                        <td><strong>Situação</strong></td>
                                        <td><select name="situacao" size="1" id="situacao">
                                                <option value="1">Pendente</option>
                                                <option value="2">Atendido</option>
                                            </select></td>
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
