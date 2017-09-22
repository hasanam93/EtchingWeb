<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Registration Page</title>
<style type="text/css">
.error {
	color: red;
}

body{
    background-color: #525252;
}
.centered-form{
	margin-top: 60px;
}

.centered-form .panel{
	background: rgba(255, 255, 255, 0.8);
	box-shadow: rgba(0, 0, 0, 0.3) 20px 20px 20px;
}


.footer{
    position: fixed;
    left: 0px;
    bottom: 0px;
    height: 35px;
    width: 100%;
    background: #1abc9c;
}

.footer {
   position:fixed;
   left:0px;
   bottom:0px;
   height:30px;
   width:100%;
   background:#999;
}

</style>
</head>
<body style="background-color: #0084bf">
<div class="navbar navbar-default navbar-fixed-top" >
    <div class="container">
        <div class="navbar-header">
            <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/Etchingweb/">EtchingIT</a>
        </div>
     <a href="/login" class="navbar-form navbar-right">Login</a>   
            </div>
    </div>
<br/><br/><br/><br/><br/><br/><br/>
<div class="container">
        <div class="row centered-form">
        <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
        	<div class="panel panel-default">
        		<div class="panel-heading">
			    		<h3 class="panel-title"><center>Please sign up</center> </h3>
			 			</div>
			 			<div class="panel-body">
	
	<form:form action="/registerSuccess"
		method="post" modelAttribute="etchingit">
		<table align="center" class="table">
		
			
<tbody>
			<tr>
				<td>Enter your First Name:</td>
				<td><form:input path="firstname" class="form-control"/></td>
				<td><form:errors path="firstname" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Enter your Last Name:</td>
				<td><form:input path="lastname" class="form-control"/></td>
				<td><form:errors path="lastname" cssClass="error"/></td>
			</tr>
<tr>
				<td>Enter your Address:</td>
				<td><form:input path="address" class="form-control"/></td>
				<td><form:errors path="address" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Select state:</td>
				<td><form:select path="state" class="form-control">
						<form:options items="${stateList}" />
					</form:select></td>
				<td><form:errors path="state" cssClass="error" /></td>
			</tr>

			<tr>
				<td>Enter City:</td>
				<td><form:input path="city" class="form-control"/></td>
				<td><form:errors path="city" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Enter zip:</td>
				<td><form:input path="zip" class="form-control"/></td>
				<td><form:errors path="zip" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Enter Phone No:</td>
				<td><form:input path="phone" class="form-control"/></td>
				<td><form:errors path="phone" cssClass="error"/></td>

			</tr>

			
			<tr>
				<td>Enter Email:</td>
				<td><form:input path="email" class="form-control"/></td>
				<td><form:errors path="email" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Enter Password:</td>
				<td><form:password path="password" class="form-control"/></td>
				<td><form:errors path="password" cssClass="error"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"  class="form-control"></td>
			</tr>
			</tbody>
		</table>

	</form:form>
</div>
	    		</div>
    		</div>
    	</div>
    </div>
   
    <div class="footer">
<div class="panel">
      <div class="panel-heading">Copyrights@Etching-IT</div>
      
    </div>
    </div>

</body>
</html>