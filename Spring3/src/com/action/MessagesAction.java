package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.Messages;
import com.entities.Residernt;
import com.service.MessagesService;

public class MessagesAction implements SessionAware{
private Integer id;
private Messages messages;
private MessagesService messagesService;
private Map<String, Object> session;
private Residernt residernt;
private int currentPage;
private int totalPage;
private int totalSize;
private int pageSize = 4;
public String add(){
	
	messages.setCreateTime(new Date());
	messagesService.addMessages(messages);
	return "success";
	
}
public String delete(){
	messages=messagesService.findById(id);
	messagesService.deleteMessages(messages);
	return "success";
	
}
public String update(){
	messagesService.updateMessages(messages);
	return "success";
	
}
public String findById(){
	messages=messagesService.findById(id);
	return "success";
	
}
public String findAll(){
	 if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=messagesService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	List<Messages>	messageslist=messagesService.findAll(currentPage, pageSize);
	session.put("messageslist", messageslist);
	return "success";
	
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Messages getMessages() {
	return messages;
}
public void setMessages(Messages messages) {
	this.messages = messages;
}
public MessagesService getMessagesService() {
	return messagesService;
}
public void setMessagesService(MessagesService messagesService) {
	this.messagesService = messagesService;
}
@Override
public void setSession(Map<String, Object> session) {
	this.session=session;
	
}
public Residernt getResidernt() {
	return residernt;
}
public void setResidernt(Residernt residernt) {
	this.residernt = residernt;
}
public int getCurrentPage() {
	return currentPage;
}
public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
}
public int getTotalPage() {
	return totalPage;
}
public void setTotalPage(int totalPage) {
	this.totalPage = totalPage;
}
public int getTotalSize() {
	return totalSize;
}
public void setTotalSize(int totalSize) {
	this.totalSize = totalSize;
}
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}

}
