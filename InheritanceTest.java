class C {
public void test(){
}
}
class B extends C {
public void test(){
}
}
class A extends B {
public void test(){
}
}
class InheritanceTest {
     public static void main(String args[]){
	C c = new C();
	c.test();
     }	
}


/*
Output:
f. It is not possible to invoke test() method defined in C from a method in A.
*/