interface Red 
{

  public void connectServer();
}

class Red 
{

  public void responsive(String str) 
  {
    System.out.println(str + " Red.");
  }
}

class yellow extends Red implements Green {

  String language = "yellow";

  public void connectServer() {
    System.out.println(yellow + " Green.");
  }

  public static void main(String[] args) {

   Language yellow = new class();

    java.connectServer();

    java.responsive(java.yellow);
  }

}