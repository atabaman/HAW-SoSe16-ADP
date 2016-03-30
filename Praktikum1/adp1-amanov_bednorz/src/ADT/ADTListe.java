package ADT;

/**
 * @author Thomas Bednorz
 * This class represents the implementation of the ADT 'ADTListe'.
 * ADTListe uses the Java type int[] as the internal representation of the data.
 * The internally used arrays are initialized with a default length of ten.
 * Both arrays get enlarged once the space gets insufficient.
 */
public class ADTListe {

    /*
    The elements are stored in the array 'elements'
    The order of the elements is encoded in the array 'order'
    */
    private int[] elements;
    private int[] order;
    private int length;


    public static ADTListe create(){
        return new ADTListe();
    }

    private ADTListe(){
        elements = new int[10];
        order = new int[10];
        length = 0;
    }

    public boolean isEmpty(){
        if (length <= 0) return true;
        return false;
    }

    public boolean equal(ADTListe aList){
        return true;
    }

    public Integer laenge(){
        return length;
    }

    public void insert(Integer pos, Integer elem){
        length++;
    }

    public void delete(Integer pos){
        length--;
    }

    public Integer find(Integer elem){
        int pos = 0;
        return pos;
    }

    public Integer retrieve(Integer pos){
        Integer elem = null;
        return elem;
    }

    public void concat(ADTListe aList){

    }
}
