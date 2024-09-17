package Arindam_maven.third;

import java.util.ArrayList;

public class List_one {
 private ArrayList<Integer> arr;
 
 public ArrayList<Integer> getArr() {
	return arr;
}

public List_one() {
	this.arr = new ArrayList<>();
}

public void insertelem(int a){
	if(arr.size()<5) 
	arr.add(a);
	else {
		arr.remove(0);
		arr.add(a);
	}
	  }

}
