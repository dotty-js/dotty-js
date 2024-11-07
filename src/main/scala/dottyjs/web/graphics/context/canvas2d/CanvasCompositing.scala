package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/globalCompositeOperation#value) */
type GlobalCompositeOperation = "color" | "color-burn" | "color-dodge" |
  "copy" | "darken" | "destination-atop" | "destination-in" |
  "destination-out" | "destination-over" | "difference" | "exclusion" |
  "hard-light" | "hue" | "lighten" | "lighter" | "luminosity" | "multiply" |
  "overlay" | "saturation" | "screen" | "soft-light" | "source-atop" |
  "source-in" | "source-out" | "source-over" | "xor"

@js.native
trait CanvasCompositing extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/globalAlpha) */
  var globalAlpha: Double = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/globalCompositeOperation) */
  var globalCompositeOperation: GlobalCompositeOperation = js.native
end CanvasCompositing