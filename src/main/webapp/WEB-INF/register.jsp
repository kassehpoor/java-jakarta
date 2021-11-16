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

<h3>Register a Student</h3>

<div class="container-box">
    <form method="post" action="/student-register.do">

        <label for="ssn">SSN</label>
        <input type="text" id="ssn" name="ssn" placeholder="ssn..">

        <label for="fname">Name</label>
        <input type="text" id="fname" name="name" placeholder="name..">

        <label for="family">Family</label>
        <input type="text" id="family" name="family" placeholder="family..">

        <label for="major">Major</label>
        <input type="text" id="major" name="major" placeholder="major..">

        <input type="submit" value="Register">
    </form>
</div>

</body>
</html>
