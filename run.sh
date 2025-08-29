# Переход в папку скрипта
cd "$(dirname "$0")"

# Сборка проекта
echo "Сборка приложения..."
mvn clean package

# Запуск приложения  
echo "Приложение запущено"
java -jar target/my-spring-app-1.0.0.jar
