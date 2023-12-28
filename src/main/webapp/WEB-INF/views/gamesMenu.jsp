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
<table>
    <tr>
        <td>
            Game id:
        </td>
        <td>
            Game Master:
        </td>
        <td>
            System:
        </td>
        <td>
            Status:
        </td>
        <td>
            Actions:
        </td>
    </tr>

<c:forEach items="${games}" var="game">
    <tr>
        <td>
            ${game.id}
        </td>
        <td>
            ${game.master.login}
        </td>
        <td>
            ${game.gameSystem}
        </td>
        <td>
            ${game.status}
        </td>
        <td>
        <a href="updateGame?id=${game.id}">Update this game</a> | <a href="deleteGame?id=${game.id}">Delete this Game</a>
        </td>
    </tr>
</c:forEach>
</table>
<jsp:include page="index.jsp"></jsp:include>
</body>
</html>
