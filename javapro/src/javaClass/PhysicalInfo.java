package javaClass;
// 신체 성장 정버
public class PhysicalInfo {
	//필드
	String name; // 이름
	int age; // 나이
	float height; // 키
	float weight; // 몸무게
	
	//생성자
	public PhysicalInfo(String name, int age, float height, float weight) {
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	
	//매서드
	void update(int age,float height, float weight) {
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	
	//매서드 오버로딩
	void update(int age,float height) {
		this.age=age;
		this.height=height;
	}
	
	//매서드 오버로딩
		void update(int age) {
			this.age=age;
		}

}
