package org.dottyjs.web.geometry

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{Float32Array, Float64Array}

// Converted from tslib
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

// Converted from tslib
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

@js.native
abstract trait DOMMatrixFields extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly#is2d) */
  def is2D: Boolean

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly#isidentity) */
  def isIdentity: Boolean

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly#a) */
  def a: Double
  def b: Double
  def c: Double
  def d: Double
  def e: Double
  def f: Double

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly#m11) */
  def m11: Double
  def m12: Double
  def m13: Double
  def m14: Double
  def m21: Double
  def m22: Double
  def m23: Double
  def m24: Double
  def m31: Double
  def m32: Double
  def m33: Double
  def m34: Double
  def m41: Double
  def m42: Double
  def m43: Double
  def m44: Double
end DOMMatrixFields

@js.native
abstract trait DOMMatrixReadOnlyMethods extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/flipX) */
  def flipX(): DOMMatrix = js.native
  def flipY(): DOMMatrix = js.native
  def inverse(): DOMMatrix = js.native
  def multiply(other: DOMMatrixInit): DOMMatrix = js.native
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

  // TODO DOMMatrixJSON
  def toJSON(): js.Object = js.native

  def transformPoint(point: DOMPointInit): DOMPoint = js.native

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/translate) */
  def translate(tx: Double, ty: Double): DOMMatrix = js.native
  def translate(tx: Double, ty: Double, tz: Double): DOMMatrix = js.native
end DOMMatrixReadOnlyMethods

@js.native
@JSGlobal
object DOMMatrixReadOnly extends js.Object:
  def fromFloat32Array(array32: Float32Array): DOMMatrixReadOnly = js.native
  def fromFloat64Array(array64: Float64Array): DOMMatrixReadOnly = js.native
  def fromMatrix(other: DOMMatrixInit): DOMMatrixReadOnly = js.native
end DOMMatrixReadOnly

@js.native
@JSGlobal
class DOMMatrixReadOnly extends DOMMatrixFields with DOMMatrixReadOnlyMethods:
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

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix) */
@js.native
@JSGlobal("DOMMatrix")
class DOMMatrix extends DOMMatrixFields with DOMMatrixReadOnlyMethods:
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

  def invertSelf(): DOMMatrix = js.native
  def multiplySelf(other: DOMMatrixInit): DOMMatrix = js.native
  def preMultiplySelf(other: DOMMatrixInit): DOMMatrix = js.native

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
end DOMMatrix

@js.native
@JSGlobal
object DOMMatrix extends js.Object:
  def fromFloat32Array(array32: Float32Array): DOMMatrix = js.native
  def fromFloat64Array(array64: Float64Array): DOMMatrixReadOnly = js.native
  def fromMatrix(other: DOMMatrixInit): DOMMatrix = js.native
end DOMMatrix
