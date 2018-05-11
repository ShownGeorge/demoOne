package com.yaorange.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yaorange.pojo.Item;

@Controller
public class PageController {
		@RequestMapping("/{page}")
		public String showPage(@PathVariable String page,Model model){
			if("itemList".equals(page)){
				List<Item> items = new ArrayList<Item>();
				for (int i = 0; i < 5; i++) {
					Item item = new Item();
					item.setId(i);
					item.setName("姓名"+i);
					item.setDetail("详情"+i);
					item.setPrice(234.5f);
					items.add(item);
				}
				model.addAttribute("itemList", items);
			}
			
			return page;
		}
		
		@RequestMapping("/yaorange")
		@ResponseBody
		public Item showData(){
			Item item = new Item();
			item.setId(1);
			item.setName("姓名"+1);
			item.setDetail("详情"+1);
			item.setPrice(234.5f);
			return item;
		}

}
