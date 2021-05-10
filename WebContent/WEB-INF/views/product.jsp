<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/9/2021
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach var="item" items="${productList}">
        <tr>
            <td><img src="${item.img}" alt=""></td>
            <td>${item.collectionID}</td>
        </tr>
    </c:forEach>
</table>

<form action="${pageContext.request.contextPath}/pro/create" method="post">
    <input type="submit" value="Create">
</form>
</body>
</html>
