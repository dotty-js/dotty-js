package org.dottyjs.web.Image

import scala.scalajs.js
import scala.scalajs.js.annotation._
import org.dottyjs.web.graphics.PredefinedColorSpace

@js.native
/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/ImageData) */
trait ImageData extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/colorSpace) */
  val colorSpace: PredefinedColorSpace

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
  var colorSpace: js.UndefOr[PredefinedColorSpace]
end ImageDataSettings