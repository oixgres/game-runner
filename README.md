# Notes

## Spring Concepts
### Dependency Injection
Identify beans, their dependencies and wire them together (provides IOC - Inversion of Control)
* Constructor Injection
* Setter Injection
* Field Injection

### IOC Container
Spring IOC Context that manages Spring beans and their lifecycle. 

### Bean Factory
Basic Spring IOC Container

### Application Context
Advanced Spring IOC Container with the enterprise-specific features - Easy to use in web applications with internationalization features and good integration with Spring AOP


## Spring Annotations
| Annotation     | Description                                                                                                                                                                                                    |
|:---------------|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| @Configuration | Indicates that a class declares one or more @Bean methods and may be processed by the Spring Container to generate bean definitions                                                                            |
| @ComponentScan | Define specific packages to scan for components. If specific packages are not defined, scanning will occur from the package of the class that declares the annotation                                          |
| @Bean          | Indicates that a method produces a bean to be managed by the Spring Container                                                                                                                                  |
| @Component     | Indicates that an annotated class is a "component"                                                                                                                                                             |
| @Service       | Specializaton of a @Component indicating that an annotated class has business logic                                                                                                                            |
| @Controller    | Specialization of a @Component indicating that an annotated class is a "Controller". Used to define controllers in your web applications and REST API                                                          |
| @Repository | Specialization of a @Component indicating that an annotated class is used to retrieve and/or manipulate data in a database                                                                                     |
| @Primary | Indicates that a bean should be given preference when multiple candidates are qualified to autowire a single-valued dependency                                                                                 |
| @Qualifier | Used on a field or parameter as a qualifier candidate beans when autowiring                                                                                                                                    |
| @Lazy | Indicates that a bean has to be lazily initialized. The absence of @Lazy annotation will lead to eager initialization                                                                                          |
| @Scope | Defines a bean to be a prototype - a new instance will be created every time you refer to the bean. Default scope is singleton - one instance per IOC container                                                |
| @PostConstruct | Identifies the method that will be executed after dependency injection is done to perform any initialization                                                                                                   |
| @PreDestroy | Identifies the method that will receive the callback notifcation to signal that the instance is in the process of being removed by the container. Typically used to release resources that it has been holding |