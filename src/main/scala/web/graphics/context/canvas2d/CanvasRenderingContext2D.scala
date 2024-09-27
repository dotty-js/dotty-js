package org.dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import scala.scalajs.js.annotation._
import org.scalajs.dom.{HTMLElement, CanvasFillRule}
import org.scalajs.dom.CanvasGradient
import org.scalajs.dom.CanvasPattern
import org.scalajs.dom.Path2D
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.ImageBitmap

import org.dottyjs.dom.HTMLCanvasElement
import org.dottyjs.web.graphics.context.canvas2d.CanvasCompositing
import org.dottyjs.web.graphics.context.canvas2d.CanvasDrawImage
import org.dottyjs.web.graphics.context.canvas2d.CanvasDrawPath
import org.dottyjs.web.graphics.context.canvas2d.CanvasFillStrokeStyles
import org.dottyjs.web.graphics.context.canvas2d.CanvasFilters
import org.dottyjs.web.graphics.context.canvas2d.CanvasImageData
import org.dottyjs.web.graphics.context.canvas2d.CanvasImageSmoothing
import org.dottyjs.web.graphics.context.canvas2d.CanvasPath
import org.dottyjs.web.graphics.context.canvas2d.Canvas2dContext2DAttributes

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
