
/**
 * @Jhan Gomez
 * @Version 1.0.3 (a version number or a date)
 * @A simple program that demonstrates how a flight checkin would work in Java. */
import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.LocalDateTime; //Important for greeting the user and verification purposes! Date and time  is imported using the time package.
import java.time.format.DateTimeFormatter;  //Important for formatting the date and time properly
public class FlightCheckIn
{
    public static void main (String[]args) {
    Ticket ticket_1= new Ticket();
    TicketSpecial guide= new TicketSpecial();
    ticket_1.setAirline("USA Regional AIRPATH-Northeast");
    Scanner checkIn=new Scanner(System.in); //Scanner moved for scope purposes
    try {
        LocalDateTime dateAndTime=LocalDateTime.now(); //Gets the date and time
        DateTimeFormatter dateAndTimeForm = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss"); //Formats the date and time into Month-Day-Year and readable hour, minute, and seconds
        String dateAndTime2=dateAndTime.format(dateAndTimeForm); //the formated date and time is saved to dateAndTime2 using the .format() method.
        ticket_1.setDate(dateAndTime2);
        System.out.println(dateAndTime2 + "." + "\n\nYou are logged in to the terminal for " +  ticket_1.getAirline() + ".");
        System.out.println("Welcome to " + ticket_1.getAirline() + ".");
        System.out.println("If you have any questions or issues with this machine, please contact a " + ticket_1.getAirline() + " employee for help.\n\n");
        System.out.println("Please enter your name, departing and arriving locations, any baggage and carry-on items, and whether you require special accomondations..."); 
        // To-Do, add special accomodations!
        System.out.println("Enter your full name as it appears on your passport and if applicable, visa: ");
        String namePass=checkIn.nextLine();
        boolean validCode1=false; //This boolean allows incorrect inputs to be rejected and for the program to ask again.
        while (!validCode1) {
        System.out.println("Enter the departing airport code (ex.) ATL for (Hartsfield-Jackson Atlanta International Airport):");
        String depAirCode=checkIn.nextLine();
        validCode1=ticket_1.setDepartingAirportCode(depAirCode);
      }
        boolean validCode2=false; //Also important for arriving airport code validation.
        while (!validCode2) {
        System.out.println("Enter the arriving airport code: ");
        String arrAirCode=checkIn.nextLine();
        validCode2=ticket_1.setArrivingAirportCode(arrAirCode);
    }
        System.out.println("Enter the amount of carry ons (Maximum One Free): ");
        int carryOnPack=checkIn.nextInt();
        System.out.println("Enter the amount of bags (Maxmimum One Free): ");
        int bag=checkIn.nextInt();
        System.out.println("Do you require special accomodations at the gate, plane, or airport? Please input either yes or no: ");
        String accomodations=checkIn.next();
        ticket_1.setBaggage(bag);
        ticket_1.setCarryOn(carryOnPack);
        ticket_1.setName(namePass);
        ticket_1.setPriceCarryOn(carryOnPack);
        ticket_1.setPriceBaggageOn(bag);
        if (accomodations.equalsIgnoreCase("No")) {
        ticket_1.printTicket();
        } else if (accomodations.equalsIgnoreCase("Yes")) {
              guide.setName(ticket_1.getName()); //These are required to prevent a null value from being returned.
              guide.setDate(ticket_1.getDate());
              guide.setDepartingAirportCode(ticket_1.departingAirportCode);
              guide.setArrivingAirportCode(ticket_1.arrivingAirportCode);
              guide.setBaggage(ticket_1.getBaggage());
              guide.setCarryOn(ticket_1.getCarryOn());
              guide.setPriceCarryOn(guide.getCarryOn());
              guide.setPriceBaggageOn(ticket_1.getBaggage()); //There was an error with price calculation, 
              //The amount of bags and carryons has to manually be put into price setters, and has to be done through the guide object.
              guide.setAirline(ticket_1.getAirline());
              guide.printTicket();
        }
    } catch (InputMismatchException e) { //Exception in case of an incorrect input.
    System.out.println("" + e.getMessage());
    checkIn.next();
   } finally { //Better for memory management.
   checkIn.close();
 }
}
}