Reproduces an issue where vite gets confused where external `node_modules` are. 

The project starts from the end of the [ScalaJS vite tutorial](https://www.scala-js.org/doc/tutorial/scalajs-vite.html),
then:
1. Stable: Migrate to Slinky's `main` branch that supports React 18: https://github.com/bphenriques/issue-rd-scalajs-sbt-vite-laminar-chartjs-example/commit/6c7b188437d0f950fd14ae2c8724d8f81da30a32
2. Buggy: Move several resources to the `web` folder (current commit): https://github.com/bphenriques/issue-rd-scalajs-sbt-vite-laminar-chartjs-example/commit/33cf7c23549f262b2e8db7c23390491f2f30b4f6

## How to reproduce
Terminal 1:
- Run `sbt "~fastLinkJS"`

- Terminal 2:
- Go to `web`
- Run `npm install`
- Run `npm run dev`

<img width="891" alt="image" src="https://github.com/bphenriques/issue-rd-scalajs-sbt-vite-laminar-chartjs-example/assets/4727729/ac871114-63ff-49e6-bfb7-423398309e4c">

## Workaround

While it is running with the bug, run the following at the root:
```
cp -r web/node_modules .
```
