package org.dottyjs.web.geometry

import scala.scalajs.js
import scala.scalajs.js.annotation._

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

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix) */
class DOMMatrix extends js.Object