<h1 align="center"> <strong>Challenge ForoHub</strong></h1>
<p align="center">
  <img src="src/main/resources/Badge-Spring.png" alt="Insignia">
</p>
  <p align="center">
  <img src="https://img.shields.io/badge/STATUS-EN%20DESARROLLO-green" alt="Estado del proyecto">
  <img src="https://img.shields.io/badge/Versión-1.0.0-orange" alt="Versión">
</p>
<br>

## 📌 Introducción
> El Challenge "ForoHub" es parte de la formación de Java y Spring Boot del programa ONE de Alura y Oracle.  
> Esta aplicación permite a los usuarios registrar tópicos, consultar todos los tópicos, ver detalles de un tópico específico, actualizarlo y eliminarlo mediante una **API REST**.  
> La aplicación implementa autenticación con **JWT** y utiliza **MySQL** para la persistencia de datos.

<br>

## 🔧 Funcionalidades
- <strong> Crear tópico: </strong> Permite registrar un nuevo tópico con título, mensaje, autor y curso.  
- <strong> Listar todos los tópicos: </strong> Devuelve todos los tópicos registrados en la base de datos.  
- <strong> Consultar detalle de un tópico: </strong> Permite obtener la información de un tópico específico por su ID.  
- <strong> Actualizar tópico: </strong> Modifica la información de un tópico existente (requiere autenticación).  
- <strong> Eliminar tópico: </strong> Elimina un tópico específico de la base de datos (requiere autenticación).  
- <strong> Seguridad con JWT: </strong> Solo usuarios autenticados pueden crear, actualizar o eliminar tópicos.  

<br>

## ⚙️ Ejecución
1. Configura tu base de datos MySQL con una base llamada `forohub`.  
2. Abre el proyecto en tu IDE preferido y verifica `application.properties` con tus credenciales de MySQL y parámetros JWT.  
3. Ejecuta la clase principal.  
4. Prueba los endpoints de la API usando **Insomnia** o **Postman**, incluyendo autenticación y gestión de tópicos.

<br>

## 💻 Tecnologías utilizadas
- Java 17  
- Spring Boot 3.2.x  
- MySQL 8+  
- Spring Data JPA  
- Spring Security con JWT 
- IDE recomendado: IntelliJ IDEA  

<br>

## ⭐️ Agradecimientos
A mis instructores del programa Oracle Next Education (ONE) por la formación para este desafío:  
- Génesys Rondón
- Eric Monné Fraga de Oliveira
- Bruno Darío Fernández Ellerbach
