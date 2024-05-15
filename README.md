# Welcome to gdx2d [![Build Status](https://travis-ci.org/ISC-HEI/gdx2d.svg?branch=master)](https://travis-ci.org/ISC-HEI/gdx2d) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/ch.hevs.gdx2d/gdx2d-core/badge.svg)](http://search.maven.org/#search%7Cga%7C1%7Cch.hevs.gdx2d)

The gdx2d project is a simple to use 2d game and graphics framework. It is multi-platform (working on Windows, Linux and MacOS). It is Java based with the heavy-lifting done in native code (i.e. C/C++), for example for physics rendering. Since 2022, the basic code also exists for Scala enthusiasts !

<p align="center">
  <a href="https://www.youtube.com/watch?v=eoVrifa1Xd0" target="_blank"><img src="https://rawgit.com/ISC-HEI/gdx2d-videofile/master/logo/logo_640.png?raw=true" alt="Logo"/></a>
</p>

More information about gdx2d can be found on the [official project website](https://isc-hei.github.io/gdx2d/).

For informations about how to use this repository and develop things in it, see CONTRIBUTING.md

## What can it do?
The library contains simple to use graphical primitives such as lines, circles, rectangles. In addition, there are methods to draw pictures, rotate them, scale them etc. Physics simulation is also supported (using Box2D) as well as music and sound playing.

For each feature, a Java demo is provided for simple integration. Here are some examples of what the library is capable of (you can check the [YouTube demo reel](https://www.youtube.com/watch?v=eoVrifa1Xd0)):

![Screen shot](https://raw.github.com/wiki/pmudry/gdx2d/multi_screenshot.png)

## Why has this framework been developed?
`gdx2d` has been developed as a teaching tool for various programming courses at the School of Engineering of the HES-SO Valais. 

The library provides a (relatively easy) wrapping layer around a very nice library called [libGDX](https://libgdx.badlogicgames.com/), which provides almost everything to the library.

## Documentation
The Javadoc API of this library can be found [here](https://ISC-HEI.github.io/gdx2d/javadoc/). More information about the project can be found on the [official website](https://ISC-HEI.github.io/gdx2d/).

## What do I get?
It is multi-platform so that you can run your code on desktop computers (running either Windows, Linux or Mac) but also on mobile devices running Android. It is based on libGDX but provides a much simpler interface and multiple demo programs to get started.

Using the framework, the following code displays a shrinking/growing circle running smoothly:

```java
package ch.hevs.gdx2d.demos.simple

import ch.hevs.gdx2d.desktop.PortableApplication
import ch.hevs.gdx2d.lib.GdxGraphics
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color

/**
 * A very simple demonstration on how to display something animated with the
 * library
 *
 * @author Pierre-André Mudry (mui)
 * @version 1.0
 */
class DemoSimpleAnimation : PortableApplication() {
    var radius = 5f
    var speed = 1f

    override fun onInit() {
        // Sets the window title
        setTitle("Simple demo")
    }

    override fun onGraphicRender(g: GdxGraphics) {

        // Clears the screen
        g.clear()
        g.drawAntiAliasedCircle(g.screenWidth / 2f, g.screenHeight / 2f, radius, Color.BLUE)

        // If reaching max or min size, invert the growing direction
        if (radius >= 100 || radius <= 3) {
            speed *= -1
        }

        // Modify the radius
        radius += speed

        g.drawSchoolLogo()
        g.drawFPS()
    }
}

fun main(args: Array<String>) {
  DemoSimpleAnimation()
}
```

## Who did this and why?
It was first developed for the [inf1 course](http://inf1.begincoding.net) taught at [HES-SO Valais / Systems engineering](http://hevs.ch/isi) by Pierre-André Mudry. It has then been adapted for the [_101 Fundamentals of programming 1_](https://isc.hevs.ch/learn/enrol/index.php?id=2) course of [ISC bachelor degree programme](https://www.hevs.ch/isc). 

The framework was written by P.-A. Mudry & N. Chatton with the help of C. Métrailler. Some work also has then been done by M. Pignat, C. Papon and S. Devènes. A full list of contributors is [available here](https://github.com/ISC-HEI/gdx2d/graphs/contributors).

## License
The gdx2d project is licensed under the [Apache 2.0 license](https://github.com/ISC-HEI/gdx2d/blob/master/LICENSE).
