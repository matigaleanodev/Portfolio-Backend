# Portfolio Backend

[Español](README.es.md)

Deprecated backend for the original personal portfolio. Preserved as a reference implementation; current portfolio development belongs to the repositories below.

## Stack

Java · Spring Boot · Spring Security · JPA · MySQL.

## Scope and configuration

REST controllers manage portfolio data and authentication. Review database and application configuration before local use. The Maven descriptor combines Java settings and older dependencies; it is not a deployment template.

## Local development

Use a toolchain compatible with the project descriptor.

```sh
mvn spring-boot:run
mvn test
```

## Related repositories

- [Portfolio-Frontend](https://github.com/matigaleanodev/Portfolio-Frontend)
- [portfolio](https://github.com/matigaleanodev/portfolio)
- [portfolio-api](https://github.com/matigaleanodev/portfolio-api)
- [portfolio-cloud](https://github.com/matigaleanodev/portfolio-cloud)
