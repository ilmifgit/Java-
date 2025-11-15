public class FICTION extends Book implements Readable {
    private String type = "FICTION";
//    public String getType(){return type;}
//    public void setType(String Type){this.type=type;}

    public FICTION(String name, String author, int years, String type, Boolean status){
        setName(name);
        setAuthor(author);
        setYears(years);
        this.type=type;
    }
    public FICTION(){}
    @Override
    public void read(){
        System.out.println("title:   " + getName());
        System.out.println("author: " + getAuthor());
        System.out.println("years:  " + getYears());
        System.out.println("type:   "+ getType());
    }
    @Override
    public String toString(){
        return "name" + getName() + "author" + getAuthor() + "years" + getYears() + "type" + getType();
    }

//    public Boolean status(){
//        return status;
//    }

    public String name( String name ){
        return getName();
    }

    public void status() {

    }
}

