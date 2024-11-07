package dottyjs.web.graphics.canvas

import scala.scalajs.js
import scala.scalajs.js.annotation._
import dottyjs.web.graphics.context.canvas2d.CanvasRenderingContext2D
import dottyjs.web.graphics.context.canvas2d.CanvasRenderingContext2DAttributes
import dottyjs.web.graphics.context.webgl.WebGLRenderingContext
import dottyjs.web.graphics.context.webgl.WebGLContextAttributes
import dottyjs.web.graphics.context.webgl2.WebGL2RenderingContext
import dottyjs.web.graphics.context.bitmap.ImageBitmapRenderingContext
import dottyjs.web.graphics.context.bitmap.ImageBitmapContextAttributes

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
@js.native
abstract trait CanvasContextMethods extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
  def getContext(contextId: "2d"): CanvasRenderingContext2D | Null = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
  def getContext(
      contextId: "2d", options: CanvasRenderingContext2DAttributes
  ): CanvasRenderingContext2D | Null = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
  def getContext(contextId: "webgl"): WebGLRenderingContext | Null = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
  def getContext(
      contextId: "webgl", options: WebGLContextAttributes
  ): WebGLRenderingContext | Null = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
  def getContext(contextId: "webgl2"): WebGL2RenderingContext | Null

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
  def getContext(
      contextId: "webgl2", options: WebGLContextAttributes
  ): WebGL2RenderingContext | Null

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
  def getContext(contextId: "bitmaprenderer"): ImageBitmapRenderingContext |
    Null

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext) */
  def getContext(
      contextId: "bitmaprenderer", options: ImageBitmapContextAttributes
  ): ImageBitmapRenderingContext | Null
end CanvasContextMethods