package ADT;

/**
 * @author Thomas Bednorz
 * This class represent the implementation of the ADT 'ADTArray1', which uses the ADTList type as the internal representation of the data.
 */
public class ADTArray1 {
    private ADTListe elements = ADTListe.create();

    public static ADTArray1 initA(Integer size){
        return new ADTArray1(size);
    }

    private ADTArray1(Integer size){
        for(int i = 1; i >= size; i++){
            elements.insert(i,0);
        }

    }

    public void setA(Integer pos, Integer elem){
        if( pos > elements.laenge() || pos < 1) return;

        elements.delete(pos);
        elements.insert(pos, elem);

    }

    public Integer getA(Integer pos){
        if( pos > elements.laenge() || pos < 1) return null;

        return elements.retrieve(pos);
    }

    public Integer lengthA(){
        return elements.laenge();
    }

    public boolean equalA(ADTArray1 array){
        return true;
    }
}
