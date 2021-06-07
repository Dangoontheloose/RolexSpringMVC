<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="banner">
    <div class="container">
        <div class="logo">
            <h1><a style="text-decoration: none" href="${pageContext.request.contextPath}"><span class="m_1">R</span>olex</a></h1>
        </div>
        <div class="header_top">
            <div class="header_top_right">
                <ul class="header_user_info">
                    <c:if test="${sessionScope.email == null}">
                        <a class="login" href="${pageContext.request.contextPath}/login">
                            <i class="user"></i>
                            <li>Log in</li>
                        </a>
                    </c:if>
                    <li class="user_desc">${sessionScope.email}</li>
                    <div class="clearfix"></div>
                </ul>
            </div>
            <div class="search-box">
                <div class="box sb-search-input">
                    <a href="${pageContext.request.contextPath}/cart">
                        <h4>
                            <p>Cart:(${(sessionScope.cartSize != null) ? sessionScope.cartSize : 0} items)</p>
                            <img src="${pageContext.request.contextPath}/resources/images/bag.png" alt=""/>
                            <div class="clearfix"></div>
                        </h4>
                    </a>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
        <div class="clearfix"></div>
    </div>
    <div class="header_bottom">
        <div class="menu">
            <ul class="megamenu skyblue">
                <li><a class="color2" href="${pageContext.request.contextPath}/">Home</a>
                </li>
                <li><a class="color2" href="${pageContext.request.contextPath}/product">Men</a>
                </li>
                <li><a class="" href="${pageContext.request.contextPath}/product">Women</a></li>
                <li><a class="" href="${pageContext.request.contextPath}/about">About</a></li>
                <div class="clearfix"></div>
            </ul>
        </div>
        <div class="clearfix"></div>
    </div>
</div>

