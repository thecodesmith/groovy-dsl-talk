## Grails Technologies

### GORM - Object Relational Mapping

```
new Author(name: "C.S. Lewis")
        .addToBooks(new Book(title: "The Lion, the Witch, and the Wardrobe")
        .addToBooks(new Book(title: "The Screwtape Letters")
        .save()
```

```
def book = Book.findByTitle("The Hobbit")
book.author = "J.R.R. Tolkien"
book.save()
```
