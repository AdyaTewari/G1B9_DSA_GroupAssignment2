import java.util.PriorityQueue;

	public class ConstructionService {
	    public static void constructBuilding(int[] floorSizes) {
	        if (floorSizes == null || floorSizes.length == 0) {
	            System.out.println("No floors to construct.");
	            return;
	        }

	        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(floorSizes.length, (a, b) -> b - a);
	        PriorityQueue<Integer> availableBlocks = new PriorityQueue<>(floorSizes.length, (a, b) -> b - a);

	        for (int i = 0; i < floorSizes.length; i++) {
	            maxHeap.offer(floorSizes[i]);
	        }

	        System.out.println("The order of construction is as follows ");
	        System.out.println();

	        for (int i = 0; i < floorSizes.length; i++) {
	            availableBlocks.offer(floorSizes[i]);
	            String dayWork = performDailyConstruction(maxHeap, availableBlocks);
	            System.out.println("Day: " + (i + 1));
	            System.out.println(dayWork);
	            System.out.println();
	        }
	    }

	    private static String performDailyConstruction(PriorityQueue<Integer> maxHeap,
	                                                   PriorityQueue<Integer> availableBlocks) {
	        StringBuilder dayWork = new StringBuilder();

	        while (!availableBlocks.isEmpty() && maxHeap.peek().equals(availableBlocks.peek())) {
	            dayWork.append(availableBlocks.poll()).append(" ");
	            maxHeap.poll();
	        }

	        return dayWork.toString();
	    }
	}
