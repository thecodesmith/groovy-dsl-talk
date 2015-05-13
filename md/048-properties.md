## Property Access

Methods of the form `getXyz()` can be accessed like properties

```
class Person {
    String firstName
    String lastName

    String getFullName() {
        return "$firstName $lastName"
    }
}

person = new Person(firstName: 'Brian', lastName: 'Stewart')

// Accessed like a property, but calls getFullName() under the hood:
println person.fullName
```
