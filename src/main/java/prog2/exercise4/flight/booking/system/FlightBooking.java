package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;

//import javax.print.attribute.standard.Destination;

public class FlightBooking {
    String flightCompany="Flights-of-Fancy";
    String flightID;
    String passengerFullName;
    FlightBooking.TripSource tripSource;
    String sourceAirport;
    String tripDestination;
    String destinationAirport;
    LocalDate departureDate;
    LocalDate returnDate;
    int childPassengers;
    int adultPassengers;
    int totalPassengers;
    double departingTicketPrice;
    double returnTicketPrice;
    double totalTicketPrice;
    String ticketNumber;
    String bookingClass;
    String tripType;
     
     
    public FlightBooking(String aNull, LocalDate depart, LocalDate returnDate, int i, int j) {
        this.passengerFullName = aNull;
        this.departureDate = depart;
        this.returnDate = returnDate;
        this.childPassengers = i;
        this.adultPassengers = j;
    }

    public enum TripType {
        ONE_WAY(1),
        RETURN(2);
        public final int num;
        private TripType(int num){
        this.num = num;
     }
     public TripType valueof(int num){
        switch(num){
            case 1:
            return TripType.ONE_WAY;
            case 2:
            return TripType.RETURN;
            default:
            return null;
        }
     }
    }

    public String getTripType()
    {
        return tripType;
    }
    public void setTripType(String tripType )
    {
        this.tripType = tripType;
    }




    public enum BookingClass {
        FIRST(1),
        BUSINESS(2),
        ECONOMY(3);
        public final int num;
        private BookingClass(int num){
        this.num = num;
     }
     public BookingClass valueof(int num){
        switch(num){
            case 1:
            return BookingClass.FIRST;
            case 2:
            return BookingClass.BUSINESS;
            case 3:
            return BookingClass.ECONOMY;
            default:
            return null;
        }
     }
    }
    public String getBookingClass()
    {
        return bookingClass;
    }
    public void setBookingClass(String bookingClass )
    {
        this.bookingClass = bookingClass;
    }






    public enum TripSource {
        NANJING("1"),
        BEIJING("2"),
        SHANGHAI("3"),
        OULU("4"),
        HELSINKI("5"),
        PARIS("6") ;
        public final String num;
        private TripSource(String num){
        this.num = num;
     }
    }
     public void setTripSource (String num){
        switch(num){
            case "1":
            this.tripSource = FlightBooking.TripSource.NANJING;
            break;
            case "2":
            this.tripSource = FlightBooking.TripSource.BEIJING;
            break;
            case "3":
            this.tripSource = FlightBooking.TripSource.SHANGHAI;
            break;
            case "4":
            this.tripSource = FlightBooking.TripSource.OULU;
            break;
            case "5":
            this.tripSource = FlightBooking.TripSource.HELSINKI;
            break;
            case "6":
            this.tripSource = FlightBooking.TripSource.PARIS;
            break;
            default:
            
        }
     }
    
    public FlightBooking.TripSource getTripSource()
    {
        return tripSource;
    }
    // public void setTripSource(String tripSource )
    // {
    //     this.tripSource = tripSource;
    // }

    
    public String getFlightCompany()
    {
        return flightCompany;
    }
    public void setFlightCompany(String flightCompany )
    {
        this.flightCompany = flightCompany;
    }


    public String getFlightID()
    {
        return flightID;
    }
    public void setFlightID(String flightID )
    {
        this.flightID = flightID;
    }


    public String getPassengerFullName()
    {
        return passengerFullName;
    }
    public void setPassengerFullName(String passengerFullName )
    {
        this.passengerFullName = passengerFullName;
    }


   

