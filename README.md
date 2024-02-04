# StartPoint

![Animation](https://raw.githubusercontent.com/DecHamza090/StartPointSeekBar/master/Screenshot/animation.gif)

[![](https://jitpack.io/v/Devhamza090/StartPointSeekBar.svg)](https://jitpack.io/#Devhamza090/StartPointSeekBar)

### Step 1. Add the JitPack repository to your build file

`Add it in your root build.gradle at the end of repositories:`


```
    allprojects {
	   repositories {
			   ...
		   maven { url 'https://jitpack.io' }
	   }
    }
```

### Step 2. Add the dependency


```
    dependencies {
        implementation ("com.github.DevHamza090:StartPointSeekBar:latest-version")
    }
```


## Usage

Add LiquidPager to your xml and use it like you would ViewPager

```
    <com.example.devhamza.StartPointSeekBar
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:defaultBackgroundColor="#8F8F8F"
        app:defaultBackgroundRangeColor="#3F51B5"
        app:minValue="-40.0"
        app:maxValue="+40.0"/>
        
```