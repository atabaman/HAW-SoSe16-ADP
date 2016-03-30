package ADT;

/**
 * @author Thomas Bednorz
 * This class represents the implementation of the ADT 'ADTListe'.
 * ADTListe uses the Java type int[] as the internal representation of the data.
 * The internally used arrays are initialized with a default length of ten.
 * Both arrays get enlarged once the space gets insufficient.
 */
public class ADTListe {

    public int[] elements;
    private int length;


    public static ADTListe create(){
        return new ADTListe();
    }

    private ADTListe(){
        elements = new int[1];
        length = 0;
    }

    public boolean isEmpty(){
        if (length == 0) return true;
        return false;
    }

    public boolean equal(ADTListe list){
        return true;
    }

    public Integer laenge(){
        return length;
      }

    /**
     * Inserts elem at pos in the list. If the position is already occupied, all elements after pos get moved one position and elem.
     * If pos is greater than the current length of the list, the item will be appended to the list
     * If pos has value smaller than 1, the operation gets aborted
     * @param pos the position on at which the element will be placed
     * @param elem the elements that will be placed inside the list
     */
    public void insert(Integer pos, Integer elem){
        // TODO insert at position 0
        if(pos < 1) return;

        ensureCapacity();

        if(pos > length){
            append(elem);
        } else {
            moveElemsRight(pos);
            elements[pos] = elem;
            length++;
        }
    }

    public void delete(Integer pos){
        moveElemsLeft(pos);
        length--;
    }

    /**
     * Finds and returns the position of the first occurence of elem in the list
     * @param elem the element for which the first occurence is searched for
     * @return the position of the first occurence of elem, null if elem couldnt be found
     */
    public Integer find(Integer elem){
    /*    for(int i = 1; i <= laenge(); i++){
            if(elem.equals(elements[i])){
                return i;
            }
        }
        */
        return null;
    }

    /**
     * Finds the element at the specified position.
     * @param pos The position at which the element is to be retrieved
     * @return The element at the specified postion, if no element at the positio exists, 'null' is returned
     */
    public Integer retrieve(Integer pos){
        Integer elem = null;
        return elem;
    }

    public void concat(ADTListe aList){

    }

    /* Helper methods */
    private void append(Integer elem){
        elements[length+1] = elem;
        length++;
    }

    /**
     * Ensure that the internally used arrays are never filled above 75%.
     * If the arrays fail to meet this condition, the size is doubled and all elements are copied
     */
    private void ensureCapacity(){
        float percentage = length / elements.length;
        if(percentage <= 0.75){
            int[] newElements = new int[elements.length * 2];

            for(int i = 0; i <= length; i++){
                newElements[i] = elements[i];
            }

            elements = newElements;
        }
    }

    /**
     * Moves all elements higher than and including the element at pos one position to the right
     * @param pos the position to start the move operation
     */
    private void moveElemsRight(Integer pos) {
        for(int i = (length+1); i >= pos; i--){
            elements[i] = elements[i-1];
        }

    }

    /**
     * Moves all elements lower than and including the element at pos one position to the right
     * @param pos the postion to start the move operation
     */
    private void moveElemsLeft(Integer pos){

    }
}
