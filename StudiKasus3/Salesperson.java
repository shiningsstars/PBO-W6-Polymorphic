public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }

    // Dibandingkan dari total penjualan; kalau seri, pakai nama (last name dulu, lalu first name)
    public int compareTo(Salesperson other) {
        if (totalSales < other.totalSales)
            return -1;
        if (totalSales > other.totalSales)
            return 1;

        int cmp = lastName.compareTo(other.lastName);
        if (cmp != 0)
            return cmp;
        return firstName.compareTo(other.firstName);
    }

    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName; }
    public int getSales()        { return totalSales; }
}
