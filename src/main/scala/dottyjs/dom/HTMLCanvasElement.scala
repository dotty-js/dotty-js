package dottyjs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Blob
import org.scalajs.dom.MediaStream

import dottyjs.web.canvas.OffscreenCanvas
import dottyjs.web.canvas.OffscreenCanvasProperties
import dottyjs.web.canvas.CanvasContextMethods
import dottyjs.web.graphics.d2.CanvasRenderingContext2D

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement#instance_properties) */
private abstract trait HTMLCanvasElementProperties extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/height)
    * Unnsigned
    */
  var height: Int

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/height)
    * Unnsigned
    */
  var width: Int
end HTMLCanvasElementProperties

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement#instance_methods) */
private abstract trait HTMLCanvasElementMethods
    extends js.Object with CanvasContextMethods[CanvasRenderingContext2D]:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/captureStream) */
  def captureStream(): MediaStream

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/captureStream) */
  def captureStream(frameRequestRate: Double): MediaStream

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/toDataURL) */
  def toDataURL(): String

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/toDataURL) */
  def toDataURL(`type`: String): String

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/toDataURL) */
  def toDataURL(
      `type`: String,
      /** Between 0 and 1 */
      quality: Double
  ): String

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toBlob) */
  def toBlob(callback: js.Function1[Blob | Null, Unit]): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toBlob) */
  def toBlob(callback: js.Function1[Blob | Null, Unit], `type`: String): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toBlob) */
  def toBlob(
      callback: js.Function1[Blob | Null, Unit], `type`: String, quality: String
  ): Unit

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/transferControlToOffscreen) */
  def transferControlToOffscreen(): OffscreenCanvas
end HTMLCanvasElementMethods

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement#events) */
private abstract trait HTMLCanvasElementEvents extends js.Object:
// TODO
end HTMLCanvasElementEvents

// HTML elements should be abstract as they are created by `document.createElement` factory
@js.native
@JSGlobal
/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement) */
abstract class HTMLCanvasElement
    extends HTMLElement with HTMLCanvasElementProperties
    with HTMLCanvasElementMethods with HTMLCanvasElementEvents
