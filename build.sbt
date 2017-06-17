import sbt.Keys.crossScalaVersions

val commonSettings = Seq(
  name := "PathOfExileApiClient",
  organization := "com.github.agaro1121",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.12.1",
  crossScalaVersions := Seq("2.11.11", scalaVersion.value)
)

resolvers += Resolver.bintrayRepo("hseeberger", "maven")

val root = project.in(file("."))
            .configs(IntegrationTest)
            .settings(commonSettings:_*)
            .settings(Defaults.itSettings: _*)
            .settings(libraryDependencies ++= Dependencies.all)
            .settings(coverageEnabled := true)




