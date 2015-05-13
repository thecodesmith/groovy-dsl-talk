## ExpandoMetaClass

Add methods to the metaClass of current classes (even JDK classes!)

```
// create a closure called getMeters in the Number meta-class
Number.metaClass.getMeters = {
    new Distance(delegate, Unit.METERS)
}

// usage:
100.meters
```
