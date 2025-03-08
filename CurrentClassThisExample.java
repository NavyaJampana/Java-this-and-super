package Thisandsuper;
class CurrentClassThisExample {
    int num = 10;
    String text = "Hello";

    void display() {
        System.out.println("Number: " + this.num);   
                System.out.println("Text: " + this.text);
    }

    public static void main(String[] args) {
        new CurrentClassThisExample().display(); 
    }
}
