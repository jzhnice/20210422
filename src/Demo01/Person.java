package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-22 16:41
 */
public class Person {
   private String name;
   private  int age;
   public  void setName( String name){
       this.name = name;
   }
   public String getName(){
       return name;
   }
   public void setAge(int age){
       this.age = age;
   }
   public int getAge(){
       return  age;
   }
   public void eatfan(){
       System.out.println("正在吃饭");
   }


}
