organization := "org.consensusresearch"

name := "lagonaki"

version := "1.2.3"

scalaVersion := "2.11.8"

resolvers += "SonaType" at "https://oss.sonatype.org/content/groups/public"

libraryDependencies ++= Seq(
  "org.consensusresearch" %% "scorex-basics" % "1.2.+",
  "org.consensusresearch" %% "scorex-consensus" % "1.2.+",
  "org.consensusresearch" %% "scorex-perma" % "1.2.+",
  "org.consensusresearch" %% "scorex-transaction" % "1.2.+"
)

//assembly settings
assemblyJarName in assembly := "lagonaki.jar"

test in assembly := {}

mainClass in assembly := Some("scorex.lagonaki.Application")