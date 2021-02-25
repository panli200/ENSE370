/**
 * Assembly class for implements robot override the funtion
 * Author: Li Pan
 * Using Singleton Pattern since only one Assembly Robot can be created
 */

public class Assembly implements Robot {

    private static Assembly assembly;

    private Assembly(){}
    
    public static Assembly getAssembly(){
       if (assembly == null){
           assembly = new Assembly();
       } 
        return assembly;
        
    }

    public void fetchParts() {

        System.out.println("Drilled part fetched");
    }

    public void doTask() {
        System.out.println("Product Assembled");
    }

    public void storeParts() {
        System.out.println("Product sent to storage");
    }
}
