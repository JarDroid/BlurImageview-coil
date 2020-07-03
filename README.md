BlurImageview-coil
==================

![](https://github.com/JarDroid/BlurImageview-coil/blob/master/blurimageview.gif)

#### The BlurImageview-coil is allow you to make your imageview background with blur efect transformation. As of same image which you set in imageview.

Download
--------

You can downlaod jar from github (https://github.com/JarDroid/BlurImageview-coil/releases).


Or use Gradle:

```gradle
allprojects {
	repositories {
	...
	maven { url 'https://jitpack.io' }
	}
}

dependencies {
  implementation 'com.github.JarDroid:BlurImageview-coil:0.1.0'
}
```

Or Maven:

```xml
<repositories>
        <repository>
                <id>jitpack.io</id>
                <url>https://jitpack.io</url>
        </repository>
</repositories>

<dependency>
	    <groupId>com.github.JarDroid</groupId>
	    <artifactId>BlurImageview-coil</artifactId>
	    <version>0.1.0</version>
</dependency>

```

How do I use BlurImagview?
-------------------

Simple use look like this:

```xml
<com.blurbackgroundimageview.BlurImageArtist
        android:id="@+id/blurImage"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:imageSrc="@mipmap/ic_launcher"
        app:imageError="@drawable/error"
        app:imagePlaceholder="@drawable/place"/>
        
 ```       

* Set **Drawable** with blur effect.

```java
blurImageArtist.setDrawableImage(R.drawabl.img,R.drawablr.error,R.drawable.place,5f,5f)//blur radius and blur sampling 

```
* Set **URL** with blur effect.

```java
blurImageArtist.setUrlImage(url,R.drawabl.error,R.drawable.place,5f,5f)//blur radius and blur sampling 

```
* Set **Resources**  with blur effect.

```java
blurImageArtist.setResImage(resources,R.drawabl.error,R.drawable.place,5f,5f)//blur radius and blur sampling 

```
* Set **Drawable** without blur effect.
```java
blurImageArtist.setDrawableImage(R.drawable.img)

````
Author
------

Nikhil Lad - @JarDroid

License
------

Copyright (c) 2020 JarDroid

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

Thanks
------
