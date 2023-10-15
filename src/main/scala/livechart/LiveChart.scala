package livechart

import org.scalajs.dom
import slinky.web.html.*
import slinky.web.ReactDOMClient
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// import javascriptLogo from "/javascript.svg"
@js.native @JSImport("/javascript.svg", JSImport.Default)
val javascriptLogo: String = js.native

@main
def Main(): Unit = {
  val container = dom.document.getElementById("app")
  val root = ReactDOMClient.createRoot(container)
  root.render(LiveChart())
}

def LiveChart() =
  div(
    a(href := "https://vitejs.dev", target := "_blank")(
      img(src := "/vite.svg", className := "logo", alt := "Vite logo")
    ),
    a(href := "https://developer.mozilla.org/en-US/docs/Web/JavaScript", target := "_blank")(
      img(src := javascriptLogo, className := "logo vanilla", alt := "JavaScript logo")
    ),
    h1("Hello, world! "),
    h3("Now with React using Slinky"),
    p(className := "read-the-docs")(
      "Click on the Vite logo to learn more"
    )
  )
