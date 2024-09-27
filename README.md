# Experimental Scala.js headless web bindings for Scala 3 (dotty)

## Diferences with [scala-js-dom](https://github.com/scala-js/scala-js-dom)
* Targets headless (non HTML/CSS/DOM) web apis like canvas, webgl, audio, etc.
* Provide more presice and closer bindings as those of typescript
* Leverate Scala 3 (dotty) literal types
* Leverage Scala 3 (dotty) union types
* Target Scala 3 LTS

## Diferences with [scala-dom-types](https://github.com/raquo/scala-dom-types)
* dotty-js targets headless web apis whereas scala-dom-types targets HTML/CSS/DOM apis

## Compatibility with scala.js DOM libraries
* Both [scala-js-dom](https://github.com/scala-js/) and [scala-dom-types](https://github.com/raquo/scala-dom-types) can be used, one may even be required to work HTML/CSS/DOM apis which are outside the scope of dotty-js

## Goals
* Given the amount of web apis available, a subset of headless graphics, audio and input is targeted, as well subset of the HTML/DOM apis like `HTMLCanvasElement` and `window`
    * Graphics
        * [Canvas API](https://developer.mozilla.org/en-US/docs/Web/API/Canvas_API) (in progress)
        * [WebGL API](https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API) (roadmap)
        * [WebGPU API](https://developer.mozilla.org/en-US/docs/Web/API/WebGPU_API) (roadmap)
    * [Audio API](https://developer.mozilla.org/en-US/docs/Web/API/Web_Audio_API) (roadmap)
    * Input
        * [Gamepad API](https://developer.mozilla.org/en-US/docs/Web/API/Gamepad_API) (roadmap)
    * DOM
        * [Window API](https://developer.mozilla.org/en-US/docs/Web/API/Window) (roadmap)
        * [HTMLCanvasElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement) (in progress)

## Structure

### Web
Bindings to headless js web apis available on web runtimes like Deno and Edge runtimes

### Dom
Bindings to html/dom web apis available on web browsers, currently scoped/limited to DOM elements required to use the headless web apis like window and HTMLCanvasElement

## Type Sources
* [MDN Web API](https://developer.mozilla.org/en-US/docs/Web/API)   
* [TypeScript-DOM-lib-generator](https://github.com/microsoft/TypeScript-DOM-lib-generator)

## Binding styles preferences
* Docstrings
   * All bindings should refer to their closest MDN reference in docstrings as markdown links
   * Docstrings should only contain MDN reference links, except for rare cases of scala.js specific technical comments, for details consult the online MDN reference link in docstring of each binding

* Numbers
   * For fractions use Double
   * For integers part use Int example `window.innerWidth`
   * If unsure whether to use Int or Double, check MDN docs for that value or property, [example](https://developer.mozilla.org/en-US/docs/Web/API/Window/innerHeight#value).

* Methods
   * For binding to js polymorphic methods prefer scala method overloads
   * For methods with optional parameters prefer extra overloads excluding those params instead of using default paramenters, add as many overloads as required for readability
