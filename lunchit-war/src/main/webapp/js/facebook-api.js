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
	console.log('window.location.pathname=' + window.location.pathname);
	if (response.status === 'connected') {
		// Logged into your app and Facebook.
		// Redirect to the menu page
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

