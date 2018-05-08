$(function() {
	var decimal = $('.js-currency');
	decimal.maskMoney({decimal: ',', thousands: '.', allowZero: false});
});