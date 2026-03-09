package com.basics.arrays;
    class Equipment {
        String name;
        int equipment_id;
        String lab;
        double voltage;
        boolean isWorking;
        Equipment(String name, int equipment_id, String lab, double voltage, boolean isWorking) {
            this.name = name;
            this.equipment_id = equipment_id;
            this.lab = lab;
            this.voltage = voltage;
            this.isWorking = isWorking;
        }
    }

public class E9 {
    static void main(String[] args) {
        Equipment[] e1 = new Equipment[]{
                new Equipment("Breadboard",1,"DC",7.0,true),
                new Equipment("Signal Generator",2,"DSP",2.0,false),
        };
       for (Equipment e : e1) {
           System.out.println(e.name + ", " + e.equipment_id + ", " + e.lab + ", " + e.voltage + ", " + e.isWorking);
       }

    }
    }

