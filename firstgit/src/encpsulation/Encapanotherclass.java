package encpsulation;

public class Encapanotherclass 
{
	public static void main(String args[]) {
		Encapsulation ob =new Encapsulation();
		ob.setEmpid(25);
		ob.setEmpname("Arun");
		ob.setEmpssn(23569);
		
		System.out.println("Eid="+ob.getEmpid());
		System.out.println("ename="+ob.getEmpname());
		System.out.println("essn="+ob.getEmpssn());
		
		Encapsulation ob1 =new Encapsulation();
		ob1.setEmpid(26);
		ob1.setEmpname("ravi");
		ob1.setEmpssn(23570);
		
		System.out.println("Eid="+ob1.getEmpid());
		System.out.println("ename="+ob1.getEmpname());
		System.out.println("essn="+ob1.getEmpssn());



	}

}
