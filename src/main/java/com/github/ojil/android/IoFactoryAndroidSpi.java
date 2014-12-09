package com.github.ojil.android;

import com.github.ojil.core.ImageIo;
import com.github.ojil.core.IoFactory;

public class IoFactoryAndroidSpi implements IoFactory {
    
    @Override
    public ImageIo createIo() {
        return new ImageIoAndroidSpi();
    }   
}