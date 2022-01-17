package genrics_aasig;

public class assig_4 {
	 public static void main(String[] args) {
	        pair<String, String> mykey=new pair<String, String>("1","Hello");
	        System.out.println("{"+myKey.getkey1()+"="+mykey.getkey2()+"}");

	    }
	}
	class pair<K,V>{
	    private K key1;
	    private V obj2;

	    public pair(K key1,V key2){
	        this.key1=key1;
	        this.key2=key2;
	    }
	    public K getKey1() {
	        return key1;
	    }
	    public V getKey2() {
	        return key2;
	    }

	}




