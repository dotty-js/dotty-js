package org.dottyjs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import org.scalajs.dom.HTMLElement
import org.dottyjs.web.graphics.{
  CanvasRenderingContext2DSettings,
  CanvasRenderingContext2D
}

@js.native
@JSGlobal
abstract class HTMLCanvasElement extends HTMLElement {

  var width: Double = js.native

  var height: Double = js.native

  /** Returns an object that provides methods and properties for drawing and
    * manipulating images and graphics on a canvas element in a document. A
    * context object includes information about colors, line widths, fonts, and
    * other graphic parameters that can be drawn on a canvas.
    * @param contextId
    *   The identifier (ID) of the type of canvas to create. Internet Explorer 9
    *   and Internet Explorer 10 support only a 2-D context using
    *   canvas.getContext("2d") IE11 Preview also supports 3-D or WebGL context
    *   using canvas.getContext("experimental-webgl")
    *
    * [MDN
    * Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/getContext)
    */
  def getContext(
      contextId: "2d",
      options: js.UndefOr[CanvasRenderingContext2DSettings] = ()
  ): CanvasRenderingContext2D | Null =
    js.native

  // def getContext(
  //   contextId: "bitmaprenderer",
  //   options ?: ImageBitmapRenderingContextSettings
  // ): ImageBitmapRenderingContext | null

  // def getContext(
  //   contextId: "webgl",
  //   options ?: WebGLContextAttributes
  // ): WebGLRenderingContext | null

  // def getContext(
  //   contextId: "webgl2",
  //   options ?: WebGLContextAttributes
  // ): WebGL2RenderingContext | null

  // getContext(contextId: string, options ?: any): RenderingContext | null

  // ---------------

  def toDataURL(`type`: String, args: js.Any*): String = js.native

  // def getContext(contextId: "2d", args: js.Any*): CanvasRenderingContext2D =
  //   js.native

  // captureStream()
  // toBlob()
  // transferControlToOffscreen()
}
