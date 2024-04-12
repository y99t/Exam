package dao;

import java.sql.Connection;

public class Dao{
	static DataSource ds;

	public Connection getConnection() throws Exception{

		//データベースのコネクションを返却

		return ds.getConnection();
	}
}