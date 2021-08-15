class quest1_1{
    public static void main(String[] args) {
        
    }
}

class Entidade{
    private int id;
    private Posicao posicao;

    int getId(){
        return this.id;
    }
    void setId(int id){
        this.id = id;
    }
    Posicao getPosicao(){
        return this.posicao;
    }
    void setPosicao(Posicao posicao){
        this.posicao = posicao;
    }
}

class Posicao
{
    private int x;
    private int y;

    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }
    void setX(int x){
        this.x = x;
    }
    void setY(int y){
        this.y = y;
    }
}

class Boid extends Entidade{
    private int energia;
    private Forca velocidade;
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public Forca getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(Forca velocidade) {
        this.velocidade = velocidade;
    }
}

class Forca{
    private int a;
    private int b;
    int getA(){
        return this.a;
    }
    int getB(){
        return this.b;
    }
    void setA(int a){
        this.a = a;
    }
    void setB(int b){
        this.b = b;
    }
    double tamanho(){
        return a*b;
    }
}

class Inimigo extends Boid{
    private int vida;
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    Inimigo achaAlvoMaisProximo(Inimigo i[]){
        int j;
        for(j = 0; j < i.length; j++){
            if((i[j].getVelocidade().getA() == getPosicao().getX()) && (i[j].getVelocidade().getB() == getPosicao().getY())){
                return i[j];
            }
        }
        return i[j];
    }
}

class Services{
    int contaPossiveisCandidatos(Inimigo i[]){
        int count = 0;
        for(int j = 0; j < i.length; j++){
            if((i[j].getPosicao().getX() > 100 && i[j].getPosicao().getX() > 100) && (i[j].getEnergia() <= 50) && (i[j].getVelocidade().tamanho() == 200)){
                count++;
            }
        }
        return count;
    }
}


