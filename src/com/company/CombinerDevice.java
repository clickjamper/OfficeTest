package com.company;

public class CombinerDevice implements Device {

    Integer id;

    public CombinerDevice(Integer id){
        this.id = id;
    }

    @Override
    public void setID(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getID() {
        return id;
    }

    @Override
    public void work() {
        System.out.println("Лазерная печать");
        System.out.println("Сканирование");
        System.out.println("Копирование");
    }

    @Override
    public void onDevice() {
        System.out.println("Комбайн включен");
    }

    @Override
    public void offDevice() {
        System.out.println("Комбайн выключен");
    }

    @Override
    public void info() {
        System.out.println("Комбайн номер " + id);
    }
}
