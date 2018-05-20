package com.dw;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.submitted.basetest.User;
import org.junit.Test;

/**
 * Created by
 *
 * @author dw
 * @date 2018/05/20
 */
public class javaBase {
    private final MyUser a;//final属性只能通过构造器初始化或者定义的时候初始化

    public javaBase() {
        this.a = new MyUser("hi");
    }

    @Test
    public void finaltest() {

        System.out.println(a.getName());
    }

    public static class MyUser {
        private final String name;

        //final属性可以用构造器初始化
        public MyUser(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

}

