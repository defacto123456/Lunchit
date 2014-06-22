var date = new Date();
var hours = date.getHours();
var minutes = date.getMinutes();
var ampm = hours >= 12 ? 'pm' : 'am';

var month = date.getMonth();
var day = date.getDate();
var year = date.getFullYear();
var dayname = date.getDay();

var monthNames = [ "January", "February", "March", "April", "May", "June",
    "July", "August", "September", "October", "November", "December" ];
var week=["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]; 

document.getElementById("para1").innerHTML = hours+"."+minutes+ampm;
document.getElementById("para2").innerHTML = week[dayname];
document.getElementById("para3").innerHTML = day+" "+monthNames[month]+" "+year;