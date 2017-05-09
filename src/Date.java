/**
 * Created by brandon on 5/9/17.
 */
public class Date {

    private int years;
    private int months;
    private int days;

    //Default constructor
    public Date(int y, int m, int d) {
        years = y;
        months = m;
        days = d;
    }



    public boolean isOlder( Date d) {

        //TODO: add comparison here, if the dates are equal just return true and add the new node to
        if ( years < d.getYears() ) {
            return true;
        } else if ( years == d.getYears() && months < d.getMonths() ) {
            return true;
        } else if ( years == d.getYears() && months == d.getMonths() && days < d.getDays() ) {
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
}
