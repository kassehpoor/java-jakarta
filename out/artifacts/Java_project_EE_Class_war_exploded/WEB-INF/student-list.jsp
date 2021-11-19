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
    <title>List Form</title>
    <link rel="stylesheet" href="/css/main.css"/>
    <script src="/js/main.js" type="application/javascript"></script>
</head>
<body>


<ul class="navigation">
    <li><a class="active" href="/">Home</a></li>
    <li><a href="/student-register-page.do">Register a Student</a></li>
    <li><a href="/student-list-page.do">List of Students</a></li>
    <li><a href="/student-find-page.do">Search a Student</a></li>
</ul>

<h3>List of Students</h3>

<table class="student-table">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Family</th>
        <th>Major</th>
        <th>SSN</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${list}" var="st" varStatus="loopstatus">

        <tr>
            <td>${ loopstatus.index + 1}</td>
            <td>${st.name}</td>
            <td>${st.family}</td>
            <td>${st.major}</td>
            <td>${st.ssn}</td>
            <td><a href="/student-delete.do?id=${st.id}"><img src="/img/icon-delete-16.jpg"
                                                              style="width: 40px; height: 40px;"
                                                              onclick="return confirmToDelete()"/></a>
                <a href="/student-fetch-to-edit-page.do?id=${st.id}"> <img src="/img/edit.png" class="square40px"
                                                                           onclick="return confirmOnEdit()"/> </a></td>
        </tr>
    </c:forEach>
</table>


</table>
</body>
</html>
