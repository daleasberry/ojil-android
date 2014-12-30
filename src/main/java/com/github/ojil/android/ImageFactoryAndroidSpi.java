package com.github.ojil.android;

import android.graphics.Bitmap;

import com.github.ojil.core.Image;
import com.github.ojil.core.ImageFactory;
import com.github.ojil.core.ImageType;

public class ImageFactoryAndroidSpi implements ImageFactory {
    
    @Override
    public Image<Integer, Bitmap> createImage(int width, int height, ImageType type) {
        Image<Integer, Bitmap> newImage = null;
        switch (type) {
            case INT_RGB:
                newImage = new RgbImageAndroid(width, height);
                break;
            default:
                throw new RuntimeException("Not yet implemented");
        }
        return newImage;
    }
}