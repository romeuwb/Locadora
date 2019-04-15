<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!
<%
//Verifica se está logado
//    if (session.getValue("loginUsuario") != null || session.getValue("senhaUsuario") != null) {
//    } else {
//        out.println("Você não está logado no sistema");
//        out.println("<script>document.location.href='index.jsp';</script>");
//    }
//%> 
>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <link rel="stylesheet" href="css/estilo.css" type="text/css" />
        <title>Cadastro de Cliente</title>
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
                        <form action="rscadfornecedor.jsp" method="post" name="frmCadastro" target="_self" id="frmCadastro">
                            <div align="center">
                                <h1>Formulário de Cadastro de Fornecedores</h1>

                                <table width="80%"  border="0">
                                    <tr>
                                        <td width="12%"><span class="style1"><strong>Nome:</strong></span></td>
                                        <td width="88%"><span class="style1">
                                                <input name="nome" type="text" id="nome" size="40">
                                            </span></td>
                                    </tr>
                                    
                                    <tr>
                                        <td><strong>C.P.F:</strong></td>
                                        <td><span class="style1">
                                                <input name="cpf" type="text" id="cpf" size="20" />
                                            </span></td>
                                    </tr>
                                    <tr>
                                        <td><strong>RG:</strong></td>
                                        <td><span class="style1">
                                                <input name="rg" type="text" id="rg" size="20" />
                                            </span></tr>

                                    <tr>
                                        <td><strong>Endereço:</strong></td>
                                        <td><strong>
                                                <input name="endereco" type="text" id="endereco" size="40" />
                                            </strong></tr>
                                    <tr>
                                        <td><strong>Telefone:</strong></td>
                                        <td><input name="telefone" type="text" id="telefone" size="20" /></td>
                                    </tr>
                                    <tr>
                                        <td><strong>Bairro:</strong></td>
                                        <td><input name="bairro" type="text" id="bairro" size="20" /></td>
                                    </tr>
                                    <tr>
                                        <td><strong>Cidade:</strong></td>
                                        <td><input name="cidade" type="text" id="cidade" size="20" /></td>
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
