#language: es

Característica: Cambiar a un empleado
  Yo como usuario quiero loguearme en la pagina demo serenity
  para seleccionar a un empleado de cualquier Orden

    Escenario: Escoger a un empleado de una Orden, y visualizar los cambios guardados
    Dado que el usuario se encuentre logueado en la pagina de Demo Serenity
    Cuando el usuario da click en la seccion Open Order y seleccione cualquier orden
      Y el usuario seleccionara un empleado de forma aleatoria y dara click en Aplicar cambios
    Entonces el usuario visualizara el mensaje de alerta Save Succes