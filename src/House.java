public class House {

    private String address;
    private String type;
    private float price;
    private Person owner;

    //getters accessors
    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public Person getOwner() {
        return owner;
    }

    //setters mutators
    public void setAddress(String address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(float price) {
        if(price >= 0){
            this.price = price;
        }
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    //no arg con
    public House(){
        this("No Address Specified","No Type Specified",0.0f,null);
    }

    //4 arg con
    public House(String address, String type, float price, String Person){
        this.address = address;
        this.type = type;
        this.price = price;
        this.owner = getOwner();
    }

    public String toString(){
        return "House Address: " + getAddress() + "\nHouse Type: " + getType() + "\nHouse Price: " + getPrice() + "\nHouse Owner: " + getOwner();
    }

}
