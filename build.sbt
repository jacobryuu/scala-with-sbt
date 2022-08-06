ThisBuild / version := "0.1.0"

ThisBuild / scalaVersion := "2.13.8"


lazy val root = (project in file("."))
  .settings(
    name := "scala-with-sbt"
  )

libraryDependencies += "org.json4s" %% "json4s-native" % "4.0.5"
libraryDependencies += "org.json4s" %% "json4s-jackson" % "4.0.5"
libraryDependencies += "org.mongodb" % "mongo-java-driver" % "3.12.11"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.11"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"