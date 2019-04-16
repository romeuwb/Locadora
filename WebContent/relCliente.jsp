<%@page import="java.util.Vector"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="br.com.locadora.*" errorPage="erro.jsp"%>
<jsp:useBean id="Cliente" class="br.com.locadora.Cliente"/>
<jsp:useBean id="fachada" class="br.com.locadora.Fachada"/>

<%
//Nada será gravado no cache do cliente
    response.setDateHeader("Expires", 0);
    response.setHeader("Pragma", "no-cache");
    if (request.getProtocol().equals("HTTP/1.1")) {
        response.setHeader("Cache-Control", "no-cache");
    }

    
    String pesquisa = request.getParameter("Nome");
    String cor = "";//Será utilizado para manipular as cores das celulas
    int contador = 0;
    Vector vetCliente = new Vector();
    vetCliente = fachada.getClientePorNome(pesquisa);

%>

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <link rel="stylesheet" href="css/estilo.css" type="text/css" />

        <title>Cadastro de Cliente</title>



        <script language="JavaScript">
            function exclui(codigo) {
                if (confirm("Deseja realmente excluir o Cleinte ?" + nome)) {
                    document.location.href = "rsexcluiusuario.jsp?codigo=" + codigo;
                }
                else {
                }
            }
        </script>



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

                    <div id="meio">
                        <form action="relCliente.jsp" method="post" name="frmCadastro" target="_self" id="frmCadastro">
                            Filttrar Pesquisa 
                            <label for="nome">nome</label>
                            <input type="text" name="nome" id="nome" />
                            <input type="submit" value="Pesquisar" />
                        </form>
                        <blockquote> 
                            <blockquote>
                                <h1><strong>.<span class="style1">: Clientes Cadastrados :.</span></strong></h1>
                            </blockquote>
                        </blockquote>
                        <table width="100%" border="0" align="center">
                            <tr bgcolor="#669999"> 
                                <td width="6%"><span class="style1"><strong>Código</strong></span></td>
                                <td width="40%"><span class="style1"><strong>Nome</strong></span></td>
                                <td width="15%"><span class="style1"><strong>RG</strong></span></td>
                                <td width="15%"><span class="style1"><strong>endereco</strong></span></td>
                                <td width="40%"><span class="style1"><strong>bairro</strong></span></td>
                                <td width="10%"><span class="style1"><strong>cidade</strong></span></td>
                                <td width="10%"><span class="style1"><strong>estado</strong></span></td>
                                <td width="15%"><span class="style1"><strong>telefone</strong></span></td>
                                <td width="40%"><span class="style1"><strong>email</strong></span></td>
                                <td width="40%"><span class="style1"><strong>Data Nascimento</strong></span></td>
                                <td width="15%"><span class="style1"><strong>sexo</strong></span></td>
                                <td colspan="2">
                                    <div align="center" class="style1"><strong>Manuten&ccedil;&atilde;o</strong></div></td>
                            </tr>
                            <%
                                for (int i = 0; i < vetCliente.size(); i++) {
                                    Cliente = (Cliente) vetCliente.elementAt(i);
                                    contador++;
                                    if (contador % 2 == 0) {
                                        cor = "#FFFFCC";
                                    } else {
                                        cor = "";
                                    }
                            %>
                            <tr bgcolor="<%=cor%>"> 
                                <td><%=Cliente.getCodCliente()%></td>
                                <td><%=Cliente.getNome()%></td>
                                <td><%=Cliente.getRg()%></td>
                                <td><%=Cliente.getEndereco()%></td>
                                <td><%=Cliente.getBairro()%></td>
                                <td><%=Cliente.getCidade()%></td>
                                <td><%=Cliente.getEstado()%></td>
                                <td><%=Cliente.getTelefone()%></td>
                                <td><%=Cliente.getEmail()%></td>
                                <td><%=Cliente.getDtNascimento()%></td>
                                <td><%=Cliente.getSexo()%></td>

                                <td width="6%"> 
                                    <div align="center"><a href="editCliente.jsp.jsp?CodCliente=<%=Cliente.getCodCliente()%>"><img src="img/editar.png" title="Editar" width="32" height="32" border="0"></a></div></td>
                                <td width="10%"> 
                                    <div align="center"><a href="rsexcluiCliente.jsp?CodCliente=<%=Cliente.getCodCliente()%>"><img src="img/apagar.png" title="Excluir" width="32" height="32" border="0" onclick="exclui(CodCliente)"></a>

                                    </div></td>
                            </tr>
                            <%
                                }

                            %> 

                        </table>
                        <%--  <%
                        }
         
                    else {
%> 
                    <script>
alert('Nenhum Registro Encontado')
                    </script>
                    <%}
                    %>--%>
                        <blockquote> 
                            <blockquote>
                                <p><a class="cad" href="cadastrocliente.jsp" target="_self" class="style1">Adicionar Novo Cliente</a> </br>

                                </p>
                            </blockquote>
                        </blockquote>


                    </div>
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
