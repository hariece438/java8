import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDistinct {

	public static void main(String[] args) {
		
		StreamsDistinct h=new StreamsDistinct();
	        h.test();
	}
	
	 public void test(){
	        List<Integer> l=new ArrayList<Integer>();
	        l.add(10);
	        l.add(12);
	        l.add(10);
	        l.add(13);
	        
	        List<Integer> uniqueNumbers = l.stream().distinct().collect(Collectors.toList());
	        System.out.println(uniqueNumbers);
	        
	    }

}
