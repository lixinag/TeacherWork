package com.lx.test;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		list.add(new User(1,"lixiang"));
		list.add(new User(2,"yanlong"));
		list.add(new User(3,"liuyuyang"));
		list.add(new User(4,"yanbowen"));
		/*List<String> nameList = getNameList(list);
        System.out.println(nameList);*/
		List<String> nameList = getNameList2(list);
        System.out.println(nameList);
	}
	public static List<String> getNameList(List<User> userlist){
		List<String> list = new ArrayList<String>();
		userlist.stream().map(x -> x.getName()).forEach(s -> list.add(s));
		return list;
	}
	public static List<String> getNameList2(List<User> userlist){
		List<String> list = new ArrayList<String>();
		userlist.forEach(x -> {String name = x.getName();list.add(name);});
		return list;
	}
}
