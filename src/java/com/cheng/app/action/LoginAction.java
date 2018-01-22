/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cheng.app.action;

import com.cheng.app.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;

/**
 *
 * @author james
 */
public class LoginAction extends ActionSupport {
    // Action类里包含一个不带泛型的Map类型的成员变量

    private Map users;

    // users属性的setter和getter方法
    public void setUsers(Map users) {
        this.users = users;
    }

    public Map getUsers() {
        return this.users;
    }

    @Override
    public String execute() throws Exception {
//        int a =1;
        // 在控制台输出Struts 2封装产生的Map对象
        System.out.println(getUsers());
        User firstUser = (User) getUsers().get("one");
        // 根据Map对象中key为one的User实例来决定控制逻辑
        if (firstUser.getName().equals("crazyit.org")
                && firstUser.getPass().equals("leegang")) 
//       if(a ==1) 
       {
            addActionMessage("登录成功！");
            return SUCCESS;
        }
        addActionMessage("登录失败！！");
        return ERROR;
    }
}
