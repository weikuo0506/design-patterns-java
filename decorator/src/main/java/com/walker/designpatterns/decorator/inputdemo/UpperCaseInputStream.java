package com.walker.designpatterns.decorator.inputdemo;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by walker on 2016/11/3.
 */
public class UpperCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected UpperCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = in.read();
        return c == -1?c:Character.toUpperCase((char)c);
    }

    public int read(byte[] b, int off, int len) throws IOException {
        int num = in.read(b, off, len);
        for(int i=off;i<off+num;i++) {
            b[i] = (byte)Character.toUpperCase((char)b[i]);
        }
        return num;
    }
}
