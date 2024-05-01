## Отправляем запросы без UI через Postman в формате JSON

### **Операция добавления (create)**

`POST` http://localhost:8080/rest/user

```java
{
  "lastName": "Иванов",
  "firstName": "Петр",
  "middleName": "Сергеевич",
  "birthDate": "1980-05-15",
  "gender": true,
  "passportSeries": "1234",
  "passportNumberMasked": "12********34",
  "issuedBy": "Отделением УФМС России",
  "issueDate": "2000-10-20",
  "identificationNumberMasked": "12********34",
  "placeOfBirth": "Москва",
  "cityOfResidence": "Москва",
  "addressOfResidence": "ул. Примерная, д. 1, кв. 101",
  "registeredAddress": "ул. Примерная, д. 1, кв. 101",
  "maritalStatus": "Женат/Замужем",
  "citizenship": "Российская Федерация",
  "disability": "Нет",
  "isPensioner": false
}
```

### **Операция чтения (read)**

`GET`

- Получить информацию о клиенте с определенным ID:
    
    ```bash
    GET http://localhost:8080/rest/user/1
    ```
    
    Здесь **`1`** - это ID клиента, информацию о котором вы хотите получить.
    
- Получить список всех клиентов:
    
    ```bash
    GET http://localhost:8080/rest/users
    ```
    

### **Операция обновления (update)**

`PUT` http://localhost:8080/rest/user/1

```bash
{ "firstName": "Новое Имя", 
"lastName": "Новая Фамилия", 
"middleName": "Новое Отчество", 
... // Если не обновить другие поля, они будут нулями
}
```

Здесь **`1`** - это ID клиента, которого вы хотите обновить, а JSON-данные содержат новые значения полей для обновления.

### **Операция удаления (delete)**

`DELETE`-запрос

```bash
http://localhost:8080/rest/user/1
```

Здесь **`1`** - это ID клиента, которого вы хотите удалить.