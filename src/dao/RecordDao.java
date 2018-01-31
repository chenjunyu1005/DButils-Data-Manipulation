package dao;

import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.Record;
import tools.JDBCUtils;

public class RecordDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getconect());

	public List<Record> selectAll() {
		try {
			String sql = "Select *from record";
			List<Record> list = qr.query(sql, new BeanListHandler<>(Record.class));
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("conection error");

		}

	}

	public List<Record> selectCondition(String start, String end) {
		try {
			String sql = "Select *from record where createtime BETWEEN ? and ?";
			Object[] params = { start, end };
			return qr.query(sql, new BeanListHandler<>(Record.class), params);
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new RuntimeException("error");

		}
	}

	public void addRecord(String flname, String money, String account, String createtime, String description) {
		try {
			String sql = "insert into record(flname,money,account,createtime,description)values(?,?,?,?,?)";
			Object[] params = { flname, money, account, createtime, description };

			qr.update(sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void editRecord(Record r) {
		try {
			String sql = "update record set flname=?,money=?, account=?, createtime=?, description=? where id=? ";
			Object[] params = { r.getFlname(), r.getMoney(), r.getAccount(), r.getCreatetime(), r.getDescription(),
					r.getId() };

			qr.update(sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteRecord(int id) {
		try {
		String sql="delete from record where id =?";
		Object[] params ={id};
			qr.update(sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
