package ADT;

/**
 * @author Thomas Bednorz
 * This class represent the implementation of the ADT 'ADTArray1', which uses the ADTList type as the internal representation of the data.
 */
public class ADTArray1 {
    private ADTListe elements = ADTListe.create();
    private int length = 0;

    public static ADTArray1 initA(Integer size){
        return new ADTArray1(size);
    }

    private ADTArray1(Integer size){
        for(int i = 1; i <= size; i++){
            elements.insert(i,0);
        }

        length = size;
    }

    /**
     * Writes the element to the specified position. Existing elements will be overridden
     * @param pos the position at which elem will be written
     * @param elem the element that will be written to pos
     */
    public void setA(Integer pos, Integer elem){
        if( pos < 0 || pos > (lengthA() - 1) ) return;

        elements.delete(pos+1);
        elements.insert(pos+1, elem);

    }

    /**
     * Returns the element at pos
     * @param pos the position for which the element will be returned
     * @return the element at pos. If pos is larger then the length of the array or smaller than
     */
    public Integer getA(Integer pos){
        if( pos > (lengthA() - 1) || pos < 0) return null;

        Integer elem = elements.retrieve(pos+1);
        elements.insert(pos+1,elem);

        return elem;
    }

    public Integer lengthA(){
        return length;
    }

    public boolean equalA(ADTArray1 array){
        if( !(lengthA().equals(array.lengthA())) ) return false;

        for(int i = 0; i <= lengthA(); i++){
            if( !(getA(i).equals(array.getA(i))) ) return false;
        }

        return true;
    }
}
