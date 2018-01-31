package domain;

public class Record {
	private int id;
	private String flname;
	private String money;
	private String account;
	private String  createtime;
	private String  description;
	public Record() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Record(int id, String flname, String money, String account, String createtime, String description) {
		super();
		this.id = id;
		this.flname = flname;
		this.money = money;
		this.account = account;
		this.createtime = createtime;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFlname() {
		return flname;
	}
	public void setFlname(String flname) {
		this.flname = flname;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Record [id=" + id + ", flname=" + flname + ", money=" + money + ", account=" + account + ", createtime="
				+ createtime + ", description=" + description + "]";
	}
	

}
