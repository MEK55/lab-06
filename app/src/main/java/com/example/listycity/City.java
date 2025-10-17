package com.example.listycity;

/**
 * This class defines a City
 */
public class City implements Comparable{
    private String city;
    private String province;

    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     *Get the city object name
     * @return
     * returns the city name
     */

    public String getCityName() {
        return this.city;
    }

    /**
     * Returns province name
     * @return
     *returns the province name
     */

    public String getProvinceName() {
        return this.province;
    }

    /**
     *Compares given objects
     * @param o the object to be compared.
     * @return
     * returns an int based on the comparison
     */
    @Override
    public int compareTo(Object o){
        City city = (City)o;
        return this.city.compareTo(city.getCityName()); //this.city refers to the city name
    }
}
