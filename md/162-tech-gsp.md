## Grails Technologies

### Groovy Server Pages (GSPs)

Similar to JSPs, but more flexible and intuitive

Writing to HTML stream - just like JSPs:
```
<html>
    <body>
        <%= "Hello World!" %>
    </body>
</html>
```

Simple GSP tag examples:
```
<g:each in="${books}" var="book">
    <p>Book: ${book.title} by ${book.author}
</g:each>


<g:findAll in="${books}" expr="it.author == 'J.R.R. Tolkien'">
    <p>Title: ${it.title}
</g:findAll>
```
