# full-stack
Full-Stack Application.

**Technologies

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

Go to the 'front-end' folder and run the command: 'php artisan serve'


**CLIENTES URLs**

**GET and POST:**

/clientes

json POST example:

{

  nome: "Dalton"
  
}

**SERVIÇOS URLs**

**GET and POST:**

/servicos

json POST example:

{

  nome: "Dalton",
  
  preco: "3000",
  
  preco_prata: "",
  
  preco_ouro: ""
  
}

**Leave the fields 'preco_prata' and 'preco_ouro' blank because the API will fill in these fields automatically based on 'preco'.**

**SERVIÇOS COMPRADOS URLs**

**GET and POST:**

/clientes/{clienteId}/servicos-comprados

json POST example:

{

  nome_servico: "Professional Dashboard",
  
  data_inicio: "20/12/2018",
  
  data_fim: "01/01/2019",
  
  dias_restantes: "",
  
  preco_pago: "30000",
  
  cliente_id: '1'
  
}

**You can make a purchase only if the 'cliente_id' is already inserted in the database.**



