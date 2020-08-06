# rn-native-ui-android-test

## Getting started

`$ npm install rn-native-ui-android-test --save`

### Mostly automatic installation

`$ react-native link rn-native-ui-android-test`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`

-   Add `import com.test.rnvideoplayer.RNRnvideoplayerPackage;` to the imports at the top of the file
-   Add `new RNRnvideoplayerPackage()` to the list returned by the `getPackages()` method

2. Append the following lines to `android/settings.gradle`:
    ```
    include ':rn-native-ui-android-test'
    project(':rn-native-ui-android-test').projectDir = new File(rootProject.projectDir, 	'../node_modules/rn-native-ui-android-test/android')
    ```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
    ```
      compile project(':rn-native-ui-android-test')
    ```

## Usage

```javascript
import RNRnvideoplayer from "rn-native-ui-android-test";

// TODO: What to do with the module?
RNRnvideoplayer;
```
