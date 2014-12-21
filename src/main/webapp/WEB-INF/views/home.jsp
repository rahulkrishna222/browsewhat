<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<tiles:insertAttribute name="head" />
</head>
<body class="homepage">

	<!-- Header -->
	<div id="header-wrapper">
		<header id="header" class="container"> </header>
		<tiles:insertAttribute name="logo" />
		<tiles:insertAttribute name="main_menu" />

		<!-- Banner -->
		<div id="ba	nner-wrapper">
			<div id="banner" class="box container">
				<div class="row">
					<div class="7u">
						<h2>Hi. You are now in BrowseWhat ?.</h2>
						<p>It's a free service and you can find what you need</p>
					</div>
					<div class="5u">
						<ul>
							<li><a href="#"
								class="button big icon fa-arrow-circle-right">Ok let's go</a></li>
							<li><a href="#"
								class="button alt big icon fa-question-circle">More info</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!-- Content Section -->
	</div>
	<tiles:insertAttribute name="content" />
	<tiles:insertAttribute name="footer" />
</body>
</html>