<script type="text/javascript">
	function loadBankByName(value) {
		
		if (value.value.length > 2) {
			var response = doHttpGetAndAppendToElement("bank/search/name.html?name="+value.value, null, null, '#search_result_name');
		} else {
			 $("#search_result_name").html( "" )
			}
	}
</script>
<!-- Features -->
<div id="features-wrapper">
	<div class="container">
		<div class="row">
			<div class="5u">

				<!-- Box -->
				<section class="box feature">
					<div class="inner">
						<header>
							<div align="center">
								<h4>Search by Name</h4>
								<p>Type bank name slowly...</p>
								<br /> <input type="text" name="txtBankName"
									oninput="loadBankByName(this)">
								<div align="center">
									<br /> 
									<div id="search_result_name">
										
									</div>
								</div>
							</div>
						</header>
					</div>
				</section>

			</div>
			<div class="6u">

				<!-- Box -->
				<section class="box feature">

					<div class="inner">
						<header>
							<h4>Search by Location</h4>
						</header>
						<table>
							<tr>
								<td>
									<p>States</p> <select>
										<option>Choose a State from the list</option>
								</select>
								</td>
								<td>
									<p>District</p> <select>
										<option>Choose a District from the list</option>
								</select>
								</td>
							</tr>
							<tr>
								<td>
									<p>City</p> <select>
										<option>Choose a City from the list</option>
								</select>
								</td>
								<td><br />
								<br />
								<input type="button" value="Search" /></td>
							</tr>
						</table>



					</div>
				</section>

			</div>
		</div>
		<div class="row">
			<div class="11u">

				<!-- Box -->
				<section class="box feature last">

					<div class="inner">
						<header>
							<h4>Filter by Criteria(s)</h4>
							<p>Here you can choose combination of search terms and or
								even a single field</p>
						</header>

						<table>
							<tr>
								<td>
									<p>I know a part of Bank name</p> <input type="text">
								</td>
								<td></td>
								<td>
									<p>States</p> <select>
										<option>Choose a State from the list</option>
								</select>
								</td>

							</tr>
							<tr>
								<td>
									<p>I know a part of address</p> <input type="text">
								</td>
								<td></td>
								<td>
									<p>District</p> <select>
										<option>Choose a District from the list</option>
								</select>
								</td>

							</tr>
							<tr>
								<td>
									<p>I know a part of IFSC</p> <input type="text">
								</td>
								<td></td>
								<td>
									<p>City</p> <select>
										<option>Choose a City from the list</option>
								</select>
								</td>
							</tr>

							<tr>
								<td></td>
								<td><input class="" type="button" value="Search" /></td>
								<td></td>
							</tr>
						</table>
					</div>
				</section>

			</div>

		</div>

	</div>
</div>
