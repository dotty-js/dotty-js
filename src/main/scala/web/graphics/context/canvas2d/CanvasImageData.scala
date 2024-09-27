package org.dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import scala.scalajs.js.annotation._
import org.dottyjs.web.graphics.canvas.ImageData
import org.dottyjs.web.graphics.canvas.ImageDataSettings

@js.native
trait CanvasImageData extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createImageData) */
  def createImageData(width: Double, height: Double): ImageData = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createImageData) */
  def createImageData(width: Double, height: Double,
      settings: ImageDataSettings): ImageData = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createImageData) */
  def createImageData(imagedata: ImageData): ImageData = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getImageData) */
  def getImageData(sx: Double, sy: Double, sw: Double,
      sh: Double): ImageData = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getImageData) */
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double,
      settings: ImageDataSettings): ImageData = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/putImageData) */
  def putImageData(imagedata: ImageData, dx: Double,
      dy: Double): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/putImageData) */
  def putImageData(imagedata: ImageData, dx: Double, dy: Double, dirtyX: Double,
      dirtyY: Double, dirtyWidth: Double, dirtyHeight: Double): Unit = js.native
end CanvasImageData
