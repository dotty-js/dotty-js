package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.ImageBitmap

import dottyjs.dom.HTMLCanvasElement

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage#image) */
type CanvasImageSource = HTMLElement | HTMLImageElement | HTMLVideoElement |
  HTMLCanvasElement | ImageBitmap

// CanvasImageSource TODO add SVGImageElement, VideoFrame

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D#drawing_images) */
private abstract trait CanvasImageDraw extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawImage) */
  def drawImage(image: CanvasImageSource, dx: Double, dy: Double): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawImage) */
  def drawImage(
      image: CanvasImageSource, dx: Double, dy: Double, dw: Double, dh: Double
  ): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawImage) */
  def drawImage(
      image: CanvasImageSource, sx: Double, sy: Double, sw: Double, sh: Double,
      dx: Double, dy: Double, dw: Double, dh: Double
  ): Unit
end CanvasImageDraw
