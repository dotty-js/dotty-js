package dottyjs.web.canvas

import scala.scalajs.js
import scala.scalajs.js.annotation._

import dottyjs.web.graphics.webgl.WebGLRenderingContext
import dottyjs.web.graphics.webgl.WebGLRenderingContextAttributes
import dottyjs.web.graphics.webgl2.WebGL2RenderingContext
import dottyjs.web.graphics.bitmap.ImageBitmapRenderingContext
import dottyjs.web.graphics.bitmap.ImageBitmapRenderingContextAttributes
import dottyjs.web.graphics.d2.OffscreenCanvasRenderingContext2D
import dottyjs.web.graphics.d2.CanvasRenderingContext2D
import dottyjs.web.graphics.d2.CanvasRenderingContext2DAttributes

type RenderingContext2D =
  (CanvasRenderingContext2D | OffscreenCanvasRenderingContext2D)

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
abstract trait CanvasContextMethods[T <: RenderingContext2D] extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
  def getContext(contextId: "2d"): T | Null

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
  def getContext(
      contextId: "2d", options: CanvasRenderingContext2DAttributes
  ): T | Null

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
  def getContext(contextId: "webgl"): WebGLRenderingContext | Null

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
  def getContext(
      contextId: "webgl", options: WebGLRenderingContextAttributes
  ): WebGLRenderingContext | Null

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
  def getContext(contextId: "webgl2"): WebGL2RenderingContext | Null

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
  def getContext(
      contextId: "webgl2", options: WebGLRenderingContextAttributes
  ): WebGL2RenderingContext | Null

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
  def getContext(contextId: "bitmaprenderer"): ImageBitmapRenderingContext |
    Null

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
  def getContext(
      contextId: "bitmaprenderer",
      options: ImageBitmapRenderingContextAttributes
  ): ImageBitmapRenderingContext | Null
end CanvasContextMethods
