<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilo.css" type="text/css" />
        <title>Locator</title>
    </head>
    <body>
        <!-- menu -->
        <div id='cssmenu'>
            <ul>
                <li class='active'><a href='index.jsp'><span>Home</span></a></li>
                <li class='has-sub'><a href='#'><span>Cadastro</span></a>
                    <ul>
                        <li class='has-sub'><a href='cliente.jsp'><span>Cliente</span></a>
                        </li>
                        <li class='has-sub'><a href='#'><span>Filme</span></a>
                        </li>
                        <li><a href='sobre.jsp'><span>locação</span></a></li>
                    </ul>
                </li>
                <li><a href='sobre.jsp'><span>Relatorio</span></a></li>
                <li class='last'><a href='#'><span>Contatos</span></a></li>

                <!--Area Exclusiva-->
                <%
                    if (session.getAttribute("loginUsuario") == null) {
                    } else {
                        String tipo_str=  session.getAttribute("tipo").toString();
                        int tipo = Integer.parseInt(tipo_str);
                        if (tipo == 2){
                %>
                <li class='has-sub'><a href='#'><span>Área Adminsitrativo</span></a>
                    <ul>
                        <li class='has-sub'><a href='#'><span>Relatórios</span></a>
                            <ul>
                                <li class='last'><a href='gerenciadorFuncionario.jsp'><span>Clientes/Funcionarios</span></a></li>
                                <li class='last'><a href='gerenciadorPedido.jsp'><span>Pedidos</span></a></li>
                                <li class='last'><a href='gerenciadorFornecedor.jsp'><span>Fornecedores</span></a></li>
                                <li class='last'><a href='gerenciadorProduto.jsp'><span>Produtos</span></a></li>
                            </ul>
                        <li class='last'><a href='cadastroFuncionario.jsp'><span>Cadastrar Funcionario</span></a></li>
                        <li class='last'><a href='cadastrofornecedor.jsp'><span>Cadastrar Fornecedores</span></a></li>
                        <li class='last'><a href='cadastroproduto.jsp'><span>Cadastrar Produtos</span></a></li>
                </li>
                <%    }
                        }
                %>
            </ul> 
        </div>
        <%

            if (session.getAttribute("loginUsuario") == null) {
        %>
        <div id="login2">
            <form action="autentica.jsp" method="post" name="frmCadastro" target="_self" id="frmCadastro">
                <span class="style3"><strong>Login:</strong></span>
                <span class="style1">
                    <input name="login" type="text" id="login4" size="10" />
                </span>
                <span class="style3"><strong>Senha:</strong></span><strong>
                    <input name="senha" type="password" id="senha" size="10" />
                </strong><strong>
                    <input name="Eviar" type="submit" id="Eviar3" value="Enviar" />
                    <input name="limpar" type="reset" id="limpar2" value="Limpar" />    
            </form>

            <a href="cadastroFuncionario.jsp"> Cadastre-se</a></p>
        </div>
        <%                        } else {
                out.println("Ola! " + session.getAttribute("loginUsuario"));
            %>
             <a href="logoff.jsp">Sair</a>
            <%}
        %>
        
       

        <!--Termina Area Exclusiva-->

    </div>

    <!-- login -->

<td width="22%"><div align="center"></div></td>
<!-- login -->


<!-- Fim menu -->
</body>
</html>
