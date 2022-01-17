package assig2_6;

 abstract class Persistence {
	public abstract void persist();
}

public class Client {
	public static void main(String[] args)
	{
		Persistence persistence = new Persistence() {
			@Override 
			public void persist() {
				System.out.println("abstract persistance object created");
				System.out.println("clients is doing invocation of abstract method");
				System.out.println("client is invoking the method without knowing that data is saved in file and database");
			}
		};
		persistence.persist();
	}


public class DatabasePersistence extends Persistence {
	@Override
	public void persist()
	{
		System.out.println("overriding persist");
	}
}

public class FilePersistence extends Persistence {
	@Override
	public void persist()
	{
		System.out.println("overriding persists");
	}
}
}

