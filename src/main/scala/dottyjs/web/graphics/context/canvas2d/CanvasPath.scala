package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait CanvasPath extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/arc) */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double,
      endAngle: Double): Unit  = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/arc) */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double,
      endAngle: Double, counterclockwise: Boolean): Unit  = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/arcTo) */
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double,
      radius: Double): Unit  = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/bezierCurveTo) */
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double,
      x: Double, y: Double): Unit  = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/closePath) */
  def closePath(): Unit  = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/ellipse) */
  def ellipse(x: Double, y: Double, radiusX: Double, radiusY: Double,
      rotation: Double, startAngle: Double, endAngle: Double): Unit  = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/ellipse) */
  def ellipse(x: Double, y: Double, radiusX: Double, radiusY: Double,
      rotation: Double, startAngle: Double, endAngle: Double,
      counterclockwise: Boolean): Unit  = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineTo) */
  def lineTo(x: Double, y: Double): Unit  = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/moveTo) */
  def moveTo(x: Double, y: Double): Unit  = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/quadraticCurveTo) */
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit  = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/rect) */
  def rect(x: Double, y: Double, width: Double, height: Double): Unit  = js.native

  // TODO RADII
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/roundRect) */
  def roundRect(x: Double, y: Double, width: Double, height: Double,
      radii: js.Any): Unit = js.native
end CanvasPath
