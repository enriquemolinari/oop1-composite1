# Ejercicios Double Dispatch

Esta solución aplica double dispatch y no el patron Visitor clásico con accept/visit.

¿Qué diferencias veo sobre a solucion con Visitor clásica?

- Visitor es un poquito mas genérico ya que pasa a los visitantes las instancias de las jerarquias a visitar para que
  los visitantes puedan acceder a todo lo que se exponga allí.
    - Observen que en esta implementacion los método son especificos y no genericos y recibe lo minimo nesarario por
      parametro.
- Esta solución es mucho mas simple pero no escala tanto.
- La solucion con visitor permitiria agregar nuevos visitantes (categorias de clientes) que realicen otras operaciones
  en las implementacones de los métodos visit, no solo calcular impuestos y costo de envio.
- Pero: "Breaking encapsulation. Visitor's approach assumes that the ConcreteElement (Producto en nuestro caso)
  interface is powerful enough to let visitors do their job. As a result, the pattern often forces you to provide public
  operations that access an element's internal state, which may compromise its encapsulation".