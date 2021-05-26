public class ErrorException {
    
    public static void main(String[] args) {
        try{
            System.out.println("Hi");
            newMethod();
        } catch (Exception e){
            System.out.println("KK");
        }
        finally{
            System.out.println("KK");
        }
    }

    public static void newMethod(){
        throw new Error("demo");
    }
}
