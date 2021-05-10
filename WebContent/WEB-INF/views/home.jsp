<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Home Page</title>
        <link rel="stylesheet"
              href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
        <link rel="stylesheet"
              href="${pageContext.request.contextPath}/resources/css/flexslider.css">
        <link rel="stylesheet"
              href="${pageContext.request.contextPath}/resources/css/style.css">
        <link rel="stylesheet"
              href="${pageContext.request.contextPath}/resources/css/memenu.css">
    </head>
    <body>
    <!--top-header-->
    <div class="top-header">
        <div class="container">
            <div class="top-header-main">
                <div class="col-md-6 top-header-left">
                    <div class="drop">
                        <div class="box">
                            <select tabindex="4" class="dropdown drop">
                                <option value="" class="label">Dollar :</option>
                                <option value="1">Dollar</option>
                                <option value="2">Euro</option>
                            </select>
                        </div>
                        <div class="box1">
                            <select tabindex="4" class="dropdown">
                                <option value="" class="label">English :</option>
                                <option value="1">English</option>
                                <option value="2">French</option>
                                <option value="3">German</option>
                            </select>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                </div>
                <div class="col-md-6 top-header-left">
                    <div class="cart box_1">
                        <a href="#">
                            <div class="total">
                                <span class="simpleCart_total"></span></div>
                            <img src="http://localhost:8080/rolex/resources/images/cart-1.png" alt="" />
                        </a>
                        <p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
                        <div class="clearfix"> </div>
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </div>
    <!--top-header-->
    <!--start-logo-->
    <div class="logo">
        <a href="#"><h1>Luxury Watches</h1></a>
    </div>
    <!--start-logo-->
    <!--bottom-header-->
    <div class="header-bottom">
        <div class="container">
            <div class="header">
                <div class="col-md-9 header-left">
                    <div class="top-nav">
                        <ul class="memenu skyblue"><li class="active"><a href="#">Home</a></li>
                            <li class="grid"><a href="#">Men</a>
                                <div class="mepanel">
                                    <div class="row">
                                        <div class="col1 me-one">
                                            <h4>Shop</h4>
                                            <ul>
                                                <li><a href="#">New Arrivals</a></li>
                                                <li><a href="#">Blazers</a></li>
                                                <li><a href="#">Swem Wear</a></li>
                                                <li><a href="#">Accessories</a></li>
                                                <li><a href="#">Handbags</a></li>
                                                <li><a href="#">T-Shirts</a></li>
                                                <li><a href="#">Watches</a></li>
                                                <li><a href="#">My Shopping Bag</a></li>
                                            </ul>
                                        </div>
                                        <div class="col1 me-one">
                                            <h4>Style Zone</h4>
                                            <ul>
                                                <li><a href="#">Shoes</a></li>
                                                <li><a href="#">Watches</a></li>
                                                <li><a href="#">Brands</a></li>
                                                <li><a href="#">Coats</a></li>
                                                <li><a href="#">Accessories</a></li>
                                                <li><a href="#">Trousers</a></li>
                                            </ul>
                                        </div>
                                        <div class="col1 me-one">
                                            <h4>Popular Brands</h4>
                                            <ul>
                                                <li><a href="#">499 Store</a></li>
                                                <li><a href="#">Fastrack</a></li>
                                                <li><a href="#">Casio</a></li>
                                                <li><a href="#">Fossil</a></li>
                                                <li><a href="#">Maxima</a></li>
                                                <li><a href="#">Timex</a></li>
                                                <li><a href="#">TomTom</a></li>
                                                <li><a href="#">Titan</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="grid"><a href="#">Women</a>
                                <div class="mepanel">
                                    <div class="row">
                                        <div class="col1 me-one">
                                            <h4>Shop</h4>
                                            <ul>
                                                <li><a href="#">New Arrivals</a></li>
                                                <li><a href="#">Blazers</a></li>
                                                <li><a href="#">Swem Wear</a></li>
                                                <li><a href="#">Accessories</a></li>
                                                <li><a href="#">Handbags</a></li>
                                                <li><a href="#">T-Shirts</a></li>
                                                <li><a href="#">Watches</a></li>
                                                <li><a href="#">My Shopping Bag</a></li>
                                            </ul>
                                        </div>
                                        <div class="col1 me-one">
                                            <h4>Style Zone</h4>
                                            <ul>
                                                <li><a href="#">Shoes</a></li>
                                                <li><a href="#">Watches</a></li>
                                                <li><a href="#">Brands</a></li>
                                                <li><a href="#">Coats</a></li>
                                                <li><a href="#">Accessories</a></li>
                                                <li><a href="#">Trousers</a></li>
                                            </ul>
                                        </div>
                                        <div class="col1 me-one">
                                            <h4>Popular Brands</h4>
                                            <ul>
                                                <li><a href="#">499 Store</a></li>
                                                <li><a href="#">Fastrack</a></li>
                                                <li><a href="#">Casio</a></li>
                                                <li><a href="#">Fossil</a></li>
                                                <li><a href="#">Maxima</a></li>
                                                <li><a href="#">Timex</a></li>
                                                <li><a href="#">TomTom</a></li>
                                                <li><a href="#">Titan</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="grid"><a href="#">Kids</a>
                                <div class="mepanel">
                                    <div class="row">
                                        <div class="col1 me-one">
                                            <h4>Shop</h4>
                                            <ul>
                                                <li><a href="#">New Arrivals</a></li>
                                                <li><a href="#">Blazers</a></li>
                                                <li><a href="#">Swem Wear</a></li>
                                                <li><a href="#">Accessories</a></li>
                                                <li><a href="#">Handbags</a></li>
                                                <li><a href="#">T-Shirts</a></li>
                                                <li><a href="#">Watches</a></li>
                                                <li><a href="#">My Shopping Bag</a></li>
                                            </ul>
                                        </div>
                                        <div class="col1 me-one">
                                            <h4>Style Zone</h4>
                                            <ul>
                                                <li><a href="#">Shoes</a></li>
                                                <li><a href="#">Watches</a></li>
                                                <li><a href="#">Brands</a></li>
                                                <li><a href="#">Coats</a></li>
                                                <li><a href="#">Accessories</a></li>
                                                <li><a href="#">Trousers</a></li>
                                            </ul>
                                        </div>
                                        <div class="col1 me-one">
                                            <h4>Popular Brands</h4>
                                            <ul>
                                                <li><a href="#">499 Store</a></li>
                                                <li><a href="#">Fastrack</a></li>
                                                <li><a href="#">Casio</a></li>
                                                <li><a href="#">Fossil</a></li>
                                                <li><a href="#">Maxima</a></li>
                                                <li><a href="#">Timex</a></li>
                                                <li><a href="#">TomTom</a></li>
                                                <li><a href="#">Titan</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="grid"><a href="#">Blog</a>
                            </li>
                            <li class="grid"><a href="#">Contact</a>
                            </li>
                        </ul>
                    </div>
                    <div class="clearfix"> </div>
                </div>
                <div class="col-md-3 header-right">
                    <div class="search-bar">
                        <input type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}">
                        <input type="submit" value="">
                    </div>
                </div>
                <div class="clearfix"> </div>
            </div>
        </div>
    </div>
    <!--bottom-header-->
    <!--banner-starts-->
    <div class="bnr" id="home">
        <div  id="top" class="callbacks_container">
            <ul class="rslides" id="slider4">
                <li>
                    <img src="http://localhost:8080/rolex/resources/images/abt-1.jpg" alt=""/>
                </li>
                <li>
                    <img src="http://localhost:8080/rolex/resources/images/cart-1.png" alt=""/>
                </li>
                <li>
                    <img src="http://localhost:8080/rolex/resources/images/abt-1.jpg" alt=""/>
                </li>
            </ul>
        </div>
        <div class="clearfix"> </div>
    </div>
    <!--banner-ends-->
    <!--Slider-Starts-Here-->
    <script src="js/responsiveslides.min.js"></script>
    <script>
        // You can also use "$(window).load(function() {"
        $(function () {
            // Slideshow 4
            $("#slider4").responsiveSlides({
                auto: true,
                pager: true,
                nav: true,
                speed: 500,
                namespace: "callbacks",
                before: function () {
                    $('.events').append("<li>before event fired.</li>");
                },
                after: function () {
                    $('.events').append("<li>after event fired.</li>");
                }
            });

        });
    </script>
    <!--End-slider-script-->
    <!--about-starts-->
    <div class="about">
        <div class="container">
            <div class="about-top grid-1">
                <div class="col-md-4 about-left">
                    <figure class="effect-bubba">
                        <img class="img-responsive" src="http://localhost:8080/rolex/resources/images/abt-1.jpg" alt=""/>
                        <figcaption>
                            <h2>Nulla maximus nunc</h2>
                            <p>In sit amet sapien eros Integer dolore magna aliqua</p>
                        </figcaption>
                    </figure>
                </div>
                <div class="col-md-4 about-left">
                    <figure class="effect-bubba">
                        <img class="img-responsive" src="http://localhost:8080/rolex/resources/images/abt-1.jpg" alt=""/>
                        <figcaption>
                            <h4>Mauris erat augue</h4>
                            <p>In sit amet sapien eros Integer dolore magna aliqua</p>
                        </figcaption>
                    </figure>
                </div>
                <div class="col-md-4 about-left">
                    <figure class="effect-bubba">
                        <img class="img-responsive" src="http://localhost:8080/rolex/resources/images/abt-1.jpg" alt=""/>
                        <figcaption>
                            <h4>Cras elit mauris</h4>
                            <p>In sit amet sapien eros Integer dolore magna aliqua</p>
                        </figcaption>
                    </figure>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </div>
    <!--about-end-->
    <!--product-starts-->
    <div class="product">
        <div class="container">
            <div class="product-top">
                <div class="product-one">
                    <div class="col-md-3 product-left">
                        <div class="product-main simpleCart_shelfItem">
                            <a href="#" class="mask"><img class="img-responsive zoom-img" src="http://localhost:8080/rolex/resources/images/abt-1.jpg" alt="" /></a>
                            <div class="product-bottom">
                                <h3>Smart Watches</h3>
                                <p>Explore Now</p>
                                <h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
                            </div>
                            <div class="srch">
                                <span>-50%</span>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 product-left">
                        <div class="product-main simpleCart_shelfItem">
                            <a href="#" class="mask"><img class="img-responsive zoom-img" src="http://localhost:8080/rolex/resources/images/abt-1.jpg" alt="" /></a>
                            <div class="product-bottom">
                                <h3>Smart Watches</h3>
                                <p>Explore Now</p>
                                <h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
                            </div>
                            <div class="srch">
                                <span>-50%</span>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 product-left">
                        <div class="product-main simpleCart_shelfItem">
                            <a href="#" class="mask"><img class="img-responsive zoom-img" src="http://localhost:8080/rolex/resources/images/abt-1.jpg"  alt="" /></a>
                            <div class="product-bottom">
                                <h3>Smart Watches</h3>
                                <p>Explore Now</p>
                                <h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
                            </div>
                            <div class="srch">
                                <span>-50%</span>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 product-left">
                        <div class="product-main simpleCart_shelfItem">
                            <a href="#" class="mask"><img class="img-responsive zoom-img" src="http://localhost:8080/rolex/resources/images/abt-1.jpg" alt="" /></a>
                            <div class="product-bottom">
                                <h3>Smart Watches</h3>
                                <p>Explore Now</p>
                                <h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
                            </div>
                            <div class="srch">
                                <span>-50%</span>
                            </div>
                        </div>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="product-one">
                    <div class="col-md-3 product-left">
                        <div class="product-main simpleCart_shelfItem">
                            <a href="#" class="mask"><img class="img-responsive zoom-img" src="http://localhost:8080/rolex/resources/images/abt-1.jpg" alt="" /></a>
                            <div class="product-bottom">
                                <h3>Smart Watches</h3>
                                <p>Explore Now</p>
                                <h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
                            </div>
                            <div class="srch">
                                <span>-50%</span>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 product-left">
                        <div class="product-main simpleCart_shelfItem">
                            <a href="#" class="mask"><img class="img-responsive zoom-img" src="http://localhost:8080/rolex/resources/images/abt-1.jpg" alt="" /></a>
                            <div class="product-bottom">
                                <h3>Smart Watches</h3>
                                <p>Explore Now</p>
                                <h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
                            </div>
                            <div class="srch">
                                <span>-50%</span>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 product-left">
                        <div class="product-main simpleCart_shelfItem">
                            <a href="#" class="mask"><img class="img-responsive zoom-img" src="http://localhost:8080/rolex/resources/images/abt-1.jpg" alt="" /></a>
                            <div class="product-bottom">
                                <h3>Smart Watches</h3>
                                <p>Explore Now</p>
                                <h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
                            </div>
                            <div class="srch">
                                <span>-50%</span>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 product-left">
                        <div class="product-main simpleCart_shelfItem">
                            <a href="#" class="mask"><img class="img-responsive zoom-img" src="http://localhost:8080/rolex/resources/images/abt-1.jpg" alt="" /></a>
                            <div class="product-bottom">
                                <h3>Smart Watches</h3>
                                <p>Explore Now</p>
                                <h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
                            </div>
                            <div class="srch">
                                <span>-50%</span>
                            </div>
                        </div>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
        </div>
    </div>
    <!--product-end-->
    <!--information-starts-->
    <div class="information">
        <div class="container">
            <div class="infor-top">
                <div class="col-md-3 infor-left">
                    <h3>Follow Us</h3>
                    <ul>
                        <li><a href="#"><span class="fb"></span><h6>Facebook</h6></a></li>
                        <li><a href="#"><span class="twit"></span><h6>Twitter</h6></a></li>
                        <li><a href="#"><span class="google"></span><h6>Google+</h6></a></li>
                    </ul>
                </div>
                <div class="col-md-3 infor-left">
                    <h3>Information</h3>
                    <ul>
                        <li><a href="#"><p>Specials</p></a></li>
                        <li><a href="#"><p>New Products</p></a></li>
                        <li><a href="#"><p>Our Stores</p></a></li>
                        <li><a href="#"><p>Contact Us</p></a></li>
                        <li><a href="#"><p>Top Sellers</p></a></li>
                    </ul>
                </div>
                <div class="col-md-3 infor-left">
                    <h3>My Account</h3>
                    <ul>
                        <li><a href="#"><p>My Account</p></a></li>
                        <li><a href="#"><p>My Credit slips</p></a></li>
                        <li><a href="#"><p>My Merchandise returns</p></a></li>
                        <li><a href="#"><p>My Personal info</p></a></li>
                        <li><a href="#"><p>My Addresses</p></a></li>
                    </ul>
                </div>
                <div class="col-md-3 infor-left">
                    <h3>Store Information</h3>
                    <h4>The company name,
                        <span>Lorem ipsum dolor,</span>
                        Glasglow Dr 40 Fe 72.</h4>
                    <h5>+955 123 4567</h5>
                    <p><a href="mailto:example@email.com">contact@example.com</a></p>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </div>
    <!--information-end-->
    <!--footer-starts-->
    <div class="footer">
        <div class="container">
            <div class="footer-top">
                <div class="col-md-6 footer-left">
                    <form>
                        <input type="text" value="Enter Your Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter Your Email';}">
                        <input type="submit" value="Subscribe">
                    </form>
                </div>
                <div class="col-md-6 footer-right">
                    <p>© 2015 Luxury Watches. All Rights Reserved | Design by  <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </div>
    <!--footer-end-->
    <script src="http://localhost:8080/rolex/resources/js/bootstrap.min.js"></script>
    <script src="http://localhost:8080/rolex/resources/js/jquery.easydropdown.js"></script>
    <script src="http://localhost:8080/rolex/resources/js/jquery.flexslider.js"></script>
    <script src="http://localhost:8080/rolex/resources/js/memenu.js"></script>
    <script src="http://localhost:8080/rolex/resources/js/jquery-1.11.0.min.js"></script>
    </body>
</html>