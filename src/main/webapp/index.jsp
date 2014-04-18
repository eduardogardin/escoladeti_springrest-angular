<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html ng-app>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hardcore app</title>

		<!-- BOOTSTRAP -->
		<link rel="stylesheet" href="./resources/css/bootstrap.min.css">

		<!-- SCRIPTS -->
		<script type="text/javascript" src="./resources/js/jquery-1.11.0.min.js"></script>
        <script type="text/javascript" src="./resources/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="./resources/js/angular.min.js" ></script>
        <script type="text/javascript" src="./resources/js/corcontroller.js"></script>
    </head>

    <body ng-controller="corController" ng-init="init()">

		<div class="container">
			<h3>
				<i class="glyphicon glyphicon-file"></i>
				Cadastro de cor
			</h3>
			<hr/>

			<form id="formCor" name="formCor">				
				<div class="row">
					<div class="form-group col-sm-2">
						<label>Nome</label>
						<input class="form-control" type="text" placeholder="Nome" ng-model="cor.nome">
					</div><!-- INPUT NOME -->
					
					<div class="form-group col-sm-2">
						<label>RGB</label>
						<input class="form-control" type="text" placeholder="RGB" ng-model="cor.rgb">
					</div><!-- INPUT RGB -->
				</div><!--/row-->

				<div class="row">
					<div class="form-group col-sm-2">
						<label></label>
						<button class="btn btn-success form-control" type="submit" ng-click="salvarOuAtualizarCor(cor)">Salvar</button>
					</div>
					<div class="form-group col-sm-2">
						<label></label>
						<button class="btn btn-danger form-control" type="submit" ng-click="cancelarCadastro()">Cancelar</button>
					</div>
				</div><!--/row-->
			</form>
			
			<!-- LISTAGEM DE CORES -->
			<h3>
				<i class="glyphicon glyphicon-th-list"></i>
				Cores cadastradas
			</h3>
			<hr/>

			<div class="row">
				<div class="table-responsive">
					<table class="table table-hover">
						<thead>
							<tr>
								<th class="col-md-1">#</th>
								<th class="col-md-3">Nome</th>
								<th class="col-md-3">RGB</th>
								<th class="col-md-2 text-center">Ações</th>								
							</tr>
						</thead>

						<tbody ng-repeat="corDaLista in cores">
							<tr>
								<td class="col-md-1">{{corDaLista.id}}</td>
								<td class="col-md-3">{{corDaLista.nome}}</td>
								<td class="col-md-3">{{corDaLista.rgb}}</td>
								<td class="col-md-1"><button class="btn btn-warning btn-sm" ng-click="editarCor(corDaLista)"><i class="glyphicon glyphicon-pencil"></i></button></td>
								<td class="col-md-1"><button class="btn btn-danger btn-sm" ng-click="apagarCor(corDaLista)"><i class="glyphicon glyphicon-remove"></i></button></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<!-- /LISTAGEM DE CORES -->

		</div>
    </body>
</html>
