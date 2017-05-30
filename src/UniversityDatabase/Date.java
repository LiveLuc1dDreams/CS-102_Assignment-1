package UniversityDatabase;

/**
 * Created by brandon on 5/9/17.
 */

public class Date {

    //Vars to store the
    private int years;
    private int months;
    private int days;

    //Default constructor
    public Date(String s) {
        this.years = Integer.parseInt(s.substring(0, 4));
        this.months = Integer.parseInt(s.substring(4, 6));
        this.days = Integer.parseInt(s.substring(6));

        //TODO:REMOVE TEMP TEST CODE
        System.out.println("Date constructor test message:" + years + " " + months + " " + days);
    }

    public Date(int dateDays, int dateMonths, int dateYears) {
        this.days = dateDays;
        this.months = dateMonths;
        this.years = dateYears;
    }


    public boolean isOlder(Date d) {

        if (years < d.getYears()) {
            return true;
        } else if (years == d.getYears() && months < d.getMonths()) {
            return true;
        } else if (years == d.getYears() && months == d.getMonths() && days < d.getDays()) {
            return true;
        } else {
            return false;
        }

    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public boolean isOlder(CompletionEvent completionEvent) {
        return false;
    }
}
