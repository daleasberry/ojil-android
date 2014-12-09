package com.github.ojil.android;

import com.github.ojil.core.Image;
import com.github.ojil.core.ImageFactory;
import com.github.ojil.core.ImageType;
import com.github.ojil.core.RgbImage;

public class ImageFactorySpi implements ImageFactory {
    
    @Override
    public Image createImage(int width, int height, ImageType type) {
        Image newImage = null;
        switch (type) {
            case INT_RGB:
                newImage = new RgbImage(width, height);
                break;
            default:
                throw new RuntimeException("Not yet implemented");
        }
        return newImage;
    }
}