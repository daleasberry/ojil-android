package com.github.ojil.android;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import android.content.Context;
import android.graphics.Bitmap;

import com.github.ojil.core.RgbImage;

public class RgbImageAndroid extends RgbImage {
    protected Bitmap bmpImage;
    
    /**
     * Creates a new instance of RgbImage
     *
     * @param cWidth
     *            the image width
     * @param cHeight
     *            the image height
     */
    public RgbImageAndroid(int cWidth, int cHeight) {
        super(cWidth, cHeight);
    }
    
    public RgbImageAndroid(int cWidth, int cHeight, Integer[] rnData) {
        super(cWidth, cHeight, rnData);
    }
    
    /**
     * Creates a new instance of RgbImage, assigning a constant value
     * 
     * @param bR
     *            the red color value to be assigned.
     * @param bG
     *            the green color value to be assigned.
     * @param bB
     *            the blue color value to be assigned.
     * @param cWidth
     *            the image width
     * @param cHeight
     *            the image height
     */
    public RgbImageAndroid(int cWidth, int cHeight, byte bR, byte bG, byte bB) {
        super(cWidth, cHeight, bR, bG, bB);
    }
    
    /**
     * Creates a new instance of RgbImage, assigning a constant value
     * 
     * @param nRgb
     *            the packed RGB value to assign
     * @param cWidth
     *            the image width
     * @param cHeight
     *            the image height
     */
    public RgbImageAndroid(int cWidth, int cHeight, int nRgb) {
        super(cWidth, cHeight, nRgb);
    }
    
    /**
     * The sole way to create an RgbImage from an image captured from the
     * camera. The parameters are the pointer to the byte data passed to the
     * JPEG picture callback and the width and height image you want. You must
     * reduce the image size because otherwise you will run out of memory. Width
     * and height reduction by a factor of 2 works on the GPhone.
     * <p>
     * Ex. usage
     * <p>
     * public void onPictureTaken(byte [] jpegData, android.hardware.Camera
     * camera) { RgbImage rgb = RgbImageAndroid.toRgbImage(jpegData,
     * camera.getParameters().getPictureSize().width/2,
     * camera.getParameters().getPictureSize().height/2); }
     * 
     * @param jpegData
     *            image data supplied to JpegPictureCallback
     * @param nWidth
     *            target width image to return
     * @param nHeight
     *            target height image to return
     * @return RgbImage initialized with the image from the camera.
     */
    public RgbImageAndroid(Bitmap bmp) {
        super(bmp.getWidth(), bmp.getHeight());
        int[] bmpData = new int[width * height];
        bmp.getPixels(bmpData, 0, width, 0, 0, width, height);
        System.arraycopy(bmpData, 0, imageData, 0, bmpData.length);
        bmpImage = bmp;
    }
    
    public Bitmap getBitmap() {
        if (bmpImage == null) {
            int[] bmpData = new int[getData().length];
            System.arraycopy(getData(), 0, bmpData, 0, getData().length);
            bmpImage = Bitmap.createBitmap(bmpData, getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        }
        return bmpImage;
    }
    
    static public void toDisplay(Context context, RgbImageAndroid rgb) {
        rgb.getBitmap();
    }
    
    static public void toFile(RgbImageAndroid rgb, int quality, String path) throws IOException {
        OutputStream os = new FileOutputStream(path);
        try {
            Bitmap bmp = rgb.getBitmap();
            Bitmap.CompressFormat format = Bitmap.CompressFormat.JPEG;
            path = path.toLowerCase();
            if (path.endsWith("jpg") || path.endsWith("jpeg")) { //$NON-NLS-1$ //$NON-NLS-2$
                format = Bitmap.CompressFormat.JPEG;
            } else if (path.endsWith("png")) { //$NON-NLS-1$
                format = Bitmap.CompressFormat.PNG;
            }
            bmp.compress(format, quality, os);
        } finally {
            os.close();
        }
    }
}
