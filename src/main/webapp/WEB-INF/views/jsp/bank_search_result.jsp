<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<div id="features-wrapper">
	<div class="container">
		<div class="row">
			<div class="3u">

				<!-- Box -->
				<section class="box feature">
					<div class="inner">
						<header>
							<h2>Ads related to Bank Name</h2>
							<p>Maybe here as well I think</p>
						</header>
						<p>Phasellus quam turpis, feugiat sit amet in, hendrerit in
							lectus. Praesent sed semper amet bibendum tristique fringilla.</p>
					</div>
				</section>

			</div>
			<div class="9u">

				<!-- Box -->
				<section class="box feature">
					<!-- <a href="#" class="image featured"><img src="resources/images/pic01.jpg"
						alt="" /></a> -->
					<div class="inner">
						<header>
							<h2>${bankName}</h2>
							<h4>Total Branchs ${bankBbranchSize}</h4>
						</header>
						<table  border="1" style="width:300px">
							<thead>
								<tr>
									<td><input type="text" id="txtBranch"
										value="Type branch Name to filter" data-constant = "Type branch Name to filter" onclick="clearTextOnClick(this)" onblur="loadTextOnBlurIfEmpty(this)"/>&nbsp</td>
									<td><input id="txtDistrict" data-constant = 'Type district to filter' onclick="clearTextOnClick(this)" onblur="loadTextOnBlurIfEmpty(this)"	value="Type district to filter" /></td>
									<td><input id="txtState" data-constant ='Type state Name to filter' onclick="clearTextOnClick(this)" onblur="loadTextOnBlurIfEmpty(this)" value="Type state Name to filter"  /></td>
									<td><input type="text"  data-constant ='IFSC' value='IFSC' id="txtIFSC" onclick="clearTextOnClick(this)" onblur="loadTextOnBlurIfEmpty(this)" /></td>
									<td><button > Filter </button></td>
								</tr>
								<tr>
									<td>Branch Name</td>
									<td>City</td>
									<td>District</td>
									<td>State</td>
									<td>IFSC</td>
								</tr>
							</thead>
							<c:forEach var="branch" items="${Branches}">
								<tr>
									<td>${branch.BranchName}</td>
									<td>${branch.BranchCity}</td>
									<td>${branch.BranchDistrict}</td>
									<td>${branch.BranchState}</td>
									<td>${branch.BranchIFSC}</td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</section>

			</div>
		</div>
	</div>
</div>