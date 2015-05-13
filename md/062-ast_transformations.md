## AST Transformations

Easy to write custom AST transformations

Then applied with annotations

Example: `@Canonical` AST transform built into Groovy

```
@Canonical
class Person {
    String firstName
    String lastName
}

// adds constructors with parameters matching fields
user = new Person('Brian', 'Stewart') 

// generates toString() method
println user  // output: Person(Brian, Stewart)
```
