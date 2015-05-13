## BigDecimal by Default

Example: Simple interpolation equation

Java
```
BigDecimal uMinusV = c.subtract(a);
BigDecimal vMinusL = b.subtract(c);
BigDecimal uMinusL = a.subtract(b);
return e.multiply(uMinusV)
        .add(d.multiply(vMinusL))
        .divide(uMinusL, 10, BigDecimal.ROUND_HALF_UP);
```

Groovy
```
(d * (b - c) + e * (c - a)) / (a - b)
```
