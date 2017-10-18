public class HeadRec {
    public void head(int n){
        if(n == 0)
            return;
        else
            head(n-1);
        System.out.println(n);
    }
}
