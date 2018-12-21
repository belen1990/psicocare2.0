package com.psicocare.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.psicocare.models.Activity;



public class ActivityManager {
	private static ActivityManager instance = null;

	private static SessionFactory sfactory;

	public static ActivityManager getInstance() {
		if (instance == null) instance = new ActivityManager();
		return instance;
	}

	private ActivityManager() {
		sfactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	
	public List<Activity> getActivities() {
		Session sess = sfactory.openSession();

		List<Activity> listaActivity = sess.createQuery("from Activity").list();

		sess.close();
		return listaActivity;
	}
	

	public Activity getActivityByAid(int aid) {
		Session sess = sfactory.openSession();
		
		System.out.println("getActivityByAid:"+aid);
		
		Activity activity = sess.get(Activity.class, aid);
		
		
		sess.close();
		return activity;
	}

}
