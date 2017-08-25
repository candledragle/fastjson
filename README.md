## 应用fastJson生成自测用例

例子：

```
Properties properties = new Properties();
String json = GenerateBeanUtils.generateTestData(ChoiceHouseBean.class, properties);
```

### Properties设置默认值

```
public class Properties {

    public Boolean aBoolean = true;

    public int aInt = 1;

    public long aLong = 30000;

    public String aString = "就不呵呵呵";

    public double aDouble = 400.00;

}
```

### javaBean 填写测试用例内容

```
private int qdpCode = 100;
private int pageNo = 0;
private int pageSize = 20;
private int toalCount = 100;
private String message = "成功";
private String toast;
private List<ListEntity> reportDetail;
```

# fastjson

[![Build Status](https://travis-ci.org/alibaba/fastjson.svg?branch=android)](https://travis-ci.org/alibaba/fastjson)
[![Codecov](https://codecov.io/gh/alibaba/fastjson/branch/android/graph/badge.svg)](https://codecov.io/gh/alibaba/fastjson/branch/android)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.alibaba/fastjson/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.alibaba/fastjson/)
[![GitHub release](https://img.shields.io/github/release/alibaba/fastjson.svg)](https://github.com/alibaba/fastjson/releases)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

Fast JSON Processor.

![fastjson](logo.jpg "fastjson")

## Documentation

- [Documentation Home](https://github.com/alibaba/fastjson/wiki)
- [Frequently Asked Questions](https://github.com/alibaba/fastjson/wiki/%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98)

## Benchmark

https://github.com/eishay/jvm-serializers/wiki

## Download

http://repo1.maven.org/maven2/com/alibaba/fastjson/

## Maven

```xml
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>fastjson</artifactId>
    <version>x.x.x</version>
</dependency>
```
