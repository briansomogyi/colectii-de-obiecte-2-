package ColectiiDeObiecte;

public class Produs {
    private String nume;
    private double pret;
    
    public Produs(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public double getPret() {
        return pret;
    }
    
    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Produs [nume=" + nume + ", pret=" + pret + "]";
    }

    
}
