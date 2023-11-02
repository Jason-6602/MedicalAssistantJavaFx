public class User {

    
    //Field Declarations
    private String username;
    private String password;

    private String firstName;
    private String lastName;

    String email;
    private String phoneNumber;

    String address;

    public User(String username, String password, String firstName, String lastName, String email, String phoneNumber, String address){
        this.username= username;
        this.password= password;
        this.firstName= firstName;
        this.lastName=lastName;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.address=address;

    }

    //Mutator Methods
    public void setUsername(String username){
        this.username=username;

    }

    public String getUsername(){
        return username;

    }

    public void setPassword(String password){
        this.password=password;
    }

    public String getPassword(){
        return password;

    }

    public void setfirstName(String firstName){
        this.firstName=firstName;

    }

    public String getfirstName(){
        return firstName;

    }

    public void setlastName(String lastName){
        this.lastName=lastName;

    }

    public String getLastName(){
        return lastName;

    }


    public void setemail(String email){
        this.email=email;

    }

    public String getemail(){
        return email;

    }

    public void setphoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;

    }

    public String getphoneNumber(){
        return phoneNumber;

    }

    public void setaddress(String address){
        this.address=address;

    }

    public String getaddress(){
        return address;

    }



}

