package com.github.ojil.core;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.ojil.android.ImageFactoryAndroidSpi;

public class FactoryServiceTest {
    
    @Test
    public void testGetImageFactory() {
        assertNotNull(ImageFactoryService.getImageFactory());
        assertEquals(ImageFactoryAndroidSpi.class, ImageFactoryService.getImageFactory().getClass());
    }
}