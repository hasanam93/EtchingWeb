<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<style type="text/css">
.error{
color:red;
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
<title>Home Page</title>
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
     
            </div>
    </div>
<br/><br/><br/><br/><br/><br/><br/>
<div class="container">
        <div class="row centered-form">
        <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
        	<div class="panel panel-default">
        		<div class="panel-heading">
			    		<h3 class="panel-title"><center>Please sign up or Login</center> </h3>
			 			</div>
			 			<div class="panel-body">

<table align="center" class="table">
            <tr>
                <td><a href="/login" class="form-control">Login</a>
                </td>
                <td><a href="/register" class="form-control">Register</a>
                </td>
            </tr>
        </table>
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