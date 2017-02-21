# SingleShotFontChange

# Single Shot Font Change
In a Single shot change font of Entire Android Application

 ![Single Shot Font Change - Example](https://s19.postimg.org/j4ivto00z/singleshot_custom_font.png)
  
#### Kindly use the following links to use this library:

In build.gradle (Project)

	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
	
And then in the other gradle file(may be your app gradle or your own module library gradle, but never add in both of them to avoid conflict.)
	
	 dependencies {
            compile 'com.github.myinnos:SingleShotFontChange:1.0'
	        }
