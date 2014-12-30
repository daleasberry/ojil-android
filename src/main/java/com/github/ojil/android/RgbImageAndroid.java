package com.github.ojil.android;

import android.graphics.Bitmap;

import com.github.ojil.core.Image;
import com.github.ojil.core.RgbImage;

public class RgbImageAndroid extends RgbImage<Bitmap> {
    /**
     * Creates a new instance of RgbImage
     *
     * @param width
     *            the image width
     * @param height
     *            the image height
     */
    public RgbImageAndroid(int width, int height) {
        super(width, height);
    }
    
    public RgbImageAndroid(int width, int height, Integer[] data) {
        super(width, height, data);
    }
    
    /**
     * Creates a new instance of RgbImage, assigning a constant value
     * 
     * @param r
     *            the red color value to be assigned.
     * @param g
     *            the green color value to be assigned.
     * @param b
     *            the blue color value to be assigned.
     * @param width
     *            the image width
     * @param height
     *            the image height
     */
    public RgbImageAndroid(int width, int height, byte r, byte g, byte b) {
        super(width, height, r, g, b);
    }
    
    /**
     * Creates a new instance of RgbImage, assigning a constant value
     * 
     * @param rgb
     *            the packed RGB value to assign
     * @param width
     *            the image width
     * @param height
     *            the image height
     */
    public RgbImageAndroid(int width, int height, int rgb) {
        super(width, height, rgb);
    }
    
    public RgbImageAndroid(Bitmap bmp) {
        super(bmp.getWidth(), bmp.getHeight(), null, bmp);
        int[] bmpData = new int[width * height];
        bmp.getPixels(bmpData, 0, width, 0, 0, width, height);
        imageData = Image.arraycopy(bmpData);
    }
}
