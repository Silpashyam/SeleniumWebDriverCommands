package multipleobjectextraction;
import java.util.ArrayList;
import java.util.List;

public class ListJava {

	public static void main(String[] args) {
		// no final size
		// dynamically
		// indexing
		List<String> l = new ArrayList<String>();
		System.out.println(l.size());//0
		l.add("Iran"); //0
		l.add("Russia"); //1
		l.add("Israel"); //2
		l.add("Japan"); //3
		System.out.println(l.size());//4
		
		System.out.println(l.get(2));
		
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		
		for(String s : l) {// no index
			System.out.println(s);
		}
		

	}

}
