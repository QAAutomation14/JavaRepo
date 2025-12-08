package org.java.oops.qa.part3;

public class MO_Child extends MO_Parent {

	public void m1() {
		System.out.println("m1 of child");
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}

	public void child() {
		System.out.println("child method");
	}
	public void exp() {
		System.out.println("exp method");
	}
	public static void main(String[] args) {

		MO_Parent mo1 = new MO_Parent();
		mo1.m1();
		mo1.parent();

		MO_Child mo2=new MO_Child();
		mo2.m1();
		mo2.parent();
		mo2.child();
		
		//up-casting
		System.out.println("upcasting-------------------------");
		MO_Parent mp=new MO_Child();
		mp.m1();
		mp.parent();
	
		//down-casting- not possible in Java implicitly
		
		MO_Child mc=(MO_Child)new MO_Parent();
		mc.m1();
		mc.child();
		mc.parent();
	}
}
