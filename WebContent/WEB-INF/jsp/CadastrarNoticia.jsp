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
	<jsp:useBean id="log" class="modelo.dao.NoticiaDAO" />
	<c:set var="noticias" value="${log.getNoticias()}" />

	<nav class="navbar navbar-default navbar-static-top">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="index.jsp">Projeto final
				geociências</a>
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
								href="#" class="list-group-item"> relatorios </a> <a
								href="MVC?logica=RedirecionaCadastrarNoticia#"
								class="list-group-item">Cadastrar Noticias </a>
						</div>
					</div>

					<div class="col-md-9">
						<div class="list-group">
							<nav class="navbar navbar-default navbar-static-top">
							<div class="container">
								<form action="/Dpto/MVC?logica=CadastrarNoticia" method="post">
									<div class="form-group">
										<h2 align="center">Cadastrar Noticias</h2>
										<label for="titulo">titulo:</label> <input
											class="form-control" type="text" id="titulo" name="titulo" />
										<br /> <label for="texto">texto:</label> <input
											class="form-control" type="text" id="texto" name="texto" />
										<br />

										<button class="btn btn-primary" type="submit">Cadastrar</button>
									</div>
								</form>
							</div>
							</nav>
						</div>

						<!-- teste mostra noticias -->

						<div class="thumbnail" align="center">
							<div class="row">
								<div class="col-md-12">
									<table class="text-center table table-striped table-responsive">
										<thead>
											<tr>
												<h1 align="center">noticias cadastradas</h1>
												<th class="text-center">titulo</th>
												<th class="text-center">texto</th>
												<th class="text-center">alterar</th>
												<th class="text-center">deletar</th>

											</tr>
										</thead>
										<tbody>

											<c:forEach var="noticias" items="${noticias}">
												<tr>
													<td>${noticias.titulo}</td>
													<td>${noticias.texto}</td>
													<td><a class="btn btn-success btn-sm" data-toggle="modal" data-target="#modal"
														href="/Dpto/MVC?logica=alterarNoticia&&id=${noticias.id}">
															<div class="glyphicon glyphicon-refresh"></div>
													</a></td>
													<td><a a class="btn btn-danger  btn-sm"
														href="/Dpto/MVC?logica=DeletarNoticia&&id=${noticias.id}">
															<div class="glyphicon glyphicon-remove"></div>
													</a></td>
												</tr>
											</c:forEach>

										</tbody>
									</table>
								</div>
							</div>
						</div>

						<!-- teste mostra noticias -->

					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- modal -->

	<div class="modal fade" id="modal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">TÊNIS NIKE LEBRON
						XIII MASCULINO</h4>
					<small>Tênis Masculino Basquete</small><br>
					<div class="pull-right">
						<strong>Por:R$899,90</strong><br> ou <b>10x</b> de <b>R$89,90</b><br>
					</div>
				</div>
				<div class="modal-body">
					<div class="row">
						<div class="col-md-4">
							<div class="thumbnail">
								<img src="http://www.lojadanike.com.br/ArquivoExibir/566744.jpg"
									alt="...">
							</div>
						</div>
						<div class="col-md-4">
							<div class="thumbnail">
								<img src="http://www.lojadanike.com.br/ArquivoExibir/566760.jpg"
									alt="...">
							</div>
						</div>
						<div class="col-md-4">
							<div class="thumbnail">
								<img src="http://www.lojadanike.com.br/ArquivoExibir/566728.jpg"
									alt="...">
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-4">
							<table class="table table-bordered">
								<thead>
									<tr>
										<th>Tamanho</th>
										<th>Esgotado</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>39</td>
										<td>X</td>
									</tr>
									<tr>
										<td>41</td>
										<td>-</td>
									</tr>
									<tr>
										<td>43</td>
										<td>-</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
				</div>

				<!-- modal -->

				<script
					src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
				<script src="js/bootstrap.js"></script>
</body>
</html>



