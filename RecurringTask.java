import java.util.Calendar;

public class RecurringTask extends Task {
  //  полями: интервал повторения (например, "ежедневно", "еженедельно") и дата начала.
    public String dateStart ;
    public String everyDay ;
    public String everyWeek ;
    public RecurringTask(String title, String opisanie, Calendar dateCreate, String dateStart, String everyDay, String everyWeek){
        setTitle(title);
        setOpisanie(opisanie);
        setDateCreate();
        this.dateStart=dateStart;
        this.everyDay=everyDay;
        this.everyWeek=everyWeek;
    }
    public RecurringTask(){}
    public String getDateStart(){
        return dateStart;
    }
    public void setDateStart(String dateStart){
        this.dateStart=dateStart;
    }
    public String getEveryDay(){
        return everyDay;
    }
    public void setEveryDay(String everyDay){
        this.everyDay=everyDay;
    }
    public String getEveryWeek(){
        return everyWeek;
    }
    public void setEveryWeek(String everyWeek){
        this.everyWeek=everyWeek;
    }
    public String toString() {
        return getTitle() + ";"
                + getOpisanie() + ";"
                + getDateCreate() + ";"
                + getDateStart() + ";"
                + getEveryDay() + ";"
                + getEveryWeek();
    }
}
