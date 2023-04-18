package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMedals {
	       public static HashMap<String,String> getStudent(Map<String, Integer> st)
	       {
	              HashMap<String,String> medal = new HashMap<>();
	              Set<String> set = st.keySet();
	              for(String s:set)
	              {
	                     Integer marks = st.get(s);
	                     if(marks>=90)
	                     {
	                           medal.put(s,"Gold");
	                     }
	                     else if(marks >=80)
	                     {
	                           medal.put(s,"Silver");
	                     }
	                     else if(marks>=70)
	                     {
	                           medal.put(s,"Bronze");
	                     }
	              }
	              return medal;
	       }
	       
	       public static void main(String[] args) {

	   		Map<String, Integer> st = new HashMap<>();
	   		st.put("Ila", 97);
	   		st.put("keshu", 99);
	   		st.put("kavi", 75);
	   		st.put("Sang", 80);
	   		System.out.println(getStudent(st));
	   	}

}
