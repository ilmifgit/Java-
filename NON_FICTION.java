public class NON_FICTION extends Book implements Readable {
    private String type = "NON_FICTION";
//    public String getType(){return type;}
//    public void setType(String type){this.type=type;}
public NON_FICTION(String name, String author, int years, String type, Boolean status){
        setName(name);
        setAuthor(author);
        setYears(years);
        this.type=type;
    }
    public NON_FICTION(){}
//    @Override
//    public void read(){}
@Override
public void read(){
    System.out.println("title:   " + getName());
    System.out.println("author: " + getAuthor());
    System.out.println("years:  " + getYears());
    System.out.println("type:   "+ type());
}

    public String type() {
        return type;
    }



}
