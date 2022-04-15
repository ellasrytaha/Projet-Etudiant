
public class main {

    public static void Main(String[] args) {
		
		testListEtudiant();
	}

public static void testListEtudiant(){
		Etudiant e1=new Etudiant(1,"Hamid");
		Etudiant e2=new Etudiant(2,"Driss");
		Etudiant e3=new Etudiant(1,"Youssef");
        ListEtudiant myList=new ListEtudiant();
		myList.add(e1);
		myList.add(e2);
		myList.add(e3);
        System.out.println(myList);
    }
    e1.note=15;
    e2.note=12;
    e3.note=16;
    
}