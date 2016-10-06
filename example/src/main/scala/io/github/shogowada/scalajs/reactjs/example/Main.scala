package io.github.shogowada.scalajs.reactjs.example

import io.github.shogowada.scalajs.reactjs.{React, ReactClassSpec, ReactDOM}
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js.annotation.JSExport

@JSExport
object Main {
  @JSExport
  def main(element: HTMLElement) = {
    object HelloWorld extends ReactClassSpec {

      override def render(self: This) = React.createElement(
        "div",
        null,
        "Hello, World!"
      )
    }

    val helloWorldClass = React.createClass(HelloWorld)

    ReactDOM.render(React.createElement(helloWorldClass), element)
  }
}
