(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id))
				return;
			js = d.createElement(s);
			js.id = id;
			js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&appId=476852845792991&version=v2.0";
			fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));


function processFBLogin() {
	FB.api('/me', function(response) {
		alert(JSON.stringify(response));
	});
	
	
	FB.getLoginStatus(function(response) {
		alert(JSON.stringify(response));	
	});
}