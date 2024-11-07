package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineCap#value) */
type CanvasLineCap = "butt" | "round" | "square"

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineJoin#value) */
type CanvasLineJoin = "round" | "bevel" | "miter"

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D#line_styles) */
@js.native
private abstract trait CanvasLineStyles extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineWidth) */
  var lineWidth: Double

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineCap) */
  var lineCap: CanvasLineCap

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineJoin) */
  var lineJoin: CanvasLineJoin

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/miterLimit) */
  var miterLimit: Double

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineDashOffset) */
  var lineDashOffset: Double

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getLineDash)
    * unsigned long
    */
  def getLineDash(): js.Array[Double]

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/setLineDash) */
  def setLineDash(segments: js.Array[Double]): Unit
end CanvasLineStyles
