organization := "gov.tubitak.minder"

name := "minder-common"

version := "0.3.1"

resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

resolvers += Resolver.mavenLocal

resolvers += "Eid public repository" at "http://193.140.74.199:8081/nexus/content/groups/public/"

javacOptions in (Compile, compile) ++= Seq("-source", "1.8", "-target", "1.8")

javacOptions in (doc) ++= Seq("-source", "1.8")

scalaVersion := "2.11.7"

crossPaths := false

libraryDependencies ++= Seq(
  "cglib" % "cglib" % "3.1",
  "org.specs2" % "specs2_2.11" % "3.3.1" % "test"
)

publishTo := Some("eid releases" at "http://193.140.74.199:8081/nexus/content/repositories/releases")

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

