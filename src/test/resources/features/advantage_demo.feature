@todo
Feature: Advantage Demo

Yo Como Product-Owner quiero realizar las pruebas de regresión de forma automatizada del portal
para poder validar que no se han presentado errores con las nuevas entregas 


  @Registro
   Scenario: registro de usuario
    Given que abro la aplicacion 
    When ingreso a la opcion de crear cuenta y diligencio los datos
    Then el sistema muestra la cuenta como oscaher
     
   @Login
   Scenario: Login
    Given que abro la aplicacion 
    When Ingreso con usuario oscaher y password Oscar123
    Then el sistema muestra la cuenta como oscaher
    
   @ComprarProducto
   Scenario: Comprar producto de la seccion de Speakers
    Given que abro la aplicacion 
    When Ingreso con usuario oscaher y password Oscar123
    Then el sistema muestra la cuenta como oscaher
    And selecciono un producto para comprar
    Then el sistema muestra mensaje Thank you for buying with Advantage
    
   @FormularioContacto
   Scenario: Registro de formulario de contacto
    Given que abro la aplicacion 
    When dliligencio el formulario de contacto
    Then el sistema me muestra el mansaje Thank you for contacting Advantage support.
   
    
    



