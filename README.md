Reproduces an issue where vite gets confused where external `node_modules` are. 

The project starts from the end of the [ScalaJS vite tutorial](https://www.scala-js.org/doc/tutorial/scalajs-vite.html),
then:
1. Stable: Migrate to Slinky's `main` branch that supports React 18 (previous commit).
2. Buggy: Move several resources to the `web` folder (current commit).

## How to reproduce
Terminal 1:
- Run `sbt "~fastLinkJS"`

- Terminal 2:
- Go to `web`
- Run `npm install`
- Run `npm run dev`

## Workaround

While it is running with the bug, run the following at the root:
```
cp -r web/node_modules .
```
