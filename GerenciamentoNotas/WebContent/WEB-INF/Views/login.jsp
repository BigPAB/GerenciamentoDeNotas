<!DOCTYPE html>
<html lang="pt-br">

<head>
	<title>Login</title>
	<meta charset="utf-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" 
integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="tela.css">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" 
integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" 
integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>

<style type="text/css">

body, html {
    height: 100%;
    margin: 0;
}

.bg {
    /* The image used */
    background-image: url("Ht.jpg");

    /* Full height */
    height: 100%; 

    /* Center and scale the image nicely */
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}
	form{
		background-color: grey;
		background-color: rgba(128, 128, 128, 0.49);
		padding: 40px;
		
		background-position: center;
		margin-top: 200px;
		margin-bottom: 60px;
		margin-right: 150px
		margin-left: 150px;
	}

	h1{
		text-align: center;
	}
	.btn1{
		width: 50%
	}
	.btn2{
		width: 50%

	}
	.btn2{
			

	}
</style>
</head>
<body>
	<div class="bg">
	<div class="container">
		<div class="panel panel-default">
			
				<div class="panel-body">
					<form name="myform" method="get" action="loginlervlet1">
						<div class="panel-heading"><h1>Login</h1></div>
						  <div class="form-group">
						    <label for="matricula">Matrícula</label>
						    <input type="text/number" class="form-control" name="matricula" placeholder="Matrícula">
						    
						  </div>
						  <div class="form-group">
						    <label for="senha">Senha</label>
						    <input type="text/number" class="form-control" name="senha" placeholder="Senha">
						  </div>
						  <div class="row">
							  <button type="submit" class="btn1 btn-primary">Entrar</button>
							  
							  		<a href="cadastro" >Cadastrar-se</a>
							  button class="btn2 btn-primary"
						  </div>
						  
					</form>

			</div>
		</div>

	</div>
</div>
</body>
</html>