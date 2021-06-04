<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dango
  Date: 03/06/2021
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<section class="checkout_area section_padding">
    <div class="container">
        <div class="billing_details">
            <div class="row">
                <div class="col-lg-8">
                    <h3>Billing Details</h3>
                    <form:form class="row contact_form" action="${pageContext.request.contextPath}/profile/update"
                               method="post" modelAttribute="personalInfo" novalidate="novalidate">
                        <form:hidden path="customerID" value="${customerID}"/>
                        <div class="col-md-12 form-group p_star">
                            <form:input type="text" class="form-control" id="first" name="name" path="name"/>
                        </div>
                        <div class="col-md-6 form-group p_star">
                            <form:input type="text" class="form-control" id="number" name="number" path="phoneNum"/>
                        </div>
                        <div class="col-md-6 form-group p_star">
                            <form:input type="text" class="form-control" id="email" name="email" path="email"/>
                        </div>
                        <div class="col-md-12 form-group p_star">
                            <form:input type="text" class="form-control" id="add1" name="address" path="address"/>
                        </div>
                        <div class="register-button">
                            <input class="btn btn-primary" type="submit" value="Update Personal Info">
                        </div>
                    </form:form>
                </div>
                <div class="col-lg-4">
                    <div class="order_box">
                        <h2>Your Order</h2>
                        <ul class="list">
                            <c:forEach var="item" items="${checkoutInfo}">
                            <li>
                                <a href="${pageContext.request.contextPath}/product/${item.productID}"> ${item.productName}
                                    <span class="middle">x ${item.quantity}</span>
                                    <span class="last">VND ${item.price}</span>
                                </a>
                            </li>
                        </ul>
                        <ul class="list list_2">
                            <li>
                                <a href="#">Subtotal
                                    <span>VND ${item.quantity*item.price}</span>
                                </a>
                            </li>
                            </c:forEach>
                            <li>
                                <a href="#">Total
                                    <span>VND ${total}</span>
                                </a>
                            </li>
                        </ul>
                        <div class="payment_item active">
                            <div class="radion_btn">
                                <input type="radio" id="f-option7" name="selector"/>
                                <label for="f-option7">Debit or Credit Card</label>
                                <div class="check"></div>
                            </div>
                        </div>
                        <form action='${pageContext.request.contextPath}/charge' method='POST' id='checkout-form'>
                            <input type='hidden' value='${total/100}' name='amount'/>
                            <script
                                    src='https://checkout.stripe.com/checkout.js'
                                    class='stripe-button'
                                    data-key=${stripePublicKey}
                                    data-amount=${total/100}
                                    data-currency=${currency}
                                    data-name='Baeldung'
                                    data-description='Spring course checkout'
                                    data-image
                                            ='https://www.baeldung.com/wp-content/themes/baeldung/favicon/android-chrome-192x192.png'
                                    data-locale='auto'
                                    data-zip-code='false'>
                            </script>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>


</body>
</html>
