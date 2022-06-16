name := "scala-impatient"
organization := "guru.impatient"
version := "0.1"
scalaVersion := "2.12.10"
autoScalaLibrary := false

val testDependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % Test,
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1",
  "org.scala-lang" % "scala-actors" % "2.11.12",
  "org.scala-lang" % "scala-xml" % "2.11.0-M4",
  "com.typesafe.play" %% "play-json" % "2.9.2"

)

libraryDependencies ++= testDependencies
