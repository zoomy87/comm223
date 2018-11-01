<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Business Casual - Start Bootstrap Theme</title>

<!-- Bootstrap core CSS -->
<spring:url value="/resources/" var="resource" />
<link href="${resource}/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom fonts for this template -->
<link
	href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${resource}/css/business-casual.min.css" rel="stylesheet">

</head>

<body>

	<h1 class="site-heading text-center text-white d-none d-lg-block">
		<span class="site-heading-upper text-primary mb-3">A Free
			Bootstrap 4 Business Theme</span> <span class="site-heading-lower">Business
			Casual</span>
	</h1>

	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark py-lg-4" id="mainNav">
		<div class="container">
			<a
				class="navbar-brand text-uppercase text-expanded font-weight-bold d-lg-none"
				href="#">Start Bootstrap</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav mx-auto">
					<li class="nav-item active px-lg-4"><a
						class="nav-link text-uppercase text-expanded" href="">Home <span
							class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item px-lg-4"><a
						class="nav-link text-uppercase text-expanded" href="about">About</a>
					</li>
					<li class="nav-item px-lg-4"><a
						class="nav-link text-uppercase text-expanded" href="products">Products</a>
					</li>
					<li class="nav-item px-lg-4"><a
						class="nav-link text-uppercase text-expanded" href="store">Store</a>
					<li class="nav-item px-lg-4"><a
						class="nav-link text-uppercase text-expanded" href="gallery">Gallery</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>

	<section class="page-section clearfix">
		<div class="container">
			<div class="intro">
				<img class="intro-img img-fluid mb-3 mb-lg-0 rounded"
					src="${resource}/img/intro.jpg" alt="">
				<div class="intro-text left-0 text-center bg-faded p-5 rounded">
					<h2 class="section-heading mb-4">
						<span class="section-heading-upper">Dank Coffee</span> <span
							class="section-heading-lower">Worth Drinking</span>
					</h2>
					<p class="mb-3">Every cup of our quality artisan coffee starts
						with locally sourced, hand picked ingredients. Once you try it,
						our coffee will be a blissful addition to your everyday morning
						routine - we guarantee it!</p>
					<div class="intro-button mx-auto">
						<a class="btn btn-primary btn-xl" href="#">Visit Us Today!</a> <a
							class="btn btn-info btn-lg" href="post">Post</a>
						<li class="nav-item px-lg-4">
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="page-section cta">
		<div class="container">
			<div class="row">
				<div class="col-xl-9 mx-auto">
					<div class="cta-inner text-center rounded">
						<h2 class="section-heading mb-4">
							<span class="section-heading-upper">Our Promise</span> <span
								class="section-heading-lower">To You</span>
						</h2>
						<p class="mb-0">When you walk into our shop to start your day,
							we are dedicated to providing you with friendly service, a
							welcoming atmosphere, and above all else, excellent products made
							with the highest quality ingredients. If you are not satisfied,
							please let us know and we will do whatever we can to make things
							right!</p>
					</div>
					<div class="container">
						<!-- Trigger the modal with a button -->
						<button type="button" class="btn btn-info btn-lg"
							data-toggle="modal" data-target="#myModal">Admin Login</button>

						<!-- Modal -->
						<div class="modal fade" id="myModal" role="dialog">
							<div class="modal-dialog modal-lg">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal">&times;</button>
										<h4 class="modal-title">Log into the site to post content</h4>
									</div>
									<div class="modal-body">
										<div class="form-group">
											<label for="usr">Name:</label> <input type="text"
												class="form-control" id="usr">
										</div>
										<div class="form-group">
											<label for="pwd">Password:</label> <input type="password"
												class="form-control" id="pwd">
										</div>
										
										 <form id="myForm" >
          <input type="hidden" value="hello" id="myField">
            <button id="myFormSubmit" type="submit">Submit</button>
        </form>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Close</button>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
	</section>

	<footer class="footer text-faded text-center py-5">
		<div class="container">
			<p class="m-0 small">Copyright &copy; Your Website 2018</p>
		</div>
	</footer>

	<!-- Bootstrap core JavaScript -->
	<script src="${resource}/vendor/jquery/jquery.min.js"></script>
	<script src="${resource}/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>