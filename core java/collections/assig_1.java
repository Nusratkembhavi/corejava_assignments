package collections_assignment;
import java.util.*;
			public class assig_1 {
			public static void main(String[] args) {
				
				Contact c1 = new Contact("Nusrat","nus@gmail.com",Gender.female);
				Contact c2 = new Contact("Archana","arch@gmail.com",Gender.female);
				Contact c3 = new Contact("Akshata","aksh@gmail.com",Gender.male);
				Contact c4 = new Contact("Bhoramma","boru@gmail.com",Gender.female);
				
				
				TreeMap<Long , Contact> map = new TreeMap<>();


				map.put(12345l,c1);
				map.put(34567l,c2);
				map.put(67898l,c3);
				map.put(98765l,c4);
				
				 Set<Map.Entry<Long,Contact> > entrySet = map.entrySet();
				 for (Map.Entry<Long,Contact> entry : entrySet)    
				 {
					 
					 System.out.println(entry.getKey());
					 System.out.println(entry.getValue());
					 System.out.println("Key:Value [" + entry.getKey() + " , " + entry.getValue() + "]");
				 }  
			}
			}

			enum Gender
			{
				male,female;
			}
			class Contact implements Comparable<Contact>
			{
				private String name;
				private String email;
				private Gender gender;
				private Long number;
				public Contact(String name, String email, Gender gender) {
					super();
					this.name = name;
					this.email = email;
					this.gender = gender;
					
				}
				public String getName() {
					return name;
				}
				
				public String getEmail() {
					return email;
				}
				
				public Gender getGender() { 
					return gender;
				}

				public Long getNumber() {
					return number;
				}
				@Override
				public int compareTo(Contact o) {
					// TODO Auto-generated method stub
					return o.getNumber().compareTo(this.getNumber());
				}
				
				public String toString() {
					return "Contact [" +name+ "," +email+ "," +gender+ "," +number+ "]";
					
				}
				
				
			}




