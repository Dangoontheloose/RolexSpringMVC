<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/4/2021
  Time: 5:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<div class="about-details section-padding30">
    <div class="container">
        <h1>About us</h1>
        <div class="row">
            <div class="offset-xl-1 col-lg-12">
                <div class="about-details-cap mb-50">
                    <h4>Our Mission</h4>
                    <p>Consectetur adipiscing elit, sued do eiusmod tempor ididunt udfgt labore et dolore magna aliqua. Quis ipsum suspendisces gravida. Risus commodo viverra sebfd dho eiusmod tempor maecenas accumsan lacus. Risus commodo viverra sebfd dho eiusmod tempor maecenas accumsan lacus.
                    </p>
                    <p> Risus commodo viverra sebfd dho eiusmod tempor maecenas accumsan lacus. Risus commodo viverra sebfd dho eiusmod tempor maecenas accumsan.</p>
                </div>

                <div class="about-details-cap mb-50">
                    <h4>Our Vision</h4>
                    <p>Consectetur adipiscing elit, sued do eiusmod tempor ididunt udfgt labore et dolore magna aliqua. Quis ipsum suspendisces gravida. Risus commodo viverra sebfd dho eiusmod tempor maecenas accumsan lacus. Risus commodo viverra sebfd dho eiusmod tempor maecenas accumsan lacus.
                    </p>
                    <p> Risus commodo viverra sebfd dho eiusmod tempor maecenas accumsan lacus. Risus commodo viverra sebfd dho eiusmod tempor maecenas accumsan.</p>
                </div>
            </div>
        </div>
    </div>
    <div class="video-area">
        <div class="container-fluid">
            <div class="row align-items-center">
                <div class="col-lg-12">
                    <!-- set background img in css -->
                </div>
            </div>
        </div>
    </div>
    <section class="agent">
        <h2>Our Team</h2>
        <div class="agent__content">
            <div class="agent__info">
                <img src="${pageContext.request.contextPath}/resources/images/Hau.jpg" alt="">
                <div class="agent__text">
                    <h4>TAN HAU</h4>
                    <p>Leader</p>
                </div>
            </div>
            <div class="agent__info">
                <img src="${pageContext.request.contextPath}/resources/images/Huy.jpg" alt="">
                <div class="agent__text">
                    <h4>DUC HUY</h4>
                    <p>Sub Leader</p>
                </div>
            </div>
            <div class="agent__info">
                <img src="${pageContext.request.contextPath}/resources/images/Trang.jpg" alt="">
                <div class="agent__text">
                    <h4>THU TRANG</h4>
                    <p>Member</p>
                </div>
            </div>
        </div>
    </section>
</div>
