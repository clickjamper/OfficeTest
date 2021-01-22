package com.company;

import java.util.ArrayList;

public class Office {

    Cabinet cab1;
    Cabinet cab2;
    Cabinet cab3;

    Human h1;
    Human h2;
    Human h3;

    ArrayList<Cabinet> listCab = new ArrayList<Cabinet>();;
    ArrayList<Human> listH = new ArrayList<Human>();;

    PrinterDevice printerDevice;
    ScanerDevice scanerDevice;
    CombinerDevice combinerDevice;

    public void go(){
        h1 = new Human("Иванов Иван Иванович", 1);
        listH.add(h1);
        h2 = new Human("Борисов Глеб Евгеньевич", 2);
        listH.add(h2);
        h3 = new Human("Александров Александр Александрович", 3);
        listH.add(h3);

        printerDevice = new PrinterDevice(145);
        scanerDevice = new ScanerDevice(545);
        combinerDevice = new CombinerDevice(343);

        cab1 = new Cabinet(1, h1, printerDevice);
        listCab.add(cab1);

        cab2 = new Cabinet(2,h3, scanerDevice);
        listCab.add(cab2);

        cab3 = new Cabinet(3, h2, combinerDevice);
        listCab.add(cab3);

        for (int i = 0; i < listCab.size(); i++){

            Cabinet c = listCab.get(i);
            c.info();
            System.out.println();
        }

        for (int i = 0; i < listH.size(); i++){

            Human h = listH.get(i);
            h.info();
            System.out.println();
        }

    }

}
