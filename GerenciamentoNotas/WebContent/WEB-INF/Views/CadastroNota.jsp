<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="utf-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" 
integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="tela.css">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" 
integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" 
integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>

<link rel="stylesheet" type="text/css" href="cc/Style.css">

<style type="text/css">

body {
    background-color: black;
    background: url(Views/Ht.jpg) no-repeat center center fixed; 
    -webkit-background-size: cover;
    -moz-background-size: cover;
    -o-background-size: cover;
    background-size: cover;
}

header h1{
	margin-top:20px;
	text-align:center;
}

nav{
	margin-top:60px;
}

form:form{
text-align: center;
}

</style>
</head>
<body>
	<header id="header">
		<div class="innertube">
			<h1>Sistema de Notas</h1>
		</div>
	</header>
	
	<nav class="navbar navbar-expand navbar-dark bg-dark">
      <a class="navbar-brand" href="">Bem-Vindo</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample02" aria-controls="navbarsExample02" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExample02">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="home">Página inicial <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="perfil">Perfil</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="jornal">Jornal de notícia</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="notasAlunos">Boletim Virtual</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Contato</a>
          </li>
        </ul>
        <form class="form-inline my-2 my-md-0">
          <input class="form-control" type="text" placeholder="Search">
          <button type="submit" class="btn btn-primary">buscar</button>
        </form>
      </div>
    </nav>
	
		<div id="wrapper">
		
		<div class="container">
		<div class="panel panel-default">
			
				<div class="panel-body">
					<form:form action="/GerenciamentoNotas/salvarNota" method="POST">
						<div class="panel-heading"><h1>Cadastro Nota</h1></div>
						
						
						
						
						<div class="row padding-top-10">
							<div class="col-md-2 ">
								<form:label path="matriculaAluno" for="Matrícula" class="control-label">Matricula do Aluno :</form:label>
								<form:input path="matriculaAluno" type="text" class="control-form" name="matricula" id="matricula" placeholder="Matrícula"/>
							</div>
						</div>	
						
			
						<div class="row padding-top-10">
							<div class="col-md-2 ">
								<form:label path="idMateria" for="idmateria" class="control-label">Id Matéria:</form:label>
								<form:input path="idMateria" type="text" class="control-form" name="idmateria" id="idmateria" placeholder="id matéria"/>
							</div>
						</div>
						
						<div class="row padding-top-10">
							<div class="col-md-2 ">
								<form:label path="notaAv1" for="av1" class="control-label">Av1 :</form:label>
								<form:input path="notaAv1" type="text" class="control-form" name="av1" id="av1" placeholder="Nota Av1"/>
							</div>
						</div>
						
						<div class="row padding-top-10">
							<div class="col-md-2 ">
								<form:label path="notaAv2" for="av2" class="control-label">Av2:</form:label>
								<form:input path="notaAv2" type="text" class="control-form" name="av2" id="av2" placeholder="Av2"/>
							</div>
						</div>
						
						<div class="row padding-top-10">
							<div class="col-md-2 ">
								<form:label path="notaAv3" for="av3" class="control-label">Av3 :</form:label>
								<form:input path="notaAv3" type="text" class="control-form" name="av3" id="av3" placeholder="Av3"/>
							</div>
						</div>
			
			
			
						<div class="row padding-top-10">
							<div class="col-md-6">
								<button type="submit" class="btn btn-primary" >Resgistrar</button>
							</div>
						</div>
			
				</form:form>
					
				</div>
				
			</div>
		</div>

	</div>
</body>
</html>