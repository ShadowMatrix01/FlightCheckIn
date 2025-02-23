
/**
 * @Jhan Gomez
 * @Version 1.0.0
 * Demonstrates how users who need special accomondations will be assisted.
 */
public class TicketSpecial extends Ticket
{
    @Override   
    public void printTicket () { //A method to print all of their the user's information.
    super.printTicket();
    System.out.println(super.getName() + " Requires Accomondations, Must Board in Group 1");
    }
    //To-Do, Send Message to Appropriate Individual To Assist Client!
    //To-Do, Add Sound To Notify Assistance is Coming.
}
