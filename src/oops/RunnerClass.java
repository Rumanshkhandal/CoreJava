package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee E1 = new Employee();
		
		E1.Name = "Mike";
		E1.EmpId = 1000;
		E1.Department = "HR";
		
		System.out.println(E1.Name);
		System.out.println(E1.EmpId);
		System.out.println(E1.Department);
		
	Employee E2 = new Employee("Jack", 1001, "Finance");
	
	//E2.Name = "Ruchi";
//	E2.EmpId = 1001;
	//E2.Department = "FINANCE";
	E2.Display();
	
	Employee E3 = new Employee ("Ruchi", 1002, "Dev");
	E3.Display();
	
	Bank B = new Bank();
	
	B.DisplayBalance();
	
	int Bal = B.GetBalance();
	
	System.out.println("The Balance is " + B.GetBalance());
	System.out.println("The Balance is " + Bal);
	
	BOABANK B1 = new BOABANK();
	
	B1.CCBalance();
	B1.DisplayBalance();
	
	B1.AccountNum = 100;
	
	// OverLoading Example
	OverLoadingExample obj = new OverLoadingExample();
	
	int RecArea = obj.GetArea(3,4);
	int sqArea = obj.GetArea(4);
	System.out.println("RecArea is " + 12);
	System.out.println("SqArea is " + sqArea);
	

	//Overriding Example
	
	B1.CloseAccount(12346);
	B.CloseAccount(12346);
	
	Chrome Ch = new Chrome();
	Ch.OpenBrowser();
	Ch.Show();
	
	Browser Br = new Chrome();
	
	Br.OpenBrowser();
	Br.CloseBrowser();
	Br.DisplayName();
	
	HondaCar car1 = new HondaCar();
	
	CarInterface car2= new HondaCar();
	
	//CarInterface car = new HondaCar();
	
	}
}
