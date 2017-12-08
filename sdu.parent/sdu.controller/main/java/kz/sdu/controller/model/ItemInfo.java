package kz.sdu.controller.model;

public class ItemInfo {
    public long id;
    public String name;
    public String userid;
    public String description;
    public UserCtrlModel user;
    public ItemInfo (long id,String name,String userid,String description,UserCtrlModel user){
        this.id = id;
        this.name = name;
        this.userid = userid;
        this.description = description;
        this.user = user;
    }
    public ItemInfo(){

    }
}
