package kz.sdu.register.impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.email.Email;
import kz.greetgo.email.EmailSender;
import kz.greetgo.email.EmailSenderController;
import kz.greetgo.util.RND;
import kz.sdu.controller.model.AuthInfo;
import kz.sdu.controller.model.UserCtrlModel;
import kz.sdu.controller.register.UserRegister;
import kz.sdu.register.dao.UserDao;
import kz.sdu.register.models.UserDot;
import kz.sdu.register.util.GCommonConstant;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Bean
public class UserRegisterImpl implements UserRegister {


  public BeanGetter<EmailSender> emailSender;
  public BeanGetter<EmailSenderController> emailSenderController;
  public BeanGetter<UserDao> userDaoBeanGetter;

  @Override
  public UserCtrlModel getWholeUserInfo(String id){
    UserDot tmp = userDaoBeanGetter.get().getWholeSelect(id);
    UserCtrlModel x = new UserCtrlModel(tmp.id, tmp.name, tmp.surname, tmp.email, tmp.password, tmp.telephone, tmp.birthday, tmp.isAccept, tmp.isWho);
    return x;
  }

  @Override
  public List<UserCtrlModel> getUsersList(){
    List<UserDot> cl = userDaoBeanGetter.get().getAllUsersList();
    List<UserCtrlModel> out = new ArrayList<UserCtrlModel>();
    for (UserDot x: cl) {
        UserCtrlModel tmp = new UserCtrlModel(x.id, x.name, x.surname, x.email, x.password, x.telephone, x.birthday, x.isAccept, x.isWho);
        out.add(tmp);
    }
    return out;
  }

  @Override
  public List<UserCtrlModel> getNotAcceptedUsersList(){
      List<UserDot> cl = userDaoBeanGetter.get().getNotAcceptedUsers();
      List<UserCtrlModel> out = new ArrayList<UserCtrlModel>();
      for (UserDot x: cl) {
          UserCtrlModel tmp = new UserCtrlModel(x.id, x.name, x.surname, x.email, x.password, x.telephone, x.birthday, x.isAccept, x.isWho);
          out.add(tmp);
      }
      return out;
  }

  @Override
  public AuthInfo authUser(String input){
    JSONObject obj = new JSONObject(input);
    String email = obj.getString("email");
    String password = obj.getString("password");
    String id = userDaoBeanGetter.get().getUserIdSelect(email, password);
    AuthInfo x = new AuthInfo();
    if(id == null){
      x.token = "not found";
      x.personId = id;
    }else {
      String isAccepted = userDaoBeanGetter.get().checkIsAccepted(id);
      if(isAccepted.equals("0")) {
        x.token = "not accepted";
        x.personId = id;
      }
      else{
        String out_token = userDaoBeanGetter.get().getUserToken(id);
        if (out_token == null) {
          x.token = RND.str(15);
          x.personId = id;
          userDaoBeanGetter.get().insertToken(id, x.token);
        } else {
          x.token = RND.str(15);
          x.personId = id;
          userDaoBeanGetter.get().updateToken(id, x.token);
        }
      }
    }
    return x;
  }

  @Override
  public String registerUser(String input){
    String res = "";


    JSONObject obj = new JSONObject(input);
    String uuid = obj.getString("id");
    String name = obj.getString("name");
    String surname = obj.getString("surname");
    String age = obj.getString("age");
    String email = obj.getString("email");
    String tel_number = obj.getString("telephone");
    String password = obj.getString("password");
    String isAccepted = obj.getString("isAccepted").equals("1") ? "1":"0";
    String isAdmin = "0";


    if(uuid.length() == 0){
        String check = userDaoBeanGetter.get().checkEmail(email);
        if(check != null){
            res = "email";
        }else{
            uuid = RND.intStr(15);
            userDaoBeanGetter.get().insertPerson(uuid, name, surname, email, password, tel_number, age,  isAccepted, isAdmin);
            res = "added";
            String body = "This is your link for activated account:\n http://localhost:8080/sdu/myproject/#!/sdu/myproject/email/"+urlGenerator(uuid);

            Email e=new Email();
            e.setFrom(GCommonConstant.username);
            e.setTo(email);
            e.setSubject("Accept");
            e.setBody(body);
            emailSender.get().send(e);

        }
    }else{
        userDaoBeanGetter.get().updatePerson(uuid, name, surname, email, password, tel_number, age);
        res = "updated";
    }

    return res;
  }


  private String urlGenerator(String userid){
      String key = RND.intStr(15);
      userDaoBeanGetter.get().insertIntoAcceptTable(userid,key);
      return key;
  }
  @Override
  public String checkUser(String input){
    return null;
  }


  @Override
  public String updateIsAccept(String genNumber){return null;}

  @Override
  public String accept(String num){
    String x = userDaoBeanGetter.get().getUserIdFromAccept(num);
    if (x == null){
        return null;
    }else{
        userDaoBeanGetter.get().updateIsAccept(x);
        return "ok update";
    }
  }
}
