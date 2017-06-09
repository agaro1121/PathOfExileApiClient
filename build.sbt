
val commonSettings = Seq(
  name := "PathOfExileApiClient",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.12.1"
)

resolvers += Resolver.bintrayRepo("hseeberger", "maven")

val root = project.in(file("."))
            .configs(IntegrationTest)
            .settings(commonSettings:_*)
            .settings(Defaults.itSettings: _*)
            .settings(libraryDependencies ++= Dependencies.all)
            .settings(coverageEnabled := true)

def latestScalafmt = "0.6.8"

commands += Command.args("scalafmt", "Run scalafmt cli.") {
  case (state, args) =>
    val Right(scalafmt) =
      org.scalafmt.bootstrap.ScalafmtBootstrap.fromVersion(latestScalafmt)
    scalafmt.main("--non-interactive" +: args.toArray)
    state
}


