This project is the sample MongoDB Spring app from https://www.mongodb.com/compatibility/spring-boot converted to use columns in Yugabyte YSQL.  Feel free to compare to the MongoDB version.

# Build and run

Build the somple app (written using Spring code) as follows:

```
$ mvn -DskipTests package
```

Run the application:

```
$ java -jar yugabyte-spring-0.0.1-SNAPSHOT.jar (in ./target folder of project)
```

**NOTE:** If you need to clean and rebuild the project, run the folowing command before rebuilding.

```
$ mvn clean
```


# Customizing

There are a number of options that can be customized in the properties file located here:
[`src/main/resources/application.properties`](src/main/resources/application.properties)

| Properties    | Description   | Default |
| ------------- | ------------- | ------- |
| `spring.datasource.url`  | The connection string. | `jdbc:postgresql://localhost:5433/postgres`  |
| `server.port`  | The port on which the REST API server should listen. | 8080 |
| `spring.datasource.username` | The username to connect to the database. | `postgres` |
| `spring.datasource.password` | The password to connect to the database. Leave blank for the password. | - |

