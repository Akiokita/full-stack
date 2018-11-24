<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    @yield('title')
    <title>Item Manager</title>
    <link rel="stylesheet" href="https://bootswatch.com/4/simplex/bootstrap.min.css">
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText"
            aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarText">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="/">Adicionar Clientes <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="/servicos">Adicionar Serviços <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="/comprar-servicos">Comprar Serviços <span class="sr-only">(current)</span></a>
                </li>
                
                <li class="nav-item active">
                    <a class="nav-link" href="http://localhost:8080/servicos">Serviços JSON <span class="sr-only">(current)</span></a>
                </li>
                
                <li class="nav-item active">
                    <a class="nav-link" href="/compra-clientes">Consulta de Compras <span class="sr-only">(current)</span></a>
                </li>
            </ul>
            <span class="navbar-text">
                Navbar text with an inline element
            </span>
        </div>
    </nav>    
       
    <div class="container">
        @yield('content')
    </div>
    

    