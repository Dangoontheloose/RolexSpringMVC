<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
</head>
<body>
<div class="account-in">
    <div class="container">
        <form:form action="product-add" method="post" modelAttribute="">
            <div class="register-top-grid">
                <h2>PRODUCT INFO</h2>
                <div>
                    <span>Product ID<label>*</label></span>
                    <form:input type="text" path="productID"/>
                    <form:errors path="productID" cssClass="error"/>
                </div>
                <div>
                    <span>Price<label>*</label></span>
                    <form:input type="text" path="price"/>
                    <form:errors path="price" cssClass="error"/>
                </div>
                <div>
                    <span>Email Address<label>*</label></span>
                    <form:input type="text" path="description"/>
                    <form:errors path="description" cssClass="error"/>
                </div>
                <div>
                    <span>Phone Number<label>*</label></span>
                    <form:input type="text" path="stock"/>
                    <form:errors path="stock" cssClass="error"/>
                </div>
                <div>
                    <span>Address<label>*</label></span>
                    <form:input type="text" path="img"/>
                    <form:errors path="img" cssClass="error"/>
                </div>
                <div class="clearfix"></div>
            </div>
            <div class="clearfix"></div>
            <div class="register-button">
                <input type="submit" value="Submit"/>
                <div class="clearfix"></div>
            </div>
        </form:form>
    </div>
</div>
</body>
</html>