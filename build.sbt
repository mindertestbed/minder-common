organization := "com.yerlibilgin.minder"

name := "minder-common"

version := "1.1.0"

resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

resolvers += Resolver.mavenLocal

javacOptions in (Compile, compile) ++= Seq("-source", "1.8", "-target", "1.8")

javacOptions in (doc) ++= Seq("-source", "1.8")

scalaVersion := "2.11.7"

crossPaths := false

libraryDependencies ++= Seq(
  "cglib" % "cglib" % "3.1",
  "com.typesafe.play" %% "play-specs2" % "2.6.9" % "test"
)

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

