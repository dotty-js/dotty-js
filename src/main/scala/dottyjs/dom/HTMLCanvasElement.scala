package dottyjs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Blob
import org.scalajs.dom.MediaStream

import dottyjs.web.graphics.canvas.OffscreenCanvas
import dottyjs.web.graphics.canvas.OffscreenCanvasProperties
import dottyjs.web.graphics.context.canvas2d.CanvasRenderingContext2D
import dottyjs.web.graphics.context.canvas2d.Canvas2dContext2DAttributes
import dottyjs.web.graphics.context.bitmap.ImageBitmapRenderingContext
import dottyjs.web.graphics.context.bitmap.ImageBitmapContextAttributes
import dottyjs.web.graphics.context.webgl.WebGLRenderingContext
import dottyjs.web.graphics.context.webgl.WebGLContextAttributes
import dottyjs.web.graphics.context.webgl2.WebGL2RenderingContext

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement#instance_properties) */
@js.native
private abstract trait HTMLCanvasElementProperties extends OffscreenCanvasProperties

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement#instance_methods) */
@js.native
private abstract trait HTMLCanvasElementMethods extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/captureStream) */
  def captureStream(): MediaStream = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/captureStream) */
  def captureStream(frameRequestRate: Double): MediaStream = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext) */
  def getContext(contextId: "2d"): CanvasRenderingContext2D | Null = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext) */
  def getContext(
      contextId: "2d", options: Canvas2dContext2DAttributes
  ): CanvasRenderingContext2D | Null = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext) */
  def getContext(contextId: "webgl"): WebGLRenderingContext | Null = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext) */
  def getContext(
      contextId: "webgl", options: WebGLContextAttributes
  ): WebGLRenderingContext | Null = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext) */
  def getContext(contextId: "webgl2"): WebGL2RenderingContext | Null

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext) */
  def getContext(
      contextId: "webgl2", options: WebGLContextAttributes
  ): WebGL2RenderingContext | Null

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext) */
  def getContext(contextId: "bitmaprenderer"): ImageBitmapRenderingContext |
    Null

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext) */
  def getContext(
      contextId: "bitmaprenderer", options: ImageBitmapContextAttributes
  ): ImageBitmapRenderingContext | Null

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/toDataURL) */
  def toDataURL(): String = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/toDataURL) */
  def toDataURL(`type`: String): String = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/toDataURL) */
  def toDataURL(
      `type`: String,
      /** Between 0 and 1 */
      quality: Double
  ): String = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toBlob) */
  def toBlob(callback: js.Function1[Blob | Null, Unit]): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toBlob) */
  def toBlob(
      callback: js.Function1[Blob | Null, Unit], `type`: String
  ): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toBlob) */
  def toBlob(
      callback: js.Function1[Blob | Null, Unit], `type`: String, quality: String
  ): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/transferControlToOffscreen) */
  def transferControlToOffscreen(): OffscreenCanvas = js.native
end HTMLCanvasElementMethods

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement#events) */
@js.native
private abstract trait HTMLCanvasElementEvents extends js.Object:
// TODO
end HTMLCanvasElementEvents

@js.native
@JSGlobal
/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement) */
abstract class HTMLCanvasElement
    extends HTMLElement with HTMLCanvasElementProperties
    with HTMLCanvasElementMethods with HTMLCanvasElementEvents
