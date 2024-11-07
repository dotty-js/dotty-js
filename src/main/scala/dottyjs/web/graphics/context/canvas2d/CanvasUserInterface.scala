package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js

import org.scalajs.dom.Element
import dottyjs.web.graphics.canvas.Path2D

@js.native
private abstract trait CanvasUserInterface extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawFocusIfNeeded) */
  def drawFocusIfNeeded(element: Element): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawFocusIfNeeded) */
  def drawFocusIfNeeded(path: Path2D, element: Element): Unit = js.native
end CanvasUserInterface
