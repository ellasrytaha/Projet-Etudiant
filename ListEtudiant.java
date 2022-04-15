import java.util.ArrayList;

interface Condition {
    public boolean estVrai(Etudiant e){
        
    }
}

public class ListEtudiant extends ArrayList<Etudiant> {

    @Override
    public boolean add(Etudiant e) {
        if (this.contains(e)) {
            set(indexOf(e), e);
        }
        return true;
    }

}