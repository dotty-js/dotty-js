package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D#shadows) */
private abstract trait CanvasShadow extends js.Object:
  // TODO investigate natural double type
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowBlur) */
  def shadowBlur: Double

  // TODO CSS typeSafe string https://developer.mozilla.org/en-US/docs/Web/CSS/color_value
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowColor) */
  def shadowColor: String

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowOffsetX) */
  def shadowOffsetX: Double

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowOffsetY) */
  def shadowOffsetY: Double
end CanvasShadow
