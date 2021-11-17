package com.winno.daos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.winno.models.User;

@Repository
public class UserDao {

	public List<User> getList() {
		List<User> datas = new ArrayList<User>();

		datas.add(new User(1, "admin", "123456", "active"));
		datas.add(new User(2, "admin1", "123456", "de-active"));
		datas.add(new User(3, "admin2", "16", "active" ));
		datas.add(new User(4, "admin3", "12", "active"));
		datas.add(new User(5, "admin4", "12", "de-active"));
	
		
		return datas;
	}

}
