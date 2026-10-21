public class Bank_Acount {
    private String Acount_Name;
    private double Balance;
    private String Bank_Name;
    static String Bank_location =  "wartanabada";

    Bank_Acount(String acount_Name, Double balance, String Bank_Name) {

        this.Acount_Name = acount_Name;
        this.Balance = balance;
        this.Bank_Name = Bank_Name;

    }

    public String Get_Acount_Name() {
        return Acount_Name;
    }

    public void Set_Acount_Name(String Acount_Name) {
        this.Acount_Name = Acount_Name;
    }

    public Double Get_Balance() {
        return Balance;
    }

    public void Set_Balance(double Balance) {
        this.Balance = Balance;
    }


    public String Get_Bank_Name() {
        return Bank_Name;
    }

    public  void  Set_Balance(String Bank_Name) {
         this.Bank_Name = Bank_Name;
    }



    public void deposit( double Balance){

        this.Balance+=Balance;
        System.out.println("deposit      " +Balance);

    }

    public void withdraw( double Balance){

        this.Balance-=Balance;
        System.out.println("Withdraw :" +Balance);

    }

    public void display_Accountinfo(){
        System.out.println("Account Name :" + Acount_Name);
        System.out.println("Account Balance :" +Balance);

    }



    public void display_Bankinfo(){
        System.out.println(" bank Name" + Acount_Name);
        System.out.println(" Bank location :" +Bank_location);

    }

    public static void main(String[]arg) {

        Bank_Acount bank=new Bank_Acount("haadi",100.1,"ibs_bank");
        bank.display_Accountinfo();
        bank.display_Bankinfo();
        bank.deposit(1000);
        bank.withdraw(200);

    }









}
