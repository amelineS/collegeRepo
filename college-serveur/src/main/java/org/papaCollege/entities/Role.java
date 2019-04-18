package org.papaCollege.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idRole;
	private String roleName;
	@ManyToOne
	@JoinColumn(name="ID_USER")
	private User user;
	
	
	public Role() {
		
	}
	
	public Role(String roleName) {
		this.roleName = roleName;
	}

	public long getIdRole() {
		return idRole;
	}
	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
