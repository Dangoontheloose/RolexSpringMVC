<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/11/2021
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/admin/product/add">Add new product</a>
<%--Product list--%>
<table>
    <thead>
    <tr>
        <th>Product ID</th>
        <th>Collection</th>
        <th>Description</th>
        <th>Price</th>
        <th>Stock</th>
        <th>Size</th>
        <th>Type</th>
        <th>Image</th>
    </tr>
    </thead>
    <c:forEach var="item" items="${productList}">
        <tr>
            <td>${item.productID}</td>
            <td>${item.collectionName}</td>
            <td>${item.description}</td>
            <td>${item.price}</td>
            <td>${item.stock}</td>
            <td>${item.sizeValue}</td>
            <td>${item.watchTypeValue}</td>
            <td>${item.img}</td>
        </tr>
    </c:forEach>
</table>
<%--Collection list--%>
<table>
    <thead>
    <tr>
        <th>Collection ID</th>
        <th>Collection</th>
    </tr>

    </thead>
    <c:forEach var="item" items="${collectionList}">
        <tr>
            <td>${item.collectionID}</td>
            <td>${item.collectionName}</td>
            <td>
                <form:form action="product/delete-collection-submit/${item.collectionID}" method="post"
                           modelAttribute="collectionForm">
                    <form:hidden path="collID" value="${item.collectionID}"/>
                    <input type="submit" value="Delete">
                    <form:errors path="collID" cssClass="error"/>
                </form:form>
            </td>
        </tr>
    </c:forEach>
</table>

<%--Add Collection Form--%>
<div class="container">
    <form:form action="${pageContext.request.contextPath}/admin/product/add-collection-submit" method="post"
               modelAttribute="collection">
        <div class="register-top-grid">
            <h2>COLLECTION INFO</h2>
            <div>
                <span>Collection ID<label>*</label></span>
                <form:input type="text" path="collectionID"/>
                <form:errors path="collectionID" cssClass="error"/>
            </div>
            <div>
                <span>Collection Name<label>*</label></span>
                <form:input type="text" path="collectionName"/>
                <form:errors path="collectionName" cssClass="error"/>
            </div>
            <div class="clearfix"></div>
        </div>
        <div class="clearfix"></div>
        <div class="register-button">
            <input type="submit" value="Add"/>
            <div class="clearfix"></div>
        </div>
    </form:form>
</div>
<%--Size list--%>
<table>
    <thead>
    <tr>
        <th>Size ID</th>
        <th>Size Value</th>
    </tr>

    </thead>
    <c:forEach var="item" items="${sizeList}">
        <tr>
            <td>${item.sizeID}</td>
            <td>${item.sizeValue}</td>
            <td>
                <form:form action="product/delete-size-submit/${item.sizeID}" method="post" modelAttribute="sizeForm">
                    <form:hidden path="sID" value="${item.sizeID}"/>
                    <input type="submit" value="Delete">
                    <form:errors path="sID" cssClass="error"/>
                </form:form>
            </td>
        </tr>
    </c:forEach>
</table>
<%--Add Watch Size Form--%>
<div class="container">
    <form:form action="${pageContext.request.contextPath}/admin/product/add-size-submit" method="post"
               modelAttribute="watchSize">
        <div class="register-top-grid">
            <h2>WATCH SIZE</h2>
            <div>
                <span>Watch Size ID<label>*</label></span>
                <form:input type="text" path="sizeID"/>
                <form:errors path="sizeID" cssClass="error"/>
            </div>
            <div>
                <span>Watch Size Value<label>*</label></span>
                <form:input type="text" path="sizeValue"/>
                <form:errors path="sizeValue" cssClass="error"/>
            </div>
            <div class="clearfix"></div>
        </div>
        <div class="clearfix"></div>
        <div class="register-button">
            <input type="submit" value="Add"/>
            <div class="clearfix"></div>
        </div>
    </form:form>
</div>
<%--Type list--%>
<table>
    <thead>
    <tr>
        <th>Type ID</th>
        <th>Type Value</th>
    </tr>

    </thead>
    <c:forEach var="item" items="${watchTypeList}">
        <tr>
            <td>${item.watchTypeID}</td>
            <td>${item.watchTypeValue}</td>
            <td>
                <form:form action="product/delete-type-submit/${item.watchTypeID}" method="post"
                           modelAttribute="typeForm">
                    <form:hidden path="tID" value="${item.watchTypeID}"/>
                    <input type="submit" value="Delete">
                    <form:errors path="tID" cssClass="error"/>
                </form:form>
            </td>
        </tr>
    </c:forEach>
</table>
<%--Add Watch Type Form--%>
<div class="container">
    <form:form action="${pageContext.request.contextPath}/admin/product/add-type-submit" method="post"
               modelAttribute="watchType">
        <div class="register-top-grid">
            <h2>WATCH TYPE</h2>
            <div>
                <span>Watch Type ID<label>*</label></span>
                <form:input type="text" path="watchTypeID"/>
                <form:errors path="watchTypeID" cssClass="error"/>
            </div>
            <div>
                <span>Watch Type Value<label>*</label></span>
                <form:input type="text" path="watchTypeValue"/>
                <form:errors path="watchTypeValue" cssClass="error"/>
            </div>
            <div class="clearfix"></div>
        </div>
        <div class="clearfix"></div>
        <div class="register-button">
            <input type="submit" value="Add"/>
            <div class="clearfix"></div>
        </div>
    </form:form>
</div>
</body>
</html>
