package com.github.ojil.platform;

import com.github.ojil.android.ImageFactoryAndroidSpi;
import com.github.ojil.android.IoFactoryAndroidSpi;
import com.github.ojil.core.ImageFactory;
import com.github.ojil.core.IoFactory;
import com.github.ojil.core.OjilFactories;

public class FactoryServiceSpi implements OjilFactories {

    @Override
    public ImageFactory getImageFactory() {
        return new ImageFactoryAndroidSpi();
    }

    @Override
    public IoFactory getIoFactory() {
        return new IoFactoryAndroidSpi();
    }
}