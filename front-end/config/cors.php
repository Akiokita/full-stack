<?php

return [

    /*
    |--------------------------------------------------------------------------
    | Laravel CORS
    |--------------------------------------------------------------------------
    |
    | allowedOrigins, allowedHeaders and allowedMethods can be set to array('*')
    | to accept any value.
    |
    */
   
    'supportsCredentials' => true,
    'allowedOrigins' => ['http://127.0.0.1:8000'],
    'allowedOriginsPatterns' => ['http://127.0.0.1:8000'],
    'allowedHeaders' => ['Access-Control-Allow-Origin','Content-Type', 'X-Requested-With'],
    'allowedMethods' => ['GET', 'POST', 'PUT',  'DELETE'],
    'exposedHeaders' => [],
    'maxAge' => 5,
];
