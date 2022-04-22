public class Etudiant implements Comparable<Etudiant> {
    private  int id;
    private String name;
    private double note;

    public Etudiant(int id, String name) {
        double note = 10;
    }

    public String toString() {
        return "Vnom:" + name + "Vnote:" + note;
    }
 public void setNote(double note) {
     this.note = note;
 }
@Override
	public boolean equals(Object obj) {
		if( ! (obj instanceof Etudiant) )  return false;
		return Etudiant.id==this.id;
    }

    @Override
			public int compareTo(Etudiant E) {
                return Double.compare(this.note, E.note);
			}
}

