//----------------------------------------------------------------
// shopping cart

function shoppingCart(cartName) {
    this.cartName = cartName;
}

shoppingCart.prototype.addItem = function (menuId, quantity) {
	
	alert(menuId + quantity);
	
	
}