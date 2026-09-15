class FoodPreparation extends Thread{
    public void run(){
        System.out.println("Food preparation started. ");
        try{
            Thread.sleep(300);
        }
        catch(InterruptedException e){
            System.out.println("Food prepration interrupted.");
        }
        System.out.println("Food preparation completed");
    }
}

class FoodDelivering extends Thread{
    public void run(){
        System.out.println("Food delevery started.");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println("Food delivery interrupt. ");
        }
        System.out.println("Food delevered successfully.");
    }
}

public class FoodDeliveryDemo{
    public static void main(String []args){
        FoodPreparation preparation = new FoodPreparation();
        FoodDelivering delivery = new FoodDelivering();
        preparation.start();
        try{
            preparation.join();
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        delivery.start();
    }
}