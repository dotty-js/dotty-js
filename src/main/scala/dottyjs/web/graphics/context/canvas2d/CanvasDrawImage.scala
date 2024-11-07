package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import scala.scalajs.js.annotation._

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.ImageBitmap

import dottyjs.dom.HTMLCanvasElement
import dottyjs.dom.HTMLCanvasElement

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage#image) */
type CanvasImageSource =
  HTMLElement | HTMLImageElement | HTMLVideoElement | HTMLCanvasElement |
    ImageBitmap

// CanvasImageSource TODO add SVGImageElement, VideoFrame
@js.native
trait CanvasDrawImage extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawImage) */
  def drawImage(image: CanvasImageSource, dx: Double,
      dy: Double): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawImage) */
  def drawImage(
      image: CanvasImageSource, dx: Double, dy: Double, dw: Double, dh: Double
  ): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawImage) */
  def drawImage(
      image: CanvasImageSource, sx: Double, sy: Double, sw: Double, sh: Double,
      dx: Double, dy: Double, dw: Double, dh: Double
  ): Unit = js.native
end CanvasDrawImage
