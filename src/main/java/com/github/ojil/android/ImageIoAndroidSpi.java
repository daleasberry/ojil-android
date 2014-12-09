package com.github.ojil.android;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import android.graphics.Bitmap;

import com.github.ojil.core.Image;
import com.github.ojil.core.ImageIo;

public class ImageIoAndroidSpi implements ImageIo {
    
    @Override
    public void writeFile(Image image, int quality, String path) throws IOException{
        //TODO handle other ImageType-s
        RgbImageAndroid rgb = (RgbImageAndroid) image;
        OutputStream os = new FileOutputStream(path);
        try {
            Bitmap bmp = rgb.getBitmap();
            Bitmap.CompressFormat format = Bitmap.CompressFormat.JPEG;
            path = path.toLowerCase();
            if (path.endsWith("jpg") || path.endsWith("jpeg")) {
                format = Bitmap.CompressFormat.JPEG;
            } else if (path.endsWith("png")) {
                format = Bitmap.CompressFormat.PNG;
            }
            bmp.compress(format, quality, os);
        } finally {
            os.close();
        }
    }
    
    @Override
    public Image readFile(String path) {
        return null;
    }
}