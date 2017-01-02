package com.liu.springxml.obj;

public class BaseService {
	
	private BaseDao baseDao;
	
	public void invoke(){
		baseDao.invoke();
		System.out.println("BaseService类中的invoke方法被调用");
	}

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

}
