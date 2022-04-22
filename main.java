
public class main {

    public static void Main(String[] args) {
		
        ListEtudiant myList=new ListEtudiant();
		Etudiant e1=new Etudiant(1,"Hamid");
		Etudiant e2=new Etudiant(2,"Driss");
		Etudiant e3=new Etudiant(1,"Youssef");
		myList.add(e1);
		myList.add(e2);
		myList.add(e3);

		ListEtudiant mesEtudiants = new ListEtudiant();
		mesEtudiants.add(e1);
		mesEtudiants.add(e2);
		mesEtudiants.add(e3);


        System.out.println(myList);
    
    e1.setNote(15);
    e2.setNote(12);
    e3.setNote(16);


}