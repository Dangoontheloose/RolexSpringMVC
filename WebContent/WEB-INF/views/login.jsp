<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="account-in">
    <div class="container">
        <h3>Account</h3>
        <div class="row">
            <div class="col-md-7 account-top">
                <form:form action="${pageContext.request.contextPath}/login-submit" modelAttribute="loginForm">
                    <div>
                        <span>Email*</span>
                        <form:input type="text" path="email"/>
                        <form:errors path="email"/>
                    </div>
                    <div>
                        <span class="pass">Password*</span>
                        <form:password path="password"/>
                        <form:errors path="password"/>
                    </div>
                    <input type="submit" value="Login">
                    <a href="${pageContext.request.contextPath}/register">Register</a>
                </form:form>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>