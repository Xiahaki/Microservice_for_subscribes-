Для запуска проекта использовать команды:
mvn install
docker-compose build
docker-compose up

Сервис доступен по порту 8091

Доступное апи

POST /users {"username" : "John"} - создать пользователя
GET /users/{id} - получить информацию о пользователе
PUT /users/{id} {"username" : "John"} - обновить пользователя
DELETE /users/{id} - удалить пользователя

POST /subscription {"subname" : "Amazon"} - добавить сервис/подписку
GET /subscription/{id} - получить информацию о сервисе
DELETE /subscription/{id} - удалить сервис

POST /users/{id}/subscriptions {"subId" : {serviceId}} - пользователь подписывается на сервис
GET /users/{id}/subscriptions - получить подписки пользователя
DELETE /users/{id}/subscriptions/{sub_id} - удалить подписку
GET /subscriptions/top - получить ТОП-3 популярных подписок