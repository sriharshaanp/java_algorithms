// Function to sort a linked list
// There are three ways to do so
pubic class SortingList{
  public static void main(String args[]){
      List<String> list = new LinkedList<String>();
      list.add("a");
      list.add("c");
      list.add("b");
      list.add("d");
      // 1st method : Using the inbuilt Api
      Collections.sort(list);
      // 2nd Method : To get a better control of the sorting process
      Collections.sort(list,new Compartor(){
          // This is a callback function
          int compare(String obj1,String obj2){
              return obj1.compareTo(obj2)?1:-1;
          }
      });
      //3rd method: Using in-place operations using bubble sort
       for(int i =0;i<list.length;i++){
          for(int j=0;j<i-1-j;j++){
              if(list.get(i).compareTo(list.get(i+1))){
                  String temp = list.get(i);
                  list.get(i) = list.get(i+1);
                  list.get(i+1) = temp;
              }
          }
      }
  }
}