    public enum SourceAirport {
        Nanjing_Lukou_International_Airport(1),
        Beijing_Capital_International_Airport(2),
        Shanghai_Pudong_International_Airport(3),
        Oulu_Airport(4),
        Helsinki_Airport(5),
        Paris_Charles_de_Gaulle_Airport(6) ;
        public final int num;
        private SourceAirport(int num){
        this.num = num;
     }
     public SourceAirport valueof(int num){
        switch(num){
            case 1:
            return SourceAirport.Nanjing_Lukou_International_Airport;
            case 2:
            return SourceAirport.Beijing_Capital_International_Airport;
            case 3:
            return SourceAirport.Shanghai_Pudong_International_Airport;
            case 4:
            return SourceAirport.Oulu_Airport;
            case 5:
            return SourceAirport.Helsinki_Airport;
            case 6:
            return SourceAirport.Paris_Charles_de_Gaulle_Airport;
            default:
            return null;
        }
     }
    }
    public String getSourceAirport()
    {
        return sourceAirport;
    }
    public void setSourceAirport(String sourceAirport )
    {
        this.sourceAirport = sourceAirport;
    }

    public enum TripDestination {
        NANJING(1),
        BEIJING(2),
        SHANGHAI(3),
        OULU(4),
        HELSINKI(5),
        PARIS(6) ;
        public final int num;
        private TripDestination(int num){
        this.num = num;
     }
     public TripDestination valueof(int num){
        switch(num){
            case 1:
            return TripDestination.NANJING;
            case 2:
            return TripDestination.BEIJING;
            case 3:
            return TripDestination.SHANGHAI;
            case 4:
            return TripDestination.OULU;
            case 5:
            return TripDestination.HELSINKI;
            case 6:
            return TripDestination.PARIS;
            default:
            return null;
        }
     }
    }
    public String getTripDestination()
    {
        return tripDestination;
    }
    public void setTripDestination(String tripDestination , String tripSouce)
    {
        if(tripDestination != tripSouce){
        this.tripDestination = tripDestination;
        }
    }


    public String getDestinationAirport()
    {
        return destinationAirport;
    }
    public void setDestinationAirport(String destinationAirport )
    {
        this.destinationAirport = destinationAirport;
    }


    public LocalDate getDepartureDate()
    {
        return departureDate;
    }
    public void setDepartureDate(LocalDate departureDate)
    {
            this.departureDate = returnDate;
    }


    public LocalDate getReturnDate()
    {
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate )
    {
        this.returnDate = returnDate;
    }


    public int getChildPassengers()
    {
        return childPassengers;
    }
    public void setChildPassengers(int childPassengers )
    {
        this.childPassengers = childPassengers;
    }


    public int getAdultPassengers()
    {
        return adultPassengers;
    }
    public void setAdultPassengers(int adultPassengers )
    {
        this.adultPassengers = adultPassengers;
    }


    public int getTotalPassengers()
    {
        return totalPassengers;
    }
    public void setTotalPassengers(int childPassengers, int adultPassengers )
    {
        this.totalPassengers = childPassengers + adultPassengers;
    }


