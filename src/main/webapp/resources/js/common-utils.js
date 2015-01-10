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

