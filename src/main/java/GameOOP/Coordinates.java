package GameOOP;

public abstract class Coordinates {
    protected int posX;
    protected int posY;


    public Coordinates(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;

    }

    public Double getDistance (Coordinates posEnemy){
        return  Math.sqrt((posX -posEnemy.posX)*(posX -posEnemy.posX) + (posY - posEnemy.posY)*(posY - posEnemy.posY));
    }






    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

}
