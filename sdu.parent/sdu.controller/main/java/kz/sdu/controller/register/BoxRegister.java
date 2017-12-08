package kz.sdu.controller.register;

import kz.sdu.controller.model.BoxInfo;
import kz.sdu.controller.model.ItemInfo;

import java.util.List;

public interface BoxRegister {
    String add(String text);
    List<BoxInfo> listItemBox(String text);
    BoxInfo take(String text);
    String delete(String text);
    String buy(String input);
}
