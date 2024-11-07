package dottyjs.web.graphics.d2

import scala.scalajs.js

import dottyjs.web.canvas.OffscreenCanvas

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvasRenderingContext2D) */
@js.native
abstract trait OffscreenCanvasRenderingContext2D
    extends js.Object with CanvasRect with CanvasLineStyles with CanvasText
    with CanvasTextStyles with CanvasFillStrokeStyles
    with CanvasGradientPatterns with CanvasShadow with CanvasPath
    with CanvasPathDraw with CanvasTransform with CanvasCompositing
    with CanvasImageDraw with CanvasImageData with CanvasImageSmoothing
    with CanvasState with CanvasFilters:

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvasRenderingContext2D) */
  val canvas: OffscreenCanvas | Null
end OffscreenCanvasRenderingContext2D
