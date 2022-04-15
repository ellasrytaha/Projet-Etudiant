public class Etudiant implements Comparable<Complexe> {
    private int id;
    private String name;
    private double note;

    public Etudiant(int id, String name, double note) {
        note = 10;
    }

    public String toString() {
        return "Vnom:" + name + "Vnote:" + note;
    }

@Override
	public boolean equals(Object obj) {
		if( ! (obj instanceof Etudiant) )  return false;
		return ((Etudiant)obj).id==this.id;
    }
