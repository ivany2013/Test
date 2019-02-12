package 设计模式.原型模式;

public class TargetClass implements Cloneable{
    private String string;
    private Integer integer;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    @Override
    protected TargetClass clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return (TargetClass)clone;
    }

    @Override
    public String toString() {
        return "{"+this.string +","+this.integer+"}";
    }
}

