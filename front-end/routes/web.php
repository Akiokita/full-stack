<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('clientes');
});

Route::get('/servicos', function () {
    return view('servicos');
});

Route::get('/comprar-servicos', function () {
    return view('comprar-servicos');
});

Route::get('/compra-clientes', function () {
    return view('compra-clientes');
});




Route::resource('api/items', 'ItemsController');