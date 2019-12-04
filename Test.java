public class Test {

    public static void main(String[] args) {
        Parking park = new Parking();

        park.setAddress("hamngatan 1");
        park.setName("Aqua");

        Parkingspace p1 = new Parkingspace();
        Parkingspace p2 = new Parkingspace();
        Parkingspace p3 = new Parkingspace();
        Parkingspace p4 = new Parkingspace();

        p1.setNbr(1);
        p2.setNbr(2);
        p3.setNbr(3);
        p4.setNbr(4);

        p1.setRent(6000);
        p2.setRent(6000);
        p3.setRent(10000);
        p4.setRent(5000);

        p1.setType("liten");
        p2.setType("liten");
        p3.setType("stor");
        p4.setType("stor");

        Car c1 = new Car();
        Car c2 = new Car();

        c1.setRegNr("ABC123");
        c1.setBrandName("volvo");
        c2.setRegNr("AAA222");
        c2.setBrandName("SAAB");

        c1.getParkeringLista().add(p1);
        c1.getParkeringLista().add(p2);
        c2.getParkeringLista().add(p3);

        p1.add(c1);
        p2.add(c1);
        p3.add(c2);

        park.add(p1);
        park.add(p2);
        park.add(p3);
        park.add(p4);

        for(Parkingspace tmpParkingspace : park.getAAllAvailableParkingspaces()) {
            System.out.println(tmpParkingspace.getNbr());
        }

        System.out.println(park.totalRent());

        for(Parkingspace tmpParkingspace : park.getParkings()) {
            if(tmpParkingspace.getCar() != null) {
                System.out.println(tmpParkingspace.getCar().getRegNr() + " " + tmpParkingspace.getCar().getBrandName());
            }
        }

        for(Parkingspace tmpParkingspace : park.findParkingspacesForCar("ABC123")) {
            System.out.println(tmpParkingspace.getNbr());
        }

    }

}
