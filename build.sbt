name := "scala-exercises"

version := "1.0"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.0.1",
  "org.apache.spark" %% "spark-sql" % "2.0.1",

  "com.databricks" % "spark-avro_2.11" % "3.1.0",

  "org.scalatest" %% "scalatest" % "2.2.0" % "test"
)
