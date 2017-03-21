package com.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="user1")//当表名 和类名不一致的时候，去手动指定映射的表名
public class User {
@Id
@GeneratedValue
	private int id;
@Column(name="username")//当字段名和属性名不一致的情况下，去手动指定映射的字段名
	private String name;
	private int age;
	private String email;
	
public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
@Transient//把这个属性排斥在数据库之外
	private int version;
	
	public int getVersion() {
	return version;
}


public void setVersion(int version) {
	this.version = version;
}


	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age
				+ ", email=" + email + ", version=" + version + "]";
	}
	
}
