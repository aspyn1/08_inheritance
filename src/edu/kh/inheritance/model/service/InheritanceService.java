package edu.kh.inheritance.model.service;

import java.util.Scanner;

import edu.kh.inheritance.model.vo.Employee;
import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class InheritanceService {
	
	public void ex1() { // 상속 확인 예제
		// Person을 상속받은 Student가 Person의 필드, 메소드를 사용할 수 있는가?
		
		
		Person p = new Person();
		
		//p.name = "홍길동"; // private 때문에 직접 접근 불가(에러발생) -> getter setter 사용해야함
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		System.out.println("==============================");
		
		// Student 객체 생성
		Student std = new Student();
		
		// Student만의 고유 필드
		std.setGrade(3);
		std.setClassRoom(5);
		// Person 클래스로부터 상속받은 필드, 메서드
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("대한민국");
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		// Student가 Person의 메소드 뿐 아니라 필드도 상속 받았는지 확인
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		System.out.println("==============================");
		
		Employee emp = new Employee();
		
		emp.setCompany("kh정보교육원");
		
		// Person클래스로부터 상속받은 메서드 
		emp.setName("최지은");
		emp.setAge(30);
		emp.setNationality("대한민국");
		
		System.out.println(emp.getCompany());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		
		// 추가된 breath메서드 상속 확인하기
		p.breath();
		std.breath();
		emp.breath();
		// 상속의 특징 : 코드 추가 및 수정에 용이함
		// -> 부모에게 정의하면 상속받은 자식들은 모두 부모의 것을 그대로 받아서 쓸 수 있음
	}
	
	// super() 생성자 사용 방법
	public void ex2() {
		
		// Student 매개변수 5개짜리 생성자
		Student std = new Student("김철수", 17, "한국", 1, 3);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
	}
	
	public void ex3() { // 오버라이딩 확인 예제
		
		Student std = new Student();
		Employee emp = new Employee();
		
		std.move(); // 오버라이딩x -> Person의 메소드 수행
		emp.move(); // 오버라이딩ㅇ -> Employee의 메소드 수행
	
	}
	
	public void ex4() {
		// 모든 클래스는 Object 클래스의 후손
		// == 모든 클래스의 최상위 부모는 Object
		
		// class명에 Object에대한 상속구문이 없다면 컴파일러가 자동으로 extends Object구문을 추가해줌
		
		Person p = new Person();
		// Object 를 상속받은 Person 객체 생성
		
		Student std = new Student();
		// Person을 상속받은 Student 객체 생성
		
		// Object - Person - Student 
		
		System.out.println(p.hashCode());
		System.out.println(std.hashCode());
		// Person이 Object에서 물려받은 hashCode()를 Student가 또 물려받아 사용
		
		String str = "abc";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(str.hashCode());
		// String이 Object 상속받음
		System.out.println(sc.hashCode());
		// Scanner가 Object 상속받음
		
	}
	
	public void ex5() {// toSting 사용 예제
		
		Person p = new Person("김철수", 17, "한국");
		
		System.out.println(p.toString());

		System.out.println(p);
		// print 구문 수행 시 참조변수명을 작성하면
		// 자동으로 toString() 메소드를 호출해서 출력한다
		
		Student std = new Student("이백점", 18, "미국", 2, 6);

		System.out.println(std.toString());
		System.out.println(std);
		
		Employee emp = new Employee("최지은", 30, "한국", "kh정보교욱원");
		
		System.out.println(emp);
				
	}
}
