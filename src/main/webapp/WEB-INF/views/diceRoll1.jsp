<%--
  Created by IntelliJ IDEA.
  User: adrian
  Date: 19.12.2023
  Time: 00:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Dice Roller</title>
</head>
<body>
<table>

  <b>Choose rolling player: </b>
  <form action="/diceRoll" method="post">
  <input list="players"  name="player">
  <datalist id="players">
    <c:forEach items="${players}" var="player">
      <option value="${player.id}" label="${player.login}"></option>
    </c:forEach>
  </datalist>
    </br>
    <input list="dices"  name="dice">
  <datalist id="dices">

      <option value="d2" label="d2"></option>
      <option value="d3" label="d3"></option>
      <option value="d4" label="d4"></option>
      <option value="d6" label="d6"></option>
      <option value="d10" label="d10"></option>
      <option value="d20" label="d20"></option>
      <option value="d100" label="d100"></option>

  </datalist>
    </br>
    <input type="submit" value="Rzuc kostka">
  </form>
<%--  </form>--%>
<%--  <tr>--%>
<%--    <td>--%>
<%--      <a href="diceRoll?dice=d2">D2</a>--%>
<%--    </td>    <td>--%>
<%--      <a href="diceRoll?dice=d3">D3</a>--%>
<%--    </td>    <td>--%>
<%--      <a href="diceRoll?dice=d4">D4</a>--%>
<%--    </td>    <td>--%>
<%--      <a href="diceRoll?dice=d6">D6</a>--%>
<%--    </td>    <td>--%>
<%--      <a href="diceRoll?dice=d10">D10</a>--%>
<%--    </td>    <td>--%>
<%--      <a href="diceRoll?dice=d20">D20</a>--%>
<%--    </td>    <td>--%>
<%--      <a href="diceRoll?dice=d100">D100</a>--%>
<%--    </td>--%>
<%--  </tr>--%>
</table>
</body>
</html>
