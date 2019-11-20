import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmpDemo {
private int Empid;
private String name;
private String email;

  public int getEmpid() {
    return Empid;
  }

  public void setEmpid(int empid) {
    Empid = empid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  EmpDemo()
  {
    Scanner s = new Scanner(System.in);
    Empid = s.nextInt();
    name = s.next();
    email = s.next();
  }

  public static void main(String[] args) throws EmailException {
    EmpDemo arr[] = new EmpDemo[2];
    for(int i =0;i<arr.length;i++)
    {
      arr[i] = new EmpDemo();
    }
    Pattern p = Pattern.compile("[A-Za-z0-9]+[@]gla[.]ac[.]in");
    for(int i =0;i<arr.length;i++)
    {
      Matcher m = p.matcher(arr[i].getEmail());
      if(m.find())
      {
        System.out.println("valid");
      }
      else
      {
        throw new EmailException("invalid email id ");
      }
    }
  }
}

// Custom Exception Class
class EmailException extends Exception
{
  EmailException(String s)
  {
    super(s);
  }
}