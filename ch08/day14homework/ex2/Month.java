package day14homework.ex2;

/**
 * @author MarkChern
 * date 2020/12/10 6:51
 */
public enum Month
{
    JANUARY(1, "JAN"), FEBRUARY(2, "FEB"),
    MARCH(3, "MAR"), APRIL(4, "APR"),
    MAY(5, "MAY"), JUNE(6, "JUN"),
    JULY(7, "JUL"), AUGUST(8, "AUG"),
    SEPTEMBER(9, "SEP"), OCTOBER(10, "OCT"),
    NOVEMBER(11, "NOV"), DECEMBER(12, "DEC");

    private int value;
    private String abbreviation;

    Month(int value, String abbreviation)
    {
        this.value = value;
        this.abbreviation = abbreviation;
    }

    public static Month getByValue(int value)
    {
        return values()[value - 1];
    }

    @Override
    public String toString()
    {
        return "Month{" +
                name() +
                ", value=" + value +
                ", abbreviation='" + abbreviation + '\'' +
                '}';
    }
}
