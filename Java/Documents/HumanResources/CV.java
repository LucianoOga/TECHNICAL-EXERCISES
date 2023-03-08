package Documents.HumanResources;

public class CV implements ICV{
    private String nameComplete;
    private String email;
    private String phone;
    private String address;
    private String experience;


    public CV (String nameComplete, String email, String phone, String address, String  experience) {
        this.nameComplete = nameComplete;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.experience = experience;
    }
    @Override
    public String getNameComplete(){
        return this.nameComplete;
    }
    @Override
    public void setNameComplete(String nameComplete){
        this.nameComplete = nameComplete;
    }
    @Override
    public String getEmail(){
        return this.email;
    }
    @Override
    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public String getPhone(){
        return this.phone;
    }
    @Override
    public void setPhone(String phone){
        this.phone = phone;
    }
    @Override
    public String getAddress(){
        return this.address;
    }
    @Override
    public void setAddress(String address){
        this.address = address;
    }
    @Override
    public String getExperience(){
        return this.experience;
    }
    @Override
    public void setExperience(String experience){
        this.experience = experience;
    }
}
