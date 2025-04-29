# multi-module-demo


Многоуровневый Java-проект с использованием Spring Boot, демонстрирующий принципы объектно-ориентированного программирования (ООП) и модульной архитектуры.​

## Структура проекта
Проект состоит из следующих модулей:​
- **`oop-demo-shapes`**  
  Содержит геометрические фигуры (`Circle`, `Square`, `Shape`) и демонстрационные классы.  
- **`aggregator`**  
  Spring Boot-приложение с REST-API для взаимодействия с фигурами.  
- **`simple-order-processor`**  
  Модуль для обработки заказов (в разработке).  
- **`java-array-utils`**  
  Утилиты для работы с массивами (в разработке). 
 
## Запуск проекта
Клонируй репозиторий:​

```bash
git clone https://github.com/LiviuPascan/multi-module-demo.git
cd multi-module-demo
```
Собери проект с помощью Maven:​

```bash
mvn clean install
```
Перейди в модуль aggregator и запусти приложение:​
```bash
cd aggregator
mvn spring-boot:run
```

Открой в браузере:​

http://localhost:8080/circle

Для вычисления площади круга с определённым радиусом:

http://localhost:8080/circle/area?radius=5 (5 может быть изменено на любое другое число)


Пример использования API
GET /circle — возвращает информацию о круге с радиусом 3.

GET /circle/area?radius=5 — возвращает площадь круга с радиусом 5.


Технологии:
Java 17+
Spring Boot 3.4.5
Maven
JUnit (для тестирования)
