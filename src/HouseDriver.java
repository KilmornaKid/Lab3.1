import javax.swing.*;

public class HouseDriver {
    public static void main(String[] args) {

        House newHouse = new House();
        Person newPerson = new Person();
        newPerson.setName("Kieran");

        System.out.print(newHouse.toString());

        House newHouse2 = new House();

        newHouse2.setAddress("Pilgrim Hill, Kilmorna");
        newHouse2.setType("Two-Storie");
        newHouse2.setPrice(5000.95f);
        newHouse2.setOwner(newPerson);

        System.out.println("\n" + newHouse2);

        House newHouse3 = new House();
        newHouse3.setAddress(JOptionPane.showInputDialog(null,"Please enter house address: "));
        newHouse3.setType(JOptionPane.showInputDialog(null,"Please enter the type of house: "));
        newHouse3.setPrice(Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter the cost of the house")));

        JOptionPane.showMessageDialog(null,newHouse3.toString());


    }
}
