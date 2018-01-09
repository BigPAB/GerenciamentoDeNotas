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



header h1{
	margin-top:20px;
	text-align:center;
}

nav{
	margin-top:60px;
}


</style>
</head>
<body style="background-image:url(Ht.jpg)">
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
            <a class="nav-link" href="home">P�gina inicial <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="perfil">Perfil</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="jornal">Jornal de not�cia</a>
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
					<form:form  action="salvarAluno" method="POST">
						<div class="panel-heading"><h1>Cadastro</h1></div>
						<div class="row padding-top-10">
							<div class="col-md-2 ">
								<form:label path="nomeAluno" for="Nome" class="control-label">Nome:</form:label>
								<form:input path="nomeAluno" type="text" class="control-form" name="nome" id="Nome" placeholder="Nome"/>
							</div>
						</div>
						
						<div class="row padding-top-10">
							<div class="col-md-2 ">
								<form:label path="sobreNome" for="Sobrenome" class="control-label">Sobrenome:</form:label>
								<form:input path="sobreNome" type="text" class="control-form" name="sobrenome" id="Sobrenome" placeholder="Sobrenome"/>
							</div>
						</div>
						
						<div class="row padding-top-10">
							<div class="col-md-2 ">
								<form:label path="matricula" for="Matr�cula" class="control-label">Matricula:</form:label>
								<form:input path="matricula" type="text" class="control-form" name="matricula" id="matricula" placeholder="Matr�cula"/>
							</div>
						</div>	
						
						<div class="row padding-top-10">
							<div class="col-md-2 ">
								<form:label path="senha" for="senha" class="control-label">Senha:</form:label>
								<form:input path="senha" type="password" class="control-form" name="senha" id="senha" placeholder="Senha"/>
							</div>
						</div>
						
						<div class="row padding-top-10">
							<div class="col-md-2 ">
								<form:label path="nomeCurso" for="curso" class="control-label">Curso:</form:label>
								<form:input path="nomeCurso" type="text" class="control-form" name="curso" id="curso" placeholder="Curso"/>
							</div>
						</div>
						
						<div class="row padding-top-10">
							<div class="col-md-2 ">
								<form:label path="idMateria" for="idmateria" class="control-label">Id Mat�ria:</form:label>
								<form:input path="idMateria" type="text" class="control-form" name="idmateria" id="idmateria" placeholder="id mat�ria"/>
							</div>
						</div>
						
						<div class="row padding-top-10">
							<div class="col-md-2 ">
								<form:label path="nomeMateria" for="materia" class="control-label">Materia:</form:label>
								<form:input path="nomeMateria" type="text" class="control-form" name="materia" id="materia" placeholder="Mat�ria"/>
							</div>
						</div>
			
						<div class="row padding-top-10">
							<div class="col-md-2 ">
								<form:label path="endereco" for="endereco" class="control-label">Endereco:<br/>Formato(estado,cidade,bairro,rua,numero,cep)</form:label>
								<form:input path="endereco" type="text" class="control-form" name="endereco" id="endereco" placeholder="estado, cidade, bairro, rua, numero, cep"/>
							</div>
						</div>
			
						<div class="row padding-top-10">
							<div class="col-md-6">
								<button type="submit" class="btn btn-primary" >Cadastrar</button>
							</div>
						</div>
			
				</form:form>
					
				</div>
				
			</div>
		</div>

	</div>
		
</body>
</html>