public class Doctor {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String typeOfDoctor;
    private float review;

    //Constructor
    public Doctor(String firstName, String lastName, String email, String phoneNumber, String typeOfDoctor, float review){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.typeOfDoctor = typeOfDoctor;
        this.review = review;
    }

    //Getters and Setters
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getTypeOfDoctor() {
        return typeOfDoctor;
    }
    public void setTypeOfDoctor(String typeOfDoctor){
        this.typeOfDoctor = typeOfDoctor;
    }

    public float getReview(){
        return review;
    }
    public void setReview(float review){
        this.review = review;
    }





}
