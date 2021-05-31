<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dango
  Date: 31/05/2021
  Time: 02:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Cart</h1>
<form:form action="${pageContext.request.contextPath}/cart/update-quantity" method="post" modelAttribute="cartForm">
    <table>
        <c:forEach var="item" items="${cartList}" varStatus="status">
            <form:hidden path="cartList[${status.index}].pID" value="${item.pID}"/>
            <tr>
                <td>${item.pID}</td>
                <td><form:input path="cartList[${status.index}].quantity" value="${item.quantity}"/></td>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="Update cart">
</form:form>
<form:form action="${pageContext.request.contextPath}/move-to-checkout" method="post">
    <input type="submit" value="Checkout">
</form:form>

</body>
</html>
