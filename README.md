# AppFontChanger
In a Single shot change font of Entire Android Application - TextViews, EditText, Buttons, Views etc., 

 ![AppFontChanger - Example](https://s19.postimg.org/j4ivto00z/singleshot_custom_font.png)
  
#### Kindly use the following links to use this library:

```java
allprojects {
  repositories {
			...
		maven { url "https://jitpack.io" }
	}
}
```
And then in the other gradle file(may be your app gradle or your own module library gradle, but never add in both of them to avoid conflict.)
```java
dependencies {
	compile 'com.github.myinnos:AppFontChanger:1.0'
}
```
How to use
-----
**Step 1:** add default font to styles, Here i added serif font as default:

```xml
<style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <!-- Customize your theme here. -->
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
        <item name="android:typeface">serif</item>
 </style>
```
 
 **Step 2:** add custom font in application level to override style font:

 ```java
 public class AppBaseApplication extends Application {
 
    	@Override
    	public void onCreate() {
        	super.onCreate();
        	// custom font for entire App
        	TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/Montserrat-Regular.ttf");
    	}
	
	''''''''''''''''
```
##### Any Queries? or Feedback, please let me know by opening a [new issue](https://github.com/myinnos/SingleShotFontChange/issues/new)!

## Contact
#### Prabhakar Thota
* :globe_with_meridians: Website: [myinnos.in](http://www.myinnos.in "Prabhakar Thota")
* :email: e-mail: contact@myinnos.in
* :mag_right: LinkedIn: [PrabhakarThota](https://www.linkedin.com/in/prabhakarthota "Prabhakar Thota on LinkedIn")
* :thumbsup: Twitter: [@myinnos](https://twitter.com/myinnos "Prabhakar Thota on twitter")  

License
-------

    Copyright 2017 MyInnos

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

   
