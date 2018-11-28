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


### Question:

    Even if our use case is too simple to show the real advantage of compacting small files in fewer bigger ones,
    can you explain why it is critical to run this kind of compaction in HDFS?


