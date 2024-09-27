val scala3Version = "3.3.4"

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "dotty-js",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++=  Seq(
      "org.scala-js" %%% "scalajs-dom" % "2.8.0",
      "org.scalameta" %% "munit" % "1.0.0" % Test
    )
  )
