package org.dottyjs.web.graphics

import scala.scalajs.js
import scala.scalajs.js.annotation._
import org.scalajs.dom.{HTMLElement, CanvasFillRule}
import org.scalajs.dom.CanvasGradient
import org.scalajs.dom.CanvasPattern
import org.scalajs.dom.Path2D
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.ImageBitmap

import org.dottyjs.dom.HTMLCanvasElement

@js.native
@JSGlobal
class TextMetrics extends js.Object {

  var actualBoundingBoxAscent: Int = js.native

  var actualBoundingBoxDescent: Int = js.native

  var actualBoundingBoxLeft: Int = js.native

  var actualBoundingBoxRight: Int = js.native

  var alphabeticBaseline: Int = js.native

  var fontBoundingBoxAscent: Int = js.native

  var fontBoundingBoxDescent: Int = js.native

  var hangingBaseline: Int = js.native

  var ideographicBaseline: Int = js.native

  // ---------------

  var width: Double = js.native
}

@js.native
trait CanvasRenderingContext2D
    extends js.Object, CanvasCompositing, CanvasDrawImage, CanvasDrawPath,
      CanvasFillStrokeStyles, CanvasFilters, CanvasImageData {

  /** [MDN
    * Reference](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/canvas)
    */
  val canvas: HTMLCanvasElement | Null = js.native

  def getContextAttributes(): CanvasRenderingContext2DSettings = js.native

  def isContextLost(): Boolean = js.native

  def reset(): Unit = js.native

  // ---------------

  /** Default 10 */
  var miterLimit: Double = js.native

  /** Default value 10px sans-serif */
  var font: String = js.native

  /** Type of endings on the end of lines. Possible values: butt (default),
    * round, square
    */
  var lineCap: String = js.native

  /** Specifies where to start a dasharray on a line. */
  var lineDashOffset: Double = js.native

  /** Color of the shadow. Default fully-transparent black. */
  var shadowColor: String = js.native

  /** Defines the type of corners where two lines meet. Possible values: round,
    * bevel, miter (default)
    */
  var lineJoin: String = js.native

  /** Horizontal distance the shadow will be offset. Default 0. */
  var shadowOffsetX: Double = js.native

  /** Width of lines. Default 1.0 */
  var lineWidth: Double = js.native

  /** Vertical distance the shadow will be offset. Default 0. */
  var shadowOffsetY: Double = js.native

  /** Specifies the blurring effect. Default 0 */
  var shadowBlur: Double = js.native

  /** Possible values: start (default), end, left, right or center. */
  var textAlign: String = js.native

  /** Possible values: top, hanging, middle, alphabetic (default), ideographic,
    * bottom
    */
  var textBaseline: String = js.native

  /** A boolean value indicating whether to smooth scaled images or not. The
    * default value is true.
    */
  var imageSmoothingEnabled: Boolean = js.native

  /** Restores the drawing style state to the last element on the 'state stack'
    * saved by save().
    */
  def restore(): Unit = js.native

  /** Resets the current transform to the identity matrix, and then invokes the
    * transform() method with the same arguments.
    */
  def setTransform(
      m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double
  ): Unit = js.native

  /** Saves the current drawing style state using a stack so you can revert any
    * change you make to it using restore().
    */
  def save(): Unit = js.native

  /** The arc() method creates a circular arc centered at (x, y) with a radius of
    * radius. The path starts at startAngle, ends at endAngle, and travels in the
    * direction given by counterclockwise (defaulting to clockwise).
    */
  def arc(
      x: Double, y: Double, radius: Double, startAngle: Double,
      endAngle: Double, counterclockwise: Boolean
  ): Unit = js.native

  /** The arc() method creates a circular arc centered at (x, y) with a radius of
    * radius. The path starts at startAngle, ends at endAngle, and travels in the
    * direction given by counterclockwise (defaulting to clockwise).
    */
  def arc(
      x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double
  ): Unit = js.native

  /** Returns a TextMetrics object. */
  def measureText(text: String): TextMetrics = js.native

  /** Adds a quadratic Bézier curve to the current path. */
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double,
      y: Double): Unit = js.native

  /** Adds a rotation to the transformation matrix. The angle argument represents
    * a clockwise rotation angle and is expressed in radians.
    */
  def rotate(angle: Double): Unit = js.native

  /** Draws (fills) a given text at the given (x, y) position. */
  def fillText(
      text: String, x: Double, y: Double, maxWidth: Double = js.native
  ): Unit = js.native

  /** Moves the origin point of the context to (x, y). */
  def translate(x: Double, y: Double): Unit = js.native

  /** Adds a scaling transformation to the canvas units by x horizontally and by
    * y vertically.
    */
  def scale(x: Double, y: Double): Unit = js.native

  /** Connects the last point in the subpath to the x, y coordinates with a
    * straight line.
    */
  def lineTo(x: Double, y: Double): Unit = js.native

  /** Returns a dash list array containing an even number of non-negative
    * numbers.
    */
  def getLineDash(): js.Array[Double] = js.native

  /** Fills the subpaths with the current fill style. */
  def fill(fillRule: CanvasFillRule = js.native): Unit = js.native

  /** Fills the subpaths with the current fill style. */
  def fill(path: Path2D): Unit = js.native

  /** Fills the subpaths with the current fill style. */
  def fill(path: Path2D, fillRule: CanvasFillRule): Unit = js.native

  /** Creates a pattern using the specified image. It repeats the source in the
    * directions specified by the repetition argument. This method returns a
    * CanvasPattern.
    */
  def createPattern(image: HTMLElement,
      repetition: String): CanvasPattern = js.native

  /** Tries to draw a straight line from the current point to the start. If the
    * shape has already been closed or has only one point, this function does
    * nothing.
    */
  def closePath(): Unit = js.native

  /** Creates a path for a rectangle at position (x, y) with a size that is
    * determined by width and height.
    */
  def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native

  /** Sets all pixels in the rectangle defined by starting point (x, y) and size
    * (width, height) to transparent black.
    */
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native

  /** Moves the starting point of a new subpath to the (x, y) coordinates. */
  def moveTo(x: Double, y: Double): Unit = js.native

  /** Draws a filled rectangle at (x, y) position whose size is determined by
    * width and height.
    */
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native

  /** Adds a cubic Bézier curve to the current path. */
  def bezierCurveTo(
      cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double,
      y: Double
  ): Unit = js.native

  /** Multiplies the current transformation matrix with the matrix described by
    * its arguments.
    */
  def transform(
      m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double
  ): Unit = js.native

  /** Paints a rectangle which has a starting point at (x, y) and has a w width
    * and an h height onto the canvas, using the current stroke style.
    */
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native

  /** Sets the current line dash pattern. */
  def setLineDash(segments: js.Array[Double]): Unit = js.native

  /** Draws (strokes) a given text at the given (x, y) position. */
  def strokeText(
      text: String, x: Double, y: Double, maxWidth: Double = js.native
  ): Unit = js.native

  // /** Starts a new path by resetting the list of sub-paths. Call this method when
  //   * you want to create a new path.
  //   */
  // def beginPath(): Unit = js.native

  /** Adds an arc with the given control points and radius, connected to the
    * previous point by a straight line.
    */
  def arcTo(
      x1: Double, y1: Double, x2: Double, y2: Double, radius: Double
  ): Unit = js.native

  /** The ellipse() method creates an elliptical arc centered at (x, y) with the
    * radii radiusX and radiusY. The path starts at startAngle and ends at
    * endAngle, and travels in the direction given by counterclockwise
    * (defaulting to clockwise).
    */
  def ellipse(
      x: Double, y: Double, radiusX: Double, radiusY: Double, rotation: Double,
      startAngle: Double, endAngle: Double,
      counterclockwise: Boolean = js.native
  ): Unit = js.native
}
