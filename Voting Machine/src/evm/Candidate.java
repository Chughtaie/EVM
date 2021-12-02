package evm;

import java.util.Date;

public class Candidate {

	String name;
	int age;
	private int votes;
	int cnic;
	String region;
	Date join_date;

	Candidate(String a, int b, int c,int d){
		
		name=a;
		age=b;
		votes=c;
		cnic=d;
		join_date= new Date();
		
	}
	
	int getVotes() {		
		return votes;		
	}
	
	void setVotes(int vot) {		
		votes=vot;		
	}
	
}
