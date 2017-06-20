object Dependencies {

  import sbt._

  object Versions {
    val AkkaHttp = "10.0.7"
    val Akka = "2.5.2"
    val Circe = "0.7.0"
    val ScalaTest = "3.0.1"
    val Cats = "0.9.0"
    val ScalaLogging = "3.5.0"
    val AkkaHttpCirce = "1.12.0"
    val LogBack = "1.1.7"
    val CaseClassy = "0.4.0"
    val Slf4jNop = "1.7.25"
  }

  lazy val AkkaHttp = "com.typesafe.akka" %% "akka-http" % Versions.AkkaHttp
  lazy val AkkaStream = "com.typesafe.akka" %% "akka-stream" % Versions.Akka
  lazy val AkkaTestkit = "com.typesafe.akka" %% "akka-testkit" % Versions.Akka

  val Circe = Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-parser",
    "io.circe" %% "circe-shapes"
  ).map(_ % Versions.Circe)

  val AkkaHttpCirce = "de.heikoseeberger" %% "akka-http-circe" % Versions.AkkaHttpCirce
  val ScalaTest = "org.scalatest" %% "scalatest" % Versions.ScalaTest % "it,test"
  val Cats = "org.typelevel" %% "cats" % Versions.Cats
  val ScalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % Versions.ScalaLogging
  val Logback =  "ch.qos.logback" % "logback-classic" % Versions.LogBack

  val CaseClassy = Seq(
    "com.47deg" %% "classy-core",
    "com.47deg" %% "classy-config-typesafe",
    "com.47deg" %% "classy-generic"
  ).map(_ % Versions.CaseClassy)

  val Slf4jNop = "org.slf4j" % "slf4j-nop" % Versions.Slf4jNop

  val all = Seq(
      AkkaHttp
      ,AkkaStream
      ,AkkaTestkit
      ,AkkaHttpCirce
      ,ScalaTest
      ,Cats
      ,ScalaLogging
      ,Logback
//      ,Slf4jNop
  ) ++ Circe ++ CaseClassy

}
