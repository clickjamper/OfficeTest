package com.company;

public class Cabinet {

    Integer id;
    Human human;
    Device device;

    public Cabinet(Integer id, Human human, Device device){
        this.id = id;
        this.human = human;
        human.setCabinetID(id);
        this.device = device;
    }

    public Integer getId(){
        return id;
    }

    public void addHuman(Human human){
        this.human = human;
    }

    public void info(){
        System.out.println("Кабинет номер " + id);
        device.info();
    }

}
