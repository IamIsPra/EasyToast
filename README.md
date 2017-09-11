# EasyToast
Just another custom Android Toast 🍞 but We have Butter and Jam 😍

[![](https://jitpack.io/v/IsPra94/EasyToast.svg)](https://jitpack.io/#IsPra94/EasyToast)
<a href="http://www.methodscount.com/?lib=com.github.IsPra94%3AEasyToast%3A-SNAPSHOT"><img src="https://img.shields.io/badge/Size-29 KB-e91e63.svg"/></a>

# Toasts with Butter and Jam

![](http://i63.tinypic.com/2nrbyr.png)

# Usage

## Gradle
      
1 *Add it in your root build.gradle at the end of repositories*

	    allprojects {
		    repositories {
			    maven { url 'https://jitpack.io' }
		    }
	    }
  
  2 *Add the dependency*
  
  	  dependencies {
	      compile 'com.github.IsPra94:EasyToast:1.0.0'
	    }

  
## Maven

1 *Add the JitPack repository to your build file*

	  <repositories>
		   <repository>
		       <id>jitpack.io</id>
		       <url>https://jitpack.io</url>
		  </repository>
	  </repositories>
  
 2 *Add the dependency*
 
 	  <dependency>
	      <groupId>com.github.IsPra94</groupId>
	      <artifactId>EasyToast</artifactId>
	      <version>1.0.0</version>
	  </dependency>

# In Your Android Project

 ## Success
 
    EasyToast.success(MainActivity.this, "Success!!!"); //Default duration : Toast.LENGTH_SHORT
    EasyToast.success(MainActivity.this, "Success!!!", Toast.LENGTH_LONG);
    EasyToast.success(MainActivity.this, "Success!!!", R.drawable.custom_icon, Toast.LENGTH_LONG);
    
 ## Error
 
    EasyToast.error(MainActivity.this, "Error!!!"); //Default duration : Toast.LENGTH_SHORT
    EasyToast.error(MainActivity.this, "Error!!!", Toast.LENGTH_LONG);
    EasyToast.error(MainActivity.this, "Error!!!", R.drawable.custom_icon, Toast.LENGTH_LONG);
    
 ## Info
 
    EasyToast.info(MainActivity.this, "Info!!!"); //Default duration : Toast.LENGTH_SHORT
    EasyToast.info(MainActivity.this, "Info!!!", Toast.LENGTH_LONG);
    EasyToast.info(MainActivity.this, "Info!!!", R.drawable.custom_icon, Toast.LENGTH_LONG);
    
 ## Warning
 
    EasyToast.warning(MainActivity.this, "Warning!!!"); //Default duration : Toast.LENGTH_SHORT
    EasyToast.warning(MainActivity.this, "Warning!!!", Toast.LENGTH_LONG);
    EasyToast.warning(MainActivity.this, "Warning!!!", R.drawable.custom_icon, Toast.LENGTH_LONG);
    
 ## Custom
 
    EasyToast.custom(MainActivity.this, "Custom w/o icon"); //Default duration : Toast.LENGTH_SHORT
    EasyToast.custom(MainActivity.this, "Custom w/o icon", Toast.LENGTH_LONG);
    EasyToast.custom(MainActivity.this, "Custom w/ icon", R.drawable.custom_icon, Toast.LENGTH_LONG);
    EasyToast.custom(MainActivity.this, "Custom colors w/o icon", getResources().getColor(R.color.background), getResources().getColor(R.color.text_color), Toast.LENGTH_LONG);
    EasyToast.custom(MainActivity.this, "Custom colors w/ icon", R.drawable.custom_icon, getResources().getColor(R.color.background), getResources().getColor(R.color.text_color), Toast.LENGTH_LONG);
 
 # Download Sample App
 
 [![](https://www.apkbc.com/wp-content/uploads/2017/06/download-apk-button.png)](https://github.com/IsPra94/EasyToast/blob/master/EasyToastSample.apk?raw=true)
    

