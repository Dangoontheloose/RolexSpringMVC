<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<div class="account-in">
    <div class="container">
        <form:form action="register-submit" method="post" modelAttribute="registerViewModel">
            <div class="register-top-grid">
                <h2>PERSONAL INFORMATION</h2>
                <div>
                    <span>First Name<label>*</label></span>
                    <form:input type="text" path="firstName"/>
                    <form:errors path="firstName" cssClass="error"/>
                </div>
                <div>
                    <span>Last Name<label>*</label></span>
                    <form:input type="text" path="lastName"/>
                    <form:errors path="lastName" cssClass="error"/>
                </div>
                <div>
                    <span>Email Address<label>*</label></span>
                    <form:input type="text" path="email"/>
                    <form:errors path="email" cssClass="error"/>
                </div>
                <div>
                    <span>Phone Number<label>*</label></span>
                    <form:input type="text" path="phoneNumber"/>
                    <form:errors path="phoneNumber" cssClass="error"/>
                </div>
                <div>
                    <span>Address<label>*</label></span>
                    <form:input type="text" path="address"/>
                    <form:errors path="address" cssClass="error"/>
                </div>
                <div class="clearfix"></div>
                <a class="news-letter" href="#">
                    <label class="checkbox"><form:checkbox path="subscribed"/><i> </i>Sign
                        Up for Newsletter</label>
                </a>
            </div>
            <div class="register-bottom-grid">
                <h2>LOGIN INFORMATION</h2>
                <div>
                    <span>Password<label>*</label></span>
                    <form:password path="password"/>
                    <form:errors path="password" cssClass="error"/>
                </div>
                <div>
                    <span>Confirm Password<label>*</label></span>
                    <form:password path="passwordConfirm"/>
                    <form:errors path="passwordConfirm" cssClass="error"/>
                </div>
                <div class="clearfix"></div>
            </div>
            <div class="clearfix"></div>
            <div class="account-top">
                <input type="submit" value="Submit"/>
                <div class="clearfix"></div>
            </div>
        </form:form>
    </div>
</div>