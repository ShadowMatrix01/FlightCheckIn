
/**
 * @Jhan Gomez
 * @Version 1.0.1 (a version number or a date)
 * @A simple program that demonstrates how a flight checkin would work in Java. */
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime; //Important for greeting the user and verification purposes! Date and time  is imported using the time package.
import java.time.format.DateTimeFormatter;  //Important for formatting the date and time properly
public class FlightCheckIn
{
    //private boolean adultOrChild, accomodator;
    ArrayList<Object> details= new ArrayList<>();
    public static void main (String[]args) {
    Ticket ticket_1= new Ticket();
    ticket_1.setAirline("USA AIRPATH-East");
    try (Scanner faa=new Scanner(System.in)) {
        LocalDateTime dateAndTime=LocalDateTime.now(); //Gets the date and time
        DateTimeFormatter dateAndTimeForm = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss"); //Formats the date and time into Month-Day-Year and readable hour, minute, and seconds
        String dateAndTime2=dateAndTime.format(dateAndTimeForm); //the formated date and time is saved to dateAndTime2 using the .format() method.
        ticket_1.setDate(dateAndTime2);
        System.out.println(dateAndTime2 + "." + "\n\nYou are logged in to the terminal for " +  ticket_1.getAirline() + ".");
        System.out.println("Welcome to " + ticket_1.getAirline() + ".");
        System.out.println("If you have any questions or issues with this machine, please contact a " + ticket_1.getAirline() + " employee for help\n\n\n");
        System.out.println("Please enter your name, departing and arriving locations, any baggage and carry-on items, and whether you require special accomondations"); 
        // To-Do, add special accomodations!
        System.out.println("Enter your full name as it appears on your passport and if applicable, visa: ");
        String namePass=faa.nextLine();
        //String datePass=faa.nextLine(); Not necessary, date is already implemented.
        System.out.println("Enter the departing location:");
        String depLocPass=faa.nextLine();
        System.out.println("Enter the arriving location:");
        String arrLocPass=faa.nextLine();
        System.out.println("Enter the departing airport code (ex.) ATL for (Hartsfield-Jackson Atlanta International Airport):");
        String depAirCode=faa.nextLine();
        System.out.println("Enter the arriving airport code: ");
        String arrAirCode=faa.nextLine();
        System.out.println("Enter the amount of carry ons (Maximum One Free): ");
        int carryOnPack=faa.nextInt();
        System.out.println("Enter the amount of bags (Maxmimum One Free): ");
        int bag=faa.nextInt();
        ticket_1.setBaggage(bag);
        ticket_1.setCarryOn(carryOnPack);
        ticket_1.setName(namePass);
        ticket_1.setDepartingLocation(depLocPass);
        ticket_1.setArrivingLocation(arrLocPass);
        ticket_1.setDepartingAirportCode(depAirCode);
        ticket_1.setArrivingAirportCode(arrAirCode);
      //  details.add(ticket_1); Issue with adding to arrayList, will analyze further.if (carryOnPack > 1) {
        ticket_1.setPriceCarryOn(carryOnPack);
        ticket_1.setPriceBaggageOn(bag);
        ticket_1.printTicket();
    } catch (Exception e) { //Exception in case of an incorrect input.
    System.out.println("" + e.getMessage());
    // Need to add a way to discard incorrect information.
   }
 }
}