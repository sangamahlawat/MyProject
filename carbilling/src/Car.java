public class Car {
   private String carnumber;
   private String carmodel;

    public Car(String carnumber, String carmodel) {
        this.carnumber = carnumber;
        this.carmodel = carmodel;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public String getCarmodel() {
        return carmodel;
    }
}
