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
        elements = new int[10];
        length = 0;
    }

    public boolean isEmpty(){
        if (laenge() == 0) return true;
        return false;
    }

    public boolean equal(ADTListe list){
        if(!(this.laenge().equals(list.laenge()))) return false;

        for(int elem : elements){
            if(!(this.find(elem).equals(list.find(elem)))) return false;
        }

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
        if(pos < 1) return;

        ensureCapacity();

        if(pos > length){
            elements[length] = elem;
        } else {
            moveElemsRight(pos);
            elements[pos-1] = elem;
        }
            length++;
    }

    public void delete(Integer pos) {
        if( (pos < 1) || (pos > laenge()) ) return;

        moveElemsLeft(pos+1);
        length--;
    }

    /**
     * Finds and returns the position of the first occurence of elem in the list
     * @param elem the element for which the first occurence is searched for
     * @return the position of the first occurence of elem, null if elem couldnt be found
     */
    public Integer find(Integer elem){
        for(int i = 0; i <= laenge(); i++){
            if(elem.equals(elements[i])) return (i+1);
        }
        return 0;
    }

    /**
     * Finds the element at the specified position.
     * @param pos The position at which the element is to be retrieved
     * @return The element at the specified postion, if no element at the positio exists, 'null' is returned
     */
    public Integer retrieve(Integer pos){
        if(pos < 1 || pos > laenge()) return null;

        Integer elem = elements[pos-1];
        delete(pos);


        return elem;
    }

    public void concat(ADTListe aList){

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
        for(int i = length; i >= pos; i--){
            elements[i] = elements[i-1];
        }

    }

    /**
     * Moves all elements higher than and inclduing pos one postion to the left
     * @param pos the postion to start the move operation
     */
    private void moveElemsLeft(Integer pos){
        for(int i = pos; i <= length; i++){
            elements[i-2] = elements[i-1];
        }
    }
}
