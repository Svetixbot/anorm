# Anorm

Anorm is a simple data access layer that uses plain SQL to interact with the database and provides an API to parse and transform the resulting datasets: [More information](docs/manual/working/scalaGuide/main/sql/ScalaAnorm.md).

## Usage

In a projects built with SBT, dependency to Anorm can be added as following:

```scala
libraryDependencies ++= Seq(
  "com.typesafe.play" %% "anorm" % ReplaceByAnormVersion)
```

## Build manually

Anorm can be built from this source repository.

    sbt publish-local

To run the tests, use:

    sbt test

[Travis](https://travis-ci.org/playframework/anorm): ![Travis build status](https://travis-ci.org/playframework/anorm.svg?branch=master)

## Documentation

To run the documentation server, run:

    sbt docs/run

To test the documentation code samples, run:

    sbt docs/test
