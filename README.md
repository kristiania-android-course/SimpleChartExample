# SimpleChartExample

A Simple chart example that draws a sine graph.

It uses https://github.com/AnyChart/AnyChart-Android

## To add AnyChart-Android to your project

### Gradle
Add this to the root build.gradle at the end of repositories (**WARNING:** Make sure you add this under **allprojects** not under buildscript):
```groovy
allprojects {
        repositories {
                ...
                maven { url 'https://jitpack.io' }
        }
}
```

Add the dependency to the project build.gradle:
```Groovy
dependencies {
        implementation 'com.github.AnyChart:AnyChart-Android:1.1.2'
}
```
