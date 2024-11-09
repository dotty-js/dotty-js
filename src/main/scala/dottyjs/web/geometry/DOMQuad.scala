package dottyjs.web.geometry

import scala.scalajs.js
import scala.scalajs.js.annotation._

// MDN reference for DOMQuad was in progress when I wrote this code, extracted mainly from tslib

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMQuad) */
trait DOMQuadInit extends js.Object:
  var p1: DOMPointArguments
  var p2: DOMPointArguments
  var p3: DOMPointArguments
  var p4: DOMPointArguments
end DOMQuadInit

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMQuad#instance_properties) */
private abstract trait DOMQuadProperties extends js.Object:
  var p1: DOMPointArguments
  var p2: DOMPointArguments
  var p3: DOMPointArguments
  var p4: DOMPointArguments
end DOMQuadProperties

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMQuad) */
@js.native
@JSGlobal
class DOMQuad(
    val p1: DOMPointArguments, val p2: DOMPointArguments, val p3: DOMPointArguments,
    val p4: DOMPointArguments
) extends js.Object:
  def getBounds(): DOMRect = js.native
  def toJSON(): DOMQuadProperties = js.native
end DOMQuad

type DOMQuadArguments = DOMQuadInit | DOMQuadProperties

/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMQuad) */
@js.native
@JSGlobal
object DOMQuad extends js.Object:
  def fromQuad(other: DOMQuadArguments): DOMQuad = js.native
  def fromRect(other: DomRectArguments): DOMQuad = js.native
end DOMQuad
