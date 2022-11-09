package Assignments_2;

public class Person {

    // fields
    private String name, nrcno, address, phone;

    // constructor
    public Person() {

    }

    public Person(String name, String nrcno, String address, String phone) {
        this.setName(name);
        this.setNrcno(nrcno);
        this.setAddress(address);
        this.setPhone(phone);
    }

    // getter
    public String getName() {
        return name; 
    }
    
    public String getNrcno() {
        return nrcno;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getPhone() {
        return phone;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setNrcno(String nrcno) {
        this.nrcno = nrcno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // showInfo()
    public void showInfo() {
        System.out.println("Name : " + name);
        System.out.println("NRCNO : " + nrcno);
        System.out.println("Address : " + address);
        System.out.println("Phone Number : " + phone);
    }

    // showIdentificationInfo()
    public void showIdentificationInfo() {
        String[] nrcSplit = this.nrcno.split("[/()]");
        String[] states = {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"
        };
        try {
            int stateIndex = Integer.parseInt(nrcSplit[0]);

            System.out.println("State : " + states[stateIndex-1]);
            System.out.println("City : " + nrcSplit[1]);
            System.out.println("Number : " + nrcSplit[3]);

        } catch(IllegalArgumentException | ArrayIndexOutOfBoundsException e)  {
            System.err.println("Input is invalid");
        }
        
    }

}