    public double  getDepartingTicketPrice()
    {
        return departingTicketPrice;
    }
    public void setDepartingTicketPrice(int adultPassengers, int childPassengers )
    {
        if (tripSource == FlightBooking.TripSource.NANJING && tripDestination == "BEIJING"){
            if (bookingClass == "FIRST"){
                departingTicketPrice = 300 + 250 + 300*0.1 + 300*0.05 ;
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = 300 + 150 + 300*0.1 + 300*0.05;
            }
            else{
                departingTicketPrice = 300 + 50 + 300*0.1 + 300*0.05;
            }
        }
        else if (tripSource == FlightBooking.TripSource.NANJING && tripDestination == "SHANGHAI"){
            if (bookingClass == "FIRST"){
                departingTicketPrice = 300 + 250 + 300*0.1 + 300*0.05 ;
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = 300 + 150 + 300*0.1 + 300*0.05;
            }
            else{
                departingTicketPrice = 300 + 50 + 300*0.1 + 300*0.05;
            }
        }
        else if (tripSource == FlightBooking.TripSource.NANJING && tripDestination == "SHANGHAI"){
            if (bookingClass == "FIRST"){
                departingTicketPrice = 300 + 250 + 300*0.1 + 300*0.05 ;
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = 300 + 150 + 300*0.1 + 300*0.05;
            }
            else{
                departingTicketPrice = 300 + 50 + 300*0.1 + 300*0.05;
            }
        }
        else if (tripSource == FlightBooking.TripSource.BEIJING && tripDestination == "SHANGHAI"){
            if (bookingClass == "FIRST"){
                departingTicketPrice = 300 + 250 + 300*0.1 + 300*0.05 ;
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = 300 + 150 + 300*0.1 + 300*0.05;
            }
            else{
                departingTicketPrice = 300 + 50 + 300*0.1 + 300*0.05;
            }
        }
        else if (tripSource == FlightBooking.TripSource.NANJING && tripDestination == "OULU"){
            if (bookingClass == "FIRST"){
                departingTicketPrice = 300 + 250 + 0.15*300 + 300*0.1;
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = 300 + 150 + 0.15*300 + 300*0.1;
            }
            else{
                departingTicketPrice = 300 + 50 + 0.15*300 + 300*0.1;
            }
        }
        else if (tripSource == FlightBooking.TripSource.NANJING && tripDestination == "HELSINKI"){
            if (bookingClass == "FIRST"){
                departingTicketPrice = 300 + 250 + 0.15*300 + 300*0.1;
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = 300 + 150 + 0.15*300 + 300*0.1;
            }
            else{
                departingTicketPrice = 300 + 50 + 0.15*300 + 300*0.1;
            }
        }
        else if (tripSource == FlightBooking.TripSource.NANJING && tripDestination == "PARIS"){
            if (bookingClass == "FIRST"){
                departingTicketPrice = 300 + 250 + 0.15*300 + 300*0.1;
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = 300 + 150 + 0.15*300 + 300*0.1;
            }
            else{
                departingTicketPrice = 300 + 50 + 0.15*300 + 300*0.1;
            }
        }
        else if (tripSource == FlightBooking.TripSource.SHANGHAI && tripDestination == "OULU"){
            if (bookingClass == "FIRST"){
                departingTicketPrice = 300 + 250 + 0.15*300 + 300*0.1;
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = 300 + 150 + 0.15*300 + 300*0.1;
            }
            else{
                departingTicketPrice = 300 + 50 + 0.15*300 + 300*0.1;
            }
        }
        else if (tripSource == FlightBooking.TripSource.SHANGHAI && tripDestination == "HELSINKI"){
            if (bookingClass == "FIRST"){
                departingTicketPrice = 300 + 250 + 0.15*300 + 300*0.1;
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = 300 + 150 + 0.15*300 + 300*0.1;
            }
            else{
                departingTicketPrice = 300 + 50 + 0.15*300 + 300*0.1;
            }
        }
        else if (tripSource == FlightBooking.TripSource.SHANGHAI && tripDestination == "PARIS"){
            if (bookingClass == "FIRST"){
                departingTicketPrice = 300 + 250 + 0.15*300 + 300*0.1;
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = 300 + 150 + 0.15*300 + 300*0.1;
            }
            else{
                departingTicketPrice = 300 + 50 + 0.15*300 + 300*0.1;
            }
        }
        else if (tripSource == FlightBooking.TripSource.SHANGHAI && tripDestination == "OULU"){
            if (bookingClass == "FIRST"){
                departingTicketPrice = 300 + 250 + 0.15*300 + 300*0.1;
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = 300 + 150 + 0.15*300 + 300*0.1;
            }
            else{
                departingTicketPrice = 300 + 50 + 0.15*300 + 300*0.1;
            }
        }
        else if (tripSource == FlightBooking.TripSource.SHANGHAI && tripDestination == "HELSINKI"){
            if (bookingClass == "FIRST"){
                departingTicketPrice = 300 + 250 + 0.15*300 + 300*0.1;
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = 300 + 150 + 0.15*300 + 300*0.1;
            }
            else{
                departingTicketPrice = 300 + 50 + 0.15*300 + 300*0.1;
            }
        }
        else if (tripSource == FlightBooking.TripSource.SHANGHAI && tripDestination == "PARIS"){
            if (bookingClass == "FIRST"){
                departingTicketPrice = 300 + 250 + 0.15*300 + 300*0.1;
            }
            else if (bookingClass == "BUSINESS"){
                departingTicketPrice = 300 + 150 + 0.15*300 + 300*0.1;
            }
            else{
                departingTicketPrice = 300 + 50 + 0.15*300 + 300*0.1;
            }
        }
    }


    public double  getReturnTicketPrice()
    {
        return returnTicketPrice;
    }
    public void setReturnTicketPrice( )
    {
    
    }


