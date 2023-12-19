<%--
  Created by IntelliJ IDEA.
  User: adrian
  Date: 19.12.2023
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Character</title>
</head>
<body>
<form method="post">
    </br><label for="charName"> Name:</label>
    <input type="text" value="${characterToEdit.name}" id="charName" name="charName">
    </br><label for="charSurname"> Surname:</label>
    <input type="text" value="${characterToEdit.surname}" id="charSurname" name="charSurname">
    </br><label for="age">
    Age:
</label><input type="number" id="age" name="age" value="${characterToEdit.age}">
    </br><label for="job"> Job:</label>
    <input type="text" value="${characterToEdit.job}" id="job" name="job">
    <%--    <div>--%>
    <%--        <input type="radio" id="male" name="sex" value="true" checked />--%>
    <%--        <label for="male"> Male</label>--%>
    <%--    </div>--%>
    <%--    <div>--%>
    <%--        <input type="radio" id="female" name="sex" value="false"/>--%>
    <%--        <label for="female"> Female</label>--%>
    <%--    </div>--%>
    </br><label for="homeCity"> Home City:</label>
    <input type="text" value="${characterToEdit.homeCity}" id="homeCity" name="homeCity">
    </br><label for="birthPlace"> Birth Place:</label>
    <input type="text" value="${characterToEdit.birthCity}" id="birthPlace" name="birthPlace">
    </br><label for="sanity">
    Sanity:
</label><input type="number" id="sanity" name="sanity" value="${characterToEdit.sanity}">
    </br><label for="luck">
    Luck:
</label><input type="number" id="luck" name="luck" value="${characterToEdit.luck}">
    </br><label for="hp">
    Health points:
</label><input type="number" id="hp" name="hp" value="${characterToEdit.hp}">
    </br><label for="mp">
    Magic points:
</label><input type="number" id="mp" name="mp" value="${characterToEdit.mp}">

    </br><label for="str">
    Strength:
</label><input type="number" id="str" name="str" value="${characterToEdit.strength}">

    </br><label for="dex">
    Dexterity:
</label><input type="number" id="dex" name="dex">
    </br>
    <label for="fit">
        Fitness:
    </label><input type="number" id="fit" name="fit">
    </br>
    <label for="pw">
        Power:
    </label><input type="number" id="pw" name="pw">
    </br>
    <label for="looks">
        Looks:
    </label><input type="number" id="looks" name="looks">
    </br>
    <label for="edu">
        Education:
    </label><input type="number" id="edu" name="edu">
    </br>
    <label for="phys">
        Physique:
    </label><input type="number" id="phys" name="phys">
    </br>
    <label for="intel">
        Inteligence:
    </label><input type="number" id="intel" name="intel">
    </br>
    <label for="mov">
        Movement:
    </label><input type="number" id="mov" name="mov">
    </br>
    <input type="submit" value="wyslij">
</form>
</body>
</html>
