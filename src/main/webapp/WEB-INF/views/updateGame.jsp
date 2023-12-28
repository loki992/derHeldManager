<%--
  Created by IntelliJ IDEA.
  User: adrian
  Date: 24.12.2023
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Game</title>
</head>
<body>
<form method="post">
    </br><label for="gameSystem"> System:</label>
    <input type="text" value="${gameToEdit.gameSystem}" id="gameSystem" name="gameSystem">
    </br>
    <label for="gameStatus"> Status:</label>
    <input type="text" value="${gameToEdit.status}" id="gameStatus" name="gameStatus">

    </br><label for="playersId"> Game Master:</label>
    <input list="players" id="playersId" name="playerId">
    <datalist id="players">
        <c:forEach items="${players}" var="player">
            <option value="${player.id}" label="${player.login}"></option>
        </c:forEach>
    </datalist>



<input type="submit" value="wyslij">
</form>
</body>
</html>
