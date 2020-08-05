package com.test.rnvideoplayer;

import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.widget.VideoView;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class RNRnvideoplayerManager extends ReactContextBaseJavaModule {

    public static final String REACT_CLASS = "RNRnvideoplayer";

    private Object mCallerContext;
    private ThemedReactContext mcontext;
    private VideoView view;

    public RNRnvideoplayerManager(Object mCallerContext) {
        this.mCallerContext = mCallerContext;
    }

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected VideoView createViewInstance(ThemedReactContext reactContext) {
        mcontext = reactContext;
        view = new VideoView(reactContext);
        return view;
   }
   @ReactProp(name="url")
    public void setVideoPath(VideoView videoView, String urlPath) {
        Uri uri = Uri.parse(urlPath);
        videoView.setVideoURI(uri);
        videoView.start();
    }
   @ReactProp(name="pause")
    public void setVideoPath(VideoView videoView, Boolean pause) {
        if(pause == true)
            videoView.pause();
        else
            videoView.start();

    }

}