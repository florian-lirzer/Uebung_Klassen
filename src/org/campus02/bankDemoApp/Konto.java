package org.campus02.bankDemoApp;

public class Konto
{
    private String kontoinhaber;
    private double kontostand;
    private int idNumber; //1....999_999
    public static int s_anzahlKonto = 10;

    public Konto(String kontoinhaber)
    {
        this.kontoinhaber = kontoinhaber;
        this.kontostand = 0;
        this.idNumber = ++s_anzahlKonto;
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
        System.out.println(this.kontoinhaber + "(ID = " + this.idNumber + ")" + ": " + this.kontostand);
    }
}
