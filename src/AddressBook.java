import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> myBuddies;
    public AddressBook(){
        myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo aBuddy){
        myBuddies.add(aBuddy);
    }
    
    public void removeBuddy(BuddyInfo aBuddy){
        myBuddies.remove(aBuddy);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
