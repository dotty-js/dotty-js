package dottyjs.web.graphics.d2

import scala.scalajs.js

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D#the_canvas_state) */
private abstract trait CanvasState extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/reset) */
  def reset(): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/restore) */
  def restore(): Unit

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/save) */
  def save(): Unit

  /** https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext */
  def getContextAttributes(): CanvasRenderingContext2DAttributes

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isContextLost) */
  def isContextLost(): Boolean
end CanvasState
