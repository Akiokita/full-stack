@extends ('layout.app')
    @section('title')
        <title>Serviços</title>
    @endsection

    @section('content')
        <h1>Adicionar Serviços</h1>
            <form id="servicosForm">
            <br>
                <div class="form-group">
                    <label><h5>Nome</h5></label>
                    <input type="text" id="nome"  placeholder ="Serviço" class="form-control">
                </div>
                <div class="form-group">
                    <label><h5>Preço</h5></label>
                    <input type="text" id="preco" placeholder = "Escreva o preço sem cifrão. Ex: 2000" class="form-control">
                </div>
                <input type="submit" value="Enviar" class="btn btn-primary">
            </form>
            <hr>
        <ul id="servicos" class="list-group"></ul>
    @endsection


    <script src="https://code.jquery.com/jquery-1.12.4.js" integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
        crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-1.12.4.js" integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
        crossorigin="anonymous"></script>

    <script type="text/javascript">
        $(document).ready(function () {
            
            // Submit event
            $('#servicosForm').on('submit', function (e) {
                e.preventDefault();

                let nome = $('#nome').val();
                let preco = $('#preco').val();

                addServiço(nome, preco);
            });

            
            // Inserir Serviços
            function addServiço(nome, preco) {
                $.ajax({
                    method: 'POST',
                    url: 'http://localhost:8080/servicos',
                    data: {
                        nome: nome,
                        preco: preco,
                        preco_prata: "",
                        preco_ouro: "",
                    }
                }).done(alert('Serviço Adicionado!'));
                    location.reload();
            }

            function jsonServicos(){
                $.ajax({
                    url: 'http://127.0.0.1:8080/servicos',
                }).done(function (items) {
                    console.log(servicos);
            });
            }

            // Get items from API
            function getServicos() {
                $.ajax({
                    url: 'http://127.0.0.1:8080/servicos',
                }).done(function (servicos) {
                    console.log(servicos);
                    let output = '';
                    $.each(servicos.content, function (key, servico) {
                        output +=
                            `
              <li class="list-group-item">
                <strong>${servico.nome} </strong>
              </li>
            `;
                    });
                    $('#servicos').append(output);
                });
            }
        });
    </script>
</body>

</html>