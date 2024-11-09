package dottyjs.web.geometry

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{Float32Array, Float64Array}

// TODO, derive from DOMMatrix2DProperties like Partial<DOMMatrix2DProperties>
trait DOMMatrix2DInit extends js.Object:
  var a: js.UndefOr[Double] = js.undefined
  var b: js.UndefOr[Double] = js.undefined
  var c: js.UndefOr[Double] = js.undefined
  var d: js.UndefOr[Double] = js.undefined
  var e: js.UndefOr[Double] = js.undefined
  var f: js.UndefOr[Double] = js.undefined
  var m11: js.UndefOr[Double] = js.undefined
  var m12: js.UndefOr[Double] = js.undefined
  var m21: js.UndefOr[Double] = js.undefined
  var m22: js.UndefOr[Double] = js.undefined
  var m41: js.UndefOr[Double] = js.undefined
  var m42: js.UndefOr[Double] = js.undefined
end DOMMatrix2DInit

// TODO, derive from DOMMatrixProperties like Partial<DOMMatrixProperties>
trait DOMMatrixInit extends js.Object with DOMMatrix2DInit:
  var is2D: js.UndefOr[Boolean] = js.undefined
  var m13: js.UndefOr[Double] = js.undefined
  var m14: js.UndefOr[Double] = js.undefined
  var m23: js.UndefOr[Double] = js.undefined
  var m24: js.UndefOr[Double] = js.undefined
  var m31: js.UndefOr[Double] = js.undefined
  var m32: js.UndefOr[Double] = js.undefined
  var m33: js.UndefOr[Double] = js.undefined
  var m34: js.UndefOr[Double] = js.undefined
  var m43: js.UndefOr[Double] = js.undefined
  var m44: js.UndefOr[Double] = js.undefined
end DOMMatrixInit

abstract trait DOMMatrix2DProperties extends js.Object:
  var a: Double
  var b: Double
  var c: Double
  var d: Double
  var e: Double
  var f: Double

  var m11: Double
  var m12: Double

  var m21: Double
  var m22: Double

  var m41: Double
  var m42: Double
end DOMMatrix2DProperties

type DOMMatrix2DArguments = DOMMatrix2DInit | DOMMatrix2DProperties

/* [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix#instance_properties) */
abstract trait DOMMatrixProperties extends js.Object with DOMMatrix2DProperties:
  var is2D: Boolean

  // TODO check if this is computed or manual
  var isIdentity: Boolean

  var m13: Double
  var m14: Double

  var m23: Double
  var m24: Double

  var m31: Double
  var m32: Double

  var m33: Double
  var m34: Double

  var m43: Double
  var m44: Double
end DOMMatrixProperties

type DOMMatrixArguments = DOMMatrixInit | DOMMatrixProperties

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly#instance_methods) */
@js.native
abstract trait DOMMatrixReadOnlyMethods extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/flipX) */
  def flipX(): DOMMatrix = js.native
  def flipY(): DOMMatrix = js.native
  def inverse(): DOMMatrix = js.native
  def multiply(
      other: DOMMatrixArguments
  ): DOMMatrix = js.native
  def rotate(rotX: Double): DOMMatrix = js.native
  def rotate(rotX: Double, rotY: Double): DOMMatrix = js.native
  def rotate(rotX: Double, rotY: Double, rotZ: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double, y: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double, y: Double, z: Double): DOMMatrix = js.native
  def rotateAxisAngle(
      x: Double, y: Double, z: Double, angle: Double
  ): DOMMatrix = js.native
  def rotateFromVector(x: Double): DOMMatrix = js.native
  def rotateFromVector(x: Double, y: Double): DOMMatrix = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/scale) */
  def scale(scaleX: Double): DOMMatrix = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/scale) */
  def scale(scaleX: Double, scaleY: Double): DOMMatrix = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/scale) */
  def scale(
      scaleX: Double, scaleY: Double, scaleZ: Double
  ): DOMMatrix = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/scale) */
  def scale(
      scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double
  ): DOMMatrix = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/scale) */
  def scale(
      scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double,
      originY: Double
  ): DOMMatrix = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/scale) */
  def scale(
      scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double,
      originY: Double, originZ: Double
  ): DOMMatrix = js.native

  def scale3d(scale: Double): DOMMatrix = js.native
  def scale3d(scale: Double, originX: Double): DOMMatrix = js.native
  def scale3d(
      scale: Double, originX: Double, originY: Double
  ): DOMMatrix = js.native
  def scale3d(
      scale: Double, originX: Double, originY: Double, originZ: Double
  ): DOMMatrix = js.native

  def skewX(sx: Double): DOMMatrix = js.native
  def skewY(sy: Double): DOMMatrix = js.native

  def toFloat32Array(): Float32Array = js.native
  def toFloat64Array(): Float64Array = js.native

  def toJSON(): DOMMatrixProperties = js.native

  def transformPoint(point: DOMPointArguments): DOMPoint = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/translate) */
  def translate(tx: Double, ty: Double): DOMMatrix = js.native
  def translate(tx: Double, ty: Double, tz: Double): DOMMatrix = js.native
