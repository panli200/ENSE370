/**
 * ENSE 370 Assignment 2 
 * Author: Li Pan 200371281
 * class: Flight 
 * Pattern: Iterator Desgin Pattern
 * Each flight is iterator.
 */
public class Flight {

    private String departureCity;
    private String arrivalCity;
    private int departureTime;
    private int price;
	
    Flight(){
        
    }

    Flight(String departureCity, String arrivalCity, int departureTime, int price) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureTime = departureTime;
        this.price = price;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;

    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrival(String arrivalCity) {
        this.arrivalCity = arrivalCity;

    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;

    }

}
