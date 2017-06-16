$(function() {
	highLightLeftMenu('lm_phr');
	initForm();
});

function initForm(){
	
	//所有input为readonly
	$("select, input[type=checkbox], input[type=radio]").attr('disabled', true);
	$("input[type=text]").attr('readonly', true);
	
}