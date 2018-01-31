package service;

import java.util.List;

import dao.RecordDao;
import domain.Record;

public class Service {
 private  RecordDao dao= new RecordDao();
 
 public List<Record> selectAll(){
	 List<Record> list =dao.selectAll();
	 return list;
	 }
 public List<Record> selectCondition(String start ,String end){
	 return dao.selectCondition(start ,end);
 }
 public void addRecord(String flname,String money,String account,String createtime, String description){
	  dao.addRecord(flname,money,account,createtime,description);
 }
public void editRecord(Record r) {
	dao.editRecord(r);
	
}
public void deleteRecord(int id) {
	dao.deleteRecord(id);
	
}
}
