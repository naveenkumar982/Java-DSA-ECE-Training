package com.basics.oops.pillars.polymorphism.overriding;

public class RBI {
    double rateOfInterest(){
        return 6.8;
    }
}
class HDFC extends RBI{
    @Override
    double rateOfInterest(){
        return 7.2;
    }
}
class ICICI extends RBI {
    @Override
    double rateOfInterest() {
        return 7.5;
    }
}
    class Canara extends RBI{
        @Override
        double rateOfInterest(){
            return 9.5;
        }

        static void main(String[] args) {
            //upcasting -> Parent obj = new Child();
            RBI rbi = new RBI();
            RBI hdfc = new HDFC();
            RBI icici = new ICICI();
            RBI canara = new Canara();
            System.out.println("The ROI of RBI: " + rbi.rateOfInterest() + "%");
            System.out.println("The ROI of HDFC: " + hdfc.rateOfInterest() + "%");
            System.out.println("The ROI of ICICI: " + icici.rateOfInterest() + "%");
            System.out.println("The ROI of Canara: " + canara.rateOfInterest() + "%");
        }
    }
