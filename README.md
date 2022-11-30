# Kotlin annotation `@JvmOverloads`

This example illustrates what the annotation `@JvmOverloads` does.
In Java-Kotlin-mixed projects it makes constructors available to calls from Java that have default parameters.
To be precise: Since default parameters do not exist in Java, the compiler adds another constructor and sets the value by itself. 