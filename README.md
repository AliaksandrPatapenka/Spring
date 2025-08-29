# Spring Boot REST API

## Описание

Этот проект представляет собой RESTful веб-сервис с двумя основными endpoint'ами:
- **GET** `/user/{id}` - Получение id пользователя
- **POST** `/api` - Обработка POST запроса с данными пользователя (name(String), email(String), id(Long). Валидация отсутствует.

### Установка и запуск

1. **Клонирование репозитория**
```bash
git clone https://github.com/AliaksandrPatapenka/spring-app.git
cd spring-app
```

2. **Сборка приложения**
```bash
mvn clean package
```

3. **Запуск приложения**
```bash
java -jar target/my-spring-app-1.0.0.jar
```

Или используйте скрипт:
```bash
chmod +x run.sh
./run.sh
```

4. **Приложение запустится на**
```
http://localhost:8080
```

## Endpoints

### GET /user/{id}

**Запрос:**
```bash
curl http://localhost:8080/user/123
```

**Ответ:**
```
"userId: 123"
```

### POST /api

**Запрос:**
```bash
curl -X POST http://localhost:8080/api \
  -H "Content-Type: application/json" \
  -d '{"id": 123, "name": "myName", "email": "test@test.ru"}'
```

**Ответ:**
```
"userId: 123, userName: myName, userEmail: test@test.ru"
```

## Структура проекта

```
Spring/
├── src/                       
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   ├── MyApplication.java
│                   ├── Controllers.java
│                   └── PostRequestDTO.java
├── target/                       
├── README.md                     
├── run.sh                       
└── pom.xml                       
```

## Основные классы

### Controllers.java
Основной контроллер с REST endpoint'ами

### PostRequestDTO.java
Data Transfer Object для получения данных

## Настройки

Приложение использует стандартные настройки Spring Boot:
- Порт: 8080
- Контекстный путь: /
