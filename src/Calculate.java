public class Calculate {
    double foodTotal, furnitureTotal;
    private int foodPrice=200, furniturePrice=2500;

    public double calculateFurnitureBill(int furnitureQuantity) {
        furnitureTotal= ((furniturePrice*furnitureQuantity)+(0.05*(furniturePrice*furnitureQuantity)));
        return furnitureTotal;
    }
    public double calculateFoodBill(int foodQuantity) {
        int price=200;
        foodTotal=foodQuantity*foodPrice;
        return foodTotal;
    }
    public double generateBill() {
        return (foodTotal+furnitureTotal);
    }
}