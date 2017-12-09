package kz.sdu.controller.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.Par;
import kz.greetgo.mvc.annotations.RequestInput;
import kz.greetgo.mvc.annotations.ToJson;
import kz.sdu.controller.model.ItemInfo;
import kz.sdu.controller.register.ItemRegister;
import kz.sdu.controller.utils.Controller;

import java.util.List;

@Bean
@Mapping("/items")
public class ItemController implements Controller {

    public BeanGetter<ItemRegister> itemRegister;

    @ToJson
    @Mapping("/select")
    public ItemInfo select(@RequestInput String text){
        return itemRegister.get().select(text);
    }

    @ToJson
    @Mapping("/search")
    public List<ItemInfo> search(@RequestInput String text){
        return itemRegister.get().search(text);
    }

    @ToJson
    @Mapping("/update")
    public String addItem(@RequestInput String input){
        return itemRegister.get().addItem(input);
    }

    @ToJson
    @Mapping("/delete")
    public String deleteItem(@RequestInput String input){
        return itemRegister.get().deleteItem(input);
    }

    @ToJson
    @Mapping("/myitems")
    public List<ItemInfo> myAllItems(@RequestInput String input){
        return itemRegister.get().myAllItems(input);
    }
}
