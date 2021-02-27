
import java.util.Random;
import java.util.Scanner;



public class HolidayResort {
    private String clientName;
    protected int accomodationType;
    private String bookingReference;
    protected String startDate; 
    protected int days;
    protected int roomNumber;
    protected final String cottageAdress = "Mayor Street Lower, International Financial Services Centre, Dublin";
    protected char keyCollectionPoint;
    public boolean optionBreak;
    protected double total;

 Scanner scan = new Scanner(System.in);
 Random r = new Random();
 
 public void booking(){
     System.out.println("Enter the client name:");
     this.clientName = scan.next().toUpperCase();
      this.getBookingReference();
     System.out.println("Enter Start day");
     this.startDate = scan.next();
     System.out.println("Enter how many days");
     this.days = scan.nextInt();
    
     this.getAccomodationType();
     
 } 
 

 public void Breakfast(){
       int optionBreakfast;
     System.out.println("Enter a option: \n"
             + "[0] Add Breakfast (charge $10,00)\n"
             + "[1] No Breakfast");
     optionBreakfast = scan.nextInt();
        
     switch (optionBreakfast) {
         case 0:
             this.optionBreak = true;
             break;
         case 1:
             this.optionBreak = false;
             break;
             
         default:   
              System.out.println("[ERROR] Enter a valid option!");
              this.Breakfast();
         
     }  
     
 }

 public void hotel(){
     int roomCost = 130;
     int breakfast = 10;
     if (this.optionBreak == true){
         this.total = this.days * breakfast; 
         this.total += this.days * roomCost;
     } else {
         this.total += this.days * roomCost;
     }
     System.out.println("\n \n \n<-- Booking information --> ");
     System.out.println("- - - - - - - - - - - - - - - - -");
     System.out.println("Client name: " + this.clientName);
     System.out.println("Booking reference: " + this.bookingReference);
     System.out.println("Start day: " + this.startDate);
     System.out.println("Total nights: " + this.days);
     System.out.println("Type of reservation: Hotel Room");
     if (this.optionBreak == true){
         System.out.println("Breakfast include: (YES)");
     } else {
         System.out.println("Breakfast include: (NO)");
     }
     System.out.println("Room number: " + this.roomNumber);
     System.out.println("TOTAL: $" +  String.format("%.2f", this.total));
     
 }
 
 public void cottage(){
     int cottage = 60;
     int eletricity = 50;
     this.total = this.days * cottage;
     this.total += eletricity;
     
     System.out.println("\n \n \n <-- Booking information --> ");
     System.out.println("- - - - - - - - - - - - - - - - -");
     System.out.println("Client name: " + this.clientName);
     System.out.println("Booking reference: " + this.bookingReference);
     System.out.println("Start day: " + this.startDate);
     System.out.println("Total nigths: " + this.days);
     System.out.println("Type of reservation: Cottage");
     System.out.println("Adress: " + this.cottageAdress);
     System.out.println("Collection point: --> " + this.keyCollectionPoint +" <--");
     System.out.println("Eletricity cost: $50,00");
     System.out.println("TOTAL: $" +  String.format("%.2f", this.total));
     
 }

    public HolidayResort(String clientName, int accomodationType, String bookingReference, String startDate, int days, int roomNumber, char keyCollectionPoint, boolean optionBreak, double total) {
        this.clientName = clientName;
        this.accomodationType = accomodationType;
        this.bookingReference = bookingReference;
        this.startDate = startDate;
        this.days = days;
        this.roomNumber = roomNumber;
        this.keyCollectionPoint = keyCollectionPoint;
        this.optionBreak = optionBreak;
        this.total = total;
    }
    
     public HolidayResort() {
         
     }   

    public int getAccomodationType() {
     System.out.println("Enter the accomodation type: \n"
                       + "[0] for Hotel Room \n"
                       +"[1] for Cottages");
     this.accomodationType = scan.nextInt();
     
     switch (this.accomodationType) {
         case 0:
             this.Breakfast();
             this.getRoomNumber();
             this.hotel();
             break;
         case 1:
             this.getKeyCollectionPoint();
             this.cottage();
             break;  
         default:
             System.out.println("[ERROR] Enter a valid option!");
             
             this.getAccomodationType();
     }
        
        
        return accomodationType;
    }

    public void setAccomodationType(int accomodationType) {
        this.accomodationType = accomodationType;
    }
 
 
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getBookingReference() {
        System.out.println("Enter the booking reference");
        this.bookingReference = scan.next().toUpperCase();
        return bookingReference;
    }

    public void setBookingReference(String bookingReference) {
        this.bookingReference = bookingReference;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getRoomNumber() {
        int min = 10;
        int max = 99;
        this.roomNumber = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(this.roomNumber);
        
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getCottageAdress() {
        return cottageAdress;
    }


    public char getKeyCollectionPoint() {
        //For generete a random uppercase letter I used ASCII table + Random methods  
        this.keyCollectionPoint = (char) (65 + r.nextInt(25));
        
        
        return keyCollectionPoint;
    }

    public void setKeyCollectionPoint(char keyCollectionPoint) {
        this.keyCollectionPoint = keyCollectionPoint;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }
    
    public boolean isOptionBreak() {
        return optionBreak;
    }

    public void setOptionBreak(boolean optionBreak) {
        this.optionBreak = optionBreak;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
 
}
