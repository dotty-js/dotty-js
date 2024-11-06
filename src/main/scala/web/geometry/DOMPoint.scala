package web.geometry

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/fromPoint_static#sourcepoint) */
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

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/toJSON#return_value) */
@js.native
trait DOMPointJSON extends js.Object:
  def x: Double

  def y: Double

  def z: Double

  def w: Double
end DOMPointJSON

@js.native
@JSGlobal
// Avoid trait to prevent accidental instantiation
abstract class DOMPoint extends DOMPointJSON:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/toJSON) */
  def toJSON(): DOMPointJSON = js.native
end DOMPoint

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly) */
@js.native
@JSGlobal
class DOMPointReadOnly extends DOMPoint:
  // intentionally excluded new DOMPointReadOnly(x) constructor

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
@JSGlobal
object DOMPointReadOnly extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/fromPoint_static) */
  def fromPoint(other: DOMPointInit): DOMPointMutable = js.native
end DOMPointReadOnly

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint) */
@js.native
@JSGlobal("DOMPoint")
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

@js.native
@JSGlobal
object DOMPointMutable extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/fromPoint_static) */
  def fromPoint(other: DOMPointInit): DOMPointMutable = js.native
end DOMPointMutable
