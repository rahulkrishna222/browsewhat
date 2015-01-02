<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<div id="features-wrapper">
	<div class="container">
		<div class="row">
			<c:forEach var="module" items="${Modules}">
				<div class="3u">
					<section class="box feature">
						<a href="${module.Path}" class="image fit"> <img height="250"
							width="300" alt="" src="${module.Image}">

						</a>
					</section>
				</div>
			</c:forEach>
		</div>
	</div>
</div>