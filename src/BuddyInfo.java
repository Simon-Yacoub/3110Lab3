public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Main
    public static void main(String[] args) {
        BuddyInfo homer = new BuddyInfo("Homer", "Colonel By Drive", "1234567890");
        System.out.println("Hello " + homer.getName() + "!");

        AddressBook myBook = new AddressBook();
        myBook.addBuddy(homer);
        myBook.removeBuddy(0);

    }
}
