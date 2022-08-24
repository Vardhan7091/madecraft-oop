import java.util.ArrayList;

public class arraylistextend extends ArrayList{
    public void print(){
        int length = this.size();
        for (int i=0;i<length;++i){
            System.out.println(this.get(i));
        }
    }
    public arraylistextend pop(){
        return (arraylistextend) this.remove(this.size()-1);
    }
}
