# Kotlin annotation `@JvmOverloads`

This example illustrates what the annotation `@JvmOverloads` does.
In Java-Kotlin-mixed projects it makes constructors available to calls from Java that have default parameters.
To be precise: Since default parameters do not exist in Java, the compiler adds another constructor and sets the value by itself.

The main method in the Main (Java) class contains three constructor calls. One of them is commented out, because the compiler throws an error.
The other two illustrate the instantiation of the respective object using the default parameter.
For that to work, those other two classes are in Kotlin - one is with the annotation and the other without.