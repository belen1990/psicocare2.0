package com.psicocare.models;

public class Test {
	
	private int tid; 
	private int respuesta1; 
	private int respuesta2; 
	private int respuesta3; 
	private int respuesta4; 
	private int respuesta5; 
	private double anxiety; 
	private double depression; 
	private double social_anxiety; 
	private double stress;
	
	
	
	public Test() {		

	}
	
	public Test(int tid, int respuesta1, int respuesta2, int respuesta3, int respuesta4, int respuesta5, double anxiety,
			double depression, double social_anxiety, double stress) {
		super();
		this.tid = tid;
		this.respuesta1 = respuesta1;
		this.respuesta2 = respuesta2;
		this.respuesta3 = respuesta3;
		this.respuesta4 = respuesta4;
		this.respuesta5 = respuesta5;
		this.anxiety = anxiety;
		this.depression = depression;
		this.social_anxiety = social_anxiety;
		this.stress = stress;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getRespuesta1() {
		return respuesta1;
	}
	public void setRespuesta1(int respuesta1) {
		this.respuesta1 = respuesta1;
	}
	public int getRespuesta2() {
		return respuesta2;
	}
	public void setRespuesta2(int respuesta2) {
		this.respuesta2 = respuesta2;
	}
	public int getResuesta3() {
		return respuesta3;
	}
	public void setRespuesta3(int respuesta3) {
		this.respuesta3 = respuesta3;
	}
	public int getRespuesta4() {
		return respuesta4;
	}
	public void setRespuesta4(int respuesta4) {
		this.respuesta4 = respuesta4;
	}
	public int getRespuesta5() {
		return respuesta5;
	}
	public void setRespuesta5(int respuesta5) {
		this.respuesta5 = respuesta5;
	}
	public double getAnxiety() {
		return anxiety;
	}
	public void setAnxiety(double anxiety) {
		this.anxiety = anxiety;
	}
	public double getDepression() {
		return depression;
	}
	public void setDepression(double depression) {
		this.depression = depression;
	}
	public double getSocial_anxiety() {
		return social_anxiety;
	}
	public void setSocial_anxiety(double social_anxiety) {
		this.social_anxiety = social_anxiety;
	}
	public double getStress() {
		return stress;
	}
	public void setStress(double stress) {
		this.stress = stress;
	} 

	public int getTest(int paso) {
		
	
		
		
		
		return paso;
		
	}

}
