package org.dottyjs.web.graphics

import scala.scalajs.js
import scala.scalajs.js.annotation._
import org.scalajs.dom.CanvasFillRule
import org.scalajs.dom.Path2D

// TODO - typesafe string filter builder

@js.native
trait CanvasFilters extends js.Object:
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/filter) */
    var filter: String
end CanvasFilters
