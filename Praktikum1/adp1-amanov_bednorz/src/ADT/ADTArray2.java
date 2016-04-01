package ADT;

/**
 * @author Thomas Bednorz
 * This class represent the implementation of the ADT 'ADTArray2', which uses the Java type int[] as the internal representation of the data.
 */
public class ADTArray2 {
	
	private int[] elements;
	

    public static ADTArray2 initA(Integer size){
        return new ADTArray2(size);
    }

    private ADTArray2(Integer size){
    	elements = new int[size];

    }

    public void setA(Integer pos, Integer elem){
    	elements[pos] = elem;

    }

    public Integer getA(Integer pos){
        return elements[pos];
    }

    public Integer lengthA(){
        return elements.length;
    }

    public boolean equalA(ADTArray2 array){
    	
    	if(this.lengthA()!=array.lengthA()) return false;
    	
    	for(int i=0; i<=this.lengthA(); i++){
    		
    		if(this.elements[i] != array.getA(i)) return false;
    	}
    	
        return true;
    }
}
