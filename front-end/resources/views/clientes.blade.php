@extends ('layout.app')

    @section('content')
    <h1>Adicionar Clientes</h1>
        <form id="clienteForm">
            <br>
            <div class="form-group">
                <label><h5>Nome</h5></label>
                <input type="text" id="nome" placeholder ="Cliente" class="form-control">
            </div>
            
            <br>
                <input id='submit' type="submit" value="Enviar" class="btn btn-primary">
        </form>
        <hr>
        <ul id="clientes" class="list-group"></ul>
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

                let nome = $('#nome').val();

                addCliente(nome);
            });

            
           // Inserir Clientes
            function addCliente(nome) {
                $.ajax({
                    method: 'POST',
                    url: 'http://localhost:8080/clientes',
                    data: {
                        nome: nome
                    }
                }).done(alert('Cliente Adicionado!'))
                location.reload();
            }
        });
    </script>
</body>

</html>