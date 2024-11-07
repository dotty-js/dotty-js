package dottyjs.web.graphics.d2

import scala.scalajs.js
import scala.scalajs.js.annotation._
import dottyjs.web.canvas.CanvasColorSpace

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext#contextattributes) */
trait CanvasRenderingContext2DAttributes extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext#alpha) */
  var alpha: js.UndefOr[Boolean] = js.undefined

  /** [MDN Reference]https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext#colorspace */
  var colorSpace: js.UndefOr[CanvasColorSpace] = js.undefined

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext#desynchronized) */
  var desynchronized: js.UndefOr[Boolean] = js.undefined

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext#willreadfrequently) */
  var willReadFrequently: js.UndefOr[Boolean] = js.undefined
end CanvasRenderingContext2DAttributes
