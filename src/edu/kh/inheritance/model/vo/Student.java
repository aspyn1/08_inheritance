package edu.kh.inheritance.model.vo;

public class Student extends Person {
	// Student 클래스에 Person 클래스의 내용을 연장한다.
	// Student 클래스에 Person 클래스의 내용(필드, 메서드)을 추가하여 확장한다.
	
	// ***상송***
	// extends : 확장하다, 연장하다...
	
//	private String name;
//	private int age;
//	private String nationality;
	private int grade; // 학년
	private int classRoom; // 반
	
	
	public Student() {
		
		// Student() 객체 생성 시 
		// 내부에 상속받은 Person 객체를 생성하기위한
		// Person 생성자 호출 코드 필요하다!
		
		// super : 상위
		// 현재 Student의 suepr == Person
		super(); // super() 생성자
		// 부모의 생성자를 호출하는 코드로
		// 반드시 자식의 생성자 최상단에 작성되어야한다.
		// 부모의 생성자 실행(필드 초기화+특정기는 수행)
		
		// * super() 생성자 떄문에
		// 자식 객체 내부에 부모객체가 생성된다!
		
		// * super() 생성자 미작성시
		// 컴파일러가 컴파일 단계에서 자동으로 추가해줌.
	
	}
	
	
	public Student(String name, int age, String nationality, int grade, int classRoom) {
//		this.name = name;
//		this.age = age;
//		this.nationality = nationality;
		// 왜? 부모의 필드에 private 접근제한자가 있어서
		// 아무리 물려받은 자식이라도 다른 객체이기 때문에 직접접근 불가
		
		// 부모의 setter를 이용할 수 있지만 모두 작성하기에는 비효율적이다.
		
		super(name, age, nationality); // 부모의 매개변수 생성자 호출
		
		this.grade = grade;
		this.classRoom = classRoom;
	}

	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getNationality() {
//		return nationality;
//	}
//
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	@Override
	public String toString() {
		return super.toString() + "/" + grade + "/" + classRoom;
	}
	

}
