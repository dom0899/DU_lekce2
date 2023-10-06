import com.engeto.Hotel.Guest;
import com.engeto.Hotel.Room;
import com.engeto.Hotel.Booking;

import java.awt.font.NumericShaper;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guest guest = new Guest("Adéla Malíková", LocalDate.of(1993, 3, 13));
        Guest guest1 = new Guest("Jan Dvořáček", LocalDate.of(1995, 5, 5));


        Room room = new Room(1 + 2, 1, true, true, 1000);
        Room room1 = new Room(3, 3, false, true, 2400);

        Booking booking = new Booking("Adéla Malíková",1+2,1, LocalDate.of(2021,7, 19),
                LocalDate.of(2021,7,26),true);
        Booking booking1 = new Booking("Adéla Malíková a Jan Dvořáček",3,2, LocalDate.of(2021,9,1),
LocalDate.of(2021,9,14),false);

        List<Booking> bookingList = new ArrayList<>();

        bookingList.add(booking);
        bookingList.add(booking1);
        Booking booking2 = bookingList.get(1);
        System.out.println(("Počet rezervací v seznamu:"+bookingList.size()));
        System.out.println(" ");

        int i = 0;
        for (Booking book : bookingList){
            System.out.println(i+": "+book.getName());
            System.out.println("Číslo pokoje je: "+book.getNumberOfRoom());
            System.out.println("Číslo hostů je: "+book.getNumberOfGuest());
            System.out.print("od :"+book.getStartDate()); System.out.println(" do :"+book.getEndDate());

            i++;
        }



    }
}