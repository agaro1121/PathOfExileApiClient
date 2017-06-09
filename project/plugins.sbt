logLevel := Level.Warn

addSbtPlugin("io.spray" % "sbt-revolver" % "0.8.0")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.0")

libraryDependencies += "com.geirsson" %% "scalafmt-bootstrap" % "0.6.6"
