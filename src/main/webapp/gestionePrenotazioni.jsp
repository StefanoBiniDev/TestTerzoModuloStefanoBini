<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*, java.util.*,it.stefano.project.controller.*,it.stefano.project.model.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Prenota ora:</h1>
		
            <form id= "formId2" action ="aggiungiPrenotazione" method= "post" class="current">
            	<label>Nome</label> <input type="text" name="nome"><br> 
            	<label>Cognome</label> <input type="text" name="cognome">
            	<label>Numero Volo</label> <input type="number" name="volo"><br> 
            	<label>Compagnia scelta</label> <input type="text" name="compagnia">
            	<input type="submit" name="Prenota" value="Prenota">
            </form>
            
    <h1>Cancella una prenotazione:</h1>
			
            <form id= "formId2" action ="rimuoviPrenotazione" method= "post" class="current">
            	<label>ID_prenotazione:</label> <input type="number" name="id_prenotazione"> 
            	<input type="submit" name="Cancella" value="Cancella">
            </form>
            

</body>
</html>