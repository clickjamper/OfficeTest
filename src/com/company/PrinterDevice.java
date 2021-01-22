package com.company;

public class PrinterDevice implements Device {

    Integer id;

    public PrinterDevice(Integer id){
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
        System.out.println("Принтер печатает");
    }

    @Override
    public void onDevice() {
        System.out.println("Принтер включен");
    }

    @Override
    public void offDevice() {
        System.out.println("Принтер выключен");
    }

    @Override
    public void info() {
        System.out.println("Принтер номер " + id);
    }
}
