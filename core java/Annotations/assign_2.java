package annotations_assignment;


	import java.lang.annotation.Annotation;
	import java.lang.annotation.ElementType;
	import java.lang.annotation.Retention;
	import java.lang.annotation.RetentionPolicy;
	import java.lang.annotation.Target;

	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	@interface Info{
		int AuthorId();
		String Date();
		String Time();
		String Vesion();
		
	}

	@Info(AuthorId = 23456, Date = "12/11/2021", Time = "12:54", Vesion = "2.0")
	class developer{
		String Author,Supervisor,Description;
		
		public developer(String author, String supervisor, String description) {
			Author = author;
			Supervisor = supervisor;
			Description = description;
		}

		void developerDetail() {
			
			System.out.println("Developer details are : ");
		}
		@Override
		public String toString() {
			return "developer [Author=" + Author + ", Supervisor=" + Supervisor + ", Description=" + Description + "]";
		}

		
	}

	public class assign_2 {
		
		public static void main(String[] args) {
			developer dd = new developer("xyz", "abc", "what ever might be that");
			Class c = dd.getClass();
			@SuppressWarnings("unchecked")
			Annotation an = c.getAnnotation(Info.class);
			Info i = (Info)an;
			
			String ss=dd.toString();
			
			dd.developerDetail();
			System.out.println(ss);
			System.out.println(i.AuthorId()+" \n"+i.Date()+"\n"+i.Time()+"\n"+i.Vesion());
			
		}
		
	}



