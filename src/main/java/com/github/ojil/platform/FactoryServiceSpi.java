package com.github.ojil.platform;

import android.graphics.Bitmap;

import com.github.ojil.android.ImageFactoryAndroidSpi;
import com.github.ojil.android.IoFactoryAndroidSpi;
import com.github.ojil.core.ImageFactory;
import com.github.ojil.core.IoFactory;
import com.github.ojil.core.OjilFactories;

public class FactoryServiceSpi implements OjilFactories {

    @Override
    public ImageFactory<Bitmap> getImageFactory() {
        return new ImageFactoryAndroidSpi();
    }

    @Override
    public IoFactory getIoFactory() {
        return new IoFactoryAndroidSpi();
    }
}