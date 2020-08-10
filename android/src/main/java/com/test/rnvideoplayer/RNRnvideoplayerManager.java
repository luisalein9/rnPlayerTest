package com.test.rnvideoplayer;

import android.net.Uri;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class RNRnvideoplayerManager extends SimpleViewManager<VideoView> {

    public static final String REACT_CLASS = "RNRnvideoplayer";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected VideoView createViewInstance(ThemedReactContext reactContext) {
        VideoView videoView = new VideoView(reactContext);
        videoView.setMediaController(new MediaController(reactContext));
        return videoView;
    }

    @ReactProp(name="url")
    public void setVideoPath(VideoView videoView, String urlPath) {
        Uri uri = Uri.parse(urlPath);
        videoView.setVideoURI(uri);
        videoView.start();
    }

    @ReactProp(name="pause")
    public void setVideoPath(VideoView videoView, Boolean pause) {
        if (pause == true)
            videoView.pause();
        else
            videoView.start();
    }

}
