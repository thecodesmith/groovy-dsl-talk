## Technologies

### XmlBuilder

Concise syntax for creating XML
```
class BookController {

    def list() {
        def results = Book.list()

        render (contentType: "text/xml") {
            books {
                for (b in results) {
                    book(title: b.title, author: b.author)
                }
            }
        }
    }
}
```

Result:
```
<books>
    <book title="The Hobbit" author="J.R.R. Tolkien" />
    <book title="The Lion, the Witch, and the Wardrobe" author="C.S. Lewis" />
    <book title="The Screwtape Letters" author="C.S. Lewis" />
</books>
```
