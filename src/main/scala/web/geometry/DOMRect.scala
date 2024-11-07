package org.dottyjs.web.geometry

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/fromRect_static#rectangle) */
trait DOMRectInit extends js.Object:
  def height: js.UndefOr[Double] = js.undefined
  def width: js.UndefOr[Double] = js.undefined
  def x: js.UndefOr[Double] = js.undefined
  def y: js.UndefOr[Double] = js.undefined
end DOMRectInit

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly#instance_properties) */
private abstract trait DOMRectProperties extends js.Object:
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
end DOMRectProperties

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly#instance_properties) */
private abstract trait DOMRectJson extends js.Object with DOMRectProperties:
  var x: Double
  var y: Double
  var width: Double
  var height: Double
  var top: Double
  var right: Double
  var bottom: Double
  var left: Double
end DOMRectJson

/** TODO MDN Rereference not available */
@js.native
private abstract trait DOMRectMethods extends js.Object:
  // Not on MDN but tested on Chromium also appeared on tslib
  def toJSON(): DOMRectProperties = js.native
end DOMRectMethods

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly) */
@js.native
@JSGlobal
class DOMRectReadOnly(
    val x: Double, val y: Double, val width: Double, val height: Double
) extends js.Object with DOMRectProperties with DOMRectMethods:
  val top: Double = js.native
  val right: Double = js.native
  val bottom: Double = js.native
  val left: Double = js.native
end DOMRectReadOnly

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly#static_methods) */
@js.native
@JSGlobal
object DOMRectReadOnly extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/fromRect_static) */
  def fromRect(other: DOMRectInit): DOMRectReadOnly = js.native
end DOMRectReadOnly

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRect) */
@js.native
@JSGlobal
class DOMRect(
    /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/x) */
    var x: Double,
    /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/y) */
    var y: Double,
    /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/width) */
    var width: Double,
    /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/height) */
    var height: Double
) extends js.Object with DOMRectJson with DOMRectMethods:
  var top: Double = js.native
  var right: Double = js.native
  var bottom: Double = js.native
  var left: Double = js.native
end DOMRect

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRect#static_methods) */
@js.native
@JSGlobal
object DOMRect extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMRect/fromRect_static) */
  def fromRect(other: DOMRectInit): DOMRect = js.native
end DOMRect
