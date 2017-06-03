name := "PathOfExileApiClient"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.0.7"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.5.2"
//libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.4.18"
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.5.2"


val circeVersion = "0.7.0"
libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser",
  "io.circe" %% "circe-shapes"
).map(_ % circeVersion)

resolvers += Resolver.bintrayRepo("hseeberger", "maven")
libraryDependencies += "de.heikoseeberger" %% "akka-http-circe" % "1.12.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

libraryDependencies += "org.typelevel" %% "cats" % "0.9.0"

//libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.7"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"