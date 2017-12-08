package kz.sdu.controller.register;

import kz.sdu.controller.model.AuthInfo;
import kz.sdu.controller.model.UserCtrlModel;

import java.util.List;

public interface UserRegister {
    UserCtrlModel getWholeUserInfo(String id);
    String registerUser(String input);
    AuthInfo authUser(String input);
    List<UserCtrlModel> getUsersList();
    List<UserCtrlModel> getNotAcceptedUsersList();
    String updateIsAccept(String genNumber);

    String checkUser(String input);

    String accept(String num);
}
