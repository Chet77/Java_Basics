public class addition {
  public static void main(String[] args) {
    int iSum = 0;
    for(int i=0; i<args.length; i++){
      iSum = iSum + Integer.parseInt(args[i]);
    }
    System.out.println("Addtion of all command line numbers : "+ iSum);
  }
}
