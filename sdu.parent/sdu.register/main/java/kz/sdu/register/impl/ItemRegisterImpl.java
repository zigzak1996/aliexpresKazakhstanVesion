package kz.sdu.register.impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.sdu.controller.model.ItemInfo;
import kz.sdu.controller.model.UserCtrlModel;
import kz.sdu.controller.register.ItemRegister;
import kz.sdu.register.dao.BoxDao;
import kz.sdu.register.dao.ItemDao;
import kz.sdu.register.dao.UserDao;
import kz.sdu.register.models.ItemDot;
import kz.sdu.register.models.UserDot;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Bean
public class ItemRegisterImpl implements ItemRegister {

    public BeanGetter<UserDao> userDaoBeanGetter;
    public BeanGetter<ItemDao> itemDaoBeanGetter;
    public BeanGetter<BoxDao> boxDaoBeanGetter;

    @Override
    public ItemInfo select(String text) {
        JSONObject json = new JSONObject(text);
        long id = json.getLong("id");
        ItemDot tmp = itemDaoBeanGetter.get().selectOne(id);
        if(tmp != null) {
            UserDot user = userDaoBeanGetter.get().getWholeSelect(tmp.userid);
            if(user!=null) {
                UserCtrlModel model = new UserCtrlModel(user.id,user.name,user.surname,user.email,user.password,user.telephone,user.birthday,user.isAccept,user.isWho);
                ItemInfo item = new ItemInfo(tmp.id, tmp.name, tmp.userid, tmp.description, model);
                return item;
            }
        }

        return null;
    }

    @Override
    public List<ItemInfo> search(String text) {
        JSONObject json = new JSONObject(text);
        String val = json.getString("text");
        List<ItemDot> items = itemDaoBeanGetter.get().searchAll(val);
        List<ItemInfo> findAll = new ArrayList<ItemInfo>();
        for (ItemDot item : items) {
            System.out.println(item.userid);
            UserDot user = userDaoBeanGetter.get().getWholeSelect(item.userid);
            if(user!=null) {
                UserCtrlModel model = new UserCtrlModel(user.id,user.name,user.surname,user.email,user.password,user.telephone,user.birthday,user.isAccept,user.isWho);
                ItemInfo it = new ItemInfo(item.id, item.name, item.userid, item.description, model);
                findAll.add(it);
            }
        }
        return findAll;
    }

    @Override
    public String addItem(String input) {
        JSONObject json = new JSONObject(input);
        long id = json.getLong("id");
        String name = json.getString("name");
        String description = json.getString("description");
        String token = json.getString("token");
        if (token.length()>0){
            String userid = userDaoBeanGetter.get().getUserIdByToken(token);
            if(id<0) {

                itemDaoBeanGetter.get().addItem(name, userid, description);

                return "YESI";
            }
            else{
                ItemDot item = itemDaoBeanGetter.get().selectOne(id);
                if(item.userid == userid) {
                    itemDaoBeanGetter.get().updateItem(name, description, id);
                    return "YESU";
                }
            }
        }
        return "NO";
    }

    @Override
    public String deleteItem(String input) {
        JSONObject json = new JSONObject(input);
        String token = json.getString("token");
        int id = json.getInt("id");

        String userid = userDaoBeanGetter.get().getUserIdByToken(token);
        if (userid.length()>0){
            itemDaoBeanGetter.get().deleteItem(id);
            boxDaoBeanGetter.get().deleteByAllItemId(id);
            return "Delate";
        }
        return "no";
    }
}
