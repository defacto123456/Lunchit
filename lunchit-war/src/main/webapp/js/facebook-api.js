window.fbAsyncInit = function() {
	initFB();
};
//Initialize FB
function initFB() {
	console.log('init');
	FB.init({
		appId : '1427352470871240',
		cookie : true, // enable cookies to allow the server to access
		// the session
		xfbml : true, // parse social plugins on this page
		version : 'v2.0' // use version 2.0
	});

	// Redirect after logout
	FB.Event.subscribe("auth.logout", function() {
		checkFBLoginStatus();
	});
	
	// Make sure that the user has logged in
	checkFBLoginStatus();
}
		
// Load the SDK asynchronously
(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id))
				return;
			js = d.createElement(s);
			js.id = id;
			js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&appId=476852845792991&version=v2.0";
			fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));

// This method is called when the user clicks to login to the app using FB login
function processFBLogin() {
	checkFBLoginStatus();
}

// Call this method before loading the rest of the page to check the login status 
function checkFBLoginStatus() {
	console.log('checkFBLoginStatus');
	FB.getLoginStatus(function(response) {
		statusChangeCallback(response);
	});
}

// This is called with the results from from FB.getLoginStatus().
function statusChangeCallback(response) {
	console.log('statusChangeCallback');
	console.log(response);
	// The response object is returned with a status field that lets the
	// app know the current login status of the person.
	// Full docs on the response object can be found in the documentation
	// for FB.getLoginStatus().
	if (response.status === 'connected') {
		// Logged into your app and Facebook.
		// Check to see whether the user is in our database
		console.log('verify user');
		FB.api('/me', function(response) {
			console.log('Successful login for: ' + response.name);
//			window.location = '/rest/json/user/get?email=' + response.email
//					+ '&firstname=' + response.first_name + '&lastname='
//					+ response.last_name;
			verifyUser(response);
		});
		
		// Redirect to the menu page
		console.log('redirect to menu.html');
		if (window.location.pathname != '/menu.html') {

			window.location = '/menu.html';
		}
		
	} else {
		// Please login
		if (window.location.pathname != '/') {

			window.location = '/';
		}
	}
}

// Verify the user. Add the user to the database if it doesn't exist.
function verifyUser(response) {
	var xmlhttp;
	if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
		xmlhttp = new XMLHttpRequest();
	} else {// code for IE6, IE5
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlhttp.onreadystatechange = function() {
		// do nothing
	};
	xmlhttp.open("GET", "/rest/json/user/get?email=" + response.email
			+ '&firstname=' + response.first_name + '&lastname='
			+ response.last_name, true);
	xmlhttp.send();
}