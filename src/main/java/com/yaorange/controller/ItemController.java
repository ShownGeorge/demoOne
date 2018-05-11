package com.yaorange.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.util.SocketUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yaorange.exception.MyException;
import com.yaorange.pojo.Item;
import com.yaorange.pojo.QueryVo;

@Controller
public class ItemController {
	//post形式传递参数
	/*@RequestMapping("/item/edit")
	public String editPage(Integer id){
		System.out.println(id);
		return "addItem";
	}*/
	
	//post形式传递参数
	/*@RequestMapping("/item/edit")
	public String editPage(int id){
		System.out.println(id);
		return "addItem";
	}*/
	
	/*//get形式传递参数
	@RequestMapping("/item/edit")
	public String editPage(HttpServletRequest request,Boolean status){
		String id = request.getParameter("id");
		System.out.println(id);
		System.out.println(status);
		return "addItem";
	}*/
	
	/*@RequestMapping("/item/edit")
	public String editPage(@RequestParam(defaultValue="10") int id){
		System.out.println(id);
		return "addItem";
	}*/
	
	/*@RequestMapping("/item/edit")
	public String editPage(@RequestParam(value="itemId",defaultValue="10") int id){
		System.out.println(id);
		return "addItem";
	}*/
	
	//页面传一个对象
	/*@RequestMapping("/item/edit")
	public String editPage(Item item){
		System.out.println(item);
		return "addItem";
	}*/
	
	//获取 集合
	/*@RequestMapping("/item/delete")
	public String editPage(Integer[] ids){
		System.out.println(ids);
		return "addItem";
	}*/
	
	//获取 集合（里面是对象）
	/*@RequestMapping("/item/delete")
	public String editPage(QueryVo vo){
		List<Item> itemList = vo.getItemList();
		System.out.println();
		return "addItem";
	}*/
	
	@RequestMapping("/item/edit")
	public String editPage(Item item) throws MyException{
		System.out.println();
		if(true){
			throw new MyException("是你的错"); 
		}
		
		System.out.println(item);
		return "addItem";
	}
	
	
}
