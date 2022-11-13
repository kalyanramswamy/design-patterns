package com.designpattern.behavioral.templateMethod.mediaConverterExample.processer;

import com.designpattern.behavioral.templateMethod.mediaConverterExample.converters.AbstractMediaConverter;

public class MediaProcessor {
    private AbstractMediaConverter converter;
    private String fileName;

    public MediaProcessor(AbstractMediaConverter converter, String fileName) {
        this.converter = converter;
        this.fileName = fileName;
    }

    public void process() {
        this.converter.convert(this.fileName);
    }

    public void setConverter(AbstractMediaConverter converter) {
        this.converter = converter;
    }
}
