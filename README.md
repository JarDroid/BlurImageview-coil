BlurImageview-coil
==================


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

Thanks
------
