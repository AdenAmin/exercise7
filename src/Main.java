public class Main {
    public static void main(String[] args) {
        BussinessContact contact2 = new BussinessContact("Aden","AdenB@gmail.com","614-615-4321");
        contact2.display();
    }
}



class Contacts{
    private String name;
    private String mail;

    public Contacts(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
    public void display(){
        System.out.println("Person's name is: " + this.name);
        System.out.println("Person's Email is: " + this.mail);
    }
}
class BussinessContact extends Contacts{
    private String number;

    public BussinessContact(String name, String mail, String number) {
        super(name, mail);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "BussinessContact{" +
                "number='" + number + '\'' +
                '}';
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Person's Phone Number is: " + this.number);
    }
}