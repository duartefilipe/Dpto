<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Departamento de geoci�ncias</title>
</head>
<body>

	<nav class="navbar navbar-default navbar-static-top">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="index.jsp">Projeto final geoci�ncias</a>
		</div>

		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li ><a href="index.jsp">inicio</a></li>
				<li class="active"><a href="#about">Sobre</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Professores<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="MVC?logica=RedirecionaCadastraProfessor">Cadastrar</a></li>
						<li><a href="#produto">professor 2</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Funcionarios<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="MVC?logica=RedirecionaCadastraFuncionario">Cadastrar</a></li>
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
								class="list-group-item"> Localiza��o Salas de Aula </a> <a
								href="#" class="list-group-item"> Certificados Monitoria </a>
								<a
								href="#" class="list-group-item"> relatorios </a>
								<a
								href="MVC?logica=RedirecionaCadastrarNoticia#" class="list-group-item"> relatorios </a>
								
						</div>
					</div>

					<div class="col-md-9">
						<div class="list-group">
							<nav class="navbar navbar-default navbar-static-top">
								<div class="container">
									<h2 align="center">Sobre o Departamento de Geoci�ncias</h2>
									<hr>
								<h4	>
								O Departamento de Geoci�ncias atende a:<br>
									13 cursos de gradua��o<br>
									07 cursos de p�s-gradua��o<br>
									totalizando: cerca de 660 alunos por semestre.<br>
									Sua infra-estrutura est� composta por:<br>
									14 laborat�rios equipados para atender a demanda destes alunos.<br>
									Possui 22 professores qualificados, sendo:<br>
									19 doutores<br>
									02 mestres.<br>
									Al�m disso, possui 05 funcion�rios.<br>
									- Chefe: Prof� Carmen Rejane Flores Wizniewsky<br>
									- Subchefe: Prof.Bernardo Say�o Penna e Souza<br>
									- Secret�ria: Nilza Doicco<br>
									- Telefone: (55) 3220-8143 ou 3220-8207<br>
									- E-mail: nilza.geo@gmail.com<br>
									- Home-page: www.ufsm.br/depgeo<br><br><br>
									
									<b>Cursos Atendidos:</b><br><br>
									
									<b>Cursos de Gradua��o</b><br> 
									� Agronomia <br>
									� Arquitetura e Urbanismo<br> 
									� Ci�ncias Biol�gicas - Licenciatura <br>
									� Ci�ncias Cont�beis<br>
									� Ci�ncias S�cias - Bacharelado <br>
									� Engenharia Civil <br>
									� Engenharia Florestal <br>
									� Geografia - Bacharelado <br>
									� Geografia - Licenciatura <br>
									� Meteorologia <br>
									� Qu�mica Bacharelado <br>
									� Qu�mica Industrial <br>
									� Qu�mica Licenciatura <br>
									� T�cnico em Geom�tica <br><br>
									
									<b>Cursos de P�s-Gradua��o</b><br>
									� Especializa��o em Geoci�ncias <br>
									� Especializa��o em Geom�tica<br>
									� Mestrado em Biologia <br>
									� Mestrado em Ci�ncias Biol�gicas - Biodiversidade Animal <br>
									� Mestrado em Engenharia Civil <br>
									� Mestrado em Geografia<br><br>
								</h4>
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



