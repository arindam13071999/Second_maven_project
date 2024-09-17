package Arindam_maven.third;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class List_oneTest {

	@Test
	void test() {
		List_one list1=new List_one();
		ArrayList<Integer> list2=new ArrayList<>();
	   list1.insertelem(1);list2.add(1);	
	   list1.insertelem(2);list2.add(2);
	   list1.insertelem(3);list2.add(3);
	   list1.insertelem(4);list2.add(4);
	  
		   Assertions.assertEquals(list1.getArr(), list2);
	}

}
