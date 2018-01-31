package controller;

import java.util.List;

import domain.Record;
import service.Service;

public class Control {
	private Service  service =new Service();

	public List<Record> selectAll() {
		// TODO Auto-generated method stub
		return service.selectAll();
	}
	 public List<Record> selectCondition(String start ,String end){
		 return service.selectCondition(start,end);
	 }
	 public void addRecord(String flname,String money,String account,String createtime, String description){
		 service.addRecord(flname,money,account,createtime,description);
	 }
	 public void editRecord(Record r){
		 service.editRecord(r);
	 }
	public void deleteRecord(int id) {
		service.deleteRecord(id);
		
	}
	 
	
	 
}
