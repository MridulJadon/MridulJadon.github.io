class Encapsulation{
    private int ssn;
    private String empName;
    private int empAge;
    private String empGender;
    public int getEmpSSN(){
        return ssn;}
    public String getEmpName(){
        return empName;}
    public int getEmpAge(){
        return empAge;}
    public void setEmpAge(int newValue){
        empAge = newValue;}
    public void setEmpName(String newValue){
        empName = newValue;}
    public void setEmpSSN(int newValue){
        ssn = newValue;}
    public String getEmpGender(){
        return empGender;}
        public void setEmpGender(String newValue){
        empGender = newValue;}}
public class bank{
    public static void main(String args[]){
         Encapsulation obj = new Encapsulation();
         obj.setEmpGender("Male");obj.setEmpName("Mario");obj.setEmpAge(32);obj.setEmpSSN(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpSSN());
         System.out.println("Employee Age: " + obj.getEmpAge());
         System.out.println("Employee Gender: " + obj.getEmpGender());
    } 
}