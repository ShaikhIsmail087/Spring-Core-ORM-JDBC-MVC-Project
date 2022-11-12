<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
    
	<div class="container mt-5">
	
	<!-- <h3 class="text-center">Registration form</h3> -->
	 <h3 class="text-center">${Header }</h3> 
	 <p class="text-center">${Desc }<p> 
	
	<form action="processform" method="post">

		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label> 
			<input
				type="email" 
				class="form-control" 
				id="exampleInputEmail1"
				aria-describedby="emailHelp" 
				placeholder="Enter email" 
				name="email">
		</div>
		
		<div class="form-group">
			<label for="userName">User Name</label> 
			<input
				type="text" 
				class="form-control" 
				id="userName"
				aria-describedby="emailHelp" 
				placeholder="Enter here"
				name="userName">
		</div>
		
		<div class="form-group">
			<label for="userPassword">User Password</label> 
			<input
				type="text" 
				class="form-control" 
				id="userPassword"
				aria-describedby="emailHelp" 
				placeholder="Enter here"
				name="password">
		</div>
		
		<div class="container text-center">
			<button type="submit" class="btn btn-success">Sign up</button>
		</div>

	</form>
	
	</div>
	
	

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>