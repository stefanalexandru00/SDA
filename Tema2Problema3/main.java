package pack;

public class main {


		 public static void main(String[] args) {
		        Address adresa = new Address(403, "Str.Parcului", "Focsani, ");
		        PM plata = new PM("Card credit");
		        Customer George = new Customer(32, "George", "Patrascu", adresa, plata);
		        System.out.println(George);
		        System.out.println(George.getAddress());
		        System.out.println(George.getPaymentMethod());
		        System.out.println(George.getFullName());

	}

}
