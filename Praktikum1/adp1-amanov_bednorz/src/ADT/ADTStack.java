package ADT;

/**
 * @author Thomas Bednorz
 * This class represent the implementation of the ADT 'ADTStack'.
 */
public class ADTStack {
	

    public static ADTStack createS(){
        return new ADTStack();
    }

    private ADTArray2 elements;
    private int counter;
    
    private ADTStack(){
        elements = ADTArray2.initA(10);
    }
    
    
    public void push(Integer elem){
    	
    	elements.setA(counter, elem);
    	counter++;
    
    }

    public void pop(){
    	
    	counter--;

    }

    public Integer top(){
        
    	return elements.getA(counter);
    }

    public boolean isEmpty(){
    	
    	if(counter == 0) return true;
        return false;
    }

    public boolean equalS(ADTStack stack){
    	if(this.isEmpty() && stack.isEmpty()) return true;
    	
    	
    	
    	
        return true;
    }

    public void reverseS(){

    }

}
