package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js

import dottyjs.dom.HTMLCanvasElement

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D) */
@js.native
abstract trait CanvasRenderingContext2D
    extends js.Object with CanvasRect with CanvasLineStyles with CanvasText
    with CanvasTextStyles with CanvasFillStrokeStyles
    with CanvasGradientPatterns with CanvasShadow with CanvasPath
    with CanvasPathDraw with CanvasTransform with CanvasCompositing
    with CanvasImageDraw with CanvasImageData with CanvasImageSmoothing
    with CanvasState with CanvasFilters with CanvasUserInterface:

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/canvas) */
  val canvas: HTMLCanvasElement | Null
end CanvasRenderingContext2D
