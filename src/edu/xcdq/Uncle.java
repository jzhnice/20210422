package edu.xcdq;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-22 16:27
 */
public class Uncle {
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;

    }

    public void setAge(int age){
        this.age = age;
    }

    public void getAge(){
        return ;
    }
    //   发红包
    public void sendhongbao(){
        System.out.println("舅舅在发红包");
    }

}
