package dottyjs.web.graphics.webgl

import scala.scalajs.js

import dottyjs.web.canvas.CanvasColorSpace

type WebGLPowerPreference = "default" | "high-performance" | "low-power"

trait WebGLRenderingContextAttributes extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext#alpha_2) */
  var alpha: js.UndefOr[Boolean] = js.undefined

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext#depth) */
  var depth: js.UndefOr[Boolean] = js.undefined

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext#stencil) */
  var stencil: js.UndefOr[Boolean] = js.undefined

  /** [MDN Reference]() */
  var desynchronized: js.UndefOr[Boolean] = js.undefined

  /** [MDN Reference]() */
  var antialias: js.UndefOr[Boolean] = js.undefined

  /** [MDN Reference]() */
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined

  /** [MDN Reference]() */
  var powerPreference: WebGLPowerPreference

  /** [MDN Reference]() */
  var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined

  /** [MDN Reference]() */
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined

  var xrCompatible: js.UndefOr[Boolean] = js.undefined
end WebGLRenderingContextAttributes
