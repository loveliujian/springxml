package com.liu.springxml.autowired;

public class OracleDaoImpl implements BasicDao {

	@Override
	public void save(Object obj) {
		System.out.println("oracle数据库保存对象入库");
	}

}
