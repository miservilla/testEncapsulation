import java.time.LocalDate;

public class LifeForms
{
    private String name;
    private LocalDate birthDay;
    private Environment environment;
    private Mobility mobility;

    public LifeForms(String name, int year, int month, int day, Environment environment, Mobility mobility)
    {
        this.name = name;
        birthDay = LocalDate.of(year, month, day);
        this.environment = environment;
        this.mobility = mobility;

    }

    public String getName()
    {
        return name;
    }

    public LocalDate getBirthDay()
    {
        return birthDay;
    }

    public Environment getEnvironment()
    {
        return environment;
    }

    public Mobility getMobility()
    {
        return mobility;
    }
}
