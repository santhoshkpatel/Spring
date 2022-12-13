<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bikeshowroom</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<style type="text/css">
body {
	background-image: url("https://www.seekpng.com/png/detail/899-8992566_akrapovic-exhaust-harley-davidson-dyna-fxd-super-glide.png");
	background-repeat: no-repeat;
	background-size: 100%;
}
form {
	text-align: center;
}
pre {
	color: blue;
	font-weight: bolder;
	font-size: large;
	font-style: italic;
}
</style>
</head>

<body>
<!-- As a link -->
<nav class="navbar navbar-dark bg-dark">
<img alt="" src="https://e1.pxfuel.com/desktop-wallpaper/589/934/desktop-wallpaper-willie-g-skull-black-phone-by-lauraspiteri-harley-davidson-skull-thumbnail.jpg" width="150" height="75">
  <a class="navbar-brand" href="#">BIKE SHOW ROOM</a>
</nav>


<form action="send" method="post"> <br>
<pre>

brand<input type="text" name="brand">
<br>
ownerName<input type="text" name="ownerName">
<br>
location<input type="text" name="location">
<br>
ambossader<input type="text" name="ambossader">
<br>
description<input type="text" name="description">
<input type="submit" value="submit">
<br>
</pre>
</form>
</body>
</html>