package dottyjs.web.graphics.d2

import scala.scalajs.js

import dottyjs.web.canvas.ImageData
import dottyjs.web.canvas.ImageDataSettings

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D#pixel_manipulation) */
private abstract trait CanvasImageData extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createImageData) */
  def createImageData(width: Double, height: Double): ImageData 

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createImageData) */
  def createImageData(
      width: Double, height: Double, settings: ImageDataSettings
  ): ImageData 

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createImageData) */
  def createImageData(imagedata: ImageData): ImageData 

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getImageData) */
  def getImageData(
      sx: Double, sy: Double, sw: Double, sh: Double
  ): ImageData 

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getImageData) */
  def getImageData(
      sx: Double, sy: Double, sw: Double, sh: Double,
      settings: ImageDataSettings
  ): ImageData 

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/putImageData) */
  def putImageData(
      imagedata: ImageData, dx: Double, dy: Double
  ): Unit 

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/putImageData) */
  def putImageData(
      imagedata: ImageData, dx: Double, dy: Double, dirtyX: Double,
      dirtyY: Double, dirtyWidth: Double, dirtyHeight: Double
  ): Unit 
end CanvasImageData
