package lopChiGhi;

public class Lop {
    private String  name= "John";
    private String class_ = "C02";

    public Lop(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", class_='" + class_ + '\''
                ;
    }
}
