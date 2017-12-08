package kz.sdu.controller.register;

import kz.sdu.controller.model.ItemInfo;

import java.util.List;

public interface ItemRegister {
    ItemInfo select(String text);
    List<ItemInfo> search(String text);
    String addItem(String input);
    String deleteItem(String input);
}
