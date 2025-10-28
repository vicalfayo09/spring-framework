package car.setter.injection;

public class Car {
        private Specification specification;
        public Car(){}
        public void setSpecification(Specification specification){
            this.specification = specification;
        }
        public void displayDetails(){
            System.out.println("Car Details: " + specification.toString());
        }
}
