<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <div class="container">
    <h1>Lista De Alunos</h1>
    <table class="table">
    <thead>
      <tr>
        <th>Nome </th>
        <th>Sobrenome</th>
        <th>Matricula</th>
        <th>Senha</th>
        <th>Curso</th>
      </tr>
    </thead>
    
    <tbody>
    <c:forEach items="${listaAlunos }" var="usuario">
      <tr>
        <td>${usuario.value.nome}</td>
      
      
        <td>${usuario.value.sobreNome}</td>
      
      
        <td>${usuario.value.matricula}</td>
      
      
        <td>${usuario.value.senha}</td>
      
     
        <td>${usuario.value.curso.nome}</td>
      </tr>
      </c:forEach>
    </tbody>
    
  </table>
  </div>
</body>
</html>