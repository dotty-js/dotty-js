package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics) */
class TextMetrics extends js.Object {

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/width) */
  val width: Double = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/actualBoundingBoxAscent) */
  val actualBoundingBoxAscent: Int = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/actualBoundingBoxDescent) */
  var actualBoundingBoxDescent: Int = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/actualBoundingBoxLeft) */
  var actualBoundingBoxLeft: Int = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/actualBoundingBoxRight) */
  var actualBoundingBoxRight: Int = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/alphabeticBaseline) */
  var alphabeticBaseline: Int = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/fontBoundingBoxAscent) */
  var fontBoundingBoxAscent: Int = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/fontBoundingBoxDescent) */
  var fontBoundingBoxDescent: Int = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/hangingBaseline) */
  var hangingBaseline: Int = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/ideographicBaseline) */
  var ideographicBaseline: Int = js.native
}
