<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Webalk - Könyvek</title>
</head>
<body>
<c:forEach var="konyv" items="${konyvek}">
	<p>${konyv.kkod}, ${konyv.szerzo}, ${konyv.cim} <br></p>
</c:forEach>
</body>
</html>