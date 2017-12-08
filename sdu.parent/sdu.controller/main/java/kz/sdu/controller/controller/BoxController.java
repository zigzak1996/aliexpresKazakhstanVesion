package kz.sdu.controller.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.RequestInput;
import kz.greetgo.mvc.annotations.ToJson;
import kz.sdu.controller.model.BoxInfo;
import kz.sdu.controller.model.ItemInfo;
import kz.sdu.controller.register.BoxRegister;
import kz.sdu.controller.utils.Controller;

import java.util.List;

@Bean
@Mapping("/box")
public class BoxController implements Controller {
    public BeanGetter<BoxRegister> boxRegister;

    @ToJson
    @Mapping("/add")
    public String add(@RequestInput String input){
        return boxRegister.get().add(input);
    }

    @ToJson
    @Mapping("/list")
    public List<BoxInfo> listItemBox(@RequestInput String input){
        return boxRegister.get().listItemBox(input);
    }

    @ToJson
    @Mapping("/take")
    public BoxInfo takeItem(@RequestInput String input){
        return boxRegister.get().take(input);
    }

    @ToJson
    @Mapping("/delete")
    public String deleteItem(@RequestInput String input){
        return boxRegister.get().delete(input);
    }
    @ToJson
    @Mapping("/buy")
    public String buyItem(@RequestInput String input){
        return boxRegister.get().buy(input);
    }
}
