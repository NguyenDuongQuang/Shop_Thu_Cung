
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>${title}</title>
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
						<span><a href="${root}/index">Trang chủ</a></span> <span><a
							href="#">Liên hệ</a></span>
					</div>
				</div>
			</div>
			<div class="main__contact">
				<div class="container">
					<div class="row">
						<div class="col-12 col-lg-6">
							<div class="contact__title">
								<h2 class="title">Liên lạc</h2>
							</div>
							<div class="contact__form">
								<form class="form" method="POST" action="/contact/save" e>
									<div class="row">
										<div class="col-md-6">
											<div class="contact__form-input">
												<input type="text" class="form-input" name="name"
													placeholder="Your name...">
											</div>
										</div>
										<div class="col-md-6">
											<div class="contact__form-input">
												<input type="email" class="form-input" name="email"
													placeholder="Email...">
											</div>
										</div>
										<div class="col-md-6">
											<div class="contact__form-input">
												<input type="text" class="form-input" name="mobile">
											</div>
										</div>
										<div class="col-md-6">
											<div class="contact__form-input">
												<input type="text" class="form-input" name="address">
											</div>
										</div>
										<div class="col-12">
											<div class="contact__form-input">
												<textarea cols="30" rows="5" class="form__textarea"
													name="message" placeholder="Message"></textarea>
											</div>
										</div>
										<div class="col-12">
											<div class="contact__form-input">
												<label for="uploadFile">Choose file to upload</label> <input
													type="file" id="contactFile" name="contactFile"
													class="form-control-file" multiple="multiple">
											</div>
										</div>
										<div class="col-12">
											<button type="submit" class="btn btn-primary">Send</button>
										</div>
									</div>
								</form>
							</div>
						</div>
						<div class="col-12 col-lg-6">
							<div class="contact__title">
								<h2 class="title">Liên hệ với chúng tôi</h2>
							</div>
							<p class="contact__description">Lorem ipsum dolor sit amet
								consectetur adipisicing elit. Voluptate facere aliquid quibusdam
								provident laudantium veniam iste magni doloribus ipsam porro
								similique, quisquam temporibus, quod ipsa obcaecati tempora.
								Doloribus, corporis impedit! Lorem, ipsum dolor sit amet
								consectetur adipisicing elit. Id ducimus sed voluptates sequi
								adipisci aspernatur, veniam libero dolor harum eaque consectetur
								officia iusto aut officiis quas est animi nam autem.</p>
							<ul class="contact__address">
								<li><i class='bx bx-phone'></i> 012345678</li>
								<li><i class='bx bx-envelope'></i> mail@gmail.com</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<div class="main__map">
				<div class="row">
					<div class="col-12">
						<iframe
							src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1612.1966650274296!2d105.78817454726801!3d20.980166368165296!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3135acce762c2bb9%3A0xbb64e14683ccd786!2zSOG7jWMgVmnhu4duIENOIELGsHUgQ2jDrW5oIFZp4buFbiBUaMO0bmcgLSBIw6AgxJDDtG5n!5e0!3m2!1svi!2s!4v1647935982673!5m2!1svi!2s"
							width="100%" height="450" style="border: 0;" allowfullscreen=""
							loading="lazy"></iframe>
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
									<p>Lorem, ipsum dolor sit amet consectetur adipisicing
										elit. Magni, dicta libero debitis delectus eum praesentium
										esse error eius odio, maxime labore iste earum ratione natus
										autem illum porro veniam enim.</p>
								</div>
								<div class="widget-social">
									<i class='bx bxl-facebook'></i> <i class='bx bxl-instagram'></i>
									<i class='bx bxl-youtube'></i> <i class='bx bxl-github'></i>

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
									<p>Đăng ký nhận tin mới nhất và được giảm giá 10% khi mua
										hàng đầu tiên của bạn ..</p>
								</div>
								<div class="widget-subscribe">
									<form action="">
										<input type="email" id="subs-email"
											placeholder="mail@gmai.com">
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
							<input type="text" placeholder="Tìm kiếm..."
								class="mobile__search-input">
							<button class="mobile__search-btn">
								<i class='bx bx-search'></i>
							</button>
						</form>
					</div>
					<div class="mobile__navigation">
						<ul class="mobile__nav">
							<li class="mobile__children"><a href="${root}/index"
								class="mobile__link">Trang chủ</li>
							<li class="mobile__children"><a href="#"
								class="mobile__link">Thú cưng <i class='bx bx-chevron-down'></i>
							</a>
								<ul class="mobile__submenu">
									<li class="mobile__submenu-item"><a href="./danhmuc.html"
										class="mobile__submenu-link">Chó Corgi</a></li>
									<li class="mobile__submenu-item"><a href="./danhmuc.html"
										class="mobile__submenu-link">Chó Beagle</a></li>
									<li class="mobile__submenu-item"><a href="./danhmuc.html"
										class="mobile__submenu-link">Chó Alaska Malamute</a></li>
									<li class="mobile__submenu-item"><a href="./danhmuc.html"
										class="mobile__submenu-link">Chó Golden Retriever</a></li>
									<li class="mobile__submenu-item"><a href="./danhmuc.html"
										class="mobile__submenu-link"> Chó Husky Siberian</a></li>
								</ul></li>
							<li class="mobile__children"><a href="#"
								class="mobile__link">Phụ kiện</a></li>
							<li class="mobile__children"><a href="#"
								class="mobile__link">Dịch vụ <i class='bx bx-chevron-down'></i></a>
								<ul class="mobile__submenu">
									<li class="mobile__submenu-item"><a href="#"
										class="mobile__submenu-link">Spa</a></li>
									<li class="mobile__submenu-item"><a href="#"
										class="mobile__submenu-link">Chăm sóc thú cưng</a></li>
								</ul></li>
							<li class="mobile__children"><a href="#"
								class="mobile__link">Liên hệ </a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Slider -->
	<jsp:include page="/WEB-INF/views/frontend/layout/js.jsp"></jsp:include>

</body>

</html>