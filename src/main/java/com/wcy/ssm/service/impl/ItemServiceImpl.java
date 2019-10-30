package com.wcy.ssm.service.impl;

import com.wcy.ssm.beans.Item;
import com.wcy.ssm.mapper.ItemMapper;
import com.wcy.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("itemService")
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;
    @Override
    public void saveItem(Item item) {
        itemMapper.save(item);
    }

    @Override
    public void deleteItemById(Long id) {
        itemMapper.deleteById(id);
    }

    @Override
    public void updateItem(Item item) {
        itemMapper.update(item);
    }

    @Override
    public Item findItemById(Long id) {
        return itemMapper.findById(id);
    }

    @Override
    public List<Item> findAllItem() {
        return itemMapper.findAll();
    }
}
