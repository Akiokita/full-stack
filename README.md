# full-stack
Full-Stack Application.

Technologies

Back-end: Java, Hibernate, Spring Boot and Mysql

Front-end: Laravel, Jquery, javascript, bootstrap, HTML, CSS.

IDE 
Netbeans 8.2

Text Editor
Visual Studio Code.

# Laravel Quick Start

Install Composer on
https://getcomposer.org/

Go to the 'front-end' folder and run the command: 'composer install'

# Back-end Quick Start

The 'back-end' is maven project. 

Create a new Schema on Mysql named: 'challenge'.

Go to 'application.properties' inside the folder 'src\main\resources\application.properties'and set 'spring.datasource.username' and 'spring.datasource.password' with your database specifications.

# Start

Run the 'back-end' with your IDE of preference.

Go to the 'front-end' folder and run the command: 'php artisan serve'

URLs

CLIENTES URLs

GET and POST
/clientes

SERVIÇOS URLs

GET and POST 
/servicos

SERVIÇOS COMPRADOS URLs
GET and POST
/clientes/{clienteId}/servicos-comprados

# Issues
The Front-end page '/comprar-servicos' might not work in some enviroments, but this funcionality available by the URL /clientes/{clienteId}/servicos-comprados.


