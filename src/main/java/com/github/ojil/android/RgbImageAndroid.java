package com.github.ojil.android;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import android.content.Context;
import android.graphics.Bitmap;

import com.github.ojil.core.RgbImage;

public class RgbImageAndroid extends RgbImage {
    
    /** Creates a new instance of RgbImage
     *
     * @param cWidth   the image width
     * @param cHeight  the image height 
     */
    public RgbImageAndroid(int cWidth, int cHeight) {
        super(cWidth, cHeight);
    }
    
    public RgbImageAndroid(int cWidth, int cHeight, Integer[] rnData) {
        super(cWidth, cHeight, rnData);
    }
    
    /**
     * Creates a new instance of RgbImage, assigning a constant value
     * @param bR the red color value to be assigned.
     * @param bG the green color value to be assigned.
     * @param bB the blue color value to be assigned.
     * @param cWidth the image width
     * @param cHeight the image height
     */
    public RgbImageAndroid(int cWidth, int cHeight, byte bR, byte bG, byte bB) {
        super(cWidth, cHeight, bR, bG, bB);
    }
    
    /**
     * Creates a new instance of RgbImage, assigning a constant value
     * @param nRgb the packed RGB value to assign
     * @param cWidth the image width
     * @param cHeight the image height
     */
    public RgbImageAndroid(int cWidth, int cHeight, int nRgb) {
        super(cWidth, cHeight, nRgb);
    }
    
    /**
	 * The sole way to create an RgbImage from an image captured from the camera.
	 * The parameters are the pointer to the byte data passed to the JPEG picture
	 * callback and the width and height image you want. You must reduce the
	 * image size because otherwise you will run out of memory. Width and height
	 * reduction by a factor of 2 works on the GPhone.<p>
	 * Ex. usage<p>
	 * public void onPictureTaken(byte [] jpegData, android.hardware.Camera camera) {
     *  	RgbImage rgb = RgbImageAndroid.toRgbImage(jpegData, 
     *  			camera.getParameters().getPictureSize().width/2,
     *  			camera.getParameters().getPictureSize().height/2);
     * }
	 * @param jpegData image data supplied to JpegPictureCallback
	 * @param nWidth target width image to return
	 * @param nHeight target height image to return
	 * @return RgbImage initialized with the image from the camera.
	 */
    static public RgbImage toRgbImage(Bitmap bmp) {
    	int nWidth = bmp.getWidth();
    	int nHeight = bmp.getHeight();
    	int[] bmpData = new int[nWidth * nHeight];
    	Integer[] rgbData = new Integer[bmpData.length];
    	bmp.getPixels(bmpData, 0, nWidth, 0, 0, nWidth, nHeight);
    	System.arraycopy(bmpData, 0, rgbData, 0, bmpData.length);
    	RgbImage rgb = new RgbImage(nWidth, nHeight, rgbData);
    	return rgb;
    }

    static public Bitmap toBitmap(RgbImage rgb)
    {
    	Integer[] rgbData = rgb.getData();
    	int[] bmpData = new int[rgbData.length];
    	System.arraycopy(rgbData, 0, bmpData, 0, rgbData.length);
    	return Bitmap.createBitmap(
    			bmpData, 
    			rgb.getWidth(), 
    			rgb.getHeight(), 
    			Bitmap.Config.ARGB_8888);
    }
    
    static public void toDisplay(Context context, RgbImage rgb) 
    {
    	toBitmap(rgb);
    }
    
    static public void toFile(Context context, RgbImage rgb, int nQuality, String szPath) 
    	throws IOException
    {
     	OutputStream os = new FileOutputStream(szPath);
     	try {
	     	Bitmap bmp = toBitmap(rgb);
	     	Bitmap.CompressFormat format = Bitmap.CompressFormat.JPEG;
	     	szPath = szPath.toLowerCase();
	     	if (szPath.endsWith("jpg") || szPath.endsWith("jpeg")) { //$NON-NLS-1$ //$NON-NLS-2$
     			format = Bitmap.CompressFormat.JPEG;
	     	} else if (szPath.endsWith("png")) { //$NON-NLS-1$
     			format = Bitmap.CompressFormat.PNG;
     		}
	     	bmp.compress(format, nQuality, os);
     	} finally {
     		os.close();
     	}
    }
}
