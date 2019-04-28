name := "akkademy-db-client-scala"

version := "1.0"

scalaVersion := "2.11.2"

lazy val akkaVersion = "2.3.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "com.akkademy-db" %% "akkademy-db-scala" % "0.0.1-SNAPSHOT"
)
