package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js

import dottyjs.web.graphics.canvas.ImageData
import dottyjs.web.graphics.canvas.ImageDataSettings

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
