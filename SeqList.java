import java.util.Arrays;

public class SeqList {
    private int[] data = new int[10];
    private int size=0;//size表示有多少个有效元素
    public void display(){//打印元素
        //System.out.println(Arrays.toString(data));
        System.out.println("[");
        for(int i=0;i<size;i++){
            System.out.println(data[i]);
            if(i!=size-1) {
                System.out.println(",");
            }
        }
        System.out.println("]");
    }
    public void add(int pos,int num){//pos把元素放在那个下标
        if(pos<0||pos>size){
            return;
        }
        if(this.size>=this.data.length){
            realloc();
        }
        if(pos==size){
            this.data[pos]=num;
            this.size++;
            return;
        }
        for(int i=this.size-1;i>pos;i--){
            this.data[i+1]=this.data[i];
        }
        this.data[pos]=num;
        this.size++;
    }
    private void realloc(){
        int[] newData=new int[this.data.length*2];
        for(int i=0;i<this.data.length;i++){
            newData[i]=this.data[i];
        }
        this.data=newData;
    }
    public boolean contains(int toFind) {
        for (int i = 0; i < this.size; i++) {//return rearch(toFind!=-1)
            if (this.data[i] == toFind) {
                return true;
            }
        }
        return false;
    }//判断是否存在
    public int search(int toFind){
        for(int i=0;i<this.size;i++){
            if (this.data[i]==toFind){
                return i;
            }
        }
        return -1;//测试
    }
    public int getPos(int pos){
        return this.data[pos];
    }
    public void setPos(int pos,int num){
        this.data[pos]=num;
    }
    public void remove(int toRemove){
        int pos=search(toRemove);
        if(pos==-1){
            return;
        }
        if(pos==this.size-1){
            this.size--;
            return;
        }
        for(int i=pos;i<size;i++){
            this.data[i]=this.data[i+1];
        }
        this.size--;
    }
    public int size(){
        return this.size;
    }
    public void clear(){
        this.size=0;
        this.data=new int[10];
    }
}
