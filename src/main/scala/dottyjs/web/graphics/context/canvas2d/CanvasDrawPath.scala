package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import org.scalajs.dom.CanvasFillRule

//  TODO CanvasFillRule

@js.native
private abstract trait CanvasDrawPath extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/beginPath) */
  def beginPath(): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/clip) */
  def clip(): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/clip) */
  def clip(fillRule: CanvasFillRule): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/clip) */
  def clip(path: Path2D): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/clip) */
  def clip(path: Path2D, fillRule: CanvasFillRule): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fill) */
  def fill(): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fill) */
  def fill(fillRule: CanvasFillRule): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fill) */
  def fill(path: Path2D): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fill) */
  def fill(path: Path2D, fillRule: CanvasFillRule): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInPath) */
  def isPointInPath(x: Double, y: Double): Boolean = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInPath) */
  def isPointInPath(
      x: Double, y: Double, fillRule: CanvasFillRule
  ): Boolean = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInPath) */
  def isPointInPath(path: Path2D, x: Double, y: Double): Boolean = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInPath) */
  def isPointInPath(
      path: Path2D, x: Double, y: Double, fillRule: CanvasFillRule
  ): Boolean = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInStroke) */
  def isPointInStroke(x: Double, y: Double): Boolean = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInStroke) */
  def isPointInStroke(path: Path2D, x: Double, y: Double): Boolean = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/stroke) */
  def stroke(): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/stroke) */
  def stroke(path: Path2D): Unit = js.native
end CanvasDrawPath
