<%--
  Created by IntelliJ IDEA.
  User: dango
  Date: 17/06/2021
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
<div class="account-in">
    <div class="container">
        <form>
            <div class="register-top-grid">
                <h2>PERSONAL INFORMATION</h2>
                <div>
                    <span>First Name<label>*</label></span>
                    <input type="text">
                </div>
                <div>
                    <span>Last Name<label>*</label></span>
                    <input type="text">
                </div>
                <div>
                    <span>Email Address<label>*</label></span>
                    <input type="email">
                </div>
                <div>
                    <span>Phone Number<label>*</label></span>
                    <input type="text">
                </div>
                <div>
                    <span>Address<label>*</label></span>
                    <input type="text">
                </div>
                <div class="clearfix"> </div>
            </div>
        </form>
        <div class="clearfix"> </div>
        <div class="register-button">
            <form>
                <input type="submit" value="Save changes">
                <div class="clearfix"></div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
