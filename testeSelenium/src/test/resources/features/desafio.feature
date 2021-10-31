

Feature: Cadastro de usuario 
  Eu como usuario quero realiza meu cadastro no site Tricentis


  Scenario: Como usuario quero realizar meu casdatro
    Given dado que esteja no "http://sampleapp.tricentis.com/101/app.php"
    And  cadastro formulario vehicle
    When realizo o cadastro insuant
    And realizo cadastro product
    And cadastro select price option
    Then envio o formulario send 
    And valido texto

 