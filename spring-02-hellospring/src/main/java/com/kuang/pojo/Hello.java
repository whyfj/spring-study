package com.kuang.pojo;

public class Hello {
    private String name;

    public Hello() {
        System.out.println("测试");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("Hello,"+ name );
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
