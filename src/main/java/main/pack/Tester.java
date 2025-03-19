package main.pack;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExpirienceInYears() {
        return expirienceInYears;
    }

    public void setExpirienceInYears(int expirienceInYears) {
        this.expirienceInYears = expirienceInYears;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Tester() {
    }

    public Tester(String name) {
        setName(name);
    }

    public Tester(String name, String surname) {
        this(name);
        setSurname(surname);
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this(name, surname);
        setExpirienceInYears(expirienceInYears);
        setEnglishLevel(englishLevel);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Surname: " + getSurname() + ", Expirience (years): " + getExpirienceInYears() + ", English lvl: " + getEnglishLevel() + ", Salary: " + getSalary();
    }

    public static String englishPlus(String lvl) {
        switch (lvl) {
            case "A1":
                return "A2";
            case "A2":
                return "B1";
            case "B1":
                return "B2";
            case "B2":
                return "C1";
            case "C1":
                return "C2";
            case "C2":
                return "C2";
            default:
                return "minus";
        }
    }

    public void remember() {
        System.out.println(getName() + " вспоминает, как был молодым студентом. Это было " + (getExpirienceInYears() + 5) + " лет назад.");
    }

    public void remember(boolean isNostalgic) {
        if (isNostalgic) {
            remember();
        } else {
            System.out.println(getName() + " не слишком задумывается о прошлом.");
        }
    }


}
