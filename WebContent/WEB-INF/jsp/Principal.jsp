<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Departamento de geociências</title>
</head>
<body>

	<nav class="navbar navbar-default navbar-static-top">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="index.jsp">Projeto final geociências</a>
		</div>

		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="index.jsp">inicio</a></li>
				<li><a href="MVC?logica=RedirecionaSobre">Sobre</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Professores<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="MVC?logica=RedirecionaCadastraProfessor">Cadastrar</a></li>
						<li><a href="#produto">professor 2</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Funcionarios<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#destaques">funcionario 1</a></li>
						<li><a href="#produto">funcionario 2</a></li>
					</ul>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">bolsistas<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#destaques">bolsista 1</a></li>
						<li><a href="#produto">bolsista 2</a></li>
					</ul></li>
				</li>
			</ul>
		</div>
	</div>
	</nav>


	<div class="container">
		<div class="row">
			<div class="jumbotron">
				<div class="container">
					<div class="container">
						<div class="row">
							<div align="center">
								<img class="img-responsive"
									src="http://w3.ufsm.br/ccne/images/ccne_logo.png">
							</div>
						</div>
					</div>
					<div class="col-md-3">
						<div class="list-group">
							<a href="#" class="list-group-item"> Formularios </a> <a href="#"
								class="list-group-item"> Localização Salas de Aula </a> <a
								href="#" class="list-group-item"> Certificados Monitoria </a> <a
								href="#" class="list-group-item"> relatorios </a>
						</div>
					</div>

					<div class="col-md-9">
						<div class="list-group">
							<nav class="navbar navbar-default navbar-static-top">
								<div class="container">
									<h1>Principal</h1>
								</div>
							</nav>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>



