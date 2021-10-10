public class Linked_list{

  public static void main(String[] args){
Node newNode1 = new Node;
Node newNode2 = new Node;
Node newNode3 = new Node;
Node newNode4 = new Node;
Node newNode5 = new Node;

newNode1.data = 1;
newNode2.data = 2;
newNode3.data = 3;
newNode4.data = 4;
newNode5.data= 5;
newNode1.next = newNode2;
newNode2.next = newNode3;
newNode3.next = newNode4;
newNode4.next = newNode5;
newNode5.next = null;
    for(int i =1;i<=5;i++){
      if(newNode1!=null){
        System.out.print(newNode1.data+" ");
        newNode1 = newNode1.next;
      }
    }
  }

}
