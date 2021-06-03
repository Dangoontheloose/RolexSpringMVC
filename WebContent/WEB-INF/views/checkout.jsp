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
<form action='${pageContext.request.contextPath}/charge' method='POST' id='checkout-form'>
    <input type='hidden' value='${amount}' name='amount' />
    <label>Price:<span>${amount} VND</span></label>
    <script
            src='https://checkout.stripe.com/checkout.js'
            class='stripe-button'
            data-key=${stripePublicKey}
            data-amount=${amount}
            data-currency=${currency}
            data-name='Baeldung'
            data-description='Spring course checkout'
            data-image
                    ='https://www.baeldung.com/wp-content/themes/baeldung/favicon/android-chrome-192x192.png'
            data-locale='auto'
            data-zip-code='false'>
    </script>
</form>
</body>
</html>
