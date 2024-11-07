package org.dottyjs.web.geometry

import scala.scalajs.js
import scala.scalajs.js.annotation._

// MDN reference for DOMQuad was in progress when I wrote this code, extracted mainly from tslib

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMQuad) */
trait DOMQuadInit extends js.Object:
  var p1: DOMPointInit
  var p2: DOMPointInit
  var p3: DOMPointInit
  var p4: DOMPointInit
end DOMQuadInit

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMQuad#instance_properties) */
private abstract trait DOMQuadProperties extends js.Object:
  var p1: DOMPoint
  var p2: DOMPoint
  var p3: DOMPoint
  var p4: DOMPoint
end DOMQuadProperties

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMQuad) */
@js.native
@JSGlobal
class DOMQuad(
    val p1: DOMPointInit, val p2: DOMPointInit, val p3: DOMPointInit,
    val p4: DOMPointInit
) extends js.Object:
  def getBounds(): DOMRect = js.native
  def toJSON(): DOMQuadProperties = js.native
end DOMQuad

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMQuad) */
@js.native
@JSGlobal
object DOMQuad extends js.Object:
  def fromQuad(other: DOMQuadInit): DOMQuad = js.native
  def fromRect(other: DOMRectInit): DOMQuad = js.native
end DOMQuad
