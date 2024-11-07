package dottyjs.web.graphics.canvas

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.typedarray.Uint8ClampedArray

@js.native
@JSGlobal
/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/ImageData) */
class ImageData extends js.Object:

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/ImageData/ImageData) */
  def this(width: Int, height: Int) = this()

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/ImageData/ImageData) */
  def this(width: Int, height: Int, settings: ImageDataSettings) = this()

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/ImageData/ImageData) */
  def this(data: Uint8ClampedArray, width: Int) = this()

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/ImageData/ImageData) */
  def this(data: Uint8ClampedArray, width: Int, height: Int) = this()

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/ImageData/ImageData) */
  def this(
      data: Uint8ClampedArray, width: Int, height: Int,
      settings: ImageDataSettings
  ) = this()

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/colorSpace) */
  val colorSpace: CanvasColorSpace = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/data) */
  val data: Uint8ClampedArray = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/height)
    * unsigned
    */
  val height: Int = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/width)
    * unsigned
    */
  val width: Int = js.native
end ImageData

@js.native
/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createImageData#settings) */
trait ImageDataSettings extends js.Object:
  var colorSpace: js.UndefOr[CanvasColorSpace]
end ImageDataSettings
