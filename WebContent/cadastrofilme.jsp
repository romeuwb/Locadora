<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <link rel="stylesheet" href="css/estilo.css" type="text/css" />
        <title>Cadastro de Filmes</title>
    </head>
    <body id="container">

        <!-- Div Cental -->
        <div id="geral">


            <!-- Cabeçalho -->
            <div id="topo">
                <div class="logo"><a href="index.jsp"><img src="img/title.png" width="150" height="90" /></a></div>

                <!-- menu -->
                <%@include file="menu.jsp" %>
                <!-- Fim menu -->

                <!-- Meio-->
                <div>
                    <div id="img"></div>

                    <div id="form">
                        <form action="rscadfilme.jsp" method="post" name="frmCadastro" target="_self" id="frmCadastro">
                            <div align="center">
                                <h1>Cadastro de Filmes</h1>

                                <table width="80%"  border="0">
                                    <tr>
                                        <td width="12%"><span class="style1"><strong>Titulo do Filme:</strong></span></td>
                                        <td width="88%"><span class="style1">
                                                <input name="titulo" type="text" id="titulo" size="40">
                                            </span></td>
                                    </tr>
                                    
                                    <tr>
                                        <td><strong>Categoria:</strong></td>
                                        <td><span class="style1">
                                                <input name="categoria" type="text" id="categoria" size="20" />
                                            </span></td>
                                    </tr>
                                    <tr>
                                        <td><strong>diretor:</strong></td>
                                        <td><span class="style1">
                                                <input name="diretor" type="text" id="diretor" size="20" />
                                            </span></tr>

                                    <tr>
                                        <td><strong>Valor da Locac�o:</strong></td>
                                        <td><strong>
                                                <input name="vlocacao" type="text" id="vlocacao" size="40" />
                                            </strong></tr>
                                    <tr>
                                        <td><strong>Reservada:</strong></td>
                                        <td><input name="reservada" type="text" id="reservada" size="20" /></td>
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
