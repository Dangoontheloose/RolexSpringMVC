<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/9/2021
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>${product[0].price}</p>

    <form action="${pageContext.request.contextPath}/pro/create" method="post">
        <input type="submit" value="Create">
    </form>
</body>
</html>
