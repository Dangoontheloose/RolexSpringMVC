<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dango
  Date: 04/06/2021
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order</title>
</head>
<body>
<main>
    <div class="slider-area ">
        <div class="single-slider slider-height2 d-flex align-items-center">
            <div class="container">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="hero-cap text-center">
                            <h2>Order</h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <section class="confirmation_part section_padding">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-lx-4">
                    <div class="single_confirmation_details">
                        <h4>order info</h4>
                        <ul>
                            <li>
                                <p>order number</p><span>: ${cart.cartID}</span>
                            </li>
                            <li>
                                <p>date</p><span>: ${cart.deliveryDate}</span>
                            </li>
                            <li>
                                <p>total</p><span>: VND ${cart.total}</span>
                            </li>
                            <li>
                                <p>Payment method</p><span>: Credit card</span>
                            </li>
                            <li>
                                <p>Order status</p><span>: ${cart.state}</span>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-6 col-lx-4">
                    <div class="single_confirmation_details">
                        <h4>shipping Address</h4>
                        <ul>
                            <li>
                                <p>Street</p><span>: ${cart.address}</span>
                            </li>
                            <li>
                                <p>City</p><span>: Thu Duc</span>
                            </li>
                            <li>
                                <p>Country</p><span>: Vietnam</span>
                            </li>
                            <li>
                                <p>Postcode</p><span>: 70000</span>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="order_details_iner">
                        <h3>Order Details</h3>
                        <table class="table table-borderless">
                            <thead>
                            <tr>
                                <th scope="col" colspan="2">Product</th>
                                <th scope="col">Quantity</th>
                                <th scope="col">Total</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="item" items="${cartList}">

                            <tr>
                                <th colspan="2"><span>${item.productName}</span></th>
                                <th>x ${item.quantity}</th>
                                <th><span>VND ${item.price}</span></th>
                            </tr>
                            <tr>
                                <th colspan="3">Subtotal</th>
                                <th> <span>VND ${item.quantity*item.price}</span></th>
                            </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </section>
</main>
</body>
</html>
