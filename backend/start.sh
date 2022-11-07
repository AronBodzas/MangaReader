mvn clean package

createdb {dbname}

export DB_USERNAME={user}
export DB_NAME={dbname}
export DB_PASSWORD={password}

java -jar target/backend-1.0-SNAPSHOT.jar backend.jar

