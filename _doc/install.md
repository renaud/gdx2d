---
layout: page
permalink: doc/install/
weight: 1
title: Installing the lib
---

A Zip file with desktop demos and a simple bootstrap project [can be downloaded](https://marcellus.begincoding.net/gdx2d/gdx2d-1.2.3-students.zip) to get started with the `gdx2d` library quickly.

You can also [download](https://github.com/ISC-HEI/gdx2d/releases/download/v1.2.2/gdx2d-demoDesktop-1.2.2.jar) and run the `gdx2d-demoDesktop-1.2.2.jar` file to see the latest demos programs on your PC (no development environment is required):

<center>
  <a title="Gdx2d demos selector" href="https://github.com/ISC-HEI/gdx2d/releases/download/v1.2.2/gdx2d-demoDesktop-1.2.2.jar"><img alt="Gdx2d demos selector" height="450" src="{{ site.baseurl }}/assets/doc/demo-selector.png"></a>
</center>

## Getting started with IntelliJ or Eclipse

{% tabs demo %}
{% tab demo Intellij %}
[Download](https://marcellus.begincoding.net/gdx2d/gdx2d-1.2.3-students.zip) and extract the `gdx2d-1.2.3-students.zip` file. There are two projects there : one for the demos with sample code and another to get started with a project. The demos project is written in Java, but you can easily convert them to Scala, as all the imports and methods are the same, you just have to adapt the syntax.

You have to start writing your project with the project `gdx2d-helloDesktop`. Enjoy !

{% endtab %}

{% tab demo Eclipse %}
[Download](https://github.com/ISC-HEI/gdx2d/releases/download/v1.2.2/gdx2d-1.2.2-students.zip) the `gdx2d-1.2.2-students.zip` file, then import the two projects in your Eclipse workspace (using the `File->Import...->Existing Projects into Workspace` menu in Eclipse then `Select archive file:`):

<center>
    <img alt="Import existing projects in Eclipse" height="550" src="{{ site.baseurl }}/assets/doc/import.png">
</center>
{% endtab %}

{% endtabs %}

The `gdx2d-demoDesktop` contains several program examples you can run on your PC. All the source code of the demo programs are provided. Select and run the main Java file `gdx2d-demoDesktop/src/ch/hevs/gdx2d/demos/DemoSelector.java` to display the demo selector window, or select the demo you are interested in and launch it from your ide.

## Development versions

Development / snapshots versions of the `gdx2d` library can be downloaded from the [Sonatype snapshots repository](https://oss.sonatype.org/content/repositories/snapshots/ch/hevs/gdx2d/).
It is also possible to build the library from sources using Maven. Please have a look [at this page](https://github.com/ISC-HEI/gdx2d/tree/v1.2.2/gdx2d-library) for the details.
