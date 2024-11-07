package dottyjs.web.graphics.d2

import scala.scalajs.js

type ImageSmoothingQuality = "high" | "low" | "medium"

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D#image_smoothing) */
private abstract trait CanvasImageSmoothing extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/imageSmoothingEnabled) */
  var imageSmoothingEnabled: Boolean

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/imageSmoothingQuality) */
  var imageSmoothingQuality: ImageSmoothingQuality
end CanvasImageSmoothing
