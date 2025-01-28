package Task_12;

public class Coin {

    private Integer nominal;
    private Integer prise;
    private String country;
    private Double diametr;

    public Coin(Integer nominal, Integer prise, String country, Double diametr) {
        this.nominal = nominal;
        this.prise = prise;
        this.country = country;
        this.diametr = diametr;
    }

    public Integer getNominal() {
        return nominal;
    }

    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    public Integer getPrise() {
        return prise;
    }

    public void setPrise(Integer prise) {
        this.prise = prise;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getDiametr() {
        return diametr;
    }

    public void setDiametr(Double diametr) {
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Прайс " + prise +
                ". Номинал " + nominal +
                ". Страна " + country +
                ". Диаметр " + diametr;
    }
}
