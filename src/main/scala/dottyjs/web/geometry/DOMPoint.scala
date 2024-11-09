package dottyjs.web.geometry

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/fromPoint_static#sourcepoint) */
trait DOMPointInit extends js.Object:
  def x: js.UndefOr[Double] = js.undefined
  def y: js.UndefOr[Double] = js.undefined
  def z: js.UndefOr[Double] = js.undefined
  def w: js.UndefOr[Double] = js.undefined
end DOMPointInit

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint#instance_properties) */
private abstract trait DOMPointProperties extends js.Object:
  var x: Double
  var y: Double
  var z: Double
  var w: Double
end DOMPointProperties

type DOMPointArguments = DOMPointInit | DOMPointProperties

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly#instance_methods) */
@js.native
private abstract trait DOMPointMethods extends js.Object:
  /** MDN Reference TODO N/A*/
  def matrixTransform(matrix: DOMMatrixArguments): DOMPointMethods = js.native

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/toJSON) */
  def toJSON(): DOMPointProperties = js.native
end DOMPointMethods

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly) */
@js.native
@JSGlobal
class DOMPointReadOnly
    extends js.Object with DOMPointProperties with DOMPointMethods:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/DOMPointReadOnly) */
  def this(x: Double) = this()

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/DOMPointReadOnly) */
  def this(x: Double, y: Double) = this()

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/DOMPointReadOnly) */
  def this(x: Double, y: Double, z: Double) = this()

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/DOMPointReadOnly) */
  def this(x: Double, y: Double, z: Double, w: Double) = this()

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/x) */
  val x: Double = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/y) */
  val y: Double = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/z) */
  val z: Double = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/w) */
  val w: Double = js.native
end DOMPointReadOnly

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly#static_methods) */
@js.native
@JSGlobal
object DOMPointReadOnly extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/fromPoint_static) */
  def fromPoint(other: DOMPointArguments): DOMPoint = js.native
end DOMPointReadOnly

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint) */
@js.native
@JSGlobal
class DOMPoint extends js.Object with DOMPointProperties with DOMPointMethods:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/DOMPoint) */
  def this(x: Double) = this()

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/DOMPoint) */
  def this(x: Double, y: Double) = this()

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/DOMPoint) */
  def this(x: Double, y: Double, z: Double) = this()

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/DOMPoint) */
  def this(x: Double, y: Double, z: Double, w: Double) = this()

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/x) */
  var x: Double = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/y) */
  var y: Double = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/z) */
  var z: Double = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/w) */
  var w: Double = js.native
end DOMPoint

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint#static_methods) */
@js.native
@JSGlobal
object DOMPoint extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/fromPoint_static) */
  def fromPoint(other: DOMPointArguments): DOMPoint = js.native
end DOMPoint
