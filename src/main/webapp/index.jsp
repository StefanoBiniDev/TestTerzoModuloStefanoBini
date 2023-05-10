<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Admin</title>
    <meta charset="utf-8">
    <meta name="robots" content="noindex">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.5">
   	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/admin.css">
  </head>
  <body>
    <div id="pgside">
      <div id="pguser">
        <i class="txt">MY ADMIN</i>
      </div>

     	<a href="#" class="current" onclick ="document.getElementById('formId2').submit();">
        <i class="ico">&#9728;</i>
        <i class="txt">Visualizza Clienti</i>
      </a>
      <a href="#" class="current" onclick ="document.getElementById('formId').submit();">
        <i class="ico">&#9733;</i>
        <i class="txt">Gestisci Prenotazioni</i>
      </a>
      
      
            <form id= "formId2" action ="passeggeroManager" method= "post" class="current"></form>
      		<form id= "formId" action ="gestionePrenotazioni" method= "post"></form>

      
    </div>


  </body>
</html>