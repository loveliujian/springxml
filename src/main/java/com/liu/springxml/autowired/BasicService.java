package com.liu.springxml.autowired;

public class BasicService {
	
	private BasicDao basicDao;
	
	public void deal(Object obj){
		basicDao.save(obj);
	}

	public void setBasicDao(BasicDao basicDao) {
		this.basicDao = basicDao;
	}

}
