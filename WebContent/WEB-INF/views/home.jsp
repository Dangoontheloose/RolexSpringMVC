<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<div class="product">
    <div class="container">
        <div class="row">
            <div class="col-md-9 prdt-left">
                <div class="row product-one">
                    <c:forEach var="item" items="${product}">
                        <div class="col-md-4 product-left p-left">
                            <div class="product-main">
                                <a href="#" class="mask"><img class="img-responsive zoom-img" src="${item.img}" alt="" /></a>
                                <div class="product-bottom">
                                    <h3>${item.collectionID}</h3>
                                    <p>${item.productID}</p>
                                    <h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">${item.price}</span></h4>
                                </div>
                            </div>
                        </div>
                    <div class="clearfix"></div>
                    </c:forEach>
                </div>
            </div>
            <div class="col-md-3 prdt-right">
                <div class="w_sidebar">
                    <section  class="sky-form">
                        <h4>Catogories</h4>
                        <div class="row1 scroll-pane">
                            <div class="col col-4">
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>All</label>
                            </div>
                            <div class="col col-4">
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Women</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Men</label>
                            </div>
                        </div>
                    </section>
                    <section  class="sky-form">
                        <h4>Brand</h4>
                        <div class="row1 row2 scroll-pane">
                            <div class="col col-4">
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Explorer</label>
                            </div>
                            <div class="col col-4">
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Submarine</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>DayDate</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>SeaDweller</label>
                            </div>
                        </div>
                    </section>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
