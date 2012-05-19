import sbt._
import sbt.Keys._

object ProjectBuild extends Build {

  lazy val root = Project(
    id = "root",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "$name$",
      organization := "$organization$",
      version := "$version$",
      scalacOptions ++= Seq("-deprecation"),
      scalaVersion := "$scala_version$",
      libraryDependencies ++= Seq(
        // test
        "org.specs2" %% "specs2" % "1.9" % "test",
            
        //log
        "org.clapper" %% "grizzled-slf4j" % "0.6.8",
        "ch.qos.logback" % "logback-classic" % "1.0.1"
      )
      // add other settings here
    )
  )
}
