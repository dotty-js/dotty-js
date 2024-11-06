# Scala3.js bindings for browser graphics, audio and input

## Diferences with [scala-js-dom](https://github.com/scala-js/scala-js-dom)
* `scala-js-dom` targets all javascript browser APIs, whereas `dotty-js` targets a subset of game-like browser apis like canvas, webgl, audio, gamepad and window
* `dotty-js` focuses on more presice and closer bindings as those of typescript
* `dotty-js` leverate Scala 3 (dotty) union types and literal types
* `dotty-js` targets Scala 3 LTS
* `dotty-js` only superseeds `scala-js-dom` in game-like API bidings, for general usage, they can be complementary

## Diferences with [scala-dom-types](https://github.com/raquo/scala-dom-types)
* `scala-dom-types` targets HTML/CSS APIs, in contrast `dotty-js` targets non-HTML APIs, so they are complementary

## Goals
Provide bindings for game-like apis for graphics, audio and input, as well the smallest subset of HTML/DOM apis like `HTMLCanvasElement` and `window` to render those graphics
* Web
   * [Geometry Interfaces](https://developer.mozilla.org/en-US/docs/Web/API/Geometry_Interfaces) (in progress)
   * Graphics
      * [Canvas API](https://developer.mozilla.org/en-US/docs/Web/API/Canvas_API) (ready)
      * [WebGL API](https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API) (roadmap)
      * [WebGPU API](https://developer.mozilla.org/en-US/docs/Web/API/WebGPU_API) (roadmap)
   * [Audio API](https://developer.mozilla.org/en-US/docs/Web/API/Web_Audio_API) (in progress)
   * Input
      * [Gamepad API](https://developer.mozilla.org/en-US/docs/Web/API/Gamepad_API) (roadmap)
* DOM
   * [Window API](https://developer.mozilla.org/en-US/docs/Web/API/Window) (roadmap)
   * [HTMLCanvasElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement) (usable)

## Why not full browser API?
* Scala.js DOM, already targets the full browser API, but it's easy to get outdated both in coverage, not event [typescript libdom](https://github.com/microsoft/TypeScript-DOM-lib-generator) it's always up to date

## Does it work on backend?
* Even though the apis targeted can be think as *headless* like the subset of web APIs found in Edge runtime or Deno, this library is meant to be used on browsers
* Some graphics can run on backend, examples are [node-canvas](https://github.com/Automattic/node-canvas) and [@std/webgpu](https://jsr.io/@std/webgpu), but not audio or input

## Type Sources
MDN is the ultimate reference source, while creating dotty-js bindings [found MDN to be more precise than the official typescript DOM bindings](https://github.com/microsoft/TypeScript-DOM-lib-generator/issues/1808)
* [MDN Web API](https://developer.mozilla.org/en-US/docs/Web/API)   
* [TypeScript-DOM-lib-generator](https://github.com/microsoft/TypeScript-DOM-lib-generator)

## Binding styles preferences
* Docstrings
   * All bindings should refer to their closest MDN reference in docstrings as markdown links
   * Docstrings should only contain MDN reference links, except for rare cases of scala.js specific technical comments, for details consult the online MDN reference link in docstring of each binding

* Numbers
   * For fractionals use `Double`
   * For integers use `Int` example `window.innerWidth` or `array.length`
   * If unsure whether to use `Int` or `Double`, check MDN docs for that value or property, [example](https://developer.mozilla.org/en-US/docs/Web/API/Window/innerHeight#value).

* Methods
   * For binding to js polymorphic methods prefer scala method overloads
   * For methods with optional parameters prefer extra overloads excluding those params instead of using default paramenters, add as many overloads as required for readability

* Classes
   * For js classes use scala classes, in other words anything created with `new` keyword on js will map to a scala class

* Literal Objects
   * For js literal objects use scala traits, in other words anything created with `{}` on js will map to a scala trait
