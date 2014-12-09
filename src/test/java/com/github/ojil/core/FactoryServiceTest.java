package com.github.ojil.core;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.ojil.android.ImageFactorySpi;

public class FactoryServiceTest {
    
    @Test
    public void testGetImageFactory() {
        FactoryService service = new FactoryService();
        service.getImageFactory();
        assertNotNull(service.getImageFactory());
        assertEquals(ImageFactorySpi.class, service.getImageFactory().getClass());
    }
}