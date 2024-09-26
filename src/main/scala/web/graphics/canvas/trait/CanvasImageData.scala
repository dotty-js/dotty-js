package org.dottyjs.web.graphics

import scala.scalajs.js
import scala.scalajs.js.annotation._
import org.dottyjs.web.Image.ImageData
import org.dottyjs.web.Image.ImageDataSettings

@js.native
trait CanvasImageData extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createImageData) */
  def createImageData(width: Double, height: Double): ImageData

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createImageData) */
  def createImageData(width: Double, height: Double,
      settings: ImageDataSettings): ImageData

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createImageData) */
  def createImageData(imagedata: ImageData): ImageData

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getImageData) */
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ImageData;

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getImageData) */
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double,
      settings: ImageDataSettings): ImageData;

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/putImageData) */
  def putImageData(imagedata: ImageData, dx: Double, dy: Double): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/putImageData) */
  def putImageData(imagedata: ImageData, dx: Double, dy: Double, dirtyX: Double,
      dirtyY: Double, dirtyWidth: Double, dirtyHeight: Double): Unit
end CanvasImageData
