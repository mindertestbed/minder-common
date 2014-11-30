organization := "gov.tubitak.minder"

name := "minder-common"

version := "0.0.2"

resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

resolvers += Resolver.mavenLocal

javacOptions in (Compile, compile) ++= Seq("-source", "1.7", "-target", "1.7")

javacOptions in (doc) ++= Seq("-source", "1.7")

scalaVersion := "2.11.1"

crossPaths := false

libraryDependencies ++= Seq(
  "cglib" % "cglib" % "3.1",
  "org.specs2" % "specs2_2.11" % "2.3.11" % "test"
)
