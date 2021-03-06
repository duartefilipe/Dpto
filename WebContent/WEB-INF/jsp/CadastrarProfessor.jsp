<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Departamento de geociências</title>
</head>
<body>
	<jsp:useBean id="log" class="modelo.dao.ProfessorDAO" />
	<c:set var="professores" value="${log.getProfessores()}" />
	
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
							<a href="#" class="list-group-item"> Formularios </a>
							<a href="#" class="list-group-item"> Localização Salas de Aula </a>
							<a href="#" class="list-group-item"> Certificados Monitoria </a>
							<a href="#" class="list-group-item"> relatorios </a>
							<a href="MVC?logica=RedirecionaCadastrarNoticia#" class="list-group-item">Cadastrar Noticias </a>
						</div>
					</div>

					<div class="col-md-9">
						<div class="list-group">
							<nav class="navbar navbar-default navbar-static-top">
								<div class="container">
									<form action="/Dpto/MVC?logica=CadastrarProfessor" method="post">
										<div class="form-group">
											<h2 align="center">Cadastrar Professores</h2>
												<label for="nome">Nome:</label>
												<input class="form-control" type="text" id="nome" name="nome"/>
												<br />
												<label for="siape">SIAPE:</label>
												<input class="form-control" type="text" id="siape" name="siape"/>
												<br />
												<label for="ramal">Ramal:</label>
												<input class="form-control" type="text" id="ramal" name="ramal"/>
												<br />
												<label for="celular">Celular:</label>
												<input class="form-control" type="text" id="celular" name="celular"/>
												<br />
												<label for="sala">Sala:</label>
												<input class="form-control" type="text" id="sala" name="sala"/>
												<br />
												<label for="cpf">CPF:</label>
												<input class="form-control" type="text" id="cpf" name="cpf"/>
												<br />
												<label for="identidade">Identidade:</label>
												<input class="form-control" type="text" id="identidade" name="idaentidade"/>
												<br />
												<label for="email">Email:</label>
												<input class="form-control" type="text" id="email" name="email"/>
												<br />
												<button class="btn btn-primary" type="submit">Cadastrar</button>
										</div>
									</form>
								</div>
							</nav>
						</div>
						
						<!-- teste mostra professores -->
						
						<div class="thumbnail" align="center">
						<div class="row">
							<div class="col-md-12">
								<section>
								<table class="text-center table table-bordered table-responsive">
									<thead>
										<tr>
											<h1 align="center">professores cadastrados</h1>
											<th class="text-center">Nome</th>
											<th class="text-center">siape</th>
											<th class="text-center">ramal</th>
											<th class="text-center">celular</th>
											<th classs="text-center">sala</th>
											<th class="text-center">cpf</th>
											<th class="text-center">identidade</th>
											<th class="text-center">email</th>
										</tr>
									</thead>
									<tbody>

										<c:forEach var="professores" items="${professores}">
											<tr>
												<td>${professores.nome}</td>
												<td>${professores.siape}</td>
												<td>${professores.ramal}</td>
												<td>${professores.celular}</td>
												<td>${professores.sala}</td>
												<td>${professores.cpf}</td>
												<td>${professores.email}</td>
												<td>
												<a href="/Dpto/MVC?logica=RedirecionaAlteraProduto&&id=${professores.codigo}">Alterar</a>
												<a href="/Dpto/MVC?logica=RedirecionaDelelarProduto&&id=${professores.codigo}">Deletar</a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>

								</section>
							</div>
						</div>
					</div>
						
						<!-- teste mostra professores -->
						
						
					</div>
				</div>
			</div>
		</div>
	</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>



