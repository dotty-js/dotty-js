package dottyjs.web.graphics.canvas

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

import org.scalajs.dom.Blob
import dottyjs.web.graphics.context.canvas2d.OffscreenCanvasRenderingContext2D

trait ImageEncodeOptions extends js.Object:
  var quality: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
end ImageEncodeOptions

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas#instance_properties) */
@js.native
abstract trait OffscreenCanvasProperties extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/height)
    * Unnsigned
    */
  var height: Int = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/width)
    * Unnsigned
    */
  var width: Int = js.native
end OffscreenCanvasProperties

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas#instance_methods) */
@js.native
private abstract trait OffscreenCanvasMethods
    extends js.Object with CanvasContextMethods[OffscreenCanvasRenderingContext2D]:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/convertToBlob) */
  def convertToBlob(options: ImageEncodeOptions): js.Promise[Blob]

  /* [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/transferToImageBitmap) */
  def transferToImageBitmap(): ImageBitmap
end OffscreenCanvasMethods

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas#events) */
private abstract trait OffscreenCanvasEvents:
  // TODO
end OffscreenCanvasEvents

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas) */
@js.native
@JSGlobal
/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/ImageData) */
class OffscreenCanvas extends js.Object with OffscreenCanvasProperties
