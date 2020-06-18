package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int setAge) {
        if (setAge < 0 && setAge > 100) {
            setAge = 0;
        }else if ()
    }

    public boolean isTeen(){
        if( setAge() > 12 || setAge() < 20){
            return true;
        }else{
            return false;
        }

    }

    public String getFullName(){
       if(firstName.isEmpty()&& lastName.isEmpty()){
           return "";
       }else if (firstName.isEmpty()){
           return lastName;

       }else if (lastName.isEmpty()) {
           return firstName;
       }else{
           return firstName+" "+lastName;
       }

    }
}
