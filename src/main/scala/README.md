## Conventions

### Docstrings
Refer to the more specific MDN reference for every entity
```scala
/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly#static_methods) */
@js.native
@JSGlobal
object DOMPointReadOnly extends js.Object:
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/fromPoint_static) */
    def fromPoint(other: DOMPointInit): DOMPoint = js.native
end DOMPointReadOnly
```
Some entities have not yet any MDN reference, can be marked as `TODO` and `TODO N/A`
```scala
  /** MDN Reference TODO N/A*/
  def matrixTransform(matrix: DOMMatrixInit): DOMPointMethods = js.native
```

Some extra information can be added to the docstring, example when Doubles or Ints are coerced to natural or unsigned numbers

```scala
  /** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/height)
    * integer non-negative
    */
  var height: Int = js.native
```

### Numbers
For whole use `Int` like `canvas.height` or `array.length`

For fractional use `Double`

Use MDN docs for reference of numeric constraints example [Canvas height](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/height).

### Literal types and Unions
JS literal number and strings map to Scala 3 literal values

JS unions map to Scala 3 union types
```ts
// TS
type CanvasLineCap = 'butt' | 'round' | 'square'
```
⥥⥥⥥
```scala
type CanvasLineCap = "butt" | "round" | "square"
```

### Methods
Js polymorphic methods map to multiple scala method overloads

Js methods with optional parameters map to two overloads one without and one with
```ts
  // TS
  getContext(contextId: "2d", options?: CanvasRenderingContext2DSettings): CanvasRenderingContext2D | null
```

```scala
  def getContext(contextId: "2d"): CanvasRenderingContext2D | Null

  def getContext(contextId: "2d", options: CanvasRenderingContext2DSettings): CanvasRenderingContext2D | Null
```

Js methods with literal number or string overloads map to Scala 3 literal singleton type overloads
```ts
  // TS
  getContext(contextId: "2d"): OffscreenCanvasRenderingContext2D | null
  getContext(contextId: "webgl"): WebGLRenderingContext | null
  getContext(contextId: "webgl2"): WebGL2RenderingContext | null
```
⥥⥥⥥
```scala
  def getContext(contextId: "2d"): OffscreenCanvasRenderingContext2D | Null
  def getContext(contextId: "webgl"): WebGLRenderingContext | Null
  def getContext(contextId: "webgl2"): WebGL2RenderingContext | Null
```

Use a trait to group entity methods then inherit from that trait (and add respective MDN reference instance methods)
```scala
@js.native
private abstract trait ImageBitmapMethods extends js.Object:
  def close(): Unit = js.native
end ImageBitmapMethods

@js.native
@JSGlobal
class ImageBitmap extends js.Object with ImageBitmapProperties with ImageBitmapMethods
```

### Objects
JS object interfaces map to Scala trait extending `js.Object`

Anything created by JS literal syntax `{}` will map to a scala trait

Always extend from `js.Object` even if already extending it from a parent
```ts
// TS
interface DOMRectInit {
    height?: number;
    width?: number;
    x?: number;
    y?: number;
}
```
⥥⥥⥥
```scala
trait DOMRectInit extends js.Object:
  def height: js.UndefOr[Double] = js.undefined
  def width: js.UndefOr[Double] = js.undefined
  def x: js.UndefOr[Double] = js.undefined
  def y: js.UndefOr[Double] = js.undefined
end DOMRectInit
```

### Classes
JS classes map to Scala class extending `js.Object`, with matching names

Always extend from `js.Object` even if already extending it from a parent

JS Polymorphic constructors map to auxiliary constructors
```scala
@js.native
@JSGlobal
class DOMPoint extends js.Object with DOMPointProperties with DOMPointMethods:
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
end DOMPoint
```

Static methods map to companion object methods
```scala
/** [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly#static_methods) */
@js.native
@JSGlobal
object DOMPointReadOnly extends js.Object:
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/fromPoint_static) */
  def fromPoint(other: DOMPointInit): DOMPoint = js.native
end DOMPointReadOnly
```

### Blocks and indentation 
Use indentation always, avoid braces

Use start/end definition with `:` and `end`
```scala
@js.native
@JSGlobal
object DOMMatrixReadOnly extends js.Object:
  // Content
end DOMMatrixReadOnly
```
