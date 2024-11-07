package dottyjs.web.graphics.context.bitmap

import scala.scalajs.js
import org.scalajs.dom.ImageBitmap
import dottyjs.web.graphics.canvas.OffscreenCanvas
import dottyjs.web.graphics.context.canvas2d.GlobalCompositeOperation
import dottyjs.dom.HTMLCanvasElement
import dottyjs.dom.HTMLCanvasElement

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext) */
@js.native
trait ImageBitmapRenderingContext extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext/canvas) */
  val canvas: HTMLCanvasElement | OffscreenCanvas = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext/transferFromImageBitmap) */
  def transferFromImageBitmap(bitmap: ImageBitmap): Unit = js.native
end ImageBitmapRenderingContext
