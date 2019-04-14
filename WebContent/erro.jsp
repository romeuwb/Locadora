<%@ page isErrorPage="true" import="java.util.*"%>
<html>
<head>
<title>Erro na p&aacute;gina</title>
<base target="_self">
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"></head>

<body bgcolor="#FFFFFF" onload="dynAnimation()">
<table border="0" width="98%">
  <tr>
    <td width="100%" height="74" colspan="2"> 
      <h1 align="center"><b><font color="#000000">Ocorreu um erro durante a execu&ccedil;&atilde;o 
        o de um servi&ccedil;o !</font></b></h1>

    </td>
  </tr>
  <tr>
    <td width="32%" height="105"><span style="z-index: -1"></span></td>
    <td width="68%" valign="top" align="left">

    <div align="left">
        <dt id="textSection1" style="font-style: normal; font-variant: normal; font-weight: normal; line-height: 15pt; font-size: 13pt; font-family: verdana; color: black"><span id="errorText"><font face="Times New Roman, Times, serif">A 
          p&aacute;gina n&atilde;o pode ser exibida</font></span><font face="Times New Roman, Times, serif">.</font></dt>
      </div>
      <div align="left"> 
        <dt id="textSection1" style="font-style: normal; font-variant: normal; font-weight: normal; line-height: 15pt; font-size: 13pt; font-family: verdana; color: black"><font face="Times New Roman, Times, serif">Verifique 
          sua permiss&atilde;o de acesso ou informe o seguinte erro ao analista.<br>
          Erro:<font color="#FF0000"><strong><%=exception.getMessage()%></strong></font></font></dt>
        <font face="Times New Roman, Times, serif"><br>
        <a target="_self" href="javaScript:history.go(-1);">Voltar</a> </font></div>
      </td>
  </tr>
</table>
</body>

</html>
