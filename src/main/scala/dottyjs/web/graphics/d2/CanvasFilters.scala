package dottyjs.web.graphics.d2

import scala.scalajs.js

// TODO - typesafe string filter builder

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D#filters) */
private abstract trait CanvasFilters extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/filter) */
  var filter: String
end CanvasFilters
