package dottyjs.web.graphics.canvas

import scala.scalajs.js

// TODO make class
@js.native
/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/ImageData) */
trait ImageData extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/colorSpace) */
  val colorSpace: CanvasColorSpace

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/data) */
  val data: js.typedarray.Uint8ClampedArray

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/height) */
  val height: Int

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/width) */
  val width: Int
end ImageData

@js.native
/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createImageData#settings) */
trait ImageDataSettings extends js.Object:
  var colorSpace: js.UndefOr[CanvasColorSpace]
end ImageDataSettings