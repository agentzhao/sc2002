class exception    {
  private boolean throwException = true;

  public static void exception(int value){
    try{
      if (throwException){
        throw new Exception("Power Failure!");
      } else {
        System.out.println("Value: " + value.getMessage());
      }
    } catch (Exception e) {
      System.out.println("Exception: " + e.getMessage());
    }
  }

  public void getMessage(){
    return; //somethings
  }
}
