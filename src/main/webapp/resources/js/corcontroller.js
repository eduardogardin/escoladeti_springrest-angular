function corController($scope, $http, $templateCache) {

	$scope.cor = {};
	$scope.cores = [];	

	$scope.init = function() {
		$scope.requestListaCores();
	};

	/* Funções da View */
	$scope.salvarOuAtualizarCor = function(cor) {
		if(cor.hasOwnProperty('id')) {
			$scope.requestAtualizarCor(cor);
		} else {
			$scope.requestSalvarCor(cor);
		}						
	};

	$scope.apagarCor = function(cor) {
		if(confirm('Deseja excluir a cor' + cor.nome + ' ?')) {
			$scope.requestApagarCor(cor);
		}		
	};

	$scope.editarCor = function(cor) {
		$scope.cor = cor;
	};

	$scope.cancelarCadastro = function() {
		$scope.cor = {};
	};

	/* Acesso ao Back-end */
	$scope.requestListaCores = function () {
		$http({
			method : "GET",
			url : "/springrest/rest/cor/listar",
			cache : $templateCache,
			headers : {'Content-Type': 'application/json; charset=UTF-8'},			
		}).success(function(data, status) {			
			$scope.cores = data;			
		}).error(function(data, status) {
			alert('Erro ao listar dados');
		});
	};

	$scope.requestSalvarCor = function(cor) {
		$http({
			method : "POST",
			url : "/springrest/rest/cor/inserir",
			cache : $templateCache,
			headers : {'Content-Type': 'application/json; charset=UTF-8'},
			data : cor
		}).success(function(data, status) {
			alert('Cor inserida com sucesso! (' + data.nome + ')');
			$scope.cor = {};
		}).error(function(data, status) {
			alert('Problemas ao inserir cor (' + data + ')');
		});
	};

	$scope.requestAtualizarCor = function(cor) {
		$http({
			method : "PUT",
			url : "/springrest/rest/cor/atualizar",
			cache : $templateCache,
			headers : {'Content-Type': 'application/json; charset=UTF-8'},
			data : cor
		}).success(function(data, status) {
			alert('Cor atualizada com sucesso!' + data);
		}).error(function(data, status) {
			alert('Problemas ao inserir cor' + data);
		});	
	};

	$scope.requestApagarCor = function(cor) {
		$http({
			method : "DELETE",
			url : "/springrest/rest/cor/apagar",
			cache : $templateCache,
			headers : {'Content-Type': 'application/json; charset=UTF-8'},
			data : cor
		}).success(function(data, status) {
			alert('Cor apagada com sucesso! (' + data.nome + ')');
			$scope.cores.splice($scope.cores.indexOf(cor), 1);
		}).error(function(data, status) {
			alert('Problemas ao inserir cor' + data);
		});
	};
};