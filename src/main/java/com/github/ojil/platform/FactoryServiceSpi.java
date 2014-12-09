package com.github.ojil.platform;

import com.github.ojil.android.ImageFactorySpi;
import com.github.ojil.core.ImageFactory;
import com.github.ojil.core.OjilFactories;

public class FactoryServiceSpi implements OjilFactories {

    @Override
    public ImageFactory getImageFactory() {
        return new ImageFactorySpi();
    }
}