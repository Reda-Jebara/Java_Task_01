public class TASK4 {
    public static void main (String[] args){

        int amountOfBricks = 63;
        int containerCapacity = 8;
        double amountOfBricksDB=amountOfBricks;
        double containerCapacityDB=containerCapacity;
        int fullContainer;


        // To Calculate th full container th amount of bricks by the Container Capacity //
                    //// we used INT to get th numbers before the point ////

        fullContainer = amountOfBricks / containerCapacity;
        System.out.println("The Number of full containers are : " + fullContainer);


        // To Calculate the General Number of  container the amount of bricks / by the Container Capacity

        double NoContainers=amountOfBricksDB/containerCapacityDB;
        System.out.println("The General Number of Containers are : " + NoContainers);

                            // Calculate the rest of bricks
        int NonFullContainers=containerCapacity % amountOfBricks;
        System.out.println("The Rest Number of Containers are : " + NonFullContainers);

    }
}