
val commonSettings = Seq(
  name := "PathOfExileApiClient",
  version := "0.1-SNAPSHOT",
  scalaVersion := "2.12.1"
)

resolvers += Resolver.bintrayRepo("hseeberger", "maven")

val root = project.in(file("."))
            .configs(IntegrationTest)
            .settings(commonSettings:_*)
            .settings(Defaults.itSettings: _*)
            .settings(libraryDependencies ++= Dependencies.all)




