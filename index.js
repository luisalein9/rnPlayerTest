import React from 'react';
import {requireNativeComponent, View} from 'react-native';

const RNRnvideoplayerComponent = (props) =>{
      return <RNRnvideoplayer {...props} />;
    }
  
  
  
  var RNRnvideoplayer = requireNativeComponent('RNRnvideoplayer', RNRnvideoplayerComponent);
  
  module.exports = RNRnvideoplayerComponent;