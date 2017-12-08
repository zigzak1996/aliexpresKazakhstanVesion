package kz.sdu.controller.controller;


import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.*;
import kz.sdu.controller.model.AuthInfo;
import kz.sdu.controller.model.UserCtrlModel;
import kz.sdu.controller.register.UserRegister;
import kz.sdu.controller.utils.Controller;

import java.util.List;

@Bean
@Mapping("/user")
public class UserController implements Controller {

    public BeanGetter<UserRegister> userRegister;



    @Mapping("/{generatedNumber}")
    public void accept(@ParPath("generatedNumber") String num){
        System.out.println(num);
        String username = userRegister.get().accept(num);
        System.out.println(username);
    }

    @ToJson
    @Mapping("/save")
    public String registerUser(@RequestInput String input){
        return userRegister.get().registerUser(input);
    }

    @ToJson
    @Mapping("/check")
    public AuthInfo checkUser(@RequestInput String input){
        return userRegister.get().authUser(input);
    }

    @ToJson
    @Mapping("/getInfo")
    public UserCtrlModel getWholeUserInfo(@Par("id") String id){ return userRegister.get().getWholeUserInfo(id);}

    @ToJson
    @Mapping("/getNotAccepted")
    public List<UserCtrlModel> getAllNotAcceptedUsers(){
        return userRegister.get().getNotAcceptedUsersList();
    }

}