public class BankDemoApp
{
    public static void main(String[] args)
    {
        Konto florian_lirzer = new Konto("Florian Lirzer");

        florian_lirzer.print();

        florian_lirzer.aufbuchen(1200);
        florian_lirzer.print();

        florian_lirzer.abbuchen(200);
        florian_lirzer.print();

        florian_lirzer.aufbuchen(6000);
        florian_lirzer.abbuchen(4000);
        florian_lirzer.print();

        Konto susi = new Konto("Susi Sorglos");
        susi.aufbuchen(100_000);
        susi.print();
    }
}
