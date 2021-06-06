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
<main>
    <div class="slider-area">
        <div class="single-slider slider-height2 d-flex align-items-center">
            <div class="container">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="hero-cap text-center">
                            <h2>Cart List</h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <c:choose>
        <c:when test="${sessionScope.cartSize == null}">
            <p>There is currently no item in your cart. Items that you have added to your cart will appear here.</p>
        </c:when>
        <c:otherwise>
            <section class="cart_area section_padding">
                <div class="container">
                    <div class="cart_inner">
                        <div class="table-responsive">
                            <table class="table">
                                <thead>
                                <tr>
                                    <th scope="col">Product</th>
                                    <th scope="col">Price</th>
                                    <th scope="col">Quantity</th>
                                    <th scope="col">Total</th>
                                </tr>
                                </thead>
                                <tbody>
                                <form:form action="${pageContext.request.contextPath}/cart/update-quantity"
                                           method="post"
                                           modelAttribute="cartForm">

                                    <c:forEach var="item" items="${cartItemInfo}" varStatus="status">
                                        <tr>
                                            <td>
                                                <div class="media">
                                                    <div class="d-flex">
                                                        <img src="${item.img}" alt=""/>
                                                    </div>
                                                    <div class="media-body">
                                                        <p>${item.productName}</p>
                                                    </div>
                                                </div>
                                            </td>
                                            <td>
                                                <h5>VND ${item.price}</h5>
                                            </td>
                                            <td>
                                                <div class="product_count">
                                                    <form:hidden path="cartList[${status.index}].pID"
                                                                 value="${item.productID}"/>
                                                    <form:input path="cartList[${status.index}].quantity"
                                                                value="${item.quantity}"/>
                                                </div>
                                            </td>
                                            <td>
                                                <h5>VND ${item.quantity*item.price}</h5>
                                            </td>
                                        </tr>
                                    </c:forEach>

                                    <tr class="bottom_button">
                                        <td>
                                            <div class="account-top">
                                                <input class="btn btn-primary" type="submit" value="Update cart">
                                            </div>
                                        </td>

                                        <td></td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                </form:form>

                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td>
                                        <h5>Subtotal</h5>
                                    </td>
                                    <td>
                                        <h5>VND ${total}</h5>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                            <div class="checkout_btn_inner account-top">
                                <a class="btn_1" href="${pageContext.request.contextPath}/product">Continue
                                    Shopping</a>
                                <form:form action="${pageContext.request.contextPath}/move-to-checkout" method="post">
                                    <input class="btn_1" type="submit" value="Checkout">
                                </form:form>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </c:otherwise>
    </c:choose>
</main>

<%--<form:form action="${pageContext.request.contextPath}/cart/update-quantity" method="post" modelAttribute="cartForm">--%>
<%--    <table>--%>
<%--        <c:forEach var="item" items="${cartList}" varStatus="status">--%>
<%--            <form:hidden path="cartList[${status.index}].pID" value="${item.pID}"/>--%>
<%--            <tr>--%>
<%--                <td>${item.pID}</td>--%>
<%--                <td><form:input path="cartList[${status.index}].quantity" value="${item.quantity}"/></td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--    </table>--%>
<%--    <input type="submit" value="Update cart">--%>
<%--</form:form>--%>
<%--<form:form action="${pageContext.request.contextPath}/move-to-checkout" method="post">--%>
<%--    <input type="submit" value="Checkout">--%>
<%--</form:form>--%>

</body>
</html>
