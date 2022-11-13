package com.designpattern.behavioral.templateMethod.mediaConverterExample;

import com.designpattern.behavioral.templateMethod.mediaConverterExample.converters.AudioConverter;
import com.designpattern.behavioral.templateMethod.mediaConverterExample.converters.VideoConverter;
import com.designpattern.behavioral.templateMethod.mediaConverterExample.processer.MediaProcessor;

public class Client {
    public static void main(String[] args) {
        MediaProcessor processor = new MediaProcessor(new AudioConverter(), "file.m4a");
        processor.process();

        processor.setConverter(new VideoConverter());
        processor.process();
    }
}
