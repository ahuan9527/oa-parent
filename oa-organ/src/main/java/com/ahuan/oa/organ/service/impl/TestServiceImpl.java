package com.ahuan.oa.organ.service.impl;

import com.ahuan.oa.organ.service.TestService;

public class TestServiceImpl implements TestService {
    public void sayHello() {
        System.out.println("你好！");
        System.out.println("pring invoke this method !");
        System.out.println("打印一个好的日志！");
    }

    public void sayFetch() {
        System.out.println("我新增了一个开发分支！");
    }

    public void continueTest() {
        System.out.println("我们开了一个bugfix修复bug，合并到master后 继续回到开发分支进行开发！");
    }
}
