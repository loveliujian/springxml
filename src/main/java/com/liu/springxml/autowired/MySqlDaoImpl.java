package com.liu.springxml.autowired;

public class MySqlDaoImpl implements BasicDao {

	@Override
	public void save(Object obj) {
		System.out.println("mysql数据库保存对象入库");
	}

}
