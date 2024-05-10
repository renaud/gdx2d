---
layout: page
permalink: doc/install/
weight: 1
title: Installing the lib
---

A Zip file with desktop demos and a simple bootstrap project [can be downloaded from Github](https://github.com/ISC-HEI/gdx2d/releases/download/v1.2.2/gdx2d-1.2.2-students.zip) to get started with the `gdx2d` library quickly.

You can also [download](https://github.com/ISC-HEI/gdx2d/releases/download/v1.2.2/gdx2d-demoDesktop-1.2.2.jar) and run the `gdx2d-demoDesktop-1.2.2.jar` file to see the latest demos programs on your PC (no development environment is required):

<center>
  <a title="Gdx2d demos selector" href="https://github.com/ISC-HEI/gdx2d/releases/download/v1.2.2/gdx2d-demoDesktop-1.2.2.jar"><img alt="Gdx2d demos selector" height="450" src="{{ site.baseurl }}/assets/doc/demo-selector.png"></a>
</center>

## Run demo programs in Eclipse/Intellij

{% tabs demo %}
{% tab demo Eclipse %}
[Download](https://github.com/ISC-HEI/gdx2d/releases/download/v1.2.2/gdx2d-1.2.2-students.zip) the `gdx2d-1.2.2-students.zip` file, then import the two projects in your Eclipse workspace (using the `File->Import...->Existing Projects into Workspace` menu in Eclipse then `Select archive file:`):

<center>
    <img alt="Import existing projects in Eclipse" height="550" src="{{ site.baseurl }}/assets/doc/import.png">
</center>
{% endtab %}


{% tab demo Intellij %}
[Download](https://github.com/ISC-HEI/gdx2d/releases/download/v1.2.2/gdx2d-1.2.2-students.zip) and extract the `gdx2d-1.2.2-students.zip` file, then import the two projects in Intellij (using `File->New->Project from Existing Sources...` menu). Keep everything by default. These demo projects are written in java, but you can easily convert them in scala, all the imports and methods are the same, you just have to adapt the syntax. Before that, you may need to add the scala library to your project in `File->Project Structure->Libraries`:

<center>
    <img alt="Import existing projects in Eclipse" height="700" src="{{ site.baseurl }}/assets/doc/scala-imports.png">
</center>
{% endtab %}

{% endtabs %}

The `gdx2d-demoDesktop` contains several program examples you can run on your PC. All the source code of the demo programs are provided. Select and run the main Java file `gdx2d-demoDesktop/src/ch/hevs/gdx2d/demos/DemoSelector.java` to display the demo selector window, or select the demo you are interested in and launch it from Eclipse/Intellij.

## Hello gdx2d project in Eclipse/Intellij

The `gdx2d-helloDesktop` project is a simple project you can use as a base to start coding with the `gdx2d` library. Select and launch the `HelloWorld.java` file to see your first program:

<center>
    <img alt="Gdx2d bootstrap project" height="350" src="{{ site.baseurl }}/assets/doc/hello-world-students.png">
</center>

## Maven-based project

Advanced user can also use Maven or Gradle based projects to get started with the `gdx2d` library on desktop.

* Add `gdx2d-desktop` as a dependency in your `pom.xml`:

{% highlight xml %}
<dependency>
  <groupId>ch.hevs.gdx2d</groupId>
  <artifactId>gdx2d-desktop</artifactId>
  <version>1.2.2</version>
</dependency>
{% endhighlight %}

* Or add `gdx2d-desktop` to the dependencies section in your `build.gradle`:

{% highlight gradle %}
compile 'ch.hevs.gdx2d:gdx2d-desktop:1.2.2'
{% endhighlight %}

More information are available [on this page](https://github.com/ISC-HEI/gdx2d/tree/v1.2.2/gdx2d-library).

## Development versions

Development / snapshots versions of the `gdx2d` library can be downloaded from the [Sonatype snapshots repository](https://oss.sonatype.org/content/repositories/snapshots/ch/hevs/gdx2d/).
It is also possible to build the library from sources using Maven. Please have a look [at this page](https://github.com/ISC-HEI/gdx2d/tree/v1.2.2/gdx2d-library) for the details.
