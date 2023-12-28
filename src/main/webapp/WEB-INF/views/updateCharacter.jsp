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
    <table>
        <tr>
            <td><label for="charName"> Name:</label>
            </td>
            <td>
                <input type="text" value="${characterToEdit.name}" id="charName" name="charName">
            </td>
        </tr>
        <tr>
            <td><label for="charSurname"> Surname:</label>
            </td>
            <td>
                <input type="text" value="${characterToEdit.surname}" id="charSurname" name="charSurname">
            </td>
        </tr>
        <tr>
            <td>
                <label for="age">
                Age:
            </label>
            </td>
            <td><input type="number" id="age" name="age" value="${characterToEdit.age}">
            </td>
        </tr>
        <tr>

            <td><label for="job"> Job:</label></td>
            <td>            <input type="text" value="${characterToEdit.job}" id="job" name="job"></td>
            <%--    <div>--%>
            <%--        <input type="radio" id="male" name="sex" value="true" checked />--%>
            <%--        <label for="male"> Male</label>--%>
            <%--    </div>--%>
            <%--    <div>--%>
            <%--        <input type="radio" id="female" name="sex" value="false"/>--%>
            <%--        <label for="female"> Female</label>--%>
            <%--    </div>--%>
        </tr>
        <tr>

            <td><label for="homeCity"> Home City:</label></td><td>
            <input type="text" value="${characterToEdit.homeCity}" id="homeCity" name="homeCity">
        </td>
        </tr>
        <tr>

            <td><label for="birthPlace"> Birth Place:</label></td><td>
            <input type="text" value="${characterToEdit.birthCity}" id="birthPlace" name="birthPlace">
        </td>
        </tr>
        <tr>

            <td><label for="sanity">
            Sanity:
            </label></td><td><input type="number" id="sanity" name="sanity" value="${characterToEdit.sanity}">
        </td>
        </tr>
        <tr>

            <td><label for="luck">
            Luck:
        </label>
            </td><td><input type="number" id="luck" name="luck" value="${characterToEdit.luck}">
        </td>
        </tr>
        <tr>

            <td><label for="hp">
            Health points:
            </label></td>
           <td>     <input type="number" id="hp" name="hp" value="${characterToEdit.hp}">
           </td>
        </tr>
        <tr>

            <td><label for="mp">
            Magic points:
        </label>
            </td><td><input type="number" id="mp" name="mp" value="${characterToEdit.mp}">
        </td>
        </tr>
        <tr>
            <td>

            <label for="str">
            Strength:
            </label></td><td><input type="number" id="str" name="str" value="${characterToEdit.strength}">
        </td>
        </tr>
        <tr>

            <td><label for="dex">
            Dexterity:
            </label></td><td><input type="number" id="dex" name="dex" value="${characterToEdit.dexterity}">
        </td>
        </tr>
        <tr>

            <td>
            <label for="fit">
                Fitness:
            </label></td><td><input type="number" id="fit" name="fit" value="${characterToEdit.fitness}">
            </td>
        </tr>
        <tr>

            <td>
            <label for="pw">
                Power:
            </label></td><td><input type="number" id="pw" name="pw" value="${characterToEdit.power}"></td>
        </tr>
        <tr>

            <td>
            <label for="looks">
                Looks:
            </label></td><td><input type="number" id="looks" name="looks" value="${characterToEdit.looks}">
        </td></tr>
        <tr>

            <td>
            <label for="edu">
                Education:
            </label></td><td><input type="number" id="edu" name="edu" value="${characterToEdit.education}">
        </td></tr>
        <tr>
            <td>
            <label for="phys">
                Physique:
            </label></td><td><input type="number" id="phys" name="phys" value="${characterToEdit.physique}">
            </td></tr>
        <tr>

            <td>
            <label for="intel">
                Inteligence:
            </label></td><td><input type="number" id="intel" name="intel" value="${characterToEdit.inteligence}">
            </td></tr>
        <tr>

            <td>
            <label for="mov">
                Movement:
            </label></td><td><input type="number" id="mov" name="mov" value="${characterToEdit.movement}">
            </td></tr>
        </br>
        <tr>
            <td>
            <input type="submit" value="wyslij">
            </td>
        </tr>
    </table>

</form>
</body>
</html>
