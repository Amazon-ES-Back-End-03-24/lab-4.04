# LAB | Java Add and Update (Añadir y Actualizar)

## Introducción

Acabamos de aprender a usar las solicitudes POST y PUT, así que practiquemos un poco más.

<br>

## Requisitos

1. Haz un fork de este repositorio.
2. Clona este repositorio.
3. Añade a tu instructor y a los calificadores de la clase como colaboradores de tu repositorio. Si no estás seguro de quiénes son los calificadores de tu clase, pregunta a tu instructor o consulta la presentación del primer día.
4. En el repositorio, crea un proyecto de Java y añade el código para las siguientes tareas.

## Entrega

Una vez que termines la tarea, envía un enlace URL a tu repositorio o tu solicitud de extracción en el campo de abajo.

<br>

## Configuración

Para este laboratorio, deberá crear dos tablas de base de datos y sembrarlas con algunos datos de muestra. Los datos de la base de datos representan clientes ficticios para un hospital en varias ciudades.

| employee_id | department  | name            | status  |
| ----------- | ----------- | --------------- | ------- |
| 356712      | cardiology  | Alonso Flores   | ON_CALL |
| 564134      | immunology  | Sam Ortega      | ON      |
| 761527      | cardiology  | German Ruiz     | OFF     |
| 166552      | pulmonary   | Maria Lin       | ON      |
| 156545      | orthopaedic | Paolo Rodriguez | ON_CALL |
| 172456      | psychiatric | John Paul Armes | OFF     |

<br>

*Tenga en cuenta que `admitted_by` es una clave externa para la tabla de empleados.*

<br>

| patient_id | name              | date_of_birth | admitted_by |
| ---------- | ----------------- | ------------- | ----------- |
| 1          | Jaime Jordan      | 1984-03-02    | 564134      |
| 2          | Marian Garcia     | 1972-01-12    | 564134      |
| 3          | Julia Dusterdieck | 1954-06-11    | 356712      |
| 4          | Steve McDuck      | 1931-11-10    | 761527      |
| 5          | Marian Garcia     | 1999-02-15    | 172456      |

<br>

## Instrucciones

Cree las rutas a continuación de la manera más eficiente posible usando la validación donde sea apropiado.

1. **Añadir nuevo paciente**: Crea una ruta para agregar un nuevo paciente.
2. **Añadir nuevo doctor**: Crea una ruta para agregar un nuevo doctor.
3. **Cambiar el estado del doctor**: Crea una ruta para cambiar el estado de un doctor.
4. **Actualizar el departamento del doctor**: Crea una ruta para actualizar el departamento de un doctor.
5. **Actualizar la información del paciente**: Crea una ruta para actualizar la información del paciente (el usuario debería poder actualizar cualquier información del paciente a través de esta ruta).
6. **Escribir una respuesta corta en README.md**. En su `README.md` escriba una respuesta corta a las siguientes preguntas:

    - ¿Usó el mismo tipo de ruta para actualizar la información del paciente y para actualizar un departamento de empleados?
       No, `PUT` para el primero y `PATCH` para el segundo.
    - ¿Por qué eligió la estrategia que eligió?
      `PUT` cuando las actualizaciones que realizamos en nuestra aplicación requieren modificar múltiples campos de un registro y `PATCH` es adecuado para actualizaciones parciales donde sólo algunos campos necesitan ser modificados. Esto ahorra ancho de banda y reduce la carga en el servidor al manejar menos datos
    - ¿Cuáles son las ventajas e inconvenientes de las estrategias que eligió para crear estas rutas?
      `PUT` puede ser menos eficiente si solo se necesita actualizar una pequeña parte de la información del paciente.
      `PATCH`, al ser utilizado para pequeñas actualizaciones, requiere que el backend maneje correctamente las actualizaciones parciales, lo que puede aumentar la complejidad del código.
    - ¿Cuáles son los compromisos entre `PUT` y `PATCH`?
      `PUT`: Es idempotente, lo que significa que realizar la misma operación repetidamente produce el mismo estado del recurso. Es ideal cuando se actualiza o reemplaza un recurso completo porque asegura que todos los campos necesarios estén especificados, evitando dejar campos inadvertidamente en un estado no deseado.
      `PATCH`: Es adecuado para actualizaciones parciales donde sólo algunos campos necesitan ser modificados. Esto ahorra ancho de banda y reduce la carga en el servidor al manejar menos datos, pero requiere lógica adicional para asegurar que sólo los campos especificados se actualicen, manteniendo los demás intactos.

<br>
