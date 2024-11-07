package dottyjs.web.graphics.d2

import scala.scalajs.js

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/globalCompositeOperation#value) */
type GlobalCompositeOperation = "color" | "color-burn" | "color-dodge" |
  "copy" | "darken" | "destination-atop" | "destination-in" |
  "destination-out" | "destination-over" | "difference" | "exclusion" |
  "hard-light" | "hue" | "lighten" | "lighter" | "luminosity" | "multiply" |
  "overlay" | "saturation" | "screen" | "soft-light" | "source-atop" |
  "source-in" | "source-out" | "source-over" | "xor"

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D#compositing) */
private abstract trait CanvasCompositing extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/globalAlpha) */
  var globalAlpha: Double

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/globalCompositeOperation) */
  var globalCompositeOperation: GlobalCompositeOperation
end CanvasCompositing
