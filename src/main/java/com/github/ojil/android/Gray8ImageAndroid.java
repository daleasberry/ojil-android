package com.github.ojil.android;

import android.graphics.Bitmap;

import com.github.ojil.core.Gray8Image;

public class Gray8ImageAndroid extends Gray8Image<Bitmap> {
	public Gray8ImageAndroid(int nWidth, int nHeight, Byte[] rbYuvData) {
		super(nWidth, nHeight, rbYuvData);
	}
}
