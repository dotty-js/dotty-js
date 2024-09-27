package org.dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import scala.scalajs.js.annotation._
import org.scalajs.dom.Element
import org.scalajs.dom.Path2D

@js.native
trait CanvasUserInterface extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawFocusIfNeeded) */
  def drawFocusIfNeeded(element: Element): Unit = js.native

  // TODO scala3 Path2D
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawFocusIfNeeded) */
  def drawFocusIfNeeded(path: Path2D, element: Element): Unit = js.native
end CanvasUserInterface
