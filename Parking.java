import java.util.ArrayList;

public class Parking {
    private String address;
    private String name;
    private ArrayList<Parkingspace> parkings = new ArrayList<>();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Parkingspace> getParkings() {
        return parkings;
    }

    public void setParkings(ArrayList<Parkingspace> parkings) {
        this.parkings = parkings;
    }

    public void add(Parkingspace p) {
        parkings.add(p);
    }

    public Parkingspace find(int nbr) {
        for(Parkingspace tmpParkingspace : parkings) {
            if(tmpParkingspace.getNbr() == nbr) {
                return tmpParkingspace;
            }
        }
        return null;
    }

    public ArrayList<Parkingspace> findParkingspacesForCar(String regNbr) {
        ArrayList<Parkingspace> parkingsForCar = new ArrayList<>();

        for(Parkingspace tmpParkingspace : parkings) {
            if(tmpParkingspace.getCar().getRegNr().equals(regNbr)) {
                parkingsForCar.add(tmpParkingspace);
            }
        }
        return parkingsForCar;
    }

    public double totalRent() {
        double rentTotal = 0;
        for(Parkingspace tmpParkingspace : parkings) {
            if(tmpParkingspace.getCar() != null) {
                rentTotal += tmpParkingspace.getRent();
            }
        }
        return rentTotal;
    }

    public ArrayList<Parkingspace> getAAllAvailableParkingspaces() {
        ArrayList<Parkingspace> availableParkings = new ArrayList<>();

        for(Parkingspace tmpParkingspace : parkings) {
            if(tmpParkingspace.getCar() == null) {
                availableParkings.add(tmpParkingspace);
            }
        }

        return availableParkings;
    }


}
