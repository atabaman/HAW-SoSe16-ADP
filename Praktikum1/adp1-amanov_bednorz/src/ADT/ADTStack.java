package ADT;

/**
 * @author Thomas Bednorz
 * This class represent the implementation of the ADT 'ADTStack'.
 */
public class ADTStack {

    public static ADTStack createS(){
        return new ADTStack();
    }

    private ADTArray1 elements;

    private ADTStack(){
        elements = ADTArray1.initA(10);
    }

    public void push(Integer elem){

    }

    public void pop(){

    }

    public Integer top(){
        Integer elem = null;
        return elem;
    }

    public boolean isEmpty(){
        return false;
    }

    public boolean equalS(ADTStack stack){
        return true;
    }

    public void reverseS(){

    }

}
