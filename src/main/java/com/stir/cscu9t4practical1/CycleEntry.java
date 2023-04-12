package com.stir.cscu9t4practical1;


public class CycleEntry {
private String terrain;
private String tempo;



public CycleEntry (String n, int d, int m,int h, int y, int min, int s, float dist, String ter, String tem) {
//super(n,d,m,y,h,min,s,dist);
this.terrain=ter;
this.tempo=tem;
}
public String getterrain() {
return terrain;
}


public void setterrain (String ter) {
this.terrain =ter;
}
public String gettempo() {
return tempo;
}
public void settempo (String tem) {
this.terrain =tem;
}
public String getTerrain() {
return tempo;
}
//public String getEntry() {

	//String result = getName()+"ran" + getDistance() +"km in"
      //  + getHour()+":"+ getMin()+":"+ getSec()+"on"
	//	+ getDay()+"/"+ getMonth()+"/"+ getYear()+"\n"+ getWhere()+":";
 //return result;
}//getEntry 

//Entry



