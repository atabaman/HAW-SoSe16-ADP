package ADT;

/**
 * @author Thomas Bednorz
 * This class represent the implementation of the ADT 'ADTQueue'.
 */
public class ADTQueue {

    private ADTStack inStack;
    private ADTStack outStack;

    public static ADTQueue createQ(){
        return new ADTQueue();
    }

    private ADTQueue(){
        inStack = ADTStack.createS();
        outStack = ADTStack.createS();
    }

    public void enqueue(Integer elem){

    }

    public void dequeue(){

    }

    public Integer front(){
        Integer elem = null;
        return elem;
    }

    public boolean isEmptyQ(){
        return false;
    }

    public boolean equalQ(ADTQueue queue){
        return true;
    }
}
