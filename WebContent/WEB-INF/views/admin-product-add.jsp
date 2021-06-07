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
        <form:form action="${pageContext.request.contextPath}/admin/product/add-product-submit" method="post"
                   modelAttribute="productForm">
            <div class="register-top-grid">
                <h2>PRODUCT INFO</h2>
                <div>
                    <span>Product ID<label>*</label></span>
                    <c:choose>
                        <c:when test="${product != null}">
                            <form:hidden path="productID" value="${product.productID}"/>
                            <input type="text" value="${product.productID}" disabled="disabled">
                        </c:when>
                        <c:otherwise>
                            <form:input type="text" path="productID"/>
                        </c:otherwise>
                    </c:choose>
                    <form:errors path="productID" cssClass="error"/>
                </div>
                <div>
                    <span>Price<label>*</label></span>
                    <c:choose>
                        <c:when test="${product != null}">
                            <form:input type="text" path="price" value="${product.price}"/>
                        </c:when>
                        <c:otherwise>
                            <form:input type="text" path="price"/>
                        </c:otherwise>
                    </c:choose>
                    <form:errors path="price" cssClass="error"/>
                </div>
                <div>
                    <span>Description<label>*</label></span>
                    <c:choose>
                        <c:when test="${product != null}">
                            <form:input type="text" path="description" value="${product.description}"/>
                        </c:when>
                        <c:otherwise>
                            <form:input type="text" path="description"/>
                        </c:otherwise>
                    </c:choose>
                    <form:errors path="description" cssClass="error"/>
                </div>
                <div>
                    <span>Stock<label>*</label></span>
                    <c:choose>
                        <c:when test="${product != null}">
                            <form:input type="text" path="stock" value="${product.stock}"/>
                        </c:when>
                        <c:otherwise>
                            <form:input type="text" path="stock"/>
                        </c:otherwise>
                    </c:choose>
                    <form:errors path="stock" cssClass="error"/>
                </div>
                <div>
                    <span>Image<label>*</label></span>
                    <c:choose>
                        <c:when test="${product != null}">
                            <form:input type="text" path="img" value="${product.img}"/>
                        </c:when>
                        <c:otherwise>
                            <form:input type="text" path="img"/>
                        </c:otherwise>
                    </c:choose>
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
                <div>
                    <span>Material<label>*</label></span>
                    <form:select type="text" path="materialName">
                        <c:forEach var="item" items="${materialList}">
                            <form:option value="${item.materialName}">${item.materialName}</form:option>
                        </c:forEach>
                    </form:select>
                    <form:errors path="materialName" cssClass="error"/>
                </div>
                <div class="clearfix"></div>
            </div>
            <div class="clearfix"></div>
            <div class="register-button">
                <input type="submit" value="Submit"/>
                <div class="clearfix"></div>
            </div>
        </form:form>
        <c:choose>
        <c:when test="${product != null}">
        <div class="register-button">
            <form:form action="${pageContext.request.contextPath}/admin/product/delete-product-submit/${product.productID}"
                       method="post">
                <input type="submit" value="Delete"/>
                <div class="clearfix"></div>
            </form:form>
            </c:when>
            </c:choose>
        </div>
    </div>
</div>
</body>
</html>