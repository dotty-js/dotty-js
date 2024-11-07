package dottyjs.web.graphics.canvas

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas#instance_properties) */
@js.native
abstract trait OffscreenCanvasProperties extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/height)
    * Unnsigned
    */
  var height: Int = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/width)
    * Unnsigned
    */
  var width: Int = js.native
end OffscreenCanvasProperties

// TODO
/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas) */
type OffscreenCanvas = js.Object
