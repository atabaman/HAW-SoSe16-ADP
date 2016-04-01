package ADT;

/**
 * @author Thomas Bednorz
 * This class represent the implementation of the ADT 'ADTBTree'.
 */
public class ADTBTree {

    private ADTBTree leftSuc;
    private ADTBTree rightSuc;
    private Integer high;
    private Integer val;

    public static ADTBTree initBT(){
        return new ADTBTree();
    }

    private ADTBTree(){
        leftSuc = null;
        rightSuc = null;
        high = null;
        val = null;
    }

    public void setLeftSuc(ADTBTree btree){
        this.leftSuc = btree;
    }

    public void setRightSuc(ADTBTree btree){
        this.rightSuc = btree;
    }

    public void setHigh(Integer high){
        this.high = high;
    }

    public void setVal(Integer val){
        this.val = val;
    }

    public ADTBTree getLeftSuc() {
        return leftSuc;
    }

    public ADTBTree getRightSuc() {
        return rightSuc;
    }

    public Integer getHigh() {
        return high;
    }

    public Integer getVal() {
        return val;
    }

    public boolean isEmptyBT(){
        return false;
    }

    public boolean equalBT(ADTBTree btree){
        return true;
    }
}
