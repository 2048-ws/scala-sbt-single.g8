# scala-sbt-single.g8

Giter8 template for a single-module Scala 3 project with sensible defaults:

- Centralized dependency versions in `project/Deps.scala`
- Testing stack: MUnit, ScalaCheck, munit-scalacheck, discipline-munit
- Cats pre-wired: `cats-core` (compile), `cats-laws` (test)
- Scalafmt configured and enabled on compile
- Modern scalac options and example test suite

## Usage

```bash
sbt new 2048-ws/scala-sbt-single.g8 \
  --name=my-app \
  --org=com.example \
  --package=com.example.app \
  --policy_sha=main
```

Notes:

- To pick a specific branch or tag, prefer the `@tag-or-branch` suffix as shown above. Some older sbt launchers may not support `--branch`.
- You can override version placeholders during generation, for example: `scala_version=3.7.0`.

## What You Get

- `build.sbt` referencing versions and modules from `project/Deps.scala`
- `project/Deps.scala` with:
  - `object V` holding version constants (templated via `default.properties`)
  - `object Dep` with typed `ModuleID`s for common libs
- `.scalafmt.conf` pinned to the template's scalafmt version
- `project/plugins.sbt` adding `sbt-scalafmt`
- Sample source and test under `src/main/scala` and `src/test/scala`

## Dependencies

- Compile: `org.typelevel` %% `cats-core`
- Test: `org.typelevel` %% `cats-laws`, `org.typelevel` %% `discipline-munit`,
  `org.scalameta` %% `munit`, `org.scalameta` %% `munit-scalacheck`, `org.scalacheck` %% `scalacheck`

All versions are centralized via `V.*` in `project/Deps.scala` and default to the values in `default.properties`.

## Formatting

- Auto-format on compile: `ThisBuild / scalafmtOnCompile := true`
- Manual formatting: `sbt scalafmtAll` (and `scalafmtSbt` for sbt files)
- Check formatting: `sbt scalafmtCheckAll scalafmtSbtCheck`

## Tasks

- Run tests: `sbt test`
- Compile only: `sbt compile`
