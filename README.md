>In this project, I will attempt to establish a relationship between mathematical functions and functional programming, covering some of the well-known principles of functional programming. To accomplish this, I have chosen a JVM-based language, primarily Java and Kotlin
****
```
All code examples can be found in the 
specific language by searching for the package name 
```
# What is Function?
```
 In short - A function relates an input to an output!
 Basically a function has three components
  1. Input
  2. Relationship
  3. Output
  
  A function may have name like f(x) = x^2. here `f` is the name 
  of the function and `x` is input.
  * Function must work for every possible input value.
  * Each input value can only have one output value.
  * Multiple input values can correspond to the same output value.
```
---
# Functional Programming 
> Functional programming focuses on specifying what should be done, rather than how to do it.
***
### Concept of Functional Programming
1. Immutability  
2. Pure Function  
3. Higher-order Function
4. Referential Transparency
5. Recursion
6. Functional Composition
7. First Class Function
***

## #Immutability
If you can't change it, then it's immutable. but there is subtle difference between immutable and constant. 

####In Java, any variable marked as final is immutable. The final value can be initialized either when the variable is created or through the constructor

``
private final int x =10;
``

But Kotlin makes it smarter. Kotlin differentiates between immutable and mutable values using two separate keywords: 'val' and 'var'. 'val' stands for a value that is immutable, while 'var' stands for a value that is mutable.

``
private val x:Int =10;
private lateinit var x:Int =10
``

## #Pure Function
A pure function is a function that always returns the same output given the same input, and has no side effects. In other words, its return value depends solely on its input value, it does not modify any other resources or state outside the function, and it does not modify its input. Pure functions are deterministic and have no hidden dependencies or side effects, making them easier to reason about, test, and compose.

Some characteristics of pure functions include the following:

1. Pure functions are idempotent, meaning that calling them multiple times with the same input produces the same result as calling them once.
2. Pure functions are thread-safe and can be safely executed in parallel, without any risk of data races or synchronization issues.
3. Pure functions are easier to optimize, since their behavior is predictable and can be memoized or cached.

## #Higher-order Function
A function that takes one or more functions as arguments, or returns a function as its result.
Basically, It's a function that operates on functions.
higher order function more related to category mathematics than mathematical function

before java 8, java doesn't support functional style code. 

## #Referential Transparency

## #Recursion

## #Functional Composition

## #First Class Function

