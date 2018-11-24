@extends ('layout.app')
    @section('title')
        <title>Comprar Serviços</title>
    @endsection

    @section('content')
        <h1>Comprar Serviços</h1>
        <br>
        <h5>Escolha seu tipo de cliente</h5>
        <form id="comprarServicosForm">
            <br>
            <div class="form-group">
                <label><h5>Tipo do cliente</h5></label>
                <input type="text" id="tipo" placeholder = "Normal, Prata ou Ouro" class="form-control">
            </div>
            <div class="form-group">
                <label><h5>Id do cliente</h5></label>
                <input type="text" id="id-cliente" placeholder = "Id" class="form-control">
            </div>
            <div class="form-group">
               <label><h5>Data de inicio</h5></label>
                <input type="text" id="inicio" placeholder = "Escreva a data no formato dd/mm/aaaa" class="form-control">
            </div>
            <div class="form-group">
                <label><h5>Data de fim</h5></label>
                <input type="text" id="fim" placeholder = "Escreva a data no formato dd/mm/aaaa" class="form-control">
            </div>
            <h5>Serviços oferecidos</h5>
            <br>
            <div id="servicos" class="list-group"></div>
            <br>
            <br>
            <input type="submit" value="Comprar" class="btn btn-primary">
        </form>
        <hr>
        
    @endsection

    <script src="https://code.jquery.com/jquery-1.12.4.js" integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
        crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-1.12.4.js" integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
        crossorigin="anonymous"></script>

    <script type="text/javascript">
        $(document).ready(function () {
            
            
            getServicos();

            // Submit event
            $('#comprarServicosForm').on('submit', function (e) {
                e.preventDefault();
                
                //array[0] nome do servico, array[1] preco do servico.
                let servico = $('#nome_preco').val();
                array = servico.split(":");

                let tipo = $('#tipo').val();
                let inicio = $('#inicio').val();
                let fim = $('#fim').val();
                let id_cliente = $('#id-cliente').val();
                console.log(tipo, inicio, fim, id_cliente, array[0], array[1]);
                addCompra(array, tipo, inicio, fim, id_cliente);
            });

            // Inserir compra do Serviço
            function addCompra(array, tipo, inicio, fim, id_cliente) {
                $.ajax({
                    method: 'POST',
                    url: 'http://localhost:8080/clientes/'+ id_cliente +'/servicos-comprados',
                    data: {
                        nome_servico: array[0],
                        preco: array[1],
                        data_inicio: inicio,
                        data_fim: fim,
                        tipo: tipo,
                        preco_prata: "",
                        preco_ouro: "",
                        pagamento_normal_adiantado: "",
                        pagamento_prata_adiantado: "",
                        pagamento_ouro_adiantado: ""
                    }
                }).done(alert('Compra Realizada com Sucesso'))
                location.reload();
                }
                
             // Get servicos da API
             function getServicos() {
                $.ajax({
                    url: 'http://127.0.0.1:8080/servicos',
                }).done(function (servicos) {
                    console.log(servicos);
                    let output = '';
                    $.each(servicos.content, function (key, servico) {
                        output +=
                            `
                                <div class="radio">
                                    <label><input type="radio" id="nome_preco" name="tipo" 
                                    value= "${servico.nome}:${servico.preco}"</label>${servico.nome}: R$${servico.preco}
                                </div>
                             `;
                    });
                    $('#servicos').append(output);
                });
            }
        });
    </script>
</body>

</html>