package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import dottyjs.web.graphics.canvas.TextMetrics

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D#drawing_text) */
private abstract trait CanvasText extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fillText) */
  def fillText(text: String, x: Double, y: Double): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fillText) */
  def fillText(text: String, x: Double, y: Double, maxWidth: Double): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/measureText) */
  def measureText(text: String): TextMetrics

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/strokeText) */
  def strokeText(text: String, x: Double, y: Double): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/strokeText) */
  def strokeText(text: String, x: Double, y: Double, maxWidth: Double): Unit
end CanvasText
