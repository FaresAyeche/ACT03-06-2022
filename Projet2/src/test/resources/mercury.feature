
@tag1
Feature: mercury.feature


Background: creation


    Given navigateur Google Chrome ouvert 
    And  Acc�der � la page mercury
    When je clique sur refistre 
    And saisir les informations 
    And je clique sur valider
    Then compte crée
    
@tag2

Scenario: login
    Given platforme mercury ouverte
    When je clique sur sign-on
    And saisir les données
    And je clique submit
    Then redirection ver la page sign-on



