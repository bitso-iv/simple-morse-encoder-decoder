# Morse Code Converter

A simple Java Spring Boot project that allows you to **convert text to Morse code and vice versa**.  
All letters are automatically converted to uppercase, and the conversion is done using a predefined mapping.

---

## Features

- Convert English text to Morse code.
- Convert Morse code to English text.
- Supports all English alphabet letters (A-Z) and space.
- Spaces in text are converted to `/` in Morse code.
- Characters not in the English alphabet (including Russian letters or symbols) will return `null`.

---

## Technologies

- **Java 17+**
- **Spring Boot**
- **Maven**
- Dependencies:
  ```xml
  <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-webmvc</artifactId>
  </dependency>

  <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-thymeleaf</artifactId>
  </dependency>

![exp](materials/Снимок%20экрана%202026-01-29%20в%2008.52.17.png)

G O O D L U C K : 
--. --- --- -.. / .-.. ..- -.-. -.-
