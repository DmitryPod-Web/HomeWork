package Task_12;

import java.util.Comparator;

public class ComparatorCoin implements Comparator<Coin> {



    @Override

    public int compare(Coin o1, Coin o2) {
        Integer priceCompare = Integer.compare(o1.getPrise(), o2.getPrise());
        if (priceCompare != 0) return priceCompare;



        Integer nominalCompare = Integer.compare(o1.getNominal(), o2.getNominal());
        if (nominalCompare != 0) return nominalCompare;



        Integer countryCompare = o1.getCountry().compareTo(o2.getCountry());
        if (countryCompare != 0) return countryCompare;


        return Double.compare(o1.getDiametr(), o2.getDiametr());
    }

}
