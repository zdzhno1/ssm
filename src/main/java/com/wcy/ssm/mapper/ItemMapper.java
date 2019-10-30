package com.wcy.ssm.mapper;

import com.wcy.ssm.beans.Item;

import java.util.List;

public interface ItemMapper {

    void save(Item item);

    void deleteById(Long id);

    void update(Item item);

    Item findById(Long id);

    List<Item> findAll();
}
