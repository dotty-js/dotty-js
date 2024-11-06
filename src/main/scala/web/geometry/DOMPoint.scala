package web.geometry

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait DOMPointInit extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/x) */
  def x: js.UndefOr[Double]

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/y) */
  def y: js.UndefOr[Double]

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/z) */
  def z: js.UndefOr[Double]

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/w) */
  def w: js.UndefOr[Double]
end DOMPointInit

@js.native
@JSGlobal
// Avoid trait to prevent accidental instantiation
abstract class DOMPoint extends DOMPointInit:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/toJSON) */
  def toJSON(): js.Object = js.native
end DOMPoint

@js.native
@JSGlobal
object DOMPoint extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/fromPoint_static) */
  def fromPoint(other: DOMPointInit): DOMPointMutable = js.native
end DOMPoint

@js.native
@JSGlobal
/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly) */
class DOMPointReadOnly extends DOMPoint:
  // intentionally excluded new DOMPoint(x) constructor

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/DOMPoint) */
  def this(x: Double, y: Double) = this()

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/DOMPoint) */
  def this(x: Double, y: Double, z: Double) = this()

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/DOMPoint) */
  def this(x: Double, y: Double, z: Double, w: Double) = this()

  val x: Double = js.native
  val y: Double = js.native
  val z: Double = js.native
  val w: Double = js.native
end DOMPointReadOnly

@js.native
@JSGlobal("DOMPoint")
/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint) */
class DOMPointMutable extends DOMPoint:
  // intentionally excluded new DOMPoint(x) constructor

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/DOMPoint) */
  def this(x: Double, y: Double) = this()

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/DOMPoint) */
  def this(x: Double, y: Double, z: Double) = this()

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/DOMPoint) */
  def this(x: Double, y: Double, z: Double, w: Double) = this()

  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  var w: Double = js.native
end DOMPointMutable
