package pack;

public class PM {
	private String type;
    public PM()
    {
        this.type = "Card";
    }
    public PM(String metoda)
    {
        this.type = metoda;
    }
    public String getPaymentMethod()
    {
        return type;
    }
    public String toString() {
        return getPaymentMethod();
    }
}
