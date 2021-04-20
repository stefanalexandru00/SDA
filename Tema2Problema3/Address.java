package pack;

public class Address {
	private int numar;
    private String strada, oras;
    public Address(){
        this.numar = 0;
        this.strada = "Nu a fost gasita o strada";
        this.oras = "Nu a fost gasit un oras";
    }
    public Address(int numar, String strada, String oras){
        this.numar = numar;
        this.strada = strada;
        this.oras = oras;
    }
    
    
    public String getAddress()
    {
        return strada + " " + numar + ", " + oras;
    }
    public String toString() {
        return getAddress();
    }


}
