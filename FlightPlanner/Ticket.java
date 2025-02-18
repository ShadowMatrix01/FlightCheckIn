
/**
 * @Jhan Gomez
 * @1.0.1 (Version)
 * @A class that allows information for the ticket to be printed correctly. */
import java.text.NumberFormat;
public class Ticket {
private String name, airline, date, departingLocation, arrivingLocation, departingAirportCode, arrivingAirportCode;
private int baggage, carryOn;
private int price_1, price_2;
NumberFormat priceChecker=NumberFormat.getCurrencyInstance(); //To properly demonstrate the price
    public void setBaggage(int bags) {
        baggage=bags;
    }
    public int getBaggage() {
        return baggage;
    }
    public void setCarryOn(int carOn) {
        carryOn=carOn;
    }
    public int getCarryOn() {
        return carryOn;
    }
    public void setAirline (String airName) {
        airline=airName;
    }
    public String getAirline() {
        return airline;
    }
     public void setName (String airName) {
        name=airName;
    }
    public String getName() {
        return name;
    }
     public void setDate (String airDate) {
       date=airDate;
    }
    public String getDate() {
        return date;
    }
     public void setDepartingLocation (String airDepLoc) {
        departingLocation=airDepLoc;
    }
    public String getDepartingLocation() {
        return departingLocation;
    }
     public void setArrivingLocation (String airArrLoc) {
        arrivingLocation=airArrLoc;
    }
    public String getArrivingLocation() {
        return arrivingLocation;
    }
     public void setDepartingAirportCode (String airDepAirCo) {
        departingAirportCode=airDepAirCo;
    }
    public String getDepartingAirportCode() {
        return departingAirportCode;
    } 
     public void setArrivingAirportCode (String airArrAirCo) {
        arrivingAirportCode=airArrAirCo;
    }
    public String getArrivingAirportCode() {
        return arrivingAirportCode;
    }
   /*  public void setTime (String airTime) {
        time=airTime;
    }
    public String getTime() { Not needed, from a previous version!
        return time;
    } */
    public void setPriceCarryOn (int carryPri) { //Determines what the flyer must pay for carryons
       if (carryPri > 1) {
       price_1=carryPri * 55;
    } else {
        price_1=0;
    }
    }
    public int getPriceCarryOn () {
       return price_1;
    }
    public void setPriceBaggageOn (int bagPri) { 
       if (bagPri > 1) {
       price_2= bagPri * 70;
    } else {
        price_2=0;
    }
    }
    public int getPriceBaggageOn () {
       return price_2;
    }
    public void printTicket () { //A method to print all of their the user's information.
      int totalPrice=price_2 + price_1;
      String price=priceChecker.format(totalPrice);
      System.out.println("Success! Thank you for using " + airline + "!" + "Here is the information for your upcoming trip: \n");
      System.out.println(" NAME: " + name + "\n DATE: " + date +"\n DEPARTING: " + departingLocation + "\n AIRPORT: " + departingAirportCode + "\n ARRIVING: "
      + arrivingLocation + "\nAIRPORT: " + arrivingAirportCode + "\n CARRYONS: " + carryOn + "\n BAGS: " + baggage); 
      System.out.println("\nSince you indicated you are carrying "  + baggage + " bag(s) and " + carryOn + " carry-on(s), you will pay: \n" + price_2 + " + " + price_1
      + "\nFor a total of: " + price);
      //To do, add gate number to ticket somehow.
    }
    //To-Do: Randomly generate a user code, aswell as implement flight numbers aswell as verification that these exist.
}
//For testing with git.
