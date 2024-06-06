package com.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTempate;
	@Transactional
	public int saveUser(User user) {

		int a = (int) this.hibernateTempate.save(user);
		return a;
	}
}
