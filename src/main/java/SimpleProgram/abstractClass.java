package SimpleProgram;


	abstract class Action {
		   int x, y;

		   // abstract method
		   abstract void drive();
		}

		class Car extends Action {
		   void drive() {
		      System.out.println("Driving Car");
		   }
		}

		class Bike extends Action {
		   void drive() {
		      System.out.println("Driving Bike");
		   }
		   
		}
		class Cycle extends Action
		{
			void drive()
			{
				System.out.println("Driving Cycle");
			}
		}

		class abstractClass {
		   public static void main(String[] args) {
			   Action a = new Car();
		      a.drive();
		      a = new Bike();
		      a.drive();
		      a = new Cycle();
		      a.drive();
		   }
		}

