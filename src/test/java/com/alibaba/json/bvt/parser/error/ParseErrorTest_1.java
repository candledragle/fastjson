package com.alibaba.json.bvt.parser.error;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

import junit.framework.TestCase;

public class ParseErrorTest_1 extends TestCase {

    public void test_for_error() throws Exception {
        Exception error = null;
        try {
            JSON.parse("{\"value\":\"xx\"");
        } catch (JSONException ex) {
            error = ex;
        }
        Assert.assertNotNull(error);
    }
}
