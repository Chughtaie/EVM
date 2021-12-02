package evm;

import java.util.Date;

import oracle.sql.DATE;

public class Voter {

	String name;
	String cnic;
	int vote; 
	Date vdate;
	String sdate;
	
	Voter(String a,String b){

		name=a;
		cnic=b;
		vote=0;		
		sdate="";
	}
	
	void Vote() {
		vote=1;
		vdate=new Date();
		sdate=vdate.toString();
	}
	
	void clear() {
		vote=0;		
		vdate=null;
		sdate="";
	}
}
