package custom_list;
import custom_list.customlist;
import custom_list.customlist.MyList;

public class Demolist {

	public static void main(String[] args) {
		Integer[] a= {11,20,30,40,50};
		String[] str= {"hima","bindhu","pavan","lovely","navya"};
		MyList<Integer> list=new MyList<Integer>(a);
		
		System.out.println("updating old element "+list.set(3, 20)+" at index: "+3);
		System.out.println("getting the element at index 3: "+list.get(3));
		System.out.println("removing the element: "+list.rem(2,3));
		System.out.println("displaying the elements:");
		list.display();
		System.out.println("the size of the list is: "+list.size());
		System.out.println("---------------------------");
		MyList<String> list1=new MyList<String>(str);
		
		System.out.println("updating old element "+list1.set(3, "Munch")+" at index: "+3);
		System.out.println("getting the element at index 3: "+list1.get(3));
		System.out.println("removing the element: "+list1.rem(2,"hanuman"));
		System.out.println("displaying the elements:");
		list1.display();
		System.out.print("the size of the list is: "+list1.size());
	}
}

