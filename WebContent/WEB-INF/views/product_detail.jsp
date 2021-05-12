<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/12/2021
  Time: 12:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form:form action="" method="get" modelAttribute="productDetailViewModel">
<div class="row men">
    <div class="container">
        <div class="col-md-10 single_top">
            <div class="single_left">
                <div class="labout span_1_of_a1">
                    <img src="${product.img}" width="100%" alt="">
                    <div class="clearfix"></div>
                </div>
                <div class="cont1 span_2_of_a1 simpleCart_shelfItem">
                    <h1>Explorer</h1>
                    <p class="availability">Availability: <span class="color">In stock</span></p>
                    <div class="price_single">
                        <span class="">${product.price}</span>
                    </div>
                    <h2 class="quick">Quick Overview:</h2>
                    <p class="quick_desc">${product.description}</p>
                    <ul class="size">
                        <h3>Size</h3>
                        <li><a href="#">${product.sizeID}</a></li>
                        <h3>Type</h3>
                        <li><a href="#">${product.watchTypeID}</a></li>
                    </ul>
                    <div class="quantity_box">
                        <ul class="product-qty">
                            <span>Quantity:</span>
                            <select>
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                            </select>
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <a href="#" class="btn btn-primary btn-normal btn-inline btn_form button item_add item_1" target="_self">Add to cart</a>
                </div>
                <div class="clearfix"> </div>
            </div>
            <div class="sap_tabs">
                <div>
                    <ul class="resp-tabs-list">
                        <li class="resp-tab-item"><span>Product Description</span></li>
                    </ul>
                    <div class="resp-tabs-container">
                        <div class="tab-1 resp-tab-content">
                            <div class="facts">
                                <ul class="tab_list">
                                    <li><a href="#">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat</a></li>
                                    <li><a href="#">augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigatione</a></li>
                                    <li><a href="#">claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica</a></li>
                                    <li><a href="#">Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc nobis videntur parum clari, fiant sollemnes in futurum.</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
</form:form >