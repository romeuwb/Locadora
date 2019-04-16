<%@page errorPage="erro.jsp"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" href="css/estilo.css" type="text/css" />

<title>Gerenciador de Filmes</title>

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
<div id="form">
<div align="center">
 
  <font size="5" face="Verdana, Arial, Helvetica, sans-serif"> Gerenciador de Filmes </font> 
  <p>&nbsp;</p>
  <form action="relFilme.jsp" method="post" name="frmCadastro" target="_self" id="frmCadastro">
Filttrar Pesquisa 
  <label for="nome">nome</label>
  <input type="text" name="nome" id="nome" />
  <input type="submit" value="Pesquisar" />
  </form>
<a href="index.jsp">Voltar para Menu Administrador</a> 
</div>
</div>

<!-- Fim Meio-->

<!-- Baixo -->
<div>
<div id="baixo">
    <%@include file="rodape.jsp" %>
</div>
</div>
<!-- Fim Baixo -->
</div>
</div>
</body>
</html>
