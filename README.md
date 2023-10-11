# Definition avec yml

application.yaml :

```application.yaml
spring:
  datasource:
    url: jdbc:h2:mem:mydb
    username: sa
    password: password
    driverClassName: org.h2.Driver
  jpa:
    spring.jpa.database-platform: org.hibernate.dialect.H2Dialect
  h2:
    console:
      path: /h2-console
      settings.trace: false
      settings.web-allow-others: false
```

En ajoutant `h2.console` il est possible de se connecter sur une console pour introspecter la db h2 : [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
