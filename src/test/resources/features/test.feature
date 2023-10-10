#Autor: Kevin Giron
# Fecha: 10/10/2023
# Lenguaje: Español

@stories
Feature:  Verificar la funcionalidad agregar y eliminar
  Como usuario requiero , agregar y/o  eliminar un producto del carrito de compras
  @scenario1
  Scenario: Seleccionar dos productos de la categoria amor para agregarlos al carro de compras
    Given Kevin quiere seleccionar un producto
    When de clic en uno de los productos
    Then se deberan agregar al carrito de compras
  @scenario2
  Scenario: Seleccionar un producto de la categoria cumpleaños, agregarlo y eliminarlo del carro de compras
    Given Kevin quiere seleccionar un producto de la categoria cumpleaños
    When de clic en uno de los productos y lo agregue
    Then podrá eliminarlos