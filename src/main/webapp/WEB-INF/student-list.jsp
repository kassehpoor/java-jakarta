<%@ page import="entities.Student" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
    Java Standard Tag Library

  Created by IntelliJ IDEA.
  User: peyma
  Date: 11/14/2021
  Time: 5:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%--<table border="1px solid black">--%>
<%--        <tr>--%>
<%--            <th>ID</th>--%>
<%--            <th>Name</th>--%>
<%--            <th>Family</th>--%>
<%--            <th>Major</th>--%>
<%--            <th>Action</th>--%>
<%--        </tr>--%>
<%--        <c:forEach items="${list}" var="st">--%>
<%--            <tr>--%>
<%--                <td>${st.id}</td>--%>
<%--                <td>${st.name}</td>--%>
<%--                <td>${st.family}</td>--%>
<%--                <td>${st.major}</td>--%>
<%--                <td> <a href="/student-delete.do?id=${st.id}">X</a> ,--%>
<%--                    <a href="/student-edit.do?id=${st.id}&name=${st.name}&family=${st.family}&major=${st.major}">E</a> </td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--</table>--%>





<%
    List<Student> list = (List<Student>) request.getAttribute("list");
%>
<table border="1px solid black">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Family</th>
        <th>Major</th>
        <th>Action</th>
    </tr>

    <% for (int i = 0; i < list.size(); i++) {%>

        <tr>
            <td><%= list.get(i).getId()%></td>
            <td><%= list.get(i).getName()%></td>
            <td><%= list.get(i).getFamily()%></td>
            <td><%= list.get(i).getMajor()%></td>
            <td> <a href="/student-delete.do?id=<%=list.get(i).getId()%> "  >X</a> ,
                <a href="/student-edit-page.do?id=${list.get(i).getId()}&name=${list.get(i).getName()}&family=${list.get(i).getFamily()}&major=${list.get(i).getMajor()}">E</a> </td>
        </tr>

    <% } %>

</table>
</body>
</html>
