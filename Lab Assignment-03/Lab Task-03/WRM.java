// NO NEED THIS SUBMIT THIS CLASS
public class WRM {
    Patient dh;

    //The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        Patient p=new Patient(id, name, age, bloodgroup, null, null);
        dh.prev.next=p;
        p.prev=dh.prev;
        p.next=dh;
        dh.prev=p; 
    }

    public void servePatient() {
        if(dh.next==dh){
            System.out.println("No patient to serve");
            return;
        }
        Patient temp=dh.next;
        dh.next=temp.next;
        temp.next.prev=dh;
        System.out.println("Patient served: "+temp.name+" "+temp.id);
    }

    public void showAllPatient() {
        if(dh.next==dh){
            System.out.println("No patient is waiting");
        }
        Patient temp=dh.next;
        while(temp!=dh){
            System.out.println(temp.id);
            temp=temp.next;
        }
    }

    public Boolean canDoctorGoHome() {
        if(dh.next==dh){
            return true;
        }
        return false;
    }

    public void cancelAll() {
        dh.next=dh;
        dh.prev=dh;
        System.out.println("All appointments are cancelled");
    }


    public void reverseTheLine() {
        if(dh.next==dh){
            System.out.println("No line to reverse");
            return;
        }
        Patient curr=dh.next;
        while(curr!=dh){
            Patient temp=curr.next;
            curr.next=curr.prev;
            curr.prev=temp;
            curr=temp;
        }
        Patient temp=dh.next;
        dh.next=dh.prev;
        dh.prev=temp;
        showAllPatient();
    }

}
