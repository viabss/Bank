import java.util.Scanner;
public class BankAccount {
    private int AccountNumber;
    private String Name;
    private double Balance;
    private String Email;
    private String PhoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.AccountNumber = accountNumber;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setBalance(double balance) {
        this.Balance = balance;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void Deposit() {
        double Amt;
        double NewBal;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount to be deposited:");
        Amt = scan.nextDouble();
        NewBal = Amt+getBalance();
        setBalance(NewBal);
        System.out.println("The current Balance is:"+getBalance());
    }

    public void Withdraw() {
        double Amt;
        double NewBal;
        Scanner scan = new Scanner(System.in);
        if(getBalance()>0) {
            System.out.println("Please enter the amount to be withdrawn:");
            Amt = scan.nextDouble();
            if(getBalance()>=Amt) {
                NewBal = getBalance()-Amt;
                setBalance(NewBal);
                System.out.println("The current Balance is:"+getBalance());
            }
        }
        else {
            System.out.println("Insufficient Balance!");
            System.exit(0);
        }

    }

    public void CreateNew() {
        Scanner scan_name = new Scanner(System.in);
        Scanner scan_ac = new Scanner(System.in);
        Scanner scan_email = new Scanner(System.in);
        Scanner scan_phone = new Scanner(System.in);
        Scanner scan_bal = new Scanner(System.in);
        String Name;
        int AccountNumber;
        String Email;
        String PhoneNumber;
        double balance;
        System.out.println("This is where we create a new Account:");
        System.out.println("Please enter your Name:");
        Name = scan_name.nextLine();
        setName(Name);
        System.out.println("Please enter the Account Number:");
        AccountNumber = scan_ac.nextInt();
        setAccountNumber(AccountNumber);
        System.out.println("Please enter your email ID:");
        Email = scan_email.nextLine();
        setEmail(Email);
        System.out.println("Please enter your Phone Number:");
        PhoneNumber = scan_phone.nextLine();
        setPhoneNumber(PhoneNumber);
        System.out.println("Please enter your Opening Balance:");
        balance = scan_bal.nextDouble();
        setBalance(balance);
        System.out.println("The current Balance is:"+getBalance());

    }
}
