organization := "gov.tubitak.minder"

name := "minder-common"

version := "0.0.41"

resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

resolvers += Resolver.mavenLocal

resolvers += "Eid public repository" at "http://eidrepo:8081/nexus/content/groups/public/"

javacOptions in (Compile, compile) ++= Seq("-source", "1.7", "-target", "1.7")

javacOptions in (doc) ++= Seq("-source", "1.7")

scalaVersion := "2.11.1"

crossPaths := false

libraryDependencies ++= Seq(
  "cglib" % "cglib" % "3.1",
  "org.specs2" % "specs2_2.11" % "2.3.11" % "test"
)

publishTo := Some("eid releases" at "http://eidrepo:8081/nexus/content/repositories/releases")

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

