package org.dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js
import scala.scalajs.js.annotation._
import org.dottyjs.web.graphics.context.canvas2d.CanvasPath
import org.dottyjs.web.geometry.DOMMatrix2DInit

@js.native
/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Path2D) */
trait Path2D extends CanvasPath:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Path2D/addPath) */
  def addPath(path: Path2D): Unit = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Path2D/addPath) */
  def addPath(path: Path2D, transform: DOMMatrix2DInit): Unit = js.native
end Path2D
