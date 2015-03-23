val scalatest = "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
val picard = "org.seqdoop" % "htsjdk" % "1.118"

/** libraryDependencies += picard*/

lazy val commonSettings = Seq(
  organization := "MatthewRalston",
  version := "0.0.1",
  scalaVersion := "2.11.6"
)    

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "helloworld",
    libraryDependencies += scalatest,
    libraryDependencies += picard
  )

/**
import org.ensime.sbt.Plugin.Settings.ensimeConfig
import org.ensime.sbt.util.SExp._

ensimeConfig := sexp(
  key(":compiler-args"), sexp("-Ywarn-dead-code", "-Ywarn-shadowing"),
  key(":formatting-prefs"), sexp(
    key(":alignParameters"), true
  )
)
*/
