<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="entities.Student" %><%--
  Created by IntelliJ IDEA.
  User: peyma
  Date: 11/9/2021
  Time: 6:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Form</title>
</head>
<body>





<%
    String sid = request.getParameter("id");
    int id = Integer.parseInt(sid);
    String name = request.getParameter("name");
    String family = request.getParameter("family");
    String major = request.getParameter("major");
    Student student = new Student(id,name,family,major);
%>
    <form method="post" action="/student-edit.do" >
        <table>
            <tr>
                <td>Id</td>
                <td><input type="text" name="id" value="<%= student.getId()%>"/></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" value="<%= student.getName()%>"/></td>
            </tr>
            <tr>
                <td>Family</td>
                <td><input type="text" name="family" value="<%= student.getFamily()%>"/></td>
            </tr>
            <tr>
                <td>Major</td>
                <td><input type="text" name="major" value="<%= student.getMajor()%>"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Edit"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
