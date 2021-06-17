<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/4/2021
  Time: 3:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<div class="main">
    <div class="container">
        <ul class="row content-home">
            <li class="col-10">
                <a href="${pageContext.request.contextPath}/product" class="item-link" title="">
                    <div class="bannerBox">
                        <img src="${pageContext.request.contextPath}/resources/images/man.jpg" class="item-img" title="" alt="" width="100%" height="100%">
                        <div class="item-html">
                            <h3><span>Men & Women</span></h3>
                            <p>The ultimate watch of prestige</p>
                            <button>Shop now!</button>
                        </div>
                    </div>
                </a>
            </li>
            <div class="clearfix"></div>
        </ul>
    </div>
    <div class="middle_content">
        <div class="container">
            <h2>Welcome</h2>
            <h3>ROLEX WATCHES ARE CRAFTED WITH SCRUPULOUS ATTENTION TO DETAIL</h3>
            <p>Explore the Rolex collection of prestigious, high-precision timepieces. Rolex offers a wide assortment of Oyster Perpetual and Cellini watches to suit any wrist. Discover the broad selection of Rolex watches to find a perfect combination of style and functionality.</p>
            <p>We call this perpetual spirit. It is based on a fundamental belief in unlimited human potential, in continuous improvement and lasting excellence, in always pushing the boundaries and taking the long-term view. Our watches are built to last. So is our contribution to future generations. Discover more about our corporate commitments on Rolex.org</p>
        </div>
    </div>
    <div class="gallery-area">
        <div class="row">
            <div class="col-xl-6 col-lg-4 col-md-6 col-sm-6">
                <div class="single-gallery mb-30">
                    <div class="gallery-img big-img" style="background-image: url(${pageContext.request.contextPath}/resources/images/gallery1.jpg)"></div>
                </div>
            </div>
            <div class="col-xl-3 col-lg-4 col-md-6 col-sm-6">
                <div class="single-gallery mb-30">
                    <div class="gallery-img big-img" style="background-image: url(${pageContext.request.contextPath}/resources/images/gallery2.jpg)"></div>
                </div>
            </div>
            <div class="col-xl-3 col-lg-4 col-md-12">
                <div class="row">
                    <div style="margin-bottom: 30px;" class="col-xl-12 col-lg-12 col-md-6 col-sm-6">
                        <div class="single-gallery mb-30">
                            <div class="gallery-img small-img" style="background-image: url(${pageContext.request.contextPath}/resources/images/gallery3.jpg)"></div>
                        </div>
                    </div>
                    <div class="col-xl-12 col-lg-12  col-md-6 col-sm-6">
                        <div class="single-gallery mb-30">
                            <div class="gallery-img small-img" style="background-image: url(${pageContext.request.contextPath}/resources/images/gallery4.jpg)"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>
<div class="clearfix"></div>