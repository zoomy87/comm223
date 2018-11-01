<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
   <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
<title>post</title>
   <!-- Bootstrap core CSS -->
    <spring:url value="/resources/" var="resource"/>
    <link href="${resource}/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${resource}/css/business-casual.min.css" rel="stylesheet">

  </head>
</head>
<body>
<h1 class="site-heading text-center text-white d-none d-lg-block">
      <span class="site-heading-upper text-primary mb-3">A Free Bootstrap 4 Business Theme</span>
      <span class="site-heading-lower">Business Casual</span>
    </h1>

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark py-lg-4" id="mainNav">
      <div class="container">
        <a class="navbar-brand text-uppercase text-expanded font-weight-bold d-lg-none" href="#">Start Bootstrap</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav mx-auto">
            <li class="nav-item px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="home">Home
                <span class="sr-only">(current)</span>
              </a>
            </li>
            <li class="nav-item px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="about">About</a>
            </li>
            <li class="nav-item px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="products">Products</a>
            </li>
            <li class="nav-item px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="store">Store</a>
                 <li class="nav-item px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="gallery">Gallery</a>
            </li>
           </ul>
        </div>
      </div>
    </nav>
             <section class="page-section clearfix">
	<div class="container">
		<div class="row">
			<div class="col-xs-12">
				<h2>Post</h2>
				<form action="" method="" class="form-horizontal">
					<div class="form-group">
						<label for="inputtext" class="col-sm-2 control-label">Input
							Text</label>
						<div class="col-sm-10">
						 <textarea class="form-control" rows="10" placeholder="Start typing your post" required></textarea>
							
						</div>
					</div>
					<div class="form-group">
						<label for="file-upload" class="col-sm-2 control-label">File
							upload</label>
						<div class="col-sm-10">
							<input type="file" class="form-control" id="file-upload" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-10 col-sm-push-2">
							<input type="submit" id="submit" class="btn btn-default"
								value="submit" />
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>