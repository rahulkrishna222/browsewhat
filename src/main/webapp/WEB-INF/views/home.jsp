<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<tiles:insertAttribute name="title" />
<tiles:insertAttribute name="head" />
</head>
<body class="homepage">

	<!-- Header -->
	<div id="header-wrapper">
		<header id="header" class="container">
			<tiles:insertAttribute name="logo" />
			<tiles:insertAttribute name="main_menu" />
		</header>
	</div>
	<!-- Banner -->
	<tiles:insertAttribute name = "banner"/>
	
	<tiles:insertAttribute name = "features"/>
	<!-- Content Section -->

	<tiles:insertAttribute name="content" />
	<tiles:insertAttribute name="footer" />
</body>
</html>