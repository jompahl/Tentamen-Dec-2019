import java.util.ArrayList;

public class Car {
    private String regNr;
    private String brandName;
    private ArrayList<Parkingspace> parkeringLista = new ArrayList<>();

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public ArrayList<Parkingspace> getParkeringLista() {
        return parkeringLista;
    }

    public void setParkeringLista(ArrayList<Parkingspace> parkeringLista) {
        this.parkeringLista = parkeringLista;
    }


}
