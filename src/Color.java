public enum Color {
    RED("red"),
    BLUE("blue"),
    GREEN("green"),
    ORANGE("orange"),
    PURPLE("purple"),
    PINK("pink"),
    BLACK("black"),
    WHITE("white"),
    BROWN("brown"),
    YELLOW("yellow");
    String color;
    private Color(String color){

        this.color=color;
    }
    public String getColor(){

        return color;
    }

}
