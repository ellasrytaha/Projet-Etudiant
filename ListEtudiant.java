import java.util.ArrayList;
import java.util.concurrent.PriorityBlockingQueue;

public class ListEtudiant extends ArrayList<Etudiant> {

    @Override
    public boolean add(Etudiant e) {
        int index = indexOf(e);
        if (index == -1) return super.add(e);
        this.set(index, e);
            return true;
    }

    public List<Etudiant> filter(Condition c)
{
    
}
}