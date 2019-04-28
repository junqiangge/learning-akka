import Dependencies._


lazy val root = (project in file("."))
  .settings(
    name := """pong""",
    version := "1.0",
    scalaVersion :="2.11.2",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % "2.3.6",
      "com.typesafe.akka" %% "akka-testkit" % "2.3.6" % Test,
      scalaTest % Test
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
