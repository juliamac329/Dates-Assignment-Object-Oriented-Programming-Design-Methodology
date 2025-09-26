/* 
 * Julia Macdonald
 * September 19th, 2025
 * Dates Class
 */
public class Dates {

    // private properties
    private int year;
    private int month;
    private int day;

    // constructor that sets the default date to January 1, 2002
    public Dates() {
        year = 2002;
        month = 1;
        year = 1;
    }
    // constructor that takes 3 integers as parameters for year, month, and day
    public Dates(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }

    // set date method, takes 3 integers as parameters for year, month, and day
    public void setDate(int y, int m, int d){
        year = y;
        month = m;
        day = d;      
    }

    // method that returns a friendly text version of the date
    public String DateString(){
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1] + " " + 
        String.valueOf(day) +
        String.valueOf(year);
    }

    //method that prints the text friendly version of the date
    public void printDate(){
        System.out.println(DateString());
    }
    
}
