<%--
  Created by IntelliJ IDEA.
  User: adrian
  Date: 23.12.2023
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Games</title>
</head>
<body>
<c:forEach items="${games}" var="game">
    <p>
            ${game.id} | ${game.master.login} | ${game.system} | ${game.status} | <a href="updateGame?id=${game.id}">Update this game</a>  <a href="deleteGame?id=${game.id}">Delete this Game</a>
    </p>
</c:forEach>
</body>
</html>
