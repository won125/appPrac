package javaClass;

public class AClass {
	
	public AClass() {
		System.out.println("AClass가 생성됨");
	}
	//내부에 있는 인스턴스 클래스
	class BClass{
		//필드
		int bfield;
		//생성자
		public BClass() {
			System.out.println("BClass가 생성됨");
		}
		//매서드
		void bmethod() {
			
		}
	}
	//정적 클래스
	static class CClass{
		
		int cfield;
		static int cfield2l; // 정적 필드
		//생성자
		public CClass() {
			System.out.println("CClass가 생성됨");
		}
		//매서드
		void cMethod() {
			
		}
		//정적매서드
		static void cMethod2() {
			
		}
	}
	void aMethod() {
		//로컬 클래스
		class DClass{
			//필드
			int dField;
			//생성자
			public DClass() {
				System.out.println("DClass가 생성됨");
			}
			//매서드
			void dMethod() {
				
			}
		}
		DClass dClass = new DClass();
		dClass.dField=10;
		dClass.dMethod();
	}
	
	

}
