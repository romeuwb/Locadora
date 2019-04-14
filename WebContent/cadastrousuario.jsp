
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" href="css/estilo.css" type="text/css" />
<title>Personalité Noivas</title>
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
<form action="rscadusuario.jsp" method="post" name="frmCadastro" target="_self" id="frmCadastro">
  <div align="center">
    <h1>FormulÃ¡rio Cadastro de Clientes</h1>
    
    <table width="80%"  border="0">
      <tr>
        <td width="12%"><span class="style1"><strong>Nome:</strong></span></td>
        <td width="88%"><span class="style1">
          <input name="nome" type="text" id="nome" size="40">
        </span></td>
      </tr>
          <td width="12%"><span class="style1"><strong>login:</strong></span></td>
        <td width="88%"><span class="style1">
          <input name="login" type="text" id="login" size="20">
        </span></td>
      </tr>
      <td width="12%"><span class="style1"><strong>Senha:</strong></span></td>
        <td width="88%"><span class="style1">
          <input name="senha" type="password" id="senha" size="20">
        </span></td>
      <tr>
        <td><span class="style1"><strong>C.P.F:</strong></span></td>
        <td><span class="style1">
          <input name="cpf" type="text" id="cpf" size="20">
</span></td>
      </tr>
      <tr>
        <td><span class="style1"><strong>EndereÃ§o:</strong></span></td>
        <td><strong>
          <input name="end" type="text" id="end" size="40">
        </strong></td>
      </tr>
      <tr>
        <td><span class="style1"><strong>Telefone:</strong></span></td>
        <td><input name="cpf" type="text" id="cpf" size="20">
      </tr>
      <tr>
        <td><span class="style1"><strong>Bairro:</strong></span></td>
        <td><input name="cpf" type="text" id="cpf" size="20">
      </tr>
      <tr>
        <td><span class="style1"><strong>Cidade:</strong></span></td>
        <td><input name="cpf" type="text" id="cpf" size="20">
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td><strong>
          <input name="Eviar" type="submit" id="Eviar3" value="Enviar" />
          <input name="limpar" type="submit" id="limpar2" value="Limpar" />
        </strong></td>
      </tr>
    </table>
    <p class="style1"><strong>    </strong></p>
  </div>
</form>
</div>
</div>
</div>
<!-- Fim Meio-->

<!-- Baixo -->
<%@include file="rodape.jsp" %>
<!-- Fim Baixo -->
</div>
</div>
</body>
</html>
