package org.dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import scala.scalajs.js.annotation._

// TODO DOMMatrix fields
/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix) */
class DOMMatrix extends js.Object

@js.native
trait CanvasTransform extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getTransform) */
  def getTransform(): DOMMatrix = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/resetTransform) */
  def resetTransform(): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/rotate) */
  def rotate(a: Double): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/scale) */
  def scale(x: Double, y: Double): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/setTransform) */
  def setTransform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/setTransform) */
  def setTransform(t: DOMMatrix): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/transform) */
  def transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/translate) */
  def translate(x: Double, y: Double): Unit = js.native
end CanvasTransform
