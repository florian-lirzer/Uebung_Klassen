public class CarDemoApp
{
    public static void main(String[] args)
    {
        Car Golf5_G_123CO = new Car();
        Car FiatPanda_G_987TU = new Car();

        Golf5_G_123CO.manufacturer = "Volkswagen";
        Golf5_G_123CO.model = "Golf 5";
        Golf5_G_123CO.horsePower = 90;
        Golf5_G_123CO.color = "black";
        Golf5_G_123CO.co2Emission = 300;

        FiatPanda_G_987TU.manufacturer = "Fiat";
        FiatPanda_G_987TU.model = "Panda";
        FiatPanda_G_987TU.color = "red";
        FiatPanda_G_987TU.horsePower = 75;
        FiatPanda_G_987TU.co2Emission = 120;

        Car Golf5_LB_345LX = new Car();

        Golf5_LB_345LX.color = "red";
        Golf5_LB_345LX.model = "Golf5";

        System.out.println("Golf 5 aus Graz: " + Golf5_G_123CO.color);

        Person susi_lang = new Person();

        susi_lang.firstName = "Susi";
        susi_lang.lastName = "Lang";
        susi_lang.age = 19;

        Person max_mustermann = new Person();

        max_mustermann.firstName = "Max";
        max_mustermann.lastName = "Mustermann";
        max_mustermann.age = 39;

        max_mustermann.printPerson();
        susi_lang.printPerson();
    }

}