    public double  getTotalTicketPrice()
    {
        return totalTicketPrice;
    }
    public void setTotalTicketPrice( )
    {
        
    }


    public String  getTicketNumber()
    {
        return ticketNumber;
    }
    public void setTicketNumber(String  ticketNumber )
    {
        if (tripType == "ONE_WAY"){
            if (bookingClass == "FIRST"){
                if ((tripSource == FlightBooking.TripSource.NANJING && tripDestination == "BEIJING" ) || ( tripSource == FlightBooking.TripSource.NANJING && tripDestination == "SHANGHAI")||(tripSource == FlightBooking.TripSource.SHANGHAI&& tripDestination == "BEIJING" )||(tripSource ==FlightBooking.TripSource.OULU&&tripDestination == "HELSINKI")){
                    ticketNumber = "11F1234DOM";
                }
                else{
                    ticketNumber = "11F1234INT";
                }
            }
            else if (bookingClass == "BUSINESS"){
                if ((tripSource == FlightBooking.TripSource.NANJING && tripDestination == "BEIJING" ) || ( tripSource == FlightBooking.TripSource.NANJING && tripDestination == "SHANGHAI")||(tripSource == FlightBooking.TripSource.SHANGHAI&& tripDestination == "BEIJING" )||(tripSource == FlightBooking.TripSource.OULU&&tripDestination == "HELSINKI")){
                    ticketNumber = "11B1234DOM";
                }
                else{
                    ticketNumber = "11B1234INT";
                }
            }
            else {
                if ((tripSource == FlightBooking.TripSource.NANJING && tripDestination == "BEIJING" ) || ( tripSource == FlightBooking.TripSource.NANJING && tripDestination == "SHANGHAI")||(tripSource == FlightBooking.TripSource.SHANGHAI&& tripDestination == "BEIJING" )||(tripSource == FlightBooking.TripSource.OULU&&tripDestination == "HELSINKI")){
                    ticketNumber = "11E1234DOM";
                }
                else{
                    ticketNumber = "11E1234INT";
                }
            }
        }
        else {
            if (bookingClass == "FIRST"){
                if ((tripSource == FlightBooking.TripSource.NANJING && tripDestination == "BEIJING" ) || ( tripSource == FlightBooking.TripSource.NANJING && tripDestination == "SHANGHAI")||(tripSource == FlightBooking.TripSource.SHANGHAI&& tripDestination == "BEIJING" )||(tripSource == FlightBooking.TripSource.OULU&&tripDestination == "HELSINKI")){
                    ticketNumber = "22F1234DOM";
                }
                else{
                    ticketNumber = "22F1234INT";
                }
            }
            else if (bookingClass == "BUSINESS"){
                if ((tripSource == FlightBooking.TripSource.NANJING && tripDestination == "BEIJING" ) || ( tripSource == FlightBooking.TripSource.NANJING && tripDestination == "SHANGHAI")||(tripSource == FlightBooking.TripSource.SHANGHAI&& tripDestination == "BEIJING" )||(tripSource == FlightBooking.TripSource.OULU&&tripDestination == "HELSINKI")){
                    ticketNumber = "22B1234DOM";
                }
                else{
                    ticketNumber = "22B1234INT";
                }
            }
            else {
                if ((tripSource == FlightBooking.TripSource.NANJING && tripDestination == "BEIJING" ) || ( tripSource == FlightBooking.TripSource.NANJING && tripDestination == "SHANGHAI")||(tripSource == FlightBooking.TripSource.SHANGHAI && tripDestination == "BEIJING" )||(tripSource == FlightBooking.TripSource.OULU&&tripDestination == "HELSINKI")){
                    ticketNumber = "22E1234DOM";
                }
                else{
                    ticketNumber = "22E1234INT";
                }
            }
        }
        
    }
    public String toString()
    {return ("Thank you for booking your flight with " + passengerFullName + ". Thank you for booking your flight with " + flightCompany + "." + "\n" +
       "Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + tripSource + " to " + tripDestination + "\n" +
        "Date of departure: " + departureDate + "\n" +
        "Date of return: " +  returnDate + "\n" +
       "Total passengers: " + totalPassengers + "\n" +
       "Total ticket price in Euros: " + totalTicketPrice);
}
}
