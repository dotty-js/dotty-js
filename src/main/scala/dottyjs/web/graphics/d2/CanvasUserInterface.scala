package dottyjs.web.graphics.d2

import scala.scalajs.js

import org.scalajs.dom.Element
import dottyjs.web.graphics.d2.Path2D

private abstract trait CanvasUserInterface extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawFocusIfNeeded) */
  def drawFocusIfNeeded(element: Element): Unit 

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawFocusIfNeeded) */
  def drawFocusIfNeeded(path: Path2D, element: Element): Unit 
end CanvasUserInterface
