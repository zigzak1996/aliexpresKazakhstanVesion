package kz.sdu.register.impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.sdu.controller.model.BoxInfo;
import kz.sdu.controller.model.ItemInfo;
import kz.sdu.controller.model.UserCtrlModel;
import kz.sdu.controller.register.BoxRegister;
import kz.sdu.register.dao.BoxDao;
import kz.sdu.register.dao.ItemDao;
import kz.sdu.register.dao.UserDao;
import kz.sdu.register.models.BoxDot;
import kz.sdu.register.models.ItemDot;
import kz.sdu.register.models.UserDot;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Bean
public class BoxRegisterImpl implements BoxRegister {

    public BeanGetter<UserDao> userDaoBeanGetter;
    public BeanGetter<ItemDao> itemDaoBeanGetter;
    public BeanGetter<BoxDao> boxDaoBeanGetter;

    @Override
    public String add(String text) {
        JSONObject json = new JSONObject(text);
        String token = json.getString("token");
        Integer itemid = (Integer)json.getInt("id");
        if(token != null){
            String userid = userDaoBeanGetter.get().getUserIdByToken(token);
            if(userid != null){
                Integer check = boxDaoBeanGetter.get().checkItem(userid,String.valueOf(itemid));
                if (check == null) {
                    boxDaoBeanGetter.get().addToBox(userid, String.valueOf(itemid));
                    return "add";
                }
            }
        }
        return "no";
    }

    @Override
    public List<BoxInfo> listItemBox(String text) {
        JSONObject json = new JSONObject(text);
        String token = json.getString("token");
        List<BoxInfo> ans = new ArrayList<BoxInfo>();

        String userid = userDaoBeanGetter.get().getUserIdByToken(token);

        List<BoxDot> boxes = boxDaoBeanGetter.get().allIdBoxForUser(userid);

        for (BoxDot box : boxes){
            ItemDot item = itemDaoBeanGetter.get().selectOne(box.itemid);
            UserDot user = userDaoBeanGetter.get().getWholeSelect(item.userid);
            UserCtrlModel u = new UserCtrlModel(user.id,user.name,user.surname,user.email,user.password,user.telephone,user.birthday,user.isAccept,user.isWho);
            ItemInfo tmp = new ItemInfo(item.id,item.name,item.userid,item.description,u);
            BoxInfo a = new BoxInfo(box.id,tmp);
            ans.add(a);
        }

        return ans;
    }

    @Override
    public BoxInfo take(String text) {
        JSONObject json = new JSONObject(text);

        String token = json.getString("token");
        int boxid = json.getInt("id");

        String userid = userDaoBeanGetter.get().getUserIdByToken(token);
        BoxDot box = boxDaoBeanGetter.get().selectById(boxid);
        ItemDot item = itemDaoBeanGetter.get().selectOne(box.itemid);
        UserDot user = userDaoBeanGetter.get().getWholeSelect(item.userid);

        UserCtrlModel u = new UserCtrlModel(user.id,user.name,user.surname,user.email,user.password,user.telephone,user.birthday,user.isAccept,user.isWho);
        ItemInfo tmp = new ItemInfo(item.id,item.name,item.userid,item.description,u);
        BoxInfo a = new BoxInfo(box.id,tmp);

        return a;
    }

    @Override
    public String delete(String text) {
        JSONObject json = new JSONObject(text);
        String token = json.getString("token");
        int id = json.getInt("id");

        String userid = userDaoBeanGetter.get().getUserIdByToken(token);
        if (userid != null){
            boxDaoBeanGetter.get().deleteById(id);
            return "DELETE";
        }
        return "NO";
    }

    @Override
    public String buy(String input) {
        JSONObject json = new JSONObject(input);
        String token = json.getString("token");
        int id = json.getInt("id");

        String userid = userDaoBeanGetter.get().getUserIdByToken(token);
        if (userid != null){
            BoxDot box = boxDaoBeanGetter.get().selectById(id);
            itemDaoBeanGetter.get().deleteItem(box.itemid);
            boxDaoBeanGetter.get().deleteByAllItemId(id);
            return "DELETE";
        }
        return "NO";
    }
}
