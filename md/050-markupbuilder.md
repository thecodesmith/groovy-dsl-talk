## The Groovy MarkupBuilder

Other builders: XMLBuilder, JSONBuilder, SwingBuilder, etc.

```
def mkp = new MarkupBuilder()
mkp.html {
    head {
        title "Groovy in Action"
    }
    body {
        div(width: "100") {
            p(class: "para") {
                span "Table of Contents"
            }
        }
    }
}
```
