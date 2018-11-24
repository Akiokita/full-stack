@extends ('layout.app')

    @section('content')
    <h1>Consultar Compras</h1>
        <form id="clienteForm">
            <br>
            <div class="form-group">
                <label><h5>Id do Cliente</h5></label>
                <input type="text" id="id-cliente" placeholder ="Id" class="form-control">
            </div>
            
            <br>
                <input id='submit' type="submit" value="Enviar" class="btn btn-primary">
        </form>
        <hr>
        <ul id="compras" class="list-group"></ul>
    @endsection
    <script src="https://code.jquery.com/jquery-1.12.4.js" integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
        crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-1.12.4.js" integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
        crossorigin="anonymous"></script>

    <script type="text/javascript">
        $(document).ready(function () {

            // Submit event
            $('#clienteForm').on('submit', function (e) {
                e.preventDefault();
                
                let clienteId = $('#id-cliente').val();
                getClienteCompra(clienteId);
            });
            
           // Get compras dos Clientes
           function getClienteCompra(clienteId) {
                $.ajax({
                    url: 'http://localhost:8080/clientes/'+clienteId+'/servicos-comprados',
                }).done(function (compras) {
                    console.log(compras);
                    //let pagamentoAdiantado = verficaCliente(compras);
                    let output = '';
                    $.each(compras.content, function (key, compra) {
                        
                        output +=
                            `
                            <div class="card border-success mb-3">
                                <li class="list-group-item">
                                    <h4>Nome do Serviço:</h4><br>
                                    <h5>${compra.nome_servico}</h5><br>
                                    <h4>Tipo do Cliente:</h4><br>
                                    <h5>${compra.tipo}</h5><br>
                                    <h4>Preço para Cliente Normal:</h4><br>
                                    <h5>R$: ${compra.preco}</h5><br>
                                    <h4>Preço para Cliente Prata:</h4><br>
                                    <h5>R$: ${compra.preco_prata}</h5><br>
                                    <h4>Preço para Cliente Ouro:</h4><br>
                                    <h5>R$: ${compra.preco_ouro}</h5><br>
                                    <h4>Preço para Cliente Normal Adiantado:</h4><br>
                                    <h5>R$: ${compra.pagamento_normal_adiantado}</h5><br>
                                    <h4>Preço para Cliente Prata Adiantado:</h4><br>
                                    <h5>R$: ${compra.pagamento_prata_adiantado}</h5><br>
                                    <h4>Preço para Cliente Ouro Adiantado:</h4><br>
                                    <h5>R$: ${compra.pagamento_ouro_adiantado}</h5><br>
                                </li>
                            </div>
                             `;
                    });
                    $('#compras').append(output);
                })  
            }
        });
    </script>
</body>

</html>