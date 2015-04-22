## Technologies

### GORM - Object Relational Mapping

```
class Book {
    String title
    Author author

    static hasOne = [author: Author]
    
    static constraints = {
        title nullable: false, unique: true
        author nullable: false
    }
}
```

```
class Author {
    String name
    static hasMany = [books: Book]
}
```
