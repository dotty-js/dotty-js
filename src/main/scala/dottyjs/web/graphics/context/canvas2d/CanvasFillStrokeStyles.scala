package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.CanvasGradient
import org.scalajs.dom.CanvasPattern

import dottyjs.dom.HTMLCanvasElement

// TODO CanvasGradient, CanvasPattern

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createPattern#repetition) */
type PatternRepeatMode = "repeat" | "repeat-x" | "repeat-y" | "no-repeat"

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D#text_styles) */
private abstract trait CanvasFillStrokeStyles extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fillStyle) */
  var fillStyle: String | CanvasGradient | CanvasPattern 

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/strokeStyle) */
  var strokeStyle: String | CanvasGradient | CanvasPattern 
end CanvasFillStrokeStyles
