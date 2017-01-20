<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Webalk - Olvasók</title>
</head>
<body>
<c:forEach var="olvaso" items="${olvasok}">
	<p>${olvaso.okod}, ${olvaso.nev}, ${olvaso.lakcim} <br></p>
</c:forEach>
</body>
</html>