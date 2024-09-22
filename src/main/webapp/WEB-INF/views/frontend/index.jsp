<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PetShop</title>
    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;700&display=swap" rel="stylesheet">
    <!-- Jquery -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <!-- ScrollReveal -->
    <script src="${pageContext.servletContext.contextPath}/frontend/js/scrollreveal.min.js"></script>
    <!-- BoxIcon -->
    <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>
    <!-- Swiper -->
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />
    <!-- Bootstrap -->
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/frontend/bootstrap/css/bootstrap.min.css">
    <!-- Reset CSS -->
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/frontend/css/reset.css">
    <!-- Style CSS -->
    <link rel="stylesheet" href="${root }/frontend/css/style.css">
    <!-- Reponsive -->
    <link rel="stylesheet" href="${root }/frontend/css/reponsive.css">

</head>

<body>
    <div class="wrapper">
        <header class="header">
            <div class="header__top">
                <div class="container">
                    <p class="header__top-title">
                        Welcome To our shop !
                    </p>
                </div>
            </div>
            <div class="header__bottom">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-3 col-md-4 col-6">
                            <div class="header__bottom-logo">
                                <a href="#"><img src="${root }/frontend/img/logo.jpg" alt="Ảnh logo" class="logo"></a>
                            </div>
                        </div>
                        <div class="col-lg-6 block none">
                            <div class="header__bottom-menu">
                                <ul>
                                    <li class="header__bottom-menu-children"><a href="${root }/frontend/index.html">Trang chủ</a></li>
                                    <li class="header__bottom-menu-children">
                                        <a href="${root }/frontend/danhmuc.html">Thú cưng</a>
                                        <ul class="mega__subnav">
                                            <li class="mega__subnav-menu">
                                                <h4 class="mega__menu-title">Chó</h4>
                                                <ul class="mega__subnav-menu-2">
                                                    <li><a href="${root }/frontend/danhmuc.html">Chó Corgi</a></li>
                                                    <li><a href="${root }/frontend/danhmuc.html">Chó Beagle</a></li>
                                                    <li><a href="${root }/frontend/danhmuc.html">Chó Alaska Malamute</a></li>
                                                    <li><a href="${root }/frontend/danhmuc.html">Chó Golden Retriever</a></li>
                                                    <li><a href="${root }/frontend/danhmuc.html">Chó Husky Siberian</a></li>
                                                    <li><a href="${root }/frontend/danhmuc.html">Chó Phốc Sóc – Pomeranian</a></li>
                                                </ul>
                                            </li>
                                            <li class="mega__subnav-menu">
                                                <h4 class="mega__menu-title">Mèo</h4>
                                                <ul class="mega__subnav-menu-2">
                                                    <li><a href="${root }/frontend/danhmuc.html">Mèo Anh (Dài + Ngắn)</a></li>
                                                    <li><a href="${root }/frontend/danhmuc.html">Mèo Chân Ngắn</a></li>
                                                    <li><a href="${root }/frontend/danhmuc.html">Mèo Tai Cụp</a></li>
                                                    <li><a href="${root }/frontend/danhmuc.html">Mèo Xiêm</a></li>
                                                    <li><a href="${root }/frontend/danhmuc.html">Mèo Ba Tư</a></li>
                                                    <li><a href="${root }/frontend/danhmuc.html">Mèo Chinchilla</a></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="header__bottom-menu-children"><a href="#">Phụ kiện</a></li>
                                    <li class="header__bottom-menu-children">
                                        <a href="#">Dịch vụ</a>
                                        <ul class="subnav">
                                            <li><a href="#">Spa</a></li>
                                            <li><a href="#">Chăm sóc thú cưng</a></li>
                                        </ul>
                                    </li>
                                    <li class="header__bottom-menu-children"><a href="${root }/frontend/lienhe.html">Liên hệ</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-8 col-6">
                            <div class="header__bottom-actions">
                                <div class=" header__bottom-btn header__bottom-search">
                                    <a href="#"><i class='bx bx-search'></i></a>
                                    <div class="header__box">
                                        <div class="header__bottom-box-search">
                                            <input type="text" placeholder="Tìm kiếm..." class="header__search-input">
                                            <div class="header__search-btn">
                                                <i class='bx bx-search'></i>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class=" header__bottom-btn header__bottom-user">
                                    <a href="${root }/frontend/pages/login/login.html"><i class='bx bx-user'></i></a>
                                </div>
                                <div class=" header__bottom-btn header__bottom-cart">
                                    <a href="#"><i class='bx bx-cart'></i></a>
                                    <span class="header__bottom-num">3</span>
                                    <div class="header__box-cart">
                                        <div class="header__bottom-box-cart">
                                            <div class="header__cart-products">
                                                <div class="cart-product-inner">
                                                    <div class="cart-product__main">
                                                        <div class="cart-product__thumb">
                                                            <img src="${root }/frontend/img/products/3.jpg" class="cart-product-img">
                                                        </div>
                                                        <div class="cart-product__content">
                                                            <a href="${root }/frontend/sanpham.html">
                                                                <p class="cart-product__content-title">POODLE NÂU ĐỎ
                                                                    ĐÁNG YÊU
                                                                </p>
                                                            </a>
                                                            <p class="cart-product__content-quantity">Số lượng: 1</p>
                                                        </div>
                                                    </div>
                                                    <div class="cart-product__close">
                                                        <i class='bx bx-x'></i>
                                                    </div>
                                                </div>
                                                <div class="cart-product-inner">
                                                    <div class="cart-product__main">
                                                        <div class="cart-product__thumb">
                                                            <img src="${root }/frontend/img/products/1.jpg" class="cart-product-img">
                                                        </div>
                                                        <div class="cart-product__content">
                                                            <a href="${root }/frontend/sanpham.html">
                                                                <p class="cart-product__content-title">MÈO TAI CỤP CƯNG
                                                                    CƯNG
                                                                </p>
                                                            </a>
                                                            <p class="cart-product__content-quantity">Số lượng: 1</p>
                                                        </div>
                                                    </div>
                                                    <div class="cart-product__close">
                                                        <i class='bx bx-x'></i>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="header__cart-product-buy">
                                                <a href="#" class="buy-product">Mua hàng</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="header__bottom-btn header__bottom-mobilemenu">
                                    <i class='bx bx-menu'></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="header__slider">
                <div class="swiper mySwiper ">
                    <div class="swiper-wrapper">
                        <div class="swiper-slide .header__slider-imgs">
                            <img src="${root }/frontend/img/slider-1.jpg" alt="" class="header__slider-img">
                        </div>
                        <div class="swiper-slide .header__slider-imgs">
                            <img src="${root }/frontend/img/slider-2.jpg" alt="" class="header__slider-img">
                        </div>
                        <div class="swiper-slide .header__slider-imgs">
                            <img src="${root }/frontend/img/slider-3.jpg" alt="" class="header__slider-img">
                        </div>
                        <div class="swiper-slide .header__slider-imgs">
                            <img src="${root }/frontend/img/slider-4.jpg" alt="" class="header__slider-img">
                        </div>
                    </div>
                    <div class="swiper-button-next next"></div>
                    <div class="swiper-button-prev prev"></div>
                </div>
            </div>
        </header>
        <main class="main">
            <div class="main__products-hot">
                <div class="container">
                    <div class="main__products-title">
                        <p>Sản phẩm nổi bật</p>
                    </div>
                    <div class="main__products-content">
                        <div class="row">
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/1.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
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
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/4.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="new">new</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
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
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/2.jpeg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <!-- <span class="sale">-20%</span> -->
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
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
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/7.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
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
                    </div>
                    <!-- <div class="main__products-more">
                        <a href="#">Xem thêm</a>
                    </div> -->
                </div>
            </div>
            <!-- Sale -->
            <div class="main__products-sale">
                <div class="container">
                    <div class="row">
                        <div class="col-12 col-lg-6">
                            <a href="${root }/frontend/danhmuc.html" class="banner-sale">
                                <img src="${root }/frontend/img/oder-1.jpg" alt="">
                            </a>
                        </div>
                        <div class="col-12 col-lg-6 block none">
                            <a href="${root }/frontend/danhmuc.html" class="banner-sale">
                                <img src="${root }/frontend/img/oder-2.jpg" alt="">
                            </a>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Danh mục sản phẩm -->
            <div class="main__products">
                <div class="container">
                    <div class="main__products-title">
                        <p>Danh sách sản phẩm</p>
                    </div>
                    <div class="main__products-content">
                        <div class="row">
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/1.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <!-- <span class="sale">-20%</span> -->
                                            <span class="new">new</span>

                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
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
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/1.jpeg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-15%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
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
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/8.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
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
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/7.jpeg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
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
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/5.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
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
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/6.jpeg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
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
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/4.jpeg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <!-- <span class="sale">-20%</span> -->
                                            <span class="new">new</span>

                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
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
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/1.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
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
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/1.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
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
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/4.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="new">new</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
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
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/2.jpeg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <!-- <span class="sale">-20%</span> -->
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
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
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/7.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
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
                    </div>
                    <div class="main__products-more">
                        <a href="${root }/frontend/danhmuc.html">Xem thêm</a>
                    </div>
                </div>
            </div>
            <!-- Danh sách phụ kiện -->
            <div class="main__accessory">
                <div class="container">
                    <div class="main__products-title">
                        <p>Danh sách phụ kiện</p>
                    </div>
                    <div class="main__products-content">
                        <div class="row">
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/phukien/1.jpg" class="fit-img zoom-img">
                                        </a>
                                        <!-- <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span> -->
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">Bát sứ hình trái cây</h5>
                                        </a>
                                        <span class="price">
                                            <!-- <span class="old">20.000.000đ</span> -->
                                            <span class="new">15.000đ</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/phukien/4.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="new">new</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">Ly gấu dễ thương</h5>
                                        </a>
                                        <span class="price">
                                            <!-- <span class="old">20.000.000đ</span> -->
                                            <span class="new">100.000đ</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/phukien/1.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <!-- <span class="sale">-20%</span> -->
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">Bát sứ hình trái cây</h5>
                                        </a>
                                        <span class="price">
                                            <!-- <span class="old">20.000.000đ</span> -->
                                            <span class="new">15.000đ</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${root }/frontend/sanpham.html" class="image">
                                            <img src="${root }/frontend/img/products/phukien/1.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${root }/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">Bát sứ hình trái cây</h5>
                                        </a>
                                        <span class="price">
                                            <!-- <span class="old">20.000.000đ</span> -->
                                            <span class="new">15.000đ</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="main__products-more">
                        <a href="#">Xem thêm</a>
                    </div>
                </div>
            </div>
            <!-- Tin tức -->
            <div class="main__news">
                <div class="container">
                    <div class="row">
                        <div class="main__products-title">
                            <p>Blog</p>
                        </div>
                        <div class="col-12 col-lg-4 col-md-6">
                            <div class="product">
                                <div class="thumb">
                                    <a href="${root }/frontend/sanpham.html" class="image">
                                        <img src="${root }/frontend/img/products/1.jpeg" class="fit-img opacity-img">
                                    </a>
                                </div>
                                <div class="content">
                                    <div class="new__author">
                                        <p class="author">By <strong>Admin</strong> -
                                            18, Mar, 2023</p>
                                    </div>
                                    <a href="${root }/frontend/sanpham.html" class="content-link">
                                        <h5 class="title">Tips for taking care of dogs</h5>
                                    </a>
                                    <div class="new__desc">
                                        <p class="desc">Lorem ipsum dolor sit, amet consectetur adipisicing elit.
                                            Deserunt, distinctio! Obcaecati quis praesentium fugiat corrupti at quidem
                                            cum doloribus eos. Sunt amet velit ducimus odit atque saepe harum vitae
                                            soluta.</p>
                                    </div>
                                    <div class="new__more">
                                        <a href="#"><span>More</span></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-12 col-lg-4 col-md-6">
                            <div class="product">
                                <div class="thumb">
                                    <a href="${root }/frontend/sanpham.html" class="image">
                                        <img src="${root }/frontend/img/products/2.jpg" class="fit-img opacity-img">
                                    </a>
                                </div>
                                <div class="content">
                                    <div class="new__author">
                                        <p class="author">By <strong>Admin</strong> -
                                            18, Mar, 2023</p>
                                    </div>
                                    <a href="${root }/frontend/sanpham.html" class="content-link">
                                        <h5 class="title">Tips for taking care of dogs</h5>
                                    </a>
                                    <div class="new__desc">
                                        <p class="desc">Lorem ipsum dolor sit, amet consectetur adipisicing elit.
                                            Deserunt, distinctio! Obcaecati quis praesentium fugiat corrupti at quidem
                                            cum doloribus eos. Sunt amet velit ducimus odit atque saepe harum vitae
                                            soluta.</p>
                                    </div>
                                    <div class="new__more">
                                        <a href="#"><span>More</span></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-12 col-lg-4 col-md-6">
                            <div class="product">
                                <div class="thumb">
                                    <a href="${root }/frontend/sanpham.html" class="image">
                                        <img src="${root }/frontend/img/products/6.jpeg" class="fit-img opacity-img">
                                    </a>
                                </div>
                                <div class="content">
                                    <div class="new__author">
                                        <p class="author">By <strong>Admin</strong> -
                                            18, Mar, 2023</p>
                                    </div>
                                    <a href="${root }/frontend/sanpham.html" class="content-link">
                                        <h5 class="title">Tips for taking care of dogs</h5>
                                    </a>
                                    <div class="new__desc">
                                        <p class="desc">Lorem ipsum dolor sit, amet consectetur adipisicing elit.
                                            Deserunt, distinctio! Obcaecati quis praesentium fugiat corrupti at quidem
                                            cum doloribus eos. Sunt amet velit ducimus odit atque saepe harum vitae
                                            soluta.</p>
                                    </div>
                                    <div class="new__more">
                                        <a href="#"><span>More</span></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- main bottom -->
            <div class="main__bottom">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-4 none block">
                            <div class="main__bottom-wrap">
                                <div class="wrap__icon"><i class='bx bxs-truck'></i></div>
                                <div class="wrap__content">
                                    <h4 class="title">FREE SHIPPING</h4>
                                    <p>Free shipping on all order</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 none block">
                            <div class="main__bottom-wrap">
                                <div class="wrap__icon"><i class='bx bx-headphone'></i></div>
                                <div class="wrap__content">
                                    <h4 class="title">ONLINE SUPPORT</h4>
                                    <p>Online live support 24/7</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 none block">
                            <div class="main__bottom-wrap">
                                <div class="wrap__icon"><i class='bx bx-bar-chart-alt'></i></div>
                                <div class="wrap__content">
                                    <h4 class="title">MONEY RETURN</h4>
                                    <p>Back guarantee under 5 days</p>
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

        <!-- mobile menu -->
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
                            <li class="mobile__children"><a href="${root }/frontend/index.html" class="mobile__link">Trang chủ</li>
                            <li class="mobile__children">
                                <a href="#" class="mobile__link">Thú cưng
                                    <i class='bx bx-chevron-down'></i>
                                </a>
                                <ul class="mobile__submenu">
                                    <li class="mobile__submenu-item"><a href="${root }/frontend/danhmuc.html"
                                            class="mobile__submenu-link">Chó
                                            Corgi</a></li>
                                    <li class="mobile__submenu-item"><a href="${root }/frontend/danhmuc.html"
                                            class="mobile__submenu-link">Chó
                                            Beagle</a></li>
                                    <li class="mobile__submenu-item"><a href="${root }/frontend/danhmuc.html"
                                            class="mobile__submenu-link">Chó Alaska
                                            Malamute</a></li>
                                    <li class="mobile__submenu-item"><a href="${root }/frontend/danhmuc.html"
                                            class="mobile__submenu-link">Chó Golden
                                            Retriever</a></li>
                                    <li class="mobile__submenu-item"><a href="${root }/frontend/danhmuc.html"
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
                            <li class="mobile__children"><a href="${root }/frontend/lienhe.html" class="mobile__link">Liên hệ </a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Slider -->
    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>

    <script src="${root }/frontend/js/app.js"></script>
    <script src="${root }/frontend/js/mobileMenu.js"></script>
</body>

</html>