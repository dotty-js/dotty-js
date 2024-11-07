package dottyjs.web.graphics.bitmap

import scala.scalajs.js
import org.scalajs.dom.ImageBitmap
import dottyjs.web.canvas.OffscreenCanvas
import dottyjs.dom.HTMLCanvasElement
import dottyjs.dom.HTMLCanvasElement

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext) */
abstract trait ImageBitmapRenderingContext extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext/canvas) */
  val canvas: HTMLCanvasElement | OffscreenCanvas

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext/transferFromImageBitmap) */
  def transferFromImageBitmap(bitmap: ImageBitmap): Unit
end ImageBitmapRenderingContext
