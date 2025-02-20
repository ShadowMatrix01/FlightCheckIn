
/**
 * @Jhan Gomez
 * @1.0.1 (Version)
 * @A class that allows information for the ticket to be printed correctly. */
import java.text.NumberFormat;
import java.util.ArrayList;
public class Ticket {
private String name, flightNumber, airline, date, departingLocation, arrivingLocation, departingAirportCode, arrivingAirportCode;
private int baggage, carryOn;
private int price_1, price_2;
NumberFormat priceChecker=NumberFormat.getCurrencyInstance(); //To properly demonstrate the price
 //Major airports list: https://www.cheapflights.co.uk/news/airports-in-north-east-usa
String [] majorAirportsNortheast={"Atlantic City International", "Baltimore/Washington International Thurgood Marshall",
        "Bradley International Airport", 
        "Buffalo Niagara International Airport", "John F Kennedy International Airport", 
    "La Guardia", "Logan International Airport", "Long Island MacArthur Airport", 
    "Manchester – Boston Regional Airport", "Newark Liberty International Airport", 
    "Philadelphia International Airport", "Pittsburgh International Airport",
    "Portland International Jetport", "Ronald Reagan Washington National Airport","Richmond International","T.F. Green Airport",
    "Washington Dulles International Airport"};
ArrayList<String> departingAndCode= new ArrayList<>(); //Allows both the airport and its IATA code to be returned.
ArrayList <String> arrivingAndCode= new ArrayList<>();
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
    // public void setDepartingLocation (String airDepLoc) {
    //    departingLocation=airDepLoc;
    //}
    //public String getDepartingLocation() {
       // return departingLocation;
    //}
    // public void setArrivingLocation (String airArrLoc) {
    //    arrivingLocation=airArrLoc;
   // }
    //public String getArrivingLocation() {
      //  return arrivingLocation;
   // }
     public void setDepartingAirportCode (String airDepAirCo) { //Modified to automatically get the departure location based on the users 
        switch (airDepAirCo) { //Switch statements based on airport code.
            case "ACY": departingAndCode.add("Atlantic City International (ACY)");
            break;
            case "BWI": departingAndCode.add("");
            break;
            case "BDL": departingAndCode.add("");
            break;
            case "BFN": departingAndCode.add("");
            break;
            case "JFK": departingAndCode.add("");
            break;
            case "LGA": departingAndCode.add("");
            break;
            case "BOS": departingAndCode.add("");
            break;
            case "ISP": departingAndCode.add("");
            break;
            case "MHT": departingAndCode.add("");
            break;
            case "EWR": departingAndCode.add("");
            break;
            case "PHL": departingAndCode.add("");
            break;
            case "PIT": departingAndCode.add("");
            break;
            case "PWM": departingAndCode.add("");
            break;
            case "DCA": departingAndCode.add("");
            break;
            case "RIC": departingAndCode.add("");
            break;
            case "PVD": departingAndCode.add("");
            break;
            case "IAD": departingAndCode.add("");
            break;
            default: //Add all valid airport codes from array!
            System.out.println("Invalid Airport Code: Please Try Again");
        }
       // departingAirportCode=airDepAirCo;
    }
    public ArrayList <String> getDepartingAirportCode() { //Since the program will be return an arrayList, the approprioate wrapper class is needed.
        //return departingAirportCode;
        return departingAndCode;
    } 
     public void setArrivingAirportCode (String airArrAirCo) {
         switch (airArrAirCo) {
            
        }
        //arrivingAirportCode=airArrAirCo;
    }
    public ArrayList <String> getArrivingAirportCode() {
        //return arrivingAirportCode;
        return arrivingAndCode;
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
    public void getFlightNumber (String flightNum) { //Need a way to properly assign flightNumbers based on IATA!
        flightNumber=flightNum;
    }
    public String setFlightNumber () {
        return flightNumber;
    }
    public void printTicket () { //A method to print all of their the user's information.
      int totalPrice=price_2 + price_1;
      String price=priceChecker.format(totalPrice);
      System.out.println("Success! Thank you for using " + airline + "!" + "Here is the information for your upcoming trip: \n");
      System.out.println(" NAME: " + name + "\n DATE: " + date +"\n DEPARTING: " + departingAndCode.get(0) + "\n AIRPORT: " + departingAirportCode + "\n ARRIVING: "
      + arrivingLocation + "\nAIRPORT: " + arrivingAirportCode + "\n CARRYONS: " + carryOn + "\n BAGS: " + baggage); 
      System.out.println("\nSince you indicated you are carrying "  + baggage + " bag(s) and " + carryOn + " carry-on(s), you will pay: \n" + price_2 + " + " + price_1
      + "\nFor a total of: " + price);
      //To do, add gate number to ticket somehow.
    }
    //To-Do, add a way to check for appropriate flight departures and arrivals,
    //limited to northeast region!
    //To-Do: Randomly generate a user code, aswell as implement flight numbers aswell as verification that these exist.
}
//For testing with git.
