package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import scala.scalajs.js.annotation._

type ImageSmoothingQuality = "high" | "low" | "medium";

@js.native
trait CanvasImageSmoothing extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/imageSmoothingEnabled) */
  var imageSmoothingEnabled: Boolean = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/imageSmoothingQuality) */
  var imageSmoothingQuality: ImageSmoothingQuality = js.native
end CanvasImageSmoothing
