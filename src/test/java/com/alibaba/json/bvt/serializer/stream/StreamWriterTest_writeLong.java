package com.alibaba.json.bvt.serializer.stream;

import java.io.StringWriter;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.json.SerializeWriterTestUtils;


public class StreamWriterTest_writeLong extends TestCase {
    public void test_0() throws Exception {
        StringWriter out = new StringWriter();
        
        SerializeWriter writer = new SerializeWriter(out, 10);
        Assert.assertEquals(10, SerializeWriterTestUtils.getBufferLength(writer));
        
        writer.write("abcde");
        writer.writeLong(12345678L);
        writer.close();
        
        String text = out.toString();
        Assert.assertEquals("abcde12345678", text);
    }
}
