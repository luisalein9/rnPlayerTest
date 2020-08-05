
# react-native-rnvideoplayer

## Getting started

`$ npm install react-native-rnvideoplayer --save`

### Mostly automatic installation

`$ react-native link react-native-rnvideoplayer`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.test.rnvideoplayer.RNRnvideoplayerPackage;` to the imports at the top of the file
  - Add `new RNRnvideoplayerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-rnvideoplayer'
  	project(':react-native-rnvideoplayer').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-rnvideoplayer/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-rnvideoplayer')
  	```


## Usage
```javascript
import RNRnvideoplayer from 'react-native-rnvideoplayer';

// TODO: What to do with the module?
RNRnvideoplayer;
```
  