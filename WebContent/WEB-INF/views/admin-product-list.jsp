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
<%--<a class="btn btn-primary" href="${pageContext.request.contextPath}/admin/product/add">Add new product</a>--%>
<%--Product list--%>
<div class="">
    <div class="row tm-content-row">
        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12 tm-block-col">
            <div class="tm-bg-primary-light tm-block tm-block-products">
                <div class="tm-product-table-container">
                    <table class="table table-hover tm-table-small tm-product-table">
                        <thead>
                        <tr>
                            <th></th>
                            <th>Product ID</th>
                            <th>Collection</th>
                            <th>Description</th>
                            <th>Price</th>
                            <th>Stock</th>
                            <th>Size</th>
                            <th>Material</th>
                            <th>Type</th>
                            <th>Image</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="item" items="${productList}">
                            <tr>
                                <td><a href="${pageContext.request.contextPath}/admin/product/${item.productID}"><button>Edit</button></a></td>
                                <td>${item.productID}</td>
                                <td>${item.collectionName}</td>
                                <td>${item.description}</td>
                                <td>${item.price}</td>
                                <td>${item.stock}</td>
                                <td>${item.sizeValue}</td>
                                <td>${item.materialName}</td>
                                <td>${item.watchTypeValue}</td>
                                <td>${item.img}</td>
                                    <%--                            <td>--%>
                                    <%--                            <c:forEach var="imgDetails" items="${item.imgDetails}">--%>
                                    <%--                            <tr><td>${imgDetails}</td></tr>--%>
                                    <%--                        </c:forEach></td>--%>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <a
                        href="${pageContext.request.contextPath}/admin/product/add"
                        class="btn btn-dark btn-block text-uppercase mb-3">Add new product</a>
                <button class="btn btn-primary btn-block text-uppercase">
                    Delete selected products
                </button>
            </div>
        </div>
    </div>
</div>
<%--Collection list--%>
<div class="">
    <div class="row tm-content-row">
        <div class="col-sm-6 col-md-6 col-lg-6 col-xl-6 tm-block-col">
            <div class="tm-bg-primary-light tm-block tm-block-products">
                <div class="tm-product-table-container">
                    <table class="table table-hover tm-table-small tm-product-table">
                        <thead>
                        <tr>
                            <th>Collection ID</th>
                            <th>Collection</th>
                            <th></th>
                        </tr>

                        </thead>
                        <tbody>
                        <c:forEach var="item" items="${collectionList}">
                            <tr>
                                <td>${item.collectionID}</td>
                                <td>${item.collectionName}</td>
                                <td>
                                    <form:form action="product/delete-collection-submit/${item.collectionID}"
                                               method="post"
                                               modelAttribute="collectionForm">
                                        <form:hidden path="collID" value="${item.collectionID}"/>
                                        <input type="submit" value="Delete">
                                        <form:errors path="collID" cssClass="error"/>
                                    </form:form>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <%--Add Collection Form--%>
        </div>
        <div class="col-sm-6 col-md-6 col-lg-6 col-xl-6">
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

    </div>
</div>
<%--Size list--%>
<div class="">
    <div class="row tm-content-row">
        <div class="col-sm-6 col-md-6 col-lg-6 col-xl-6 tm-block-col">
            <div class="tm-bg-primary-light tm-block tm-block-products">
                <div class="tm-product-table-container">
                    <table class="table table-hover tm-table-small tm-product-table">
                        <thead>
                        <tr>
                            <th>Size ID</th>
                            <th>Size Value</th>
                            <th></th>
                        </tr>

                        </thead>
                        <tbody>
                        <c:forEach var="item" items="${sizeList}">
                            <tr>
                                <td>${item.sizeID}</td>
                                <td>${item.sizeValue}</td>
                                <td>
                                    <form:form action="product/delete-size-submit/${item.sizeID}" method="post"
                                               modelAttribute="sizeForm">
                                        <form:hidden path="sID" value="${item.sizeID}"/>
                                        <input type="submit" value="Delete">
                                        <form:errors path="sID" cssClass="error"/>
                                    </form:form>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <%--Add Watch Size Form--%>
        <div class="col-sm-6 col-md-6 col-lg-6 col-xl-6">
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
    </div>
</div>
<%--Type list--%>
<div class="">
    <div class="row tm-content-row">
        <div class="col-sm-6 col-md-6 col-lg-6 col-xl-6 tm-block-col">
            <div class="tm-bg-primary-light tm-block tm-block-products">
                <div class="tm-product-table-container">
                    <table class="table table-hover tm-table-small tm-product-table">
                        <thead>
                        <tr>
                            <th>Type ID</th>
                            <th>Type Value</th>
                            <th></th>
                        </tr>

                        </thead>
                        <tbody>
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
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <%--Add Watch Type Form--%>
        <div class="col-sm-6 col-md-6 col-lg-6 col-xl-6">
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
    </div>
</div>
<%--Material List--%>
<div class="">
    <div class="row tm-content-row">
        <div class="col-sm-6 col-md-6 col-lg-6 col-xl-6 tm-block-col">
            <div class="tm-bg-primary-light tm-block tm-block-products">
                <div class="tm-product-table-container">
                    <table class="table table-hover tm-table-small tm-product-table">
                        <thead>
                        <tr>
                            <th>Material ID</th>
                            <th>Material Value</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="item" items="${materialList}">
                            <tr>
                                <td>${item.materialID}</td>
                                <td>${item.materialName}</td>
                                <td>
                                    <form:form action="product/delete-material-submit/${item.materialID}" method="post"
                                               modelAttribute="materialForm">
                                        <form:hidden path="mID" value="${item.materialID}"/>
                                        <input type="submit" value="Delete">
                                        <form:errors path="mID" cssClass="error"/>
                                    </form:form>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <div class="col-sm-6 col-md-6 col-lg-6 col-xl-6">
            <form:form action="${pageContext.request.contextPath}/admin/product/add-material-submit" method="post"
                       modelAttribute="material">
                <div class="register-top-grid">
                    <h2>MATERIAL</h2>
                    <div>
                        <span>Material ID<label>*</label></span>
                        <form:input type="text" path="materialID"/>
                        <form:errors path="materialID" cssClass="error"/>
                    </div>
                    <div>
                        <span>Material Name<label>*</label></span>
                        <form:input type="text" path="materialName"/>
                        <form:errors path="materialName" cssClass="error"/>
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
    </div>
</div>

</body>
</html>
