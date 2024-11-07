package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/direction#value) */
type CanvasDirection = "inherit" | "ltr" | "rtl"

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fontKerning#value) */
type CanvasFontKerning = "auto" | "none" | "normal"

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fontStretch#value) */
type CanvasFontStretch = "ultra-condensed" | "extra-condensed" | "condensed" |
  "semi-condensed" | "normal" | "semi-expanded" | "expanded" |
  "extra-expanded" | "ultra-expanded"

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fontVariantCaps#value) */
type CanvasFontVariantCaps = "normal" | "all-petite-caps" | "all-small-caps" |
  "petite-caps" | "small-caps" | "titling-caps" | "unicase"

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/textAlign#value) */
type CanvasTextAlign = "center" | "end" | "left" | "right" | "start"

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/textBaseline#value) */
type CanvasTextBaseline = "alphabetic" | "bottom" | "hanging" | "ideographic" |
  "middle" | "top"

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/textRendering#value) */
type CanvasTextRendering = "auto" | "geometricPrecision" |
  "optimizeLegibility" | "optimizeSpeed"

@js.native
trait CanvasTextDrawingStyles extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/direction) */
  var direction: CanvasDirection = js.native

  // TODO css type safe string https://developer.mozilla.org/en-US/docs/Web/CSS/font
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/font) */
  var font: String = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fontKerning) */
  var fontKerning: CanvasFontKerning = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fontStretch) */
  var fontStretch: CanvasFontStretch = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fontVariantCaps) */
  var fontVariantCaps: CanvasFontVariantCaps = js.native

  // TODO css type safe string https://developer.mozilla.org/en-US/docs/Web/CSS/length
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/letterSpacing) */
  var letterSpacing: String = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/textAlign) */
  var textAlign: CanvasTextAlign = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/textBaseline) */
  var textBaseline: CanvasTextBaseline = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/textRendering) */
  var textRendering: CanvasTextRendering = js.native

  // TODO css type safe string https://developer.mozilla.org/en-US/docs/Web/CSS/word-spacing
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/wordSpacing) */
  var wordSpacing: String = js.native
end CanvasTextDrawingStyles
