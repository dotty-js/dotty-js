package org.dottyjs.web.graphics

import scala.scalajs.js
import scala.scalajs.js.annotation._
import org.dottyjs.web.graphics.PredefinedColorSpace

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext#contextattributes) */
trait CanvasRenderingContext2DSettings extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext#alpha) */
  var alpha: js.UndefOr[Boolean] = js.undefined

  /** [MDN Reference]https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext#colorspace */
  var colorSpace: js.UndefOr[PredefinedColorSpace] = js.undefined

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext#desynchronized) */
  var desynchronized: js.UndefOr[Boolean] = js.undefined

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext#willreadfrequently) */
  var willReadFrequently: js.UndefOr[Boolean] = js.undefined
end CanvasRenderingContext2DSettings
