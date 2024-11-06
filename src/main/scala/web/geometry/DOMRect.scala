package org.dottyjs.web.geometry

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/fromRect_static#rectangle) */
@js.native
trait DOMRectInit extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/height) */
  def height: js.UndefOr[Double]

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/width) */
  def width: js.UndefOr[Double]

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/x) */
  def x: js.UndefOr[Double]

  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/y) */
  def y: js.UndefOr[Double]
end DOMRectInit

@js.native
trait DOMRectJSON extends DOMRectInit:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/x) */
  def x: Double

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/y) */
  def y: Double

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/width) */
  def width: Double

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/height) */
  def height: Double

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/top) */
  def top: Double

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/right) */
  def right: Double

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/bottom) */
  def bottom: Double

  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/left) */
  def left: Double
end DOMRectJSON

@js.native
@JSGlobal
// Avoid trait to prevent accidental instantiation
abstract class DOMRect extends DOMRectJSON:
  // Not on MDN but tested on Chromium also appeared on tslib
  def toJSON(): DOMRectJSON = js.native
end DOMRect

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly) */
@js.native
@JSGlobal
class DOMRectReadOnly(
    val x: Double, val y: Double, val width: Double, val height: Double
) extends DOMRect:
  val top: Double = js.native
  val right: Double = js.native
  val bottom: Double = js.native
  val left: Double = js.native
end DOMRectReadOnly

@js.native
@JSGlobal
object DOMRectReadOnly extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/fromRect_static) */
  def fromRect(other: DOMRectInit): DOMRectReadOnly = js.native
end DOMRectReadOnly

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRect) */
@js.native
@JSGlobal("DOMRect")
class DOMRectMutable(
    var x: Double, var y: Double, var width: Double, var height: Double
) extends DOMRect:
  var top: Double = js.native
  var right: Double = js.native
  var bottom: Double = js.native
  var left: Double = js.native
end DOMRectMutable

@js.native
@JSGlobal
object DOMRectMutable extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRect/fromRect_static) */
  def fromRect(other: DOMRectInit): DOMRectMutable = js.native
end DOMRectMutable
