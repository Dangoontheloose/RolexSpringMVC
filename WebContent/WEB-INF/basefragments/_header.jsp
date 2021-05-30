<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="banner">
    <div class="container">
        <div class="logo">
            <h1><a style="text-decoration: none" href="#"><span class="m_1">R</span>olex</a></h1>
        </div>
        <div class="header_top">
            <div class="header_top_left">
                <div class="box">
                    <a href="${pageContext.request.contextPath}/cart">
                        <h4>
                            <p>Cart:(${(sessionScope.cartSize != null) ? sessionScope.cartSize : 0} items)</p>
                            <img src="http://localhost:8080/rolex/resources/images/bag.png" alt=""/>
                            <div class="clearfix"></div>
                        </h4>
                    </a>
                </div>
            </div>
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
                <div>
                    <form>
                        <input class="sb-search-input" placeholder="Find watch" type="search" name="search" id="search">
                        <input class="sb-search-submit" type="submit" value="">
                        <span class="sb-icon-search"></span>
                    </form>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
        <div class="clearfix"></div>
    </div>
    <div class="header_bottom">
        <div class="menu">
            <ul class="megamenu skyblue">
                <li><a class="color2" href="#">Mens</a>
                </li>
                <li><a class="color2" href="#">Womens</a>
                </li>
                <li><a class="color10" href="#">Brands</a></li>
                <li><a class="color7" href="#">News</a></li>
                <div class="clearfix"></div>
            </ul>
        </div>
        <div class="clearfix"></div>
    </div>
</div>

