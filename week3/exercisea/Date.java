 package week3.exercisea;

public class Date {
    private int day;
    private int month;
    private int year;//attributes

    public Date(){ //no argument constructor
        /*this.day = 1;
        this.month = 1;
        this.year = 1900;*/
        this(1,1,1900);
    }

    public Date(int day,int month,int year){ // multi argument constructor
    setDay(day);
    setMonth(month);
    setYear(year);

}

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

public String toString(){
        return  getDay() + "-" + getMonth() + "-" + getYear() ;
}

}



















































