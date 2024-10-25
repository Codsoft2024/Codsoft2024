Class House{
  String owner="ABC";
  public void display(){
    System.out.println("House Owner "+owner);
   class Hall{
      int area=200;
       public void display(){
    System.out.println("Hall space "+area);
  }
     Hall hh = new Hall();
     hh.display();
    }
  }
  public ClassinClass{
    public static void main(string ....a){
      House h1 = new House();
      h1.display();
     // House.Hall hl1 = h1.new Hall();
      hl1.display();
      House.Hall hl1 = new House.Hall();
      hl1.display();
    }
  }
