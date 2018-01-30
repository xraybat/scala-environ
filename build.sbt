name := "environ"

organization := "au.com.carringbushsw"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.4"

logBuffered in Test := false

scalacOptions ++= Seq("-unchecked", "-deprecation")

//resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)
