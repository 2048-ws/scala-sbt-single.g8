#

Generated from `scala-sbt-single.g8`.

## What’s Included

- Scala 3 project with versions centralized in `project/Deps.scala`
- Testing: MUnit, ScalaCheck, munit-scalacheck, discipline-munit
- Cats: `cats-core` (compile), `cats-laws` (test)
- Scalafmt configured and enabled on compile (`.scalafmt.conf`)

## Quick Start

```bash
sbt -v test
```

Useful commands:

```bash
sbt scalafmtAll            # format sources
sbt scalafmtSbt            # format sbt files
sbt scalafmtCheckAll       # check formatting
```
