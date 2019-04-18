package org.papaCollege.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_USER")
	private long idUser;
	private String userName;
	private String password;
	private boolean actived;
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<Role> roles;
	
	
	
	public User() {
		
	}
	
	
	public User(String userName, String password, boolean actived) {
		this.userName = userName;
		this.password = password;
		this.actived = actived;
	}


	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActived() {
		return actived;
	}
	public void setActived(boolean actived) {
		this.actived = actived;
	}

}
