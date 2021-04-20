package pack;

public class Customer {
	private int ani;
    private String nume, prenume;
    private Address adresa;
    private PM PaymentMethod;

    public Customer(){
        this.nume = "Date";
        this.prenume = "Neintroduse";
        this.ani = 0;
    }
    public Customer(int ani, String nume, String prenume, Address adresa, PM PaymentMethod)
    {
        this.ani = ani;
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
        this.PaymentMethod = PaymentMethod;
    }
    public String getName()
    {
        return this.nume;
    }
    public String getSurname()
    {
        return this.prenume;
    }
    public String getFullName()
    {
        return (nume + " " + prenume);
    }
    public int getAge()
    {
        return this.ani;
    }
    public Address getAddress()
    {
        return this.adresa;
    }
    public PM getPaymentMethod()
    {
        return this.PaymentMethod;
    }
    public String toString() {
        return "Client: "  + nume + " " + prenume + " Ani: " + ani + " Adresa: " + this.adresa.getAddress() + " Metoda de plata: " + this.PaymentMethod.getPaymentMethod();

    }


}
