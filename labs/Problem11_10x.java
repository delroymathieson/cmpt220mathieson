import java.util.ArrayList;
public class Problem11_10x extends ArrayList<Object>{
  public boolean isEmpty() {
  return super.isEmpty();
  }
  
  public int getSize() {
  return size();
  }

  public Object peek() {
  return get(getSize() - 1);
  }
  
  public Object pop() {
    Object o = get(getSize() - 1);
    remove(getSize() - 1);
    return o;
  }
  
  public Object push(Object o){
    add(o);
    return o;
  }
  
  public int search(Object o){
    return indexOf(o);
  }
  
  @Override
  public String toString() {
    String letter = "";
    for(int i = 0; i < getSize(); i++)
	  letter += get(i) + " ";
      return letter;
  }
}