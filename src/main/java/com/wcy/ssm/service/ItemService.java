package com.wcy.ssm.service;

import com.wcy.ssm.beans.Item;

import java.util.List;

public interface ItemService {

    void saveItem(Item item);

    void deleteItemById(Long id);

    void updateItem(Item item);

    Item findItemById(Long id);

    List<Item> findAllItem();
}
