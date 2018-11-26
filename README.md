# full-stack
Full-Stack Application.

**Technologies**

Back-end: Java, Hibernate, Spring Boot and Mysql

Front-end: Laravel, Jquery, javascript, bootstrap, HTML, CSS.

**IDE** 

Netbeans 8.2

**Text Editor**

Visual Studio Code.


# Laravel Quick Start

Install Composer:
https://getcomposer.org/

Go to the 'front-end' folder and run the command: 'composer install'


# Back-end Quick Start

The 'back-end' is a maven project. 

Create a new Schema on Mysql named: 'challenge'.

Go to 'application.properties' inside the folder 'src\main\resources\application.properties'and set 'spring.datasource.username' and 'spring.datasource.password' with your database specifications.

All the front-end pages are in the 'front-end/resources/views' folder.


# Start

Run the 'back-end' with your IDE of preference.

Go to the 'front-end' folder and run the command: 'php artisan serve'.

Copy the number initiated by the command and paste in your browser.


**CLIENTES URLs**

**GET and POST:**

/clientes

json POST example:

{
  "nome": "Dalton"
  }

**SERVIÇOS URLs**

**GET and POST:**

/servicos

json POST example:

{
  "nome": "Dalton",
  "preco": "3000",
  "preco_prata": "",
  "preco_ouro": ""
  }

**Leave the fields 'preco_prata' and 'preco_ouro' blank because the API will fill in these fields automatically based on 'preco'.**

**SERVIÇOS COMPRADOS URLs**

**GET and POST:**

/clientes/{clienteId}/servicos-comprados

json POST example:

{
	"nome_servico": "Bruno",
	"preco_pago": "2000",
	"data_inicio": "20/10/2018",
	"data_fim": "20/11/2018",
	"tipo": "normal",
	"preco_prata": "",
  	"preco_ouro": "",
  	"pagamento_normal_adiantado":"",
	"pagamento_prata_adiantado":"",
	"pagamento_ouro_adiantado":""
}

**You can make this post only if the 'cliente_id' is already inserted in the database.**

# Issues

If you want to use 'postman' to make requests to the API, you need to put @RequestBody in the call of all methods of the classes inside the package com.example.lecomchallenge.controller.

if you want the front end to consume the api, you need to take out the @RequestBody in the call of all methods of the classes inside the package com.example.lecomchallenge.controller.
