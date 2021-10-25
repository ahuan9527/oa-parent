package com.ahuan.oa.organ.service.impl;

import com.ahuan.oa.organ.service.TestService;

public class TestServiceImpl implements TestService {
    public void sayHello() {
        System.out.println("你好！,bug 修复！");
        System.out.println("pring invoke this method !");
        System.out.println("打印一个好的日志！");
        System.out.println("修改了feature/002！");
    }

    public void sayFetch() {
        System.out.println("我新增了一个开发分支！,我也搞一个！");
        System.out.println("test origin master!");
    }

    public void continueTest() {
        System.out.println("我们开了一个bugfix修复bug，合并到master后 继续回到开发分支进行开发！");
        System.out.println("add a github!");
        System.out.println("add feature/001!");
    }
}
