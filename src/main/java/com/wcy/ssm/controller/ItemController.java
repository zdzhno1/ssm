package com.wcy.ssm.controller;

import com.wcy.ssm.beans.Item;
import com.wcy.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Item> list = itemService.findAllItem();
        model.addAttribute("items", list);
        return "itemList";
    }
}
