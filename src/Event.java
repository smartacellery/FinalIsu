
abstract public class Event {

    protected String name;
    protected int age;
    protected String sector;
    protected boolean renewal;
    protected boolean vip;

    public Event(String nm, int a) {
        name = nm;
        age = a;
    }

    public Event() {
        name = "";
        age = 0;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setSector(String s) {
        sector = s;
    }

    public String getSector() {
        return sector;
    }

    public boolean setRenewal(String r) {
        if (r.equals("no renewal")) {
            return false;
        } else {
            if (r.equals("yes renewal"));
            return true;
        }
    }

    public boolean setVip(String v) {
        if (v.equals("no vip")) {
            return false;
        } else {
            if (v.equals("yes vip"));
            return true;
        }
    }

    public String validateData() {
        String errormsg = null;
        if (name.length() < 2) {
            errormsg = "Please enter a name!! \n";

        } else if (age <= 0 || age > 31) {
            errormsg = "Please enter a valid date!! /n";
        }
        return errormsg;
    }

}
