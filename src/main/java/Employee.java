//Aleksander Kosiak, 08/03/22

public class Employee {
    private String Title;
    private String Name;
    private String PPS;
    private int Phone;
    private String Type;
    private int Age;

    public Employee(String title, String name, String pps, int phone, String type, int age){

    }

    public void getTitle(String title){
        if(title == "Mr" || title == "Mrs" || title == "Ms"){
            this.Title = title;
        }
        else{
            throw new IllegalArgumentException("Invalid title");
        }
    }

    public void getName(String name){
        if(name.length() > 2 && name.length() < 26){
            this.Name = name;
        }
        else{
            throw new IllegalArgumentException("Invalid name");
        }
    }

    public void getPPS(String pps){
        if(pps.length() == 8){
            this.PPS = pps;
        }
        else{
            throw new IllegalArgumentException("PPS must be 8 characters long");
        }
    }

    public void getPhone(int phone){
        if(String.valueOf(phone).length() == 9){
            this.Phone = phone;
        }
        else{
            throw new IllegalArgumentException("Phone number must be 9 digits long");
        }
    }

    public void getType(String type){
        if(type == "Full-time" || type == "Part-time" || type == "Contract"){
            this.Type = type;
        }
        else{
            throw new IllegalArgumentException("Invalid employment type");
        }
    }

    public void getAge(int age){
        if(age > 16){
            this.Age = age;
        }
        else{
            throw new IllegalArgumentException("Age must be over 16");
        }
    }
}
