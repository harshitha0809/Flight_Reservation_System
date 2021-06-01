package com.Upgrad.FRS;

public class Main {

    public static void main(String[] args) {

        Ticket regularTicket = new RegularTicket("2A99B7", "Chennai", "Australia", null, "DepartureDateTime", "ArrivalDateTime", null, 50000, false, "4A", "lunch");
        Ticket touristTicket = new TouristTicket("66AA87", "Chennai", "Kerala", null, "DepartureDateTime", "ArrivalDateTime", null, 100000, false, "1B", "uae Resort", new String[]{" "});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }
}
