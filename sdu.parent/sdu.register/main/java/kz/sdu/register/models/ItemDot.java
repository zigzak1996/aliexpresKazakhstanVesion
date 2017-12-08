package kz.sdu.register.models;

public class ItemDot {
    public long id;
    public String name;
    public String userid;
    public String description;
    public ItemDot (long id,String name,String userid,String description){
        this.id = id;
        this.name = name;
        this.userid = userid;
        this.description = description;
    }
    public ItemDot(){

    }
}
