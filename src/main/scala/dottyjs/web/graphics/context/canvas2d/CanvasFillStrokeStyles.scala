package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import scala.scalajs.js.annotation._

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.CanvasGradient
import org.scalajs.dom.CanvasPattern

import dottyjs.dom.HTMLCanvasElement

// TODO planaro CanvasGradient, CanvasPattern

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createPattern#repetition) */
type PatternRepeatMode = "repeat" | "repeat-x" | "repeat-y" | "no-repeat"

@js.native
trait CanvasFillStrokeStyles extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fillStyle) */
  var fillStyle: String | CanvasGradient | CanvasPattern = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/strokeStyle) */
  var strokeStyle: String | CanvasGradient | CanvasPattern = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createConicGradient) */
  def createConicGradient(startAngle: Double, x: Double,
      y: Double): CanvasGradient = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createLinearGradient) */
  def createLinearGradient(x0: Double, y0: Double, x1: Double,
      y1: Double): CanvasGradient = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createPattern) */
  def createPattern(image: CanvasImageSource,
      repetition: PatternRepeatMode | Null): CanvasPattern | Null = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createRadialGradient) */
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double,
      y1: Double, r1: Double): CanvasGradient = js.native
end CanvasFillStrokeStyles