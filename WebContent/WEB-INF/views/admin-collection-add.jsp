<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
</head>
<body>
<div class="account-in">
    <div class="container">
        <form:form action="add-collection-submit" method="post" modelAttribute="collection">
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
                <input type="submit" value="Submit"/>
                <div class="clearfix"></div>
            </div>
        </form:form>
    </div>
</div>
</body>
</html>