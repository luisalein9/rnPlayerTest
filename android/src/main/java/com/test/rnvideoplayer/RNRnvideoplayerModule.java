
package com.test.rnvideoplayer;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class RNRnvideoplayerModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNRnvideoplayerModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNRnvideoplayer";
  }
}