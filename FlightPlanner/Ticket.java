
/**
 * @Jhan Gomez
 * @1.0.4 (Version)
 * @A class that allows information for the ticket to be printed correctly.  */
import java.text.NumberFormat;
import java.util.HashMap; //A hashmap allows values to be stored with keys
//import java.util.ArrayList; Not needed anymore
import java.util.Map; //Is a better and more efficient implementation compared to before.
public class Ticket {
protected Map<String, String> departingAndCode=new HashMap<>();
protected Map<String, String> arrivingAndCode=new HashMap<>();
protected boolean arrivingCodeValid, departingCodeValid;
protected String name, flightNumber, airline, date, departingAirportCode, arrivingAirportCode, flightCodeAssigned, airlineAcronym;
//departingLocation and arrivingLocation will be removed.
protected int baggage, carryOn;
protected int price_1, price_2;
NumberFormat priceChecker=NumberFormat.getCurrencyInstance(); //To properly demonstrate the price
 //Major airports list: https://www.cheapflights.co.uk/news/airports-in-north-east-usa
 //IMPORTANT: AIRPORT CODE FOR BUFFALO IS INCORRECT IN THE ARTICLE AND WAS THUS CHANGED
String [] majorAirportsNortheast=
     { //In alphabetical order for clarity
    "\n(ACY) Atlantic City International Airport, Egg Harbor Township, New Jersey, U.S.", 
    "(BDL) Bradley International Airport, Windsor Locks, Connecticut, U.S.", 
    "(BOS) Boston Logan International Airport, Boston/Winthrop, Massachusetts, U.S.", 
    "(BUF) Buffalo Niagara International Airport, Cheektowaga, New York, U.S.", 
    "(BWI) Baltimore/Washington International Thurgood Marshall Airport, Anne Arundel County, Maryland, U.S.",
    "(DCA) Ronald Reagan Washington National Airport, Crystal City, Arlington County, Virginia, U.S.", 
    "(EWR) Newark Liberty International Airport, Newark/Elizabeth, New Jersey, U.S. ", 
    "(IAD) Washington Dulles International Airport, Dulles, Virginia, U.S.",
    "(ISP) Long Island MacArthur Airport, Ronkonkoma, New York, U.S.", 
    "(JFK) John F Kennedy International Airport, Jamaica, Queens, New York City, U.S.", 
    "(LGA) La Guardia Airport, East Elmhurst, Queens, New York City, New York, U.S. ", 
    "(MHT) Manchester – Boston Regional Airport, Manchester/Londonderry, New Hampshire, U.S. ",
    "(PIT) Pittsburgh International Airport, Allegheny County, Pennsylvania, U.S.",
    "(PHL) Philadelphia International Airport, Philadelphia / Tinicum Township, Delaware County, Pennsylvania, U.S.", 
    "(PVD) Rhode Island-T.F. Green Airport, Warwick, Rhode Island U.S.",
    "(RIC) Richmond International Airport, Sandston, Virginia, U.S.",
    "(PWM) Portland International Jetport, Portland, Oregon, U.S.\n"
    };
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
        switch (airline) { //Scalable, dependent on hypothetical airlines.
            case "USA Regional AIRPATH-Northeast" : airlineAcronym="US"; 
            setAirlineAcronym(airlineAcronym);
            break;
            default:
            System.out.println("ERROR: NOT A VALID AIRLINE!!! \nMODIFY AIRLINE DETAILS OR CONTACT SUPPORT FOR ASSITANCE AT (???)!!!-$$$$.");
            System.out.println("TICKET APPLICATION EXITED WITH ERRORS, INVALID INPUT DETECTED!\nREFERENCE CODE: 404");
            System.exit(0);
        }
    }
    public String getAirline() {
        return airline;
    }
    public void setAirlineAcronym(String airlineAcronym) {
        this.airlineAcronym=airlineAcronym;
    }
    public String getAirlineAcronym() {
        return airlineAcronym;
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
    public boolean setDepartingAirportCode (String airDepAirCo) { //Modified to automatically get the departure location based on the users 
         departingAirportCode=airDepAirCo;
         switch (airDepAirCo) { //Switch statements based on airport code.
            case "ACY": departingAndCode.put("ACY", "Atlantic City International Airport, Egg Harbor Township, New Jersey, U.S.");
            departingCodeValid=true;
            return true;
            case "BWI": departingAndCode.put("BWI", "Baltimore/Washington International Thurgood Marshall Airport, Anne Arundel County, Maryland, U.S.");
            departingCodeValid=true;
            return true;
            case "BDL": departingAndCode.put("BDL", "Bradley International Airport, Windsor Locks, Connecticut, U.S.");
            departingCodeValid=true;
            return true;
            case "BUF": departingAndCode.put("BUF", "Buffalo Niagara International Airport, Cheektowaga, New York, U.S.");
            departingCodeValid=true;
            return true;
            case "JFK": departingAndCode.put("JFK", "John F Kennedy International Airport, Jamaica, Queens, New York City, U.S.");
            departingCodeValid=true;
            return true;
            case "LGA": departingAndCode.put("LGA", "LaGuardia Airport, East Elmhurst, Queens, New York City, New York, U.S. ");
            departingCodeValid=true;
            return true;
            case "BOS": departingAndCode.put("BOS", "Boston Logan International Airport, Boston/Winthrop, Massachusetts, U.S.");
            departingCodeValid=true;
            return true;
            case "ISP": departingAndCode.put("ISP", "Long Island MacArthur Airport, Ronkonkoma, New York, U.S.");
            departingCodeValid=true;
            return true;
            case "MHT": departingAndCode.put("MHT", "Manchester – Boston Regional Airport, Manchester/Londonderry, New Hampshire, U.S.");
            departingCodeValid=true;
            return true;
            case "EWR": departingAndCode.put("EWR", "Newark Liberty International Airport, Newark/Elizabeth, New Jersey, U.S.");
            departingCodeValid=true;
            return true;
            case "PHL": departingAndCode.put("PHL", "Philadelphia International Airport, Philadelphia / Tinicum Township, Delaware County, Pennsylvania, U.S.");
            departingCodeValid=true;
            return true;
            case "PIT": departingAndCode.put("PIT", "Pittsburgh International Airport, Allegheny County, Pennsylvania, U.S.");
            departingCodeValid=true;
            return true;
            case "PWM": departingAndCode.put("PWM", "Portland International Jetport, Portland, Oregon, U.S.");
            departingCodeValid=true;
            return true;
            case "DCA": departingAndCode.put("DCA", "Ronald Reagan Washington National Airport, Crystal City, Arlington County, Virginia, U.S.");
            departingCodeValid=true;
            return true;
            case "RIC": departingAndCode.put("RIC", "Richmond International Airport, Sandston, Virginia, U.S.");
            departingCodeValid=true;
            return true;
            case "PVD": departingAndCode.put("PVD", "Rhode Island-T.F. Green Airport, Warwick, Rhode Island U.S.");
            departingCodeValid=true;
            return true;
            case "IAD": departingAndCode.put("IAD", "Washington Dulles International Airport, Dulles, Virginia, U.S.");
            departingCodeValid=true;
            return true;
            default: //Add all valid airport codes from array!
            departingCodeValid=false;
            System.out.println("Invalid Airport Code: Please Try Again");
            System.out.println("Valid Codes (denoted within braces)");
            for (String validAirportCodes: majorAirportsNortheast) {
            System.out.println("" + validAirportCodes); //Added all valid airport codes for airline routes.
        }
         return false;
    }
}
     public String getDepartingAirportName() { 
        if(departingCodeValid && departingAndCode.containsKey(departingAirportCode)) {
        return departingAndCode.get(departingAirportCode);
    } 
    return null;
}
     public boolean setArrivingAirportCode (String airArrAirCo) { //Switched to boolean for validation
         arrivingAirportCode=airArrAirCo;
         switch (airArrAirCo) { //Switch statements based on airport code.
            case "ACY": arrivingAndCode.put("ACY", "Atlantic City International Airport, Egg Harbor Township, New Jersey, U.S.");
            arrivingCodeValid=true;      
            flightCodeAssigned="701";
            return true;
           // break; break is not needed since the loop will stop when it returns tru
            case "BWI": arrivingAndCode.put("BWI", "Baltimore/Washington International Thurgood Marshall Airport, Anne Arundel County, Maryland, U.S.");
            arrivingCodeValid=true;   
            flightCodeAssigned="354";
            return true;
            case "BDL": arrivingAndCode.put("BDL", "Bradley International Airport, Windsor Locks, Connecticut, U.S.");
            arrivingCodeValid=true;   
            flightCodeAssigned="201";
            return true;
            case "BUF": arrivingAndCode.put("BUF", "Buffalo Niagara International Airport, Cheektowaga, New York, U.S.");
            arrivingCodeValid=true;
            flightCodeAssigned="399";
            return true;
            case "JFK": arrivingAndCode.put("JFK", "John F Kennedy International Airport, Jamaica, Queens, New York City, U.S.");
            arrivingCodeValid=true;
            flightCodeAssigned="969";
            return true;
            case "LGA": arrivingAndCode.put("LGA", "LaGuardia Airport, East Elmhurst, Queens, New York City, New York, U.S.");
            arrivingCodeValid=true;   
            flightCodeAssigned="835";
            return true;
            case "BOS": arrivingAndCode.put("BOS", "Boston Logan International Airport, Boston/Winthrop, Massachusetts, U.S.");
            arrivingCodeValid=true;  
            flightCodeAssigned="505";
            return true;
            case "ISP": arrivingAndCode.put("ISP", "Long Island MacArthur Airport, Ronkonkoma, New York, U.S.");
            arrivingCodeValid=true;   
            flightCodeAssigned="109";
            return true;
            case "MHT": arrivingAndCode.put("MHT", "Manchester – Boston Regional Airport, Manchester/Londonderry, New Hampshire, U.S.");
            arrivingCodeValid=true;  
            flightCodeAssigned="245";
            return true;
            case "EWR": arrivingAndCode.put("EWR", "Newark Liberty International Airport, Newark/Elizabeth, New Jersey, U.S.");
            arrivingCodeValid=true; 
            flightCodeAssigned="800";
            return true;
            case "PHL": arrivingAndCode.put("PHL", "Philadelphia International Airport, Philadelphia / Tinicum Township, Delaware County, Pennsylvania, U.S.");
            arrivingCodeValid=true;      
            flightCodeAssigned="475";
            return true;
            case "PIT": arrivingAndCode.put("PIT", "Pittsburgh International Airport, Allegheny County, Pennsylvania, U.S.");
            arrivingCodeValid=true; 
            flightCodeAssigned="747";
            return true;
            case "PWM": arrivingAndCode.put("PWM", "Portland International Jetport, Portland, Oregon, U.S.");
            arrivingCodeValid=true;
            flightCodeAssigned="246";
            return true;
            case "DCA": arrivingAndCode.put("DCA", "Ronald Reagan Washington National Airport, Crystal City, Arlington County, Virginia, U.S.");
            arrivingCodeValid=true; 
            flightCodeAssigned="100";
            return true;
            case "RIC": arrivingAndCode.put("RIC", "Richmond International Airport, Sandston, Virginia, U.S.");
            arrivingCodeValid=true; 
            flightCodeAssigned="569";
            return true;
            case "PVD": arrivingAndCode.put("PVD", "Rhode Island-T.F. Green Airport, Warwick, Rhode Island U.S.");
            arrivingCodeValid=true;   
            flightCodeAssigned="686";
            return true;
            case "IAD": arrivingAndCode.put("IAD", "Washington Dulles International Airport, Dulles, Virginia, U.S.");
            arrivingCodeValid=true;   
            flightCodeAssigned="418";
            return true;
            default: 
            arrivingCodeValid=false;
            System.out.println("Invalid Airport Code: Please Try Again");
            System.out.println("Valid Codes (denoted within braces)");
            for (String validAirportCodes: majorAirportsNortheast) {
            System.out.println("" + validAirportCodes); //Added all valid airport codes for airline routes.
        }
        setFlightCodeAssigned(flightCodeAssigned);
        return false;
    }
    }
    public String getArrivingAirportCode() {
        if (arrivingCodeValid && arrivingAndCode.containsKey(arrivingAirportCode)) {
        return arrivingAndCode.get(arrivingAirportCode);
    }
    return null;
    }
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
    public void setFlightCodeAssigned (String flightCodeAssigned) { //Had to add in order to prevent null from
        //appearing in the flightCode, I believe this is due to encapsulation in Java!
        this.flightCodeAssigned=flightCodeAssigned;
    }
    public String getFlightCodeAssigned () {
        return flightCodeAssigned; //Essential to prevent null from appearing!
    }
    public void printTicket () { //A method to print all of their the user's information.
      System.out.print('\u000C'); //Clears the console up to this point.
      int totalPrice=price_2 + price_1;
      String price=priceChecker.format(totalPrice);
      System.out.println("Success! Thank you for using " + airline + "! " + "\nHere is the information for your upcoming trip: \n");
      System.out.println(" NAME: " + name + "\n DATE(MM/DD/YYYY): " + date + "\n FLIGHT NUMBER: " + airlineAcronym + flightCodeAssigned + "\n DEPARTING LOCATION: " +  departingAndCode.get(departingAirportCode) + "\n DEPARTING AIRPORT CODE: " + departingAirportCode + "\n ARRIVING AIRPORT LOCATION: "
      + arrivingAndCode.get(arrivingAirportCode) + "\n ARRIVING AIRPORT CODE: " + arrivingAirportCode + "\n CARRYONS: " + carryOn + "\n BAGS: " + baggage); 
      System.out.println("\nSince you indicated you are carrying "  + baggage + " bag(s) and " + carryOn + " carry-on(s), you will pay: \n" + price_2 + " + " + price_1
      + "\nFor a total of: " + price);
      System.out.println("Thank you for travelling with " + airline + "!");
      //To do, add gate number to ticket somehow.
    }
    //COMPLETED, add a way to check for appropriate flight departures and arrivals,
    //limited to northeast region!
    //COMPLETED: Randomly generate a user code, aswell as implement flight numbers aswell as verification that these exist. 
}
