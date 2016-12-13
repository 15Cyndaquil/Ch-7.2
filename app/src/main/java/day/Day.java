package day;


/**
 * Created by cynda on 12/8/16.
 */

public class Day {
    private String day;
    private final static String [] daysOfWeek = new String[7];



    public Day(){
        day="Sunday";
        daysOfWeek[0]="Sunday";
        daysOfWeek[1]="Monday";
        daysOfWeek[2]="Tuesday";
        daysOfWeek[3]="Wednesday";
        daysOfWeek[4]="Thursday";
        daysOfWeek[5]="Friday";
        daysOfWeek[6]="Saturday";
    }

    public Day(String currentDay){
        this.day=currentDay;
        daysOfWeek[0]="Sunday";
        daysOfWeek[1]="Monday";
        daysOfWeek[2]="Tuesday";
        daysOfWeek[3]="Wednesday";
        daysOfWeek[4]="Thursday";
        daysOfWeek[5]="Friday";
        daysOfWeek[6]="Saturday";
    }

    public void setDay(String currentDay){
        this.day=currentDay;
    }

    public String getDay(){return this.day;}

    public String toString(){return this.day;}

    public String getNextDay(){
        int days=0;
        String output="";
        if(this.day.equals("Sunday")){
            days=0;
        }else if(this.day.equals("Monday")){
            days=1;
        }else if(this.day.equals("Tuesday")){
            days=2;
        }else if(this.day.equals("Wednesday")){
            days=3;
        }else if(this.day.equals("Thursday")){
            days=4;
        }else if(this.day.equals("Friday")){
            days=5;
        }else if(this.day.equals("Saturday")){
            days=6;
        }
        if(days==6){
            days=0;
        }else{days++;}
        output = daysOfWeek[days];
        return output;
    }

    public String getPreviousDay(){
        int days=0;
        String output="";
        if(this.day.equals("Sunday")){
            days=0;
        }else if(this.day.equals("Monday")){
            days=1;
        }else if(this.day.equals("Tuesday")){
            days=2;
        }else if(this.day.equals("Wednesday")){
            days=3;
        }else if(this.day.equals("Thursday")){
            days=4;
        }else if(this.day.equals("Friday")){
            days=5;
        }else if(this.day.equals("Saturday")){
            days=6;
        }
        if(days==0){
            days=6;
        }else{days--;}
        output = daysOfWeek[days];
        return output;
    }

    public String getIntDay(int cool){
        int days=0;
        String output="";
        if(this.day.equals("Sunday")){
            days=0;
        }else if(this.day.equals("Monday")){
            days=1;
        }else if(this.day.equals("Tuesday")){
            days=2;
        }else if(this.day.equals("Wednesday")){
            days=3;
        }else if(this.day.equals("Thursday")){
            days=4;
        }else if(this.day.equals("Friday")){
            days=5;
        }else if(this.day.equals("Saturday")){
            days=6;
        }
        cool=cool+days;
        cool=cool%7;
        output = daysOfWeek[cool];
        return output;
    }

}
