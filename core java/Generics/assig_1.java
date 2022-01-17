package genrics_aasig;
import java.util.HashSet;

public class assig_1 {

	public static void main(String[] args) {
	        HashSet<employee> act= new HashSet();
	        employee a=new employee(678654,"Nusrat",50000,"Development");
	        employee b=new employee(675489,"Akshata",30000,"Testing");
	        employee c=new employee(675432,"Archana",60000,"Manager");
	        act.add(a);
	        act.add(b);
	        act.add(c);
	        for(employee e :act){
	            e.displayDetails();
	        }
	    }
	}
	class employee{
	    int id,salary;
	    String name,dept;
	    public employee(int id, String name, int salary, String dept){
	        this.id=id;
	        this.name=name;
	        this.salary=salary;
	        this.dept=dept;
	    }
	    public void displayDetails(){
	        System.out.println("{ID: "+id+" Name: "+name+" Salary: "+salary+" Department: "+dept+"}");
	    }
	}