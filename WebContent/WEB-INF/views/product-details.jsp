<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/6/2021
  Time: 4:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>${productDetails.productID}</tr>
    <tr>${productDetails.collectionName}</tr>
    <tr>${productDetails.price}</tr>
</table>
<img src="${productDetails.img}" alt="">
</body>
</html>
