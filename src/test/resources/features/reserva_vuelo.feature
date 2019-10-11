# language:es

Característica: Reserva de vuelo
  Yo como usuario de viva colombia
  quiero realizar una reserva de vuelo
  para poder llegar a mi destino en una fecha indicada


  Esquema del escenario: : Reserva de vuelo exitosa
    Dado que el usuario se encuentra dentro de la pagina de viva colombia
    Cuando se ingresan los datos de reserva
      | ciudadOrigen   | cidudadDestino  | fechaVuelo   |
      | <ciudadOrigen> | <ciudadDestino> | <fechaVuelo> |
    Entonces la reserva se realiza de forma exitosa

    Ejemplos:
      | ciudadOrigen | ciudadDestino | fechaVuelo      |
      | MEDELLIN     | MIAMI         | Lun 23 Sep 2019 |