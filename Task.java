import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Task {
    //с полями: название задачи, описание, дата создания
    private String title = "title";
    private String opisanie = "opisanie";
    //private String dateCreate = "dateCreate";
    private Calendar dateCreate = new GregorianCalendar(2025, 10, 8);
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getOpisanie(){
        return opisanie;
    }
    public void setOpisanie(String opisanie){
        this.opisanie=opisanie;
    }
    public Calendar getDateCreate(){
        return dateCreate;
    }
    public void setDateCreate(){
     this.dateCreate=dateCreate;
    }
    public String toString(){
        return getTitle() + getOpisanie() + getDateCreate();
    }
}
