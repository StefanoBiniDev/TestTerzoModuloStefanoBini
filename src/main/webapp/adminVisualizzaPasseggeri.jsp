<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*, java.util.*,it.stefano.project.controller.*,it.stefano.project.model.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<%
PasseggeroServiceBean passBean = new PasseggeroServiceBean();
List <Passeggero> Passeggeri = passBean.getAllPasseggeri();
HttpSession s = request.getSession();
s.setAttribute("Passeggeri",Passeggeri);
List<Passeggero> passeggeri = (List<Passeggero>)request.getAttribute("clienti");
%>

<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<TABLE BORDER="1">
		<TR>
			<TH>Nome</TH>
			<TH>Cognome</TH>
			<TH>Data Prenotazione</TH>
		</TR>

		<c:forEach items="$(passeggeri)" var="pass">


			<TR>
			
				<TD><c:out value="${pass.nome}">
					</c:out></TD>
				<TD><c:out value="${pass.cognome}">
					</c:out></TD>
				<TD><c:out value="${pass.data_prenot}">
					</c:out></TD>
			</TR>
		</c:forEach>
	</TABLE>
</body>

</html>