<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dango
  Date: 07/06/2021
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body id="reportsPage">
<div class="" id="home">
    <div class="container">
        <div class="row">
            <div class="col">
                <p class="text-white mt-5 mb-5">Welcome back, <b>Admin</b></p>
            </div>
        </div>
        <!-- row -->
        <div class="row tm-content-row">
            <div class="col-12 tm-block-col">
                <div class="tm-bg-primary-light tm-block tm-block-taller tm-block-scroll">
                    <h2 class="tm-block-title">Order List</h2>
                    <table class="table">
                        <thead>
                        <tr>
                            <th scope="col">ORDER NO.</th>
                            <th scope="col">STATUS</th>
                            <th scope="col">EMAIL</th>
                            <th scope="col">ADDRESS</th>
                            <th scope="col">DELIVERY DATE</th>
                            <th scope="col">TOTAL PRICE</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="item" items="${orderList}">
                            <tr>
                                <th scope="row"><b>${item.cartID}</b></th>
                                <th scope="row"><b>${item.state}</b></th>
                                <td><b>${item.email}</b></td>
                                <td><b>${item.address}</b></td>
                                <td>${item.deliveryDate}</td>
                                <td>VND ${item.price}</td>
                            </tr>
                        </c:forEach>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
