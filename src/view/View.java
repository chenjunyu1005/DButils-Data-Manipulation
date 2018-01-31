package view;

import java.util.List;
import java.util.Scanner;

import controller.Control;
import domain.Record;

public class View {
Control control =new Control();
public  void run(){
	Scanner sc =new Scanner(System.in);
	while(true){
		System.out.println("----------------------------------");
		System.out.println("1.AddRecord 2.ModifyRecord 3.DeleteRecord 4.SearchRecord 5.Exit");
		System.out.println("Enter the operation number[1-5]:");
      int num =sc.nextInt();
      switch (num){
      case 1: addRecord(); 
         break;
      case 2: editRecord(); 
          break;
      case 3: deleteRecord();
          break;
      case 4:  selectRecord();
          break;
      case 5:
    	  System.exit(0);
    	  System.out.println("Exit Successful");
       default:  
    	   System.out.println("Invalid Input");
            
      }
	}
}

public void selectRecord(){
	System.out.println("1.All record  2.conditional record");
     Scanner sc =new Scanner(System.in);
     int no =sc.nextInt();
     switch(no){
     case 1:
    	 selectAll();
    	 break;
     case 2:
    	 selectCondition();
     }
}
public void selectAll(){
	List<Record> list= control.selectAll();
	printRecord(list);
}
private void printRecord(List<Record> list) {
	System.out.println("ID\tTransaction\tAmount\tAccount\tDate\tDescription");
    for(Record r : list){
    	System.out.println(r.getId()+"\t"+r.getFlname()+"  \t"+r.getMoney()+" \t"
    	+r.getAccount()+"\t"+r.getCreatetime()+"\t"+r.getDescription()
    	);
    }
}
public void selectCondition(){
	Scanner scanner =new Scanner(System.in);
	System.out.println("Starting date");
	String start =scanner.nextLine();
	System.out.println("End date");
	String end = scanner.nextLine();
	List<Record> list =control.selectCondition(start, end);
	if(list.size()!=0){
	printRecord(list);
	}else{
		System.out.println("Result not found");
	}
}

public void addRecord(){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Type");
	String flname =sc.nextLine();
	System.out.println("Enter Amount");
	String money =sc.nextLine();
	System.out.println("Enter Account");
	String account =sc.nextLine();
	System.out.println("Enter Date");
	String createtime =sc.nextLine();
	System.out.println("Enter Description");
	String description =sc.nextLine();
	/*r.setId(id);
	r.setFlname(flname);
	r.setMoney(money);
	r.setAccount(account);
	r.setCreatetime(createtime);
	r.setDescription(description);*/
	Record r =new Record(0, flname, money, account, createtime, description);
	control.addRecord(flname, money, account, createtime, description);

}
public void editRecord(){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the the id ");
	int id = sc.nextInt();
	System.out.println("Enter Type");
	String flname =sc.next();
	System.out.println("Enter Amount");
	String money =sc.next();
	System.out.println("Enter Account");
	String account =sc.next();
	System.out.println("Enter Date");
	String createtime =sc.next();
	System.out.println("Enter Description");
	String description =sc.next();
	Record r =new Record(id, flname, money, account, createtime, description);
	control.editRecord(r);
	System.out.println("Edit Successful");
	
}
private void deleteRecord() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the the id you want to delete ");
	int id = sc.nextInt();
	control.deleteRecord(id);
	System.out.println("Delete Successful");
}
}
