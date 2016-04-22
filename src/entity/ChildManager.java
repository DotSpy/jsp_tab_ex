package entity;

import java.util.ArrayList;

public class ChildManager {
    private String firstName = null;
    private String lastName = null;
    private int age = 0;

    public ChildManager() {
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(Integer age){
        this.age = age;
    }
//    private ArrayList integerList = new ArrayList<Integer>(){{
//        add(1);
//        add(2);
//        add(3);
//        add(4);
//        add(5);
//    }};
//
//    public ArrayList getIntegerList() {
//        return integerList;
//    }
//
//    public void setIntegerList(ArrayList integerList) {
//        this.integerList = integerList;
//    }
}
