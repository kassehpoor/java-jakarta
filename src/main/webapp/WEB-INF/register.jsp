<%--
  Created by IntelliJ IDEA.
  User: peyma
  Date: 11/9/2021
  Time: 6:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>
    <form method="post" action="/student-register.do" >
        <table>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>Family</td>
                <td><input type="text" name="family"/></td>
            </tr>
            <tr>
                <td>Major</td>
                <td><input type="text" name="major"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Register"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
