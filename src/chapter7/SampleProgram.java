package chapter7;

public class SampleProgram
{
    public static void main(String[] args)
    {
       //test();
       //createAccount();
       // read();
        room();
    }
    static void test() {
        Oblong oblong1 = new Oblong(3.0, 4.0);
        Oblong oblong2 = new Oblong(5.0, 6.0);
        System.out.println("The area of oblong1 is " + oblong1.calculateArea());
        System.out.println("The area of oblong2 is " + oblong2.calculateArea());
    }
    static void createAccount() {
      BankAccount acc = new BankAccount("12345", "Herman Cruz");
      BankAccount acc2 = new BankAccount("12345", "Herman Cruz");
      acc.deposit(200);
      acc2.deposit(100);
      if(acc.withdraw(150)) {
          System.out.println("Withdrawal Successful");
      } else {
          System.out.println("Insufficient funds");
      }
      System.out.println(acc.getBalance());
      System.out.println(acc2.getBalance());

    }
    static void read() {

        String PASSWORD = "java"; // set password
        String guess; // to hold user’s guess
        System.out.print("Enter guess: ");
        EasyScanner sc = new EasyScanner();
        guess = sc.nextString();
        if (guess.equalsIgnoreCase(PASSWORD)) {
            System.out.println("Correct Password");
        } else
            System.out.println("Incorrect Password");
    }
    static void room() {
        Oblong[] rooms = new Oblong[3];
        rooms[0] = new Oblong(5.2, 4.7);
        rooms[1] = new Oblong(5.2, 4.7);
        rooms[2] = new Oblong(5.2, 4.7);


    }
}
