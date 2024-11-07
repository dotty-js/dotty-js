package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import scala.scalajs.js.annotation._

// ** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineCap#value) */
type CanvasLineCap = "butt" | "round" | "square"

// ** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineJoin#value) */
type CanvasLineJoin = "round" | "bevel" | "miter"

@js.native
trait CanvasPathDrawingStyles extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineCap) */
  var lineCap: CanvasLineCap

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineDashOffset) */
  var lineDashOffset: Double

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineJoin) */
  var lineJoin: CanvasLineJoin

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineWidth) */
  var lineWidth: Double

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/miterLimit) */
  var miterLimit: Double

  // TODO check if this preserves floats, not specified on MDN, jsDom used Double
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getLineDash) */
  def getLineDash(): js.Array[Double]

  // TODO check if this preserves floats, not specified on MDN, jsDom used Double
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/setLineDash) */
  def setLineDash(segments: js.Array[Double]): Unit
end CanvasPathDrawingStyles
