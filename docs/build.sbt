name := "anorm-docs"

libraryDependencies ++= Seq(
  component("play-jdbc") % "test",
  component("play-test") % "test"
)

PlayDocsKeys.javaManualSourceDirectories  := (baseDirectory.value / "manual" / "working" / "javaGuide" ** "code").get
PlayDocsKeys.scalaManualSourceDirectories := (baseDirectory.value / "manual" / "working" / "scalaGuide" ** "code").get
