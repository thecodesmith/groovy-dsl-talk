## Closures

When closures are last parameter, they can be outside parentheses

Example: Custom control structures

```
// method taking a closure:
def unless(Boolean condition, Closure action) {
    log.info "Executing action" 
    action()
}

// usage:
unless (account.balance < 100.euros) {
    account.debit 100.euros
}
```
