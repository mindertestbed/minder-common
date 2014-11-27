organization := "gov.tubitak.minder"

name := "minder-common"

version := "0.0.1"

resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

resolvers += "Eid public repository" at "http://eidrepo:8081/nexus/content/groups/public/"

resolvers += Resolver.mavenLocal

javacOptions in (Compile, compile) ++= Seq("-source", "1.7", "-target", "1.7")

javacOptions in (doc) ++= Seq("-source", "1.7")

libraryDependencies ++= Seq(
  "cglib" % "cglib" % "3.1"
)
