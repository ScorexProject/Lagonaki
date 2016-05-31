import com.typesafe.config.ConfigFactory

organization := "org.consensusresearch"

val appConf = ConfigFactory.parseFile(new File("src/main/resources/application.conf")).resolve().getConfig("app")

name := "lagonaki"

version := appConf.getString("version")

scalaVersion := "2.11.8"

resolvers += "SonaType" at "https://oss.sonatype.org/content/groups/public"

val modulesVersion = "1.2.8-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.consensusresearch" %% "scorex-basics" % modulesVersion,
  "org.consensusresearch" %% "scorex-perma" % modulesVersion,
  "org.consensusresearch" %% "scorex-transaction" % modulesVersion,
  "io.spray" %% "spray-testkit" % "1.+" % "test",
  "org.scalatest" %% "scalatest" % "2.+" % "test",
  "org.scalactic" %% "scalactic" % "2.+" % "test",
  "org.scalacheck" %% "scalacheck" % "1.12.+" % "test",
  "net.databinder.dispatch" %% "dispatch-core" % "+" % "test"
)

//assembly settings
assemblyJarName in assembly := "lagonaki.jar"

test in assembly := {}

mainClass in assembly := Some("scorex.lagonaki.Application")