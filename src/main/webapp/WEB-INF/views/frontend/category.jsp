<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>${title }</title>
<!-- Fonts -->
<jsp:include page="/WEB-INF/views/frontend/layout/css.jsp"></jsp:include>

</head>

<body>
	<div class="wrapper">
		<jsp:include page="/WEB-INF/views/frontend/layout/header.jsp"></jsp:include>
		 <main class="main">
            <div class="main__breadcrumb">
                <div class="container">
                    <div class="bread-crumb">
                        <span><a href="${root }/index">Trang chủ</a></span>
                        <span><a href="#">Danh mục sản phẩm</a></span>
                    </div>
                </div>
            </div>
            <div class="main__section">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-3 none block">
                            <div class="section__sidebar-widget">
                                <div class="widget__inner">
                                    <div class="widget__list">
                                        <h3 class="widget__title">Search</h3>
                                        <div class="widget__search-box">
                                            <input type="text" placeholder="Tìm kiếm..." class="widget__input">
                                            <button class="search-icon">
                                                <i class='bx bx-search'></i>
                                            </button>
                                        </div>
                                    </div>
                                    <div class="widget__list">
                                        <h3 class="widget__title">Danh mục</h3>
                                        <div class="widget__list-body">
                                            <ul class="sidebar-list">
                                                <li><a href="#">Tất cả sảm phẩm</a></li>
                                                <li><a href="#">Chó Alaska Malamute (29)</a></li>
                                                <li><a href="#">Chó Corgi (18)</a></li>
                                                <li><a href="#">Chó Poodle (20)</a></li>
                                                <li><a href="#">Mèo Anh (Dài + Ngắn) (3)</a></li>
                                                <li><a href="#">Sản phẩm mới (8)</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="widget__list">
                                        <h3 class="widget__title">Tags</h3>
                                        <div class="widget__list-body">
                                            <ul class="tags">
                                                <li><a href="#">Dogs</a></li>
                                                <li><a href="#">Cats</a></li>
                                                <li><a href="#">Alaska</a></li>
                                                <li><a href="#">Thức ăn</a></li>
                                                <li><a href="#">Hubby</a></li>
                                                <li><a href="#">Animals</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-9 col-12">
                            <div class="toolbar__wrapper">
                                <div class="toolbar__left">
                                    <div class="tool__left-btn">
                                        <i class='bx bxs-grid active-btn'></i>
                                        <i class='bx bx-menu'></i>
                                    </div>
                                </div>
                                <div class="toolbar__right">
                                    <h4 class="tool__right-title">Sắp xếp:</h4>
                                    <div class="toolbar__right-shortby">
                                        <select class="short-by">
                                            <option selected>Theo độ phổ biến</option>
                                            <option>Theo giá: Thấp đến cao</option>
                                            <option>Theo giá: Cao đến thấp</option>
                                            <option>Theo sản phẩm mới</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="row section__shop-wrapper">
                                <div class="col-12 col-lg-4 col-md-6">
                                    <div class="product">
                                        <div class="thumb">
                                            <a href="./sanpham.html" class="image">
                                                <img src="./img/products/1.jpg" class="fit-img zoom-img">
                                            </a>
                                            <span class="badges">
                                                <span class="sale">-20%</span>
                                                <span class="new">new</span>
                                            </span>
                                        </div>
                                        <div class="content">
                                            <a href="./sanpham.html" class="content-link">
                                                <h5 class="title">Chó mèo</h5>
                                            </a>
                                            <span class="price">
                                                <span class="old">20.000.000đ</span>
                                                <span class="new">15.000.000đ</span>
                                            </span>
                                            <span class="symbol">
                                                <a href="#"><i class='bx bx-heart'></i></a>
                                                <a href="#"><i class='bx bx-cart'></i></a>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-12 col-lg-4 col-md-6">
                                    <div class="product">
                                        <div class="thumb">
                                            <a href="./sanpham.html" class="image">
                                                <img src="./img/products/6.jpg" class="fit-img zoom-img">
                                            </a>
                                            <span class="badges">
                                                <span class="sale">-20%</span>
                                            </span>
                                        </div>
                                        <div class="content">
                                            <a href="./sanpham.html" class="content-link">
                                                <h5 class="title">Chó mèo</h5>
                                            </a>
                                            <span class="price">
                                                <span class="old">20.000.000đ</span>
                                                <span class="new">15.000.000đ</span>
                                            </span>
                                            <span class="symbol">
                                                <a href="#"><i class='bx bx-heart'></i></a>
                                                <a href="#"><i class='bx bx-cart'></i></a>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-12 col-lg-4 col-md-6">
                                    <div class="product">
                                        <div class="thumb">
                                            <a href="./sanpham.html" class="image">
                                                <img src="./img/products/4.jpeg" class="fit-img zoom-img">
                                            </a>
                                            <span class="badges">
                                                <!-- <span class="sale">-20%</span> -->
                                            </span>
                                        </div>
                                        <div class="content">
                                            <a href="./sanpham.html" class="content-link">
                                                <h5 class="title">Chó mèo</h5>
                                            </a>
                                            <span class="price">
                                                <!-- <span class="old">20.000.000đ</span> -->
                                                <span class="new">15.000.000đ</span>
                                            </span>
                                            <span class="symbol">
                                                <a href="#"><i class='bx bx-heart'></i></a>
                                                <a href="#"><i class='bx bx-cart'></i></a>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-12 col-lg-4 col-md-6">
                                    <div class="product">
                                        <div class="thumb">
                                            <a href="./sanpham.html" class="image">
                                                <img src="./img/products/8.jpg" class="fit-img zoom-img">
                                            </a>
                                            <span class="badges">
                                                <span class="sale">-10%</span>
                                            </span>
                                        </div>
                                        <div class="content">
                                            <a href="./sanpham.html" class="content-link">
                                                <h5 class="title">Chó mèo</h5>
                                            </a>
                                            <span class="price">
                                                <span class="old">20.000.000đ</span>
                                                <span class="new">15.000.000đ</span>
                                            </span>
                                            <span class="symbol">
                                                <a href="#"><i class='bx bx-heart'></i></a>
                                                <a href="#"><i class='bx bx-cart'></i></a>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-12 col-lg-4 col-md-6">
                                    <div class="product">
                                        <div class="thumb">
                                            <a href="./sanpham.html" class="image">
                                                <img src="./img/products/3.jpeg" class="fit-img zoom-img">
                                            </a>
                                            <span class="badges">
                                                <!-- <span class="sale">-20%</span> -->

                                            </span>
                                        </div>
                                        <div class="content">
                                            <a href="./sanpham.html" class="content-link">
                                                <h5 class="title">Chó mèo</h5>
                                            </a>
                                            <span class="price">
                                                <!-- <span class="old">20.000.000đ</span> -->
                                                <span class="new">15.000.000đ</span>
                                            </span>
                                            <span class="symbol">
                                                <a href="#"><i class='bx bx-heart'></i></a>
                                                <a href="#"><i class='bx bx-cart'></i></a>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-12 col-lg-4 col-md-6">
                                    <div class="product">
                                        <div class="thumb">
                                            <a href="./sanpham.html" class="image">
                                                <img src="./img/products/7.jpeg" class="fit-img zoom-img">
                                            </a>
                                            <span class="badges">
                                                <span class="sale">-20%</span>
                                            </span>
                                        </div>
                                        <div class="content">
                                            <a href="./sanpham.html" class="content-link">
                                                <h5 class="title">Chó mèo</h5>
                                            </a>
                                            <span class="price">
                                                <span class="old">20.000.000đ</span>
                                                <span class="new">15.000.000đ</span>
                                            </span>
                                            <span class="symbol">
                                                <a href="#"><i class='bx bx-heart'></i></a>
                                                <a href="#"><i class='bx bx-cart'></i></a>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-12 col-lg-4 col-md-6">
                                    <div class="product">
                                        <div class="thumb">
                                            <a href="./sanpham.html" class="image">
                                                <img src="./img/products/8.jpg" class="fit-img zoom-img">
                                            </a>
                                            <span class="badges">
                                                <span class="sale">-10%</span>
                                            </span>
                                        </div>
                                        <div class="content">
                                            <a href="./sanpham.html" class="content-link">
                                                <h5 class="title">Chó mèo</h5>
                                            </a>
                                            <span class="price">
                                                <span class="old">20.000.000đ</span>
                                                <span class="new">15.000.000đ</span>
                                            </span>
                                            <span class="symbol">
                                                <a href="#"><i class='bx bx-heart'></i></a>
                                                <a href="#"><i class='bx bx-cart'></i></a>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-12 col-lg-4 col-md-6">
                                    <div class="product">
                                        <div class="thumb">
                                            <a href="./sanpham.html" class="image">
                                                <img src="./img/products/3.jpeg" class="fit-img zoom-img">
                                            </a>
                                            <span class="badges">
                                                <!-- <span class="sale">-20%</span> -->
                                            </span>
                                        </div>
                                        <div class="content">
                                            <a href="./sanpham.html" class="content-link">
                                                <h5 class="title">Chó mèo</h5>
                                            </a>
                                            <span class="price">
                                                <!-- <span class="old">20.000.000đ</span> -->
                                                <span class="new">15.000.000đ</span>
                                            </span>
                                            <span class="symbol">
                                                <a href="#"><i class='bx bx-heart'></i></a>
                                                <a href="#"><i class='bx bx-cart'></i></a>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-12 col-lg-4 col-md-6">
                                    <div class="product">
                                        <div class="thumb">
                                            <a href="./sanpham.html" class="image">
                                                <img src="./img/products/7.jpeg" class="fit-img zoom-img">
                                            </a>
                                            <span class="badges">
                                                <span class="sale">-20%</span>
                                            </span>
                                        </div>
                                        <div class="content">
                                            <a href="./sanpham.html" class="content-link">
                                                <h5 class="title">Chó mèo</h5>
                                            </a>
                                            <span class="price">
                                                <span class="old">20.000.000đ</span>
                                                <span class="new">15.000.000đ</span>
                                            </span>
                                            <span class="symbol">
                                                <a href="#"><i class='bx bx-heart'></i></a>
                                                <a href="#"><i class='bx bx-cart'></i></a>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="section__shop-toolbars">
                                <div class="shop__toolbar">
                                    <ul class="pagination">
                                        <li class="pages-item active"><a href="#" class="pages-link">1</a></li>
                                        <li class="pages-item"><a href="#" class="pages-link">2</a></li>
                                        <li class="pages-item"><a href="#" class="pages-link">3</a></li>
                                        <li class="pages-item"><a href="#" class="pages-link"><i
                                                    class='bx bx-chevrons-right'></i></a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <footer class="footer">
            <div class="footer__top">
                <div class="container">
                    <div class="row">
                        <div class="col-12 col-lg-3 col-md-6">
                            <div class="footer-widget">
                                <div class="widget-header">
                                    <h1 class="title">Về chúng tôi</h1>
                                </div>
                                <div class="widget-content">
                                    <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Magni, dicta libero
                                        debitis delectus eum praesentium esse error eius odio, maxime labore iste earum
                                        ratione natus autem illum porro veniam enim.</p>
                                </div>
                                <div class="widget-social">
                                    <i class='bx bxl-facebook'></i>
                                    <i class='bx bxl-instagram'></i>
                                    <i class='bx bxl-youtube'></i>
                                    <i class='bx bxl-github'></i>

                                </div>
                            </div>
                        </div>
                        <div class="col-12 col-lg-3 col-md-6">
                            <div class="footer-widget">
                                <div class="widget-header">
                                    <h1 class="title">Hỗ trợ khách hàng</h1>
                                </div>
                                <div class="widget-list">
                                    <ul>
                                        <li><a href="#">Hướng dẫn mua hàng</a></li>
                                        <li><a href="#">Điều khoản và điều kiện</a></li>
                                        <li><a href="#">Chính sách bảo mật</a></li>
                                        <li><a href="#">Chính sách thanh toán</a></li>
                                        <li><a href="#">Chất lượng dịch vụ</a></li>
                                        <li><a href="#">Hướng dẫn gửi trả hàng</a></li>
                                    </ul>
                                </div>

                            </div>
                        </div>
                        <div class="col-12 col-lg-3 col-md-6">
                            <div class="footer-widget">
                                <div class="widget-header">
                                    <h1 class="title">Địa chỉ liên hệ</h1>
                                </div>
                                <div class="widget-list">
                                    <ul>
                                        <li>Tầng 1, số 1 Trung Hòa, Cầu Giấy, Hà Nội</li>
                                        <li>Email: <i>mail@gmail.com.vn</i></li>
                                        <li>Hotline: 0123456789</li>
                                        <li>muopham.com</li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="col-12 col-lg-3 col-md-6">
                            <div class="footer-widget">
                                <div class="widget-header">
                                    <h1 class="title">Đăng ký nhận tin:</h1>
                                </div>
                                <div class="widget-content">
                                    <p>Đăng ký nhận tin mới nhất và được giảm giá 10% khi mua hàng đầu tiên của
                                        bạn ..</p>
                                </div>
                                <div class="widget-subscribe">
                                    <form action="">
                                        <input type="email" id="subs-email" placeholder="mail@gmai.com">
                                        <button type="submit" class="widget-btn">Gửi</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <div class="scroll__top">
            <i class='bx bx-up-arrow-alt'></i>
        </div>
        <div class="mobile__menu-wrapper">
            <div class="mobile__menu-body">
                <div class="mobile__btn-close">
                    <i class='bx bx-x'></i>
                </div>
                <div class="mobile__content">
                    <div class="mobile__search-box">
                        <form>
                            <input type="text" placeholder="Tìm kiếm..." class="mobile__search-input">
                            <button class="mobile__search-btn">
                                <i class='bx bx-search'></i>
                            </button>
                        </form>
                    </div>
                    <div class="mobile__navigation">
                        <ul class="mobile__nav">
                            <li class="mobile__children"><a href="./index.html" class="mobile__link">Trang chủ</li>
                            <li class="mobile__children">
                                <a href="#" class="mobile__link">Thú cưng
                                    <i class='bx bx-chevron-down'></i>
                                </a>
                                <ul class="mobile__submenu">
                                    <li class="mobile__submenu-item"><a href="./danhmuc.html"
                                            class="mobile__submenu-link">Chó
                                            Corgi</a></li>
                                    <li class="mobile__submenu-item"><a href="./danhmuc.html"
                                            class="mobile__submenu-link">Chó
                                            Beagle</a></li>
                                    <li class="mobile__submenu-item"><a href="./danhmuc.html"
                                            class="mobile__submenu-link">Chó Alaska
                                            Malamute</a></li>
                                    <li class="mobile__submenu-item"><a href="./danhmuc.html"
                                            class="mobile__submenu-link">Chó Golden
                                            Retriever</a></li>
                                    <li class="mobile__submenu-item"><a href="./danhmuc.html"
                                            class="mobile__submenu-link"> Chó Husky
                                            Siberian</a></li>
                                </ul>
                            </li>
                            <li class="mobile__children"><a href="#" class="mobile__link">Phụ kiện</a></li>
                            <li class="mobile__children">
                                <a href="#" class="mobile__link">Dịch vụ <i class='bx bx-chevron-down'></i></a>
                                <ul class="mobile__submenu">
                                    <li class="mobile__submenu-item"><a href="#" class="mobile__submenu-link">Spa</a>
                                    </li>
                                    <li class="mobile__submenu-item"><a href="#" class="mobile__submenu-link">Chăm sóc
                                            thú cưng</a></li>
                                </ul>
                            </li>
                            <li class="mobile__children"><a href="./lienhe.html" class="mobile__link">Liên hệ </a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
	<jsp:include page="/WEB-INF/views/frontend/layout/js.jsp"></jsp:include>

</body>

</html>