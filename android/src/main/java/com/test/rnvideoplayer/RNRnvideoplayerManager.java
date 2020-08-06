package com.test.rnvideoplayer;

import android.graphics.Color;
import android.view.View;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class RNRnvideoplayerManager extends SimpleViewManager<View> {

    public static final String REACT_CLASS = "RNRnvideoplayer";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected View createViewInstance(ThemedReactContext reactContext) {
        View view = new View(reactContext);
        view.setBackgroundColor(Color.RED);
        return view;
   }

}
