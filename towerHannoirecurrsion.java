public class towerHannoirecurrsion {
    public static void Towerofhennoi(int n, String source ,String helper, string destination ){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+source+" to "+destination);
            return ;
        }
        Towerofhennoi(n-1, source, destination, helper);
        System.out.println("transfer disk "+n+"from "+source+" to "+destination);
        Towerofhennoi(n-1, helper, source, destination);
    }
    public static void main(String args[]){
        Towerofhennoi(3, "S", "H", "D");
    }
}
