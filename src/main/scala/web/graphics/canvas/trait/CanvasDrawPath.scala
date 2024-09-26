package org.dottyjs.web.graphics

import scala.scalajs.js
import scala.scalajs.js.annotation._
import org.scalajs.dom.CanvasFillRule
import org.scalajs.dom.Path2D

//  TODO - planaro CanvasFillRule
//  TODO - planaro Path2D

@js.native
trait CanvasDrawPath extends js.Object:
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

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInPath) */
  def isPointInPath(x: Double, y: Double): Boolean = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInPath) */
  def isPointInPath(x: Double, y: Double,
      fillRule: CanvasFillRule): Boolean = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInPath) */
  def isPointInPath(path: Path2D, x: Double, y: Double): Boolean = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInPath) */
  def isPointInPath(path: Path2D, x: Double, y: Double,
      fillRule: CanvasFillRule): Boolean = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInStroke) */
  def isPointInStroke(x: Double, y: Double): Boolean = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInStroke) */
  def isPointInStroke(path: Path2D, x: Double, y: Double): Boolean = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/stroke) */
  def stroke(): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/stroke) */
  def stroke(path: Path2D): Unit = js.native
end CanvasDrawPath
