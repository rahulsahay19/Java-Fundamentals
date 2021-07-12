public class Main {
    public static void main(String[] args) {
        GearBox bmw = new GearBox(7);
        //Inner class instance creation
//        GearBox.Gear first = bmw.new Gear(1, 12.3);
//        System.out.println(first.driveSpeed(1000));
        bmw.addGear(1, 5.3);
        bmw.addGear(2, 10.6);
        bmw.addGear(3, 15.9);
        bmw.useClutch(true);
        bmw.changeGear(1);
        bmw.useClutch(false);
        System.out.println(bmw.wheelSpeed(1000));
        bmw.changeGear(2);
        System.out.println(bmw.wheelSpeed(2000));
        bmw.useClutch(true);
        bmw.changeGear(3);
        bmw.useClutch(false);
        System.out.println(bmw.wheelSpeed(3000));
    }
}
