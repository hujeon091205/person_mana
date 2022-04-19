public class Customer {
    private String name;
    private char sex;
    private int age;
    private String phone;
    private String email;

    public Customer(String name, char gender, int age, String phone,
                    String email) {
        this.name = name;
        this.sex = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDetails() {
        return name + "\t" + sex + "\t" + age + "\t\t" + phone + "\t" + email;
    }
}


        //    public String getName() {
//        return name;
//    }
//    public char getSex() {
//        return sex;
//    }
//    public int getAge() {
//        return age;
//    }
//    public String getPhone(){
//        return phone;
//    }
//    public String getEmail() {
//        return email;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public void setSex(char sex) {
//        this.sex = sex;
//    }
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }


