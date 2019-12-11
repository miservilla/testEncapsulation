
public class Main extends MainJavaFX
{
    public static void main(String[] args)
    {
        LifeForms ed = new LifeForms("Ed", 1958,9,25, Environment.LAND, Mobility.WALK);

        Environment a = Environment.LAND;

        System.out.print(ed.getName() + "'s birthday is " + ed.getBirthDay() + ". ");
        System.out.println("Ed lives on the " + ed.getEnvironment().toString().toLowerCase() + ", and he " +
                ed.getMobility().toString().toLowerCase() + "s.");

        System.out.println(a);

        MainJavaFX.launch();
    }
}
