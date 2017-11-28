public class TailRec {
    public void tail(int n)
    {
        if(n == 1)
            return;
        else
            System.out.println(n);
        tail(n-1);
    }
}