end DOMMatrixReadOnlyMethods

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly#static_methods) */
@js.native
@JSGlobal
object DOMMatrixReadOnly extends js.Object:
  def fromFloat32Array(array32: Float32Array): DOMMatrixReadOnly = js.native
  def fromFloat64Array(array64: Float64Array): DOMMatrixReadOnly = js.native
  def fromMatrix(other: DOMMatrixArguments): DOMMatrixReadOnly = js.native
end DOMMatrixReadOnly

@js.native
@JSGlobal
class DOMMatrixReadOnly
    extends js.Object with DOMMatrixProperties with DOMMatrixReadOnlyMethods:
  // TODO css transform string or 6 | 16 tuple
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly/DOMMatrixReadOnly) */
  def this(init: js.Array[Double] | String) = this()

  val is2D: Boolean = js.native

  val isIdentity: Boolean = js.native

  val a: Double = js.native
  val b: Double = js.native
  val c: Double = js.native
  val d: Double = js.native
  val e: Double = js.native
  val f: Double = js.native

  val m11: Double = js.native
  val m12: Double = js.native
  val m13: Double = js.native
  val m14: Double = js.native
  val m21: Double = js.native
  val m22: Double = js.native
  val m23: Double = js.native
  val m24: Double = js.native
  val m31: Double = js.native
  val m32: Double = js.native
  val m33: Double = js.native
  val m34: Double = js.native
  val m41: Double = js.native
  val m42: Double = js.native
  val m43: Double = js.native
  val m44: Double = js.native
end DOMMatrixReadOnly

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix#instance_methods) */
@js.native
abstract trait DOMMatrixMethods extends js.Object with DOMMatrixReadOnlyMethods:
  def invertSelf(): DOMMatrix = js.native
  def multiplySelf(other: DOMMatrixArguments): DOMMatrix = js.native
  def preMultiplySelf(other: DOMMatrixArguments): DOMMatrix = js.native

  def rotateAxisAngleSelf(x: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(
      x: Double, y: Double, z: Double
  ): DOMMatrix = js.native
  def rotateAxisAngleSelf(
      x: Double, y: Double, z: Double, angle: Double
  ): DOMMatrix = js.native

  def rotateFromVectorSelf(x: Double): DOMMatrix = js.native
  def rotateFromVectorSelf(x: Double, y: Double): DOMMatrix = js.native

  def rotateSelf(rotX: Double): DOMMatrix = js.native
  def rotateSelf(rotX: Double, rotY: Double): DOMMatrix = js.native
  def rotateSelf(
      rotX: Double, rotY: Double, rotZ: Double
  ): DOMMatrix = js.native

  def scale3dSelf(scale: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double): DOMMatrix = js.native
  def scale3dSelf(
      scale: Double, originX: Double, originY: Double
  ): DOMMatrix = js.native
  def scale3dSelf(
      scale: Double, originX: Double, originY: Double, originZ: Double
  ): DOMMatrix = js.native

  def scaleSelf(scaleX: Double): DOMMatrix = js.native
  def scaleSelf(scaleX: Double, scaleY: Double): DOMMatrix = js.native
  def scaleSelf(
      scaleX: Double, scaleY: Double, scaleZ: Double
  ): DOMMatrix = js.native
  def scaleSelf(
      scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double
  ): DOMMatrix = js.native
  def scaleSelf(
      scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double,
      originY: Double
  ): DOMMatrix = js.native
  def scaleSelf(
      scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double,
      originY: Double, originZ: Double
  ): DOMMatrix = js.native

  def setMatrixValue(transformList: String): DOMMatrix = js.native

  def skewXSelf(sx: Double): DOMMatrix = js.native
  def skewYSelf(sy: Double): DOMMatrix = js.native

  def translateSelf(tx: Double): DOMMatrix = js.native
  def translateSelf(tx: Double, ty: Double): DOMMatrix = js.native
  def translateSelf(tx: Double, ty: Double, tz: Double): DOMMatrix = js.native
end DOMMatrixMethods

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix) */
@js.native
@JSGlobal
class DOMMatrix
    extends js.Object with DOMMatrixProperties with DOMMatrixMethods:
  // TODO css transform string or 6 | 16 tuple
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix/DOMMatrix) */
  def this(init: js.Array[Double] | String) = this()

  var is2D: Boolean = js.native

  var isIdentity: Boolean = js.native

  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var e: Double = js.native
  var f: Double = js.native

  var m11: Double = js.native
  var m12: Double = js.native
  var m13: Double = js.native
  var m14: Double = js.native
  var m21: Double = js.native
  var m22: Double = js.native
  var m23: Double = js.native
  var m24: Double = js.native
  var m31: Double = js.native
  var m32: Double = js.native
  var m33: Double = js.native
  var m34: Double = js.native
  var m41: Double = js.native
  var m42: Double = js.native
  var m43: Double = js.native
  var m44: Double = js.native
end DOMMatrix

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix#static_methods) */
@js.native
@JSGlobal
object DOMMatrix extends js.Object:
  def fromFloat32Array(array32: Float32Array): DOMMatrix = js.native
  def fromFloat64Array(array64: Float64Array): DOMMatrixReadOnly = js.native
  def fromMatrix(other: DOMMatrixArguments): DOMMatrix = js.native
end DOMMatrix
