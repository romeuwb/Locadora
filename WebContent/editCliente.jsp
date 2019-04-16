<%@page import="br.com.locadora.*, java.util.*" %>
<jsp:useBean id="cliente" class="br.com.locadora.Cliente"/>
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
                                <p class="style1"><strong>.: Altera&ccedil;&atilde;o de dados do Cliente</strong> :.</p>
                                <form action="rscadcliente.jsp" method="post" name="editaCliente id="editaCliente">
                                    <input type="hidden" name="operacao" value="U"/>
                                    <input type="hidden" name="codigo" value="<%=cliente.getCodCliente()%>"/>
                                    <table width="35%" border="0">

                                        <tr>
                                            <tr>
                                                <td width="14%"><span class="style1">Nome:</span></td>
                                                <td width="86%"><input name="nome" type="text" id="nome" value="<%=cliente.getNome()%>" size="40"></td>
                                            </tr>

                                            <tr> 
                                                <td height="22"><span class="style1">RG:</span></td>
                                                <td><input name="rg" type="text" id="rg" value="<%=cliente.getRg()%>" size="15" maxlength="15"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">Endere&ccedil;o:</span></td>
                                                <td><input name="endereco" type="text" id="endereco" value="<%=cliente.getEndereco()%>" size="40"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">Bairro:</span></td>
                                                <td><input name="bairro" type="text" id="bairro" value="<%=cliente.getBairro()%>" size="10"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">Cidade:</span></td>
                                                <td><input name="cidade" type="text" id="cidade" value="<%=cliente.getCidade()%>" size="10"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">Estado:</span></td>
                                                <td><input name="estado" type="text" id="estado" value="<%=cliente.getEstado()%>" size="15"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">Telefone:</span></td>
                                                <td><input name="telefone" type="text" id="telefone" value="<%=cliente.getTelefone()%>" size="15"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">E-Mail:</span></td>
                                                <td><input name="email" type="text" id="email" value="<%=cliente.getEmail()%>" size="15"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">Data Nascimento:</span></td>
                                                <td><input name="dtnascimento" type="text" id="dtnascimento" value="<%=cliente.getDtNascimento()%>" size="15"></td>
                                            </tr>
                                            <tr> 
                                                <td><span class="style1">Sexo:</span></td>
                                                <td><input name="sexo" type="text" id="sexo" value="<%=cliente.getSexo()%>" size="15"></td>
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
