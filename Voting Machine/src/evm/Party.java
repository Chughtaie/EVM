package evm;

import java.util.Date;
import java.util.Vector;

public class Party {
	
	String name;
	Vector<Candidate> can;
	Date reg_date;
	Candidate pres;
	String code;
	
	Party(String a,Candidate b,String c){
		name=a;
		pres=b;
		code=c;
		can=new Vector<Candidate>();
	}
	
	void addCandidate(Candidate a) {
		can.add(a);
	}
	
	Candidate delCandidate(int del) {
		for(int i=0;i<can.size();i++)
			if(can.get(i).cnic==del)
				 return can.remove(i);				
				
		System.out.println("Not a member of Party!!");
		return null;
	}

	boolean setPres(int pre) {
		for(int i=0;i<can.size();i++)
			if(can.get(i).cnic==pre)
				{pres=can.get(i); return true;}

		System.out.println("Not a member of Party!!");
		return false;
	}
	
}
