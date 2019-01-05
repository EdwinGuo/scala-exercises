# Technical Test

Checkout/download this project. The goal is to complete the following exercise that contains both coding challenges and
a theorical question.

### Coding exercise:

A few libraries are already setup in the build.sbt, you can add or remove any dependency as you wish during this
exercise.

#### Part 1

The goal of this first exercise is to review quickly the basics of Scala. In the file Part1.scala, a sequence of Person objects
have been initialized.

1. Complete the implementation of the method printStatus that should print the output:

> D is young [8]<br>
> A is young [15]<br>
> G is young [21]<br>
> B is not that young [24]<br>
> F is not that young [34]<br>
> C is not that young [62]<br>
> E is not that young [90]

2. Complete the implementation of the method getCityStats that should return a Map of the city names with their occurrences:

> Map(<br>
>    "Quebec" -> 1<br>
>    "Granby" -> 1<br>
>    "Montreal" -> 4<br>
>    "Sherbrooke" -> 1<br>
> )


#### Part 2

The goal of this exercise is to ingest and manipulate a small dataset contained in the Avro files located at
src/main/resources/input. The Avro schema is provided in the src/main/resources/avro_utils folder.

Please initiate in the file Part2.scala a Spark 2 Session in local mode (no interaction with an Hadoop cluster will happen during this
exercise).

1. **Compaction** : Using the Spark API, please generate one Avro file that will contain all the records of the four
 input files. You can output this file to the path of your choice on your local machine. Result file does not have to be committed to the
 repository at the end of the exercise.

2. **Transformation/Datamart** : Using the result of the first step, please output the data again (again at the path
 of your choice), but this time partitioned by age, *excluding* people that are younger than 21. Output should look
 like :

    - \path\age=21\\***.avro
    - \path\age=24\\***.avro
    - ...

=======================================================================================================================================================
# Scala Interview question

This file contains a number of Scala interview questions that can be used when vetting potential candidates. It is by no means recommended to use every single question here on the same candidate (that would take hours). Choosing a few items from this list should help you vet the intended skills you require.

**Note:** Keep in mind that many of these questions are open-ended and could lead to interesting discussions that tell you more about the person's capabilities than a straight answer would.

## Table of Contents

  1. [General Questions](#general-questions)
  1. [Language Questions](#language-questions)
  1. [Functional Programming Questions](#functional-programming-questions)
  1. [Reactive Programming Questions](#reactive-programming-questions)
  1. [Coding Questions](#coding-questions)
  1. [Fun Questions](#fun-questions)
  1. [Answers](#answer)

## Getting Involved

  1. [Contributors](#contributors)
  1. [How to Contribute](https://github.com/jarlakxen/Scala-Interview-Questions/blob/master/CONTRIBUTING.md)
  1. [License](https://github.com/jarlakxen/Scala-Interview-Questions/blob/master/LICENSE.md)

#### General Questions:

* What did you learn yesterday/this week?
* Why and how did you start learning Scala?
* What excites or interests you about coding in Scala?
* What is a recent technical challenge you experienced and how did you solve it?
* Talk about your preferred development environment. (OS, Editor or IDE, Tools, etc.)
* What are your thoughts about the other JVM languages compared to Scala?
* Do you think that the Scala language and community is mature enough?

#### Language Questions:

* What is the difference between a `var`, a `val` and `def`?
* What is the difference between a `trait` and an `abstract class`?
* What is the difference between an `object` and a `class`?
* What is a `case class`?
* What is the difference between a Java future and a Scala future?
* What is the difference between `unapply` and `apply`, when would you use them?
* What is a companion object?
* What is the difference between the following terms and types in Scala: `Nil`, `Null`, `None`, `Nothing`?
* What is `Unit`?
* What is the difference between a `call-by-value` and `call-by-name` parameter? 
	* How does Scala's `Stream` trait levarages `call-by-name`?
* Define uses for the `Option` monad and good practices it provides.
* How does `yield` work?
* Explain the implicit parameter precedence.
* What operations is a `for comprehension` syntactic sugar for?
* Streams:
	* What consideration you need to have when you use Scala's `Streams`? 
	* What technique does the Scala's `Streams` use internally?

#### Functional Programming Questions:

* What is a `functor`?
* What is a `applicative`?
* What is a `monad`?
  * What are the `monad` axioms?
  * What Scala data types are, or behave like, monads?
  * What are the basic and optional requirement/s to conform a Monad?
* Explain higher order functions.
* What is gained from using immutable objects?
* What is tail recursion?
  * How does it differentiate from common recursion?
  * What issues are there with tail recursive functions in the JVM?
  * How does the Scala compiler optimize a tail recursive function?
  * How do you ensure that the compiler optimizes the tail recursive function?
* What is function currying?
* What are implicit parameters?
* What are typeclasses?
* What are lenses?
* What is and which are the uses of: Enumerators, Enumeratees and Iteratee

#### Reactive Programming Questions:

* Explain the actor model.
* What are benefits of non-blocking (asynchronous I/O) over blocking (synchronous I/O).
* Do you think that Scala has the same async spirit as Node.js?
* Explain the difference between `concurrency` and `parallelism`, and name some constructs you can use in Scala to leverage both.
* What is the global ExecutionContext?
  * What does the global ExecutionContext underlay?
* Akka:
	* Which are the 3 main components in a Stream?

#### Coding Questions:

* How can you make a `List[String]` from a `List[List[String]]`?
* What is the difference (if any) between these 2 statements? 
```scala
  var x = immutable.Set[Int]()
  val y = mutable.Set[Int]()
```

#### Fun Questions:

* What's a cool project that you've recently worked on?
* What testing framework for Scala do you use?
* What do you know about property based testing frameworks, such as Scalacheck?
* Do you like ‘scalaz‘?

#### Answers:

* [Scala interview questions](http://pedrorijo.com/blog/scala-interview-questions/) by [@pedrorijo91](https://github.com/pedrorijo91)


## Top 25 Scala Interview Questions & Answers	
https://career.guru99.com/top-25-interview-questions-on-scala/
