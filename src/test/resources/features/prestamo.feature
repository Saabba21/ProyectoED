
Feature: Préstamo de libros

  Scenario: El bibliotecario presta un libro a un usuario
    Given un bibliotecario
    And un usuario con nombre "Javi"
    And un libro con título "La metamorfósis"
    When el bibliotecario presta el libro al usuario
    Then se debe crear un préstamo con el libro "La metamorfósis"