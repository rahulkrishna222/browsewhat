<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!-- Features -->
<div id="features-wrapper">
	<div class="container">
		<div class="row">
			<div class="4u">

				<!-- Box -->
				<section class="box feature">
					<a href="#" class="image featured"><img src="" alt="" /></a>
					<div class="inner">
						<header>
							<h2>Ad Goes here</h2>
							<p>Maybe here as well I think</p>
						</header>
						<p>Small links as well</p>
					</div>
					<br>
					<div class="inner">
						<header>
							<h2>Ad Goes here</h2>
							<p>Maybe here as well I think</p>
						</header>
						<p>Small links as well</p>
					</div>
				</section>

			</div>
			<div class="7u">

				<!-- Box -->
				<section class="box feature">
					<div class="inner">
						<header>
							<h2>How can I help you ? </h2>
							<p>We'll get back to you as soon as possible</p>
						</header>
						<form:form method="POST" commandName="contactUsForm" action="GetAnswer.html">
							<form:label path="email"> Email </form:label>
							<form:errors path="email"></form:errors>
							<form:input path="email" />
							<form:label path="questions">Ask your questions </form:label>
							<form:textarea rows="10" cols="30" path="questions"></form:textarea>
							<input type="button" value="Give me answer" />
						</form:form>
					</div>

				</section>

			</div>

		</div>
	</div>
</div>



