package dottyjs.web.graphics.d2

import scala.scalajs.js

import dottyjs.web.geometry.DOMMatrix
import dottyjs.web.geometry.DOMMatrix2DArguments

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D#transformations) */
private abstract trait CanvasTransform extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getTransform) */
  def getTransform(): DOMMatrix

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/resetTransform) */
  def resetTransform(): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/rotate) */
  def rotate(a: Double): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/scale) */
  def scale(x: Double, y: Double): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/setTransform) */
  def setTransform(
      a: Double, b: Double, c: Double, d: Double, e: Double, f: Double
  ): Unit

  // DOMMatrix2DInit from tslib not MDN
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/setTransform) */
  def setTransform(t: DOMMatrix2DArguments): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/transform) */
  def transform(
      a: Double, b: Double, c: Double, d: Double, e: Double, f: Double
  ): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/translate) */
  def translate(x: Double, y: Double): Unit
end CanvasTransform
