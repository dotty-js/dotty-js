package dottyjs.web.graphics.d2

import scala.scalajs.js
import scala.scalajs.js.annotation._

import dottyjs.web.geometry.DOMMatrix2DInit
import dottyjs.web.geometry.DOMMatrix2DProperties
import dottyjs.web.graphics.d2.CanvasPath

@js.native
@JSGlobal
/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Path2D) */
class Path2D extends js.Object with CanvasPath:

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Path2D/Path2D#path) */
  def this(path: Path2D) = this()

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Path2D/Path2D#d) */
  def this(d: String) = this()

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Path2D/addPath) */
  def addPath(path: Path2D): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Path2D/addPath) */
  def addPath(
      path: Path2D, transform: DOMMatrix2DInit | DOMMatrix2DProperties
  ): Unit = js.native
end Path2D
