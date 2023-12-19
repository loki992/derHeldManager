<%--
  Created by IntelliJ IDEA.
  User: adrian
  Date: 18.12.2023
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>All Characters</title>
</head>
<body>
<c:forEach items="${characters}" var="character">
    <p>
        ${character.id}: ${character.name} ${character.surname} <a href="show?id=${character.id}">Show character sheet</a> <a href="update?id=${character.id}">Update</a>  <a href="delete?id=${character.id}&sure=no">Delete</a>
    </p>
</c:forEach>


<jsp:include page="index.jsp"></jsp:include>

</body>
</html>
