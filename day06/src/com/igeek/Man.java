package com.igeek;

public class Man {
	
	private int gender;
	private int salay;
	
	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getSalay() {
		return salay;
	}

	public void setSalay(int salay) {
		this.salay = salay;
	}

	public void maleOrFemale() {
		if(gender==1) {
			System.out.println("man");
		}else if (gender == 0) {
			System.out.println("woman");
		}
	}
	
	
	
	
	public void employee() {
		String jobInfo = salay == 0 ? "no work" : "have work";
		System.out.println(jobInfo);
	}

}
