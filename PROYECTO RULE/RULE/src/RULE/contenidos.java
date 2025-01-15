package RULE;

public class contenidos {

    //Constructores
    private String clr;
    private String num;

    //getter and setter
    public String getClr() {
        return clr;
    }

    public void setClr(String clr) {
        this.clr = clr;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }


    public contenidos(String clr, String num) {
        super();
        this.clr = clr;
        this.num = num;
    }

    public contenidos() {
        super();
    }



}
