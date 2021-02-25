/**
 * Cutting class for implements robot override the funtion
 * Author: Li Pan
 */

public class Cutting implements Robot {

    public void fetchParts() {
        System.out.println("Raw material fetched");
    }

    public void doTask() {
        System.out.println("Raw material cut");
    }

    public void storeParts() {
        System.out.println("Cut part sent to storage");
    }
}
