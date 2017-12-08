package kz.sdu.controller.model;



public class UserCtrlModel {
    public String id;
    public String name;
    public String surname;
    public String email;
    public String password;
    public String telephone;
    public String birthday;
    public String isAccept;
    public String isWho;

    public UserCtrlModel(String id, String name, String surname, String email, String password, String telephone, String birthday, String isAccept,String isWho){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.birthday = birthday;
        this.isAccept = isAccept;
        this.isWho = isWho;
    }

    public UserCtrlModel(){

    }

    public String isAccepted() {
        return isAccept;
    }

    public void setAccepted(String accepted) {
        isAccept = accepted;
    }
}
