import java.util.Scanner;

		public class DriverApp
		{
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("enter the total no of floors in the building");
		        int numberOfFloors = scanner.nextInt();
		        int[] floorSizes = new int[numberOfFloors];

		        for (int i = 0; i < numberOfFloors; i++) {
		            System.out.println("enter the floor size given on day : " + (i + 1) + "" );
		            floorSizes[i] = scanner.nextInt();
		        }

		        ConstructionService.constructBuilding(floorSizes);
		        scanner.close();
		    }
		}
