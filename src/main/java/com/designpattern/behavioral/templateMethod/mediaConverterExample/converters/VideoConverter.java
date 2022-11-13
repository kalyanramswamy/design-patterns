package com.designpattern.behavioral.templateMethod.mediaConverterExample.converters;

public class VideoConverter extends AbstractMediaConverter {

    @Override
    public void convert(String file) {
        System.out.println("Converting " + file + " to video");
    }
}
