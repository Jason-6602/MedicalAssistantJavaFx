public class Patient extends User {

        private String username;
        private String password;
        
        private String firstName;
        private String lastName;
        
        private String email;
        private String phoneNumber;
        private String address;

        public Patient(String username, String password, String firstName, String lastName, String email, String phoneNumber, String address){
            super(username, password, firstName, lastName, email, phoneNumber, address);
           this.username = username;
           this.password = password;           
           this.firstName = firstName;
           this.lastName = lastName;
           this.email = email;
           this.phoneNumber = phoneNumber;
 
 }
}