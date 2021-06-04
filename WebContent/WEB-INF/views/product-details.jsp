<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/12/2021
  Time: 12:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form:form action="${pageContext.request.contextPath}/product/add-to-cart" method="post" modelAttribute="addToCartForm">
    <form:hidden path="pID" value="${product.productID}"/>
    <div class="row men">
    <div class="container">
        <div class="col-md-10 single_top">
            <div class="single_left">
                <div class="labout span_1_of_a1">
                    <img src="${product.img}" width="100%" alt="">
                    <div class="clearfix"></div>
                </div>
                <div class="cont1 span_2_of_a1 simpleCart_shelfItem">
                    <h1>${product.productName}</h1>
                    <p class="availability">Availability: <span class="color">In stock</span></p>
                    <div class="price_single">
                        <span class="">${product.price} VND</span>
                    </div>
                    <h2 class="quick">Quick Overview:</h2>
                    <p class="quick_desc">${product.description}</p>
                    <ul class="size">
                        <h3>Size: <span>${product.sizeValue}</span></h3>
                        <h3>Type: <span>${product.watchTypeValue}</span></h3>
                    </ul>
                    <div class="quantity_box">
                        <ul class="product-qty">
                            <span>Quantity:</span>
                            <form:select type="text" path="quantity">
                                <form:option value="1">1</form:option>
                                <form:option value="2">2</form:option>
                                <form:option value="3">3</form:option>
                                <form:option value="4">4</form:option>
                            </form:select>
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <div class="account-top">
                        <input type="submit" value="Add to cart">
                    </div>
                </div>
                <div class="clearfix"> </div>
            </div>
            <div class="sap_tabs">
                <div>
                    <ul class="resp-tabs-list">
                        <li class="resp-tab-item"><span>Product Description</span></li>
                    </ul>
                    <div class="resp-tabs-container">
                        <div class="tab-1 resp-tab-content">
                            <div class="facts">
                                <ul class="tab_list">
                                    <li>${product.detailDescription[0]}</li>
                                    <li>${product.detailDescription[1]}</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
</form:form >