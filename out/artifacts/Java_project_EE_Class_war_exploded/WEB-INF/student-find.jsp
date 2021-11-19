<%--
  Created by IntelliJ IDEA.
  User: peyma
  Date: 11/16/2021
  Time: 6:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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

<h3>Search for Students</h3>

<div class="container-box">

    <form action="/student-find-by-ssn.do" method="post">
        ID : <input type="text" name="ssn" id="ssn" type="text"/> <br/>
        <input type="submit" value="search"/>
    </form>
</div>

</body>
</html>
