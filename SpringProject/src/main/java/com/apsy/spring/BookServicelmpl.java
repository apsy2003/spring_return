package com.apsy.spring;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*�������� ���� Ŭ�������� �˷��ش�*/
@Service
public class BookServicelmpl implements BookService{
	@Autowired
	BookDao bookDao;
	/* �����ͺ��̽� ������ ���� BookDao �ν��Ͻ��� ���� */
	
	@Override
	public String create(Map<String, Object> map) {
		//bookDao.insert �޼��带 ����
		//affectRowCount �������� ������� �� ���� ����.
	    int affectRowCount = this.bookDao.insert(map);
	    if (affectRowCount ==  1) {
	    	//map �ν��Ͻ��� book ���̺��� PK�� book_id�� ������� ���̴�. book_id ���� ����
	        return map.get("book_id").toString();
	    }
	    return null;
	}
	
    @Override
    public Map<String, Object> detail(Map<String, Object> map){
        return this.bookDao.selectDetail(map);
    }	
    
    @Override
    public boolean edit(Map<String, Object> map) {
        int affectRowCount = this.bookDao.update(map);
        return affectRowCount == 1;
    }    
    
    @Override
    public boolean remove(Map<String, Object> map) {
        int affectRowCount = this.bookDao.delete(map);
        //������ ��� ������ �����ϰ� �� ���� ���� ����� ����޾Ҵ����� �˻�
        return affectRowCount == 1;
    }    
}