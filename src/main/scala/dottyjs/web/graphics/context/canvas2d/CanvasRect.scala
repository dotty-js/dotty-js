package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D#drawing_rectangles) */
private abstract trait CanvasRect extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/clearRect) */
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fillRect) */
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/strokeRect) */
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit
end CanvasRect
