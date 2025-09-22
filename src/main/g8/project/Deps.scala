import sbt._

object V {
  // Languages
  val scala3 = "$scala_version$"

  // Libraries
  val munit       = "$munit_version$"
  val scalacheck  = "$scalacheck_version$"
  val cats        = "$cats_version$"
  val disciplineMunit = "$discipline_munit_version$"
  val munitScalaCheck = "$munit_scalacheck_version$"
}

object Dep {
  // Testing
  val munit       = "org.scalameta"  %% "munit"       % V.munit
  val scalacheck  = "org.scalacheck" %% "scalacheck"  % V.scalacheck
  val disciplineMunit = "org.typelevel" %% "discipline-munit" % V.disciplineMunit
  val munitScalaCheck = "org.scalameta" %% "munit-scalacheck" % V.munitScalaCheck

  // Typelevel
  val catsCore    = "org.typelevel" %% "cats-core" % V.cats
  val catsLaws    = "org.typelevel" %% "cats-laws" % V.cats
}
