package com.company;

public class Human {

    String name;
    Integer id;
    Integer cabId;

    public Human(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public Integer getId(){
        return id;
    }

    public void setCabinetID(Integer cabId){
        this.cabId = cabId;
    }

    public void info(){
        System.out.println("Работник " + name + " личный номер " + id + " Кабинет номер " + cabId);
    }
}
