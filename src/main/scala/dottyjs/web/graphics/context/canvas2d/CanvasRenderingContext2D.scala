package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import scala.scalajs.js.annotation._

import dottyjs.dom.HTMLCanvasElement
import dottyjs.web.graphics.context.canvas2d.CanvasCompositing
import dottyjs.web.graphics.context.canvas2d.CanvasDrawImage
import dottyjs.web.graphics.context.canvas2d.CanvasDrawPath
import dottyjs.web.graphics.context.canvas2d.CanvasFillStrokeStyles
import dottyjs.web.graphics.context.canvas2d.CanvasFilters
import dottyjs.web.graphics.context.canvas2d.CanvasImageData
import dottyjs.web.graphics.context.canvas2d.CanvasImageSmoothing
import dottyjs.web.graphics.context.canvas2d.CanvasPath
import dottyjs.web.graphics.context.canvas2d.Canvas2dContext2DAttributes
import dottyjs.dom.HTMLCanvasElement

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D) */
@js.native
trait CanvasRenderingContext2D
    extends js.Object, CanvasCompositing, CanvasDrawImage, CanvasDrawPath,
      CanvasFillStrokeStyles, CanvasFilters, CanvasImageData,
      CanvasImageSmoothing, CanvasPath, CanvasPathDrawingStyles, CanvasRect,
      CanvasShadowStyles, CanvasState, CanvasText, CanvasTextDrawingStyles,
      CanvasTransform, CanvasUserInterface {

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/canvas) */
  val canvas: HTMLCanvasElement | Null = js.native

  def getContextAttributes(): Canvas2dContext2DAttributes = js.native
}
