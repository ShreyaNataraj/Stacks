import java.util.*;
public class pushatbootom {
  public static void bottompush(Stack<Integer>list , int data){
    if(list.isEmpty()){
      list.push(data);
      return;
    }
    int top = list.pop();
    bottompush(list,data);
    list.push(top);

  }
  public static void main(String[] args) {
    Stack<Integer>list = new Stack<>();
    list.push(1);
    list.push(2);
    list.push(3);
    bottompush(list,4);
    while(!list.isEmpty()){
      System.out.println(list.pop());
    }
    
  }
}
