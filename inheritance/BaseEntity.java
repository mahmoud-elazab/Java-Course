package inheritance;

public class BaseEntity {
    private String name;
    private int id;
    private String address;

    // public BaseEntity(){
    //     System.out.println("Default Constructor of BaseEntity");
    // }
    public BaseEntity(String name){
        System.out.println("Constructor of BaseEntity with key: "+ name );
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}