package dottyjs.web.graphics.canvas

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmap#instance_properties) */
@js.native
private abstract trait ImageBitmapProperties extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmap/height) */
  val height: Int = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmap/width) */
  val width: Int = js.native
end ImageBitmapProperties

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmap#instance_methods) */
@js.native
private abstract trait ImageBitmapMethods extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmap/close) */
  def close(): Unit = js.native
end ImageBitmapMethods

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/ImageData) */
@js.native
@JSGlobal
class ImageBitmap
    extends js.Object with ImageBitmapProperties with ImageBitmapMethods
