package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait CanvasShadowStyles extends js.Object:
  // TODO investigate natural double type
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowBlur) */
  def shadowBlur: Double = js.native

  // TODO CSS typeSafe string https://developer.mozilla.org/en-US/docs/Web/CSS/color_value
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowColor) */
  def shadowColor: String = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowOffsetX) */
  def shadowOffsetX: Double = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowOffsetY) */
  def shadowOffsetY: Double = js.native
end CanvasShadowStyles