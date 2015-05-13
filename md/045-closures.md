## Closures

When closures are last parameter, they can be outside parentheses

Example: Custom control structures

```
// method taking a closure:
def unless(boolean condition, Closure action) {
    ... 
    action()
    ... 
}

// usage:
unless (account.balance < 100.euros) {
    account.debit 100.euros
}
```
