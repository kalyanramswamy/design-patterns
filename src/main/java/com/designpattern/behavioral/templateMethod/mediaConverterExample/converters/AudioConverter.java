package com.designpattern.behavioral.templateMethod.mediaConverterExample.converters;

public class AudioConverter extends AbstractMediaConverter {

    @Override
    public void convert(String file) {
        System.out.println("Converting " + file + " to audio");
    }
}
