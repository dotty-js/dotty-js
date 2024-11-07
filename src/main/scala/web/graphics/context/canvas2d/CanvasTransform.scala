package org.dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import scala.scalajs.js.annotation._
import org.dottyjs.web.geometry.{DOMMatrix, DOMMatrix2DInit}

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
  def setTransform(
      a: Double, b: Double, c: Double, d: Double, e: Double, f: Double
  ): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/setTransform) */
  def setTransform(t: DOMMatrix2DInit): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/transform) */
  def transform(
      a: Double, b: Double, c: Double, d: Double, e: Double, f: Double
  ): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/translate) */
  def translate(x: Double, y: Double): Unit = js.native
end CanvasTransform
