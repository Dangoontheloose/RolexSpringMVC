<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/4/2021
  Time: 1:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
<c:forEach var="customer" items="${customerList}">
    <tr>
        <td>${customer.email}</td>
    </tr>
    <tr>
        <td>${customer.address}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
