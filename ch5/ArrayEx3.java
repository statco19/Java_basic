
public class ArrayEx3{

    public static void main(String args[]){
        int[] arr = new int[5];
		
		System.out.println("[변경전]");
		System.out.println("arr.length:"+arr.length);
		
		for(int i=0;i<arr.length;i++){
			arr[i] = i+1;
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		System.out.println("[변경후]");
		
		int[] tmp = new int[arr.length * 2];
		System.out.println("arr.length:"+tmp.length);		for(int i=0;i<arr.length;i++){
			tmp[i] = arr[i];
		}
		arr = tmp;
		for(int i=0;i<tmp.length;i++){
			System.out.println("arr["+i+"]:"+arr[i]);
		}
    } // main
}



