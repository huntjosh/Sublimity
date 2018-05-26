# Sublimity
A Java library for bespoke concurrent system integrations.
<br>
<br>
The aim of this library is to allow for extremely reliable and high performing custom 
integrations between any mixture of sources such as: Files, APIs, Databases, etc.

Note: This project is still heavily under development and is only in early stages.
## Example usage

```java
List<Integration> integrations = new ArrayList<>();
integrations.add(new PeopleEmployee());
IntegrationRunner integrationRunner = new IntegrationRunner(integrations, 
                                                            new StubScheduleChecker(), 
                                                            new ConsoleLogger());
Timer t = new Timer();
t.scheduleAtFixedRate(integrationRunner, 0, 1000);
```

## Versioning

Current version is 0.1

## Author

* [Josh Hunt](https://github.com/huntjosh)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details