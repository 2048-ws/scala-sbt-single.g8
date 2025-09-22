ThisBuild / scalaVersion := V.scala3
ThisBuild / scalafmtOnCompile := true

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    organization := "$org$",
    version := "0.0.1-SNAPSHOT",
    scalacOptions ++= Seq("-deprecation","-feature","-unchecked","-Xfatal-warnings"),
    libraryDependencies ++= Seq(
      Dep.catsCore,
      Dep.catsLaws    % Test,
      Dep.munit       % Test,
      Dep.munitScalaCheck % Test,
      Dep.scalacheck  % Test,
      Dep.disciplineMunit % Test
    ),
    testFrameworks += new TestFramework("munit.Framework")
  )
