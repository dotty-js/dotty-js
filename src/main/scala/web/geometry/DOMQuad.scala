package org.dottyjs.web.geometry

import scala.scalajs.js
import scala.scalajs.js.annotation._

// MDN reference for DOMQuad was in progress when I wrote this code, extracted mainly from tslib

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMQuad) */
@js.native
trait DOMQuadInit extends js.Object:
    var p1: DOMPointInit
    var p2: DOMPointInit
    var p3: DOMPointInit
    var p4: DOMPointInit
end DOMQuadInit

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMQuad) */
@js.native
trait DOMQuadJSON extends js.Object:
    var p1: DOMPointMutable
    var p2: DOMPointMutable
    var p3: DOMPointMutable
    var p4: DOMPointMutable
end DOMQuadJSON

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMQuad) */
@js.native
@JSGlobal
class DOMQuad(
    val p1: DOMPointInit,
    val p2: DOMPointInit,
    val p3: DOMPointInit,
    val p4: DOMPointInit
) extends js.Object:
  def getBounds(): DOMRectMutable = js.native
  def toJSON(): DOMQuadJSON = js.native
end DOMQuad

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMQuad) */
@js.native
@JSGlobal
object DOMQuad extends js.Object:
    def fromQuad(other: DOMQuadInit): DOMQuad = js.native
    def fromRect(other: DOMRectInit): DOMQuad = js.native
end DOMQuad
