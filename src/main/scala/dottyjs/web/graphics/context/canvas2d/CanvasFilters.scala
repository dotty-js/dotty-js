package dottyjs.web.graphics.context.canvas2d

import scala.scalajs.js

// TODO - typesafe string filter builder

@js.native
private abstract trait CanvasFilters extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/filter) */
  var filter: String = js.native
end CanvasFilters
