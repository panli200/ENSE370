/**
 * Drilling class for implements robot override the funtion
 * Author: Li Pan
 */

public class Drilling implements Robot {

    public void fetchParts() {
        System.out.println("Cut part fetched");
    }

    public void doTask() {
        System.out.println("Holes drilled");
    }

    public void storeParts() {
        System.out.println("Drilled part sent to storage");
    }

}
