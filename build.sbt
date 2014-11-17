organization := "gov.tubitak.minder"

name := "minder-common"

version := "0.0.1"

resolvers += "Eid public repository" at "http://eidrepo:8081/nexus/content/groups/public/"

resolvers += Resolver.mavenLocal

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % "2.11.4",
  "org.scala-lang" % "scala-reflect" % "2.11.4",
  "org.scala-lang" % "scala-actors" % "2.11.4",
  "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.2", 
  "cglib" % "cglib" % "3.1"
)
