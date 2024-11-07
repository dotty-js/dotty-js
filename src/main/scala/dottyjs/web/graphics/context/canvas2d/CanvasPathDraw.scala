package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import org.scalajs.dom.CanvasFillRule
import dottyjs.web.graphics.canvas.Path2D

//  TODO CanvasFillRule

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D#drawing_paths) */
private abstract trait CanvasPathDraw extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/beginPath) */
  def beginPath(): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/clip) */
  def clip(): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/clip) */
  def clip(fillRule: CanvasFillRule): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/clip) */
  def clip(path: Path2D): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/clip) */
  def clip(path: Path2D, fillRule: CanvasFillRule): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fill) */
  def fill(): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fill) */
  def fill(fillRule: CanvasFillRule): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fill) */
  def fill(path: Path2D): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fill) */
  def fill(path: Path2D, fillRule: CanvasFillRule): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInPath) */
  def isPointInPath(x: Double, y: Double): Boolean

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInPath) */
  def isPointInPath(x: Double, y: Double, fillRule: CanvasFillRule): Boolean

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInPath) */
  def isPointInPath(path: Path2D, x: Double, y: Double): Boolean

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInPath) */
  def isPointInPath(
      path: Path2D, x: Double, y: Double, fillRule: CanvasFillRule
  ): Boolean

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInStroke) */
  def isPointInStroke(x: Double, y: Double): Boolean

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInStroke) */
  def isPointInStroke(path: Path2D, x: Double, y: Double): Boolean

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/stroke) */
  def stroke(): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/stroke) */
  def stroke(path: Path2D): Unit
end CanvasPathDraw
