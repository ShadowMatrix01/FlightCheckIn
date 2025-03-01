
/**
 * @Jhan Gomez
 * @Version 1.0.4
 * Demonstrates how users who need special accomondations will be assisted.
 */
public class TicketSpecial extends Ticket
{
    @Override   
    public void printTicket () { //A method to print all of their the user's information.
    System.out.print('\u000C'); //Java escape sequence which clears whats in the console.
    System.out.println("ATTENTION: " + super.getName() + " Needs Accomondations, Must Be Assisted at Gate (Gate Method Required).");
    super.printTicket(); 
    //TO-DO: ADD GATE FUNCTION FOR BOTH TICKET AND TICKET SPECIAL!
    }
    //To-Do, Send Message to Appropriate Individual To Assist Client!
    //SOUND SCRAPPED, NOT NEEDED.
}
