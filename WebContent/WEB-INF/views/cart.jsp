<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dango
  Date: 31/05/2021
  Time: 02:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Cart</h1>
    <table>
        <c:forEach var="item" items="${cartList}">
            <tr>
                <td>${item.pID}</td>
                <td>${item.quantity}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
