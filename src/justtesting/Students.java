package justtesting;

import java.util.ArrayList;

public class Students {
	
	public static void getAllStudents(ArrayList<Student>students) {
		for(int i=0;i<students.size();i++) {
			
		
		System.out.println(students.get(i).getId()+","+students.get(i).getName()+","+students.get(i).getCity());
	}
	}
	public static void main(String []args) {
	
		ArrayList<Student>students=new ArrayList<>();
		
		students.add( new Student(1,"pranith","wgl"));
		students.add( new Student(2,"shirley","hyd"));
		
		getAllStudents(students);
		
		System.out.println("hello chnaged");
	}

}
