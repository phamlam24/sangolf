package SAN_GOLF;

public class Date {
    public int day;
    public int month;
    public int year;

    Date(int d,int m,int y){
        day = d;
        month = m;
        year = y;
    }
    
    public void PrintDate(){
        System.out.println(Integer.toString(day) + '/' + Integer.toString(month) + "/" + Integer.toString(year));
    }
}
