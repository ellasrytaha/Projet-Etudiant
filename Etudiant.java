public class Etudiant implements Comparable<Etudiant> {
    private int id;
    private String name;
    private double note;

    public Etudiant(int id, String name) {
        double note = 10;
    }

    public String toString() {
        return "Vnom:" + name + "Vnote:" + note;
    }

@Override
	public boolean equals(Object obj) {
		if( ! (obj instanceof Etudiant) )  return false;
		return ((Etudiant)obj).id==this.id;
    }

    @Override
			public int compareTo(Etudiant E) {
				if(E.note>this.note) { return 0;}
				if(E.note==this.note) { return 1;}
				else{return -1;}
			}
}