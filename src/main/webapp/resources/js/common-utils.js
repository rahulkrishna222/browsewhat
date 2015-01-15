/**
 * 
 */

function clearTextOnClick(obj) {
	if (obj.value === jQuery(obj).attr('data-constant')) {

		obj.value = '';
	}

}

function loadTextOnBlurIfEmpty(obj) {
	if (obj.value == '') {
		obj.value = jQuery(obj).attr('data-constant');
	}
}

/*******************************************************************************
 * url += createQueryParam("branchName", $(branchName).val()); url +=
 * createQueryParam("state", $(state).val()); url +=
 * createQueryParam("district", $(district).val()); url +=
 * createQueryParam("ifsc", $(ifsc).val());
 * 
 * Banks related functions
 */
function filterBranch(elementId, bankId, branchName, district, state, ifsc) {

	var url = 'bank/search/filter/' + bankId;
	/*
	 * url += createQueryParam("branchName", $(branchName).val()); url +=
	 * createQueryParam("state", $(state).val()); url +=
	 * createQueryParam("district", $(district).val()); url +=
	 * createQueryParam("ifsc", $(ifsc).val());
	 */

	var data = {
		branchName : getValueFromElement($(branchName)),
		district : getValueFromElement($(district)),
		state : getValueFromElement($(state)),
		ifsc : getValueFromElement($(ifsc))
	};
	debugger;
	$.post(url, data, function(result) {
		$(elementId).html(result);
		return result;
	});
}

function getValueFromElement(element) {
	if (element.val() === jQuery(element).attr('data-constant')) {
		return null;
	} else {
		return element.val();
	}
}
function createQueryParam(key, value) {
	return '&' + key + '=' + value
}
function doHttpPostAndAppend(url, data, contentType) {
	$.post(url, function(result) {
		$(elementId).html(result);
		return result;
	});
}

function doHttpGetAndAppendToElement(url, data, contentType, elementId) {
	$.get(url, function(result) {
		$(elementId).html(result);
		return result;
	});
}
