package com.psicocare.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="actividad")
public class Activity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aid;
	@Column
	private String statement;
	@Column
	private String value;
	@Column
	private String content;
	@Column
	private String about;
	@Column
	private String description;
	@Column
	private int countdown;
	
	public  Activity() {
		
	}
	
	public Activity(int aid, String statement, String value, String content, String about, String description,
			int countdown) {
		super();
		this.aid = aid;
		this.statement = statement;
		this.value = value;
		this.content = content;
		this.about = about;
		this.description = description;
		this.countdown = countdown;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCountdown() {
		return countdown;
	}
	public void setCountdown(int countdown) {
		this.countdown = countdown;
	}
	
	
}
