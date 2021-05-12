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
        <form:form action="${pageContext.request.contextPath}/admin/product/add-product-submit" method="post" modelAttribute="productForm">
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
                    <span>Description<label>*</label></span>
                    <form:input type="text" path="description"/>
                    <form:errors path="description" cssClass="error"/>
                </div>
                <div>
                    <span>Stock<label>*</label></span>
                    <form:input type="text" path="stock"/>
                    <form:errors path="stock" cssClass="error"/>
                </div>
                <div>
                    <span>Image<label>*</label></span>
                    <form:input type="text" path="img"/>
                    <form:errors path="img" cssClass="error"/>
                </div>
                <div>
                    <span>Type<label>*</label></span>
                    <form:select type="text" path="collectionName">
                        <c:forEach var="item" items="${collectionList}">
                            <form:option value="${item.collectionName}">${item.collectionName}</form:option>
                        </c:forEach>
                    </form:select>
                    <form:errors path="watchTypeValue" cssClass="error"/>
                </div>
                <div>
                    <span>Size<label>*</label></span>
                    <form:select type="text" path="sizeValue">
                        <c:forEach var="item" items="${sizeList}">
                            <form:option value="${item.sizeValue}">${item.sizeValue}</form:option>
                        </c:forEach>
                    </form:select>
                    <form:errors path="sizeValue" cssClass="error"/>
                </div>
                <div>
                    <span>Type<label>*</label></span>
                    <form:select type="text" path="watchTypeValue">
                        <c:forEach var="item" items="${typeList}">
                            <form:option value="${item.watchTypeValue}">${item.watchTypeValue}</form:option>
                        </c:forEach>
                    </form:select>
                    <form:errors path="watchTypeValue" cssClass="error"/>
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