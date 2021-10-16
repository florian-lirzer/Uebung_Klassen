public class Konto
{
    private String kontoinhaber;
    private double kontostand;

    public void setInhaber(String kontoinhaber)
    {
        this.kontoinhaber = kontoinhaber;
        kontostand = 0;
    }

    public void aufbuchen(double betrag)
    {
        if (betrag > 0)
        {
            this.kontostand += betrag;
        }
        else
        {
            System.out.println("Betrag ungültig");
        }
    }

    public void abbuchen(double betrag)
    {
        if (betrag <= kontostand)
        {
            this.kontostand -= betrag;
        }
        else
        {
            System.out.println("Abbuchung nicht möglich, Kontostand zu gering");
        }
    }

    public void print()
    {
        System.out.println(this.kontoinhaber + ": " + this.kontostand);
    }
}
