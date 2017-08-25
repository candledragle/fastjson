package com.alibaba.json.test.sym;

import java.util.ArrayList;

/**
 * Created by sym on 17/8/24.
 */
public class Person {


    public String name = "person";
    public int age;
    public boolean flag;
    public long l;

    public Child aChild;

    public ArrayList<Child> childs;

    public ArrayList<Son> sons;

    public static class Child {
        public String name = "child";
        public int age;
    }

    public static class Son {

        public ArrayList<Haha> hahas;

        public String name = "son";
        public int age;

        public static class Haha {
            public boolean flag;
        }
    }
}
