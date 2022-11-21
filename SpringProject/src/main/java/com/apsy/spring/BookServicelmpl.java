package com.apsy.spring;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*스프링에 서비스 클래스임을 알려준다*/
@Service
public class BookServicelmpl implements BookService{
	@Autowired
	BookDao bookDao;
	/* 데이터베이스 접근을 위해 BookDao 인스턴스를 주입 */
	
	@Override
	public String create(Map<String, Object> map) {
		//bookDao.insert 메서드를 실행
		//affectRowCount 변수에는 영향받은 행 수가 담긴다.
	    int affectRowCount = this.bookDao.insert(map);
	    if (affectRowCount ==  1) {
	    	//map 인스턴스에 book 테이블의 PK인 book_id가 담겨있을 것이다. book_id 값을 리턴
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
        //삭제의 경우 수정과 동일하게 한 개의 행이 제대로 영향받았는지만 검사
        return affectRowCount == 1;
    }    
}
