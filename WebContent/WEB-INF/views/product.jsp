<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<div class="product">
    <div class="container">
        <h3>Product</h3>
        <div class="row">
            <div class="col-md-9 prdt-left">
                <div class="row product-one">
                    <c:forEach var="item" items="${product}">
                        <div class="col-md-4 product-left p-left">
                            <div class="product-main">
                                <a href="${pageContext.request.contextPath}/product/${item.productID}" class="mask"><img class="img-responsive zoom-img" src="${item.img}" alt="" /></a>
                                <div class="product-bottom">
                                    <h3>${item.productName}</h3>
                                    <p>${item.collectionName}</p>
                                    <h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">${item.price}</span> VND</h4>
                                </div>
                            </div>
                        </div>
                    <div class="clearfix"></div>
                    </c:forEach>
                </div>
            </div>
            <div class="col-md-3 prdt-right">
                <form:form action="${pageContext.request.contextPath}/apply-filter" method="post" modelAttribute="filter">
                <div class="w_sidebar">
                    <section  class="sky-form">
                        <h4>Categories</h4>
                        <div class="row1 scroll-pane">
                            <c:forEach var="item" items="${typeList}" varStatus="status">
                                <div class="row no-gutters">
                                    <div class="col-2">
                                        <form:checkbox class="checkbox" path="typeFilter" value="${item.watchTypeValue}"/><i></i>
                                    </div>
                                    <div class="col-10">${item.watchTypeValue}</div> </div>
                            </c:forEach>
                        </div>
                    </section>
                    <section  class="sky-form">
                        <h4>Collection</h4>
                        <div class="row1 row2 scroll-pane">
                            <c:forEach var="item" items="${collectionList}" varStatus="status">
                                <div class="row no-gutters">
                                    <div class="col-2">
                                        <form:checkbox class="checkbox" path="collectionFilter" value="${item.collectionName}"/><i></i>
                                    </div>
                                    <div class="col-10">${item.collectionName}</div> </div>
                            </c:forEach>
                        </div>
                    </section>
                    <section  class="sky-form">
                        <h4>Material</h4>
                        <div class="row1 row2 scroll-pane">
                            <c:forEach var="item" items="${materialList}" varStatus="status">
                                <div class="row no-gutters">
                            <div class="col-2">
                                    <form:checkbox class="checkbox" path="materialFilter" value="${item.materialName}"/><i></i>
                            </div>
                                <div class="col-10">${item.materialName}</div> </div>
                            </c:forEach>
                        </div>
                    </section>
                    <section  class="sky-form">
                        <h4>Size</h4>
                        <div class="row1 row2 scroll-pane">
                            <c:forEach var="item" items="${sizeList}" varStatus="status">
                                <div class="row no-gutters">
                                    <div class="col-2">
                                        <form:checkbox class="checkbox" path="sizeFilter" value="${item.sizeValue}"/><i></i>
                                    </div>
                                    <div class="col-10">${item.sizeValue}</div> </div>
                            </c:forEach>
                        </div>
                    </section>
                </div>
                    <div>
                        <div style="margin-top: 10px" class="account-top">
                            <input type="submit" value="Apply filter">
                        </div>
                    </div>
                </form:form>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
