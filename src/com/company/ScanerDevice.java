package com.company;

public class ScanerDevice implements Device {

    Integer id;

    public ScanerDevice(Integer id){
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
        System.out.println("Сканирует");
    }

    @Override
    public void onDevice() {
        System.out.println("Сканер включен");
    }

    @Override
    public void offDevice() {
        System.out.println("Сканер выключен");
    }

    @Override
    public void info() {
        System.out.println("Сканер номер " + id);
    }
}